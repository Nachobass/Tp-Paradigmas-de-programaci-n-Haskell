module Playlist ( Playlist, nuevaP, actualP, skipP, backP, resetP )
  where
import Tipos
import Tema
data Playlist = Play Int [ Tema ] deriving (Eq, Show)

nuevaP :: [ Tema ] -> Playlist
nuevaP te = Play 0 te


actualP :: Playlist -> Tema
actualP (Play i tema) = head (drop (i) tema)


skipP :: Playlist -> Playlist
skipP (Play i te) = (Play (i+1) te)


backP :: Playlist -> Playlist
backP (Play i te) = (Play (i-1) te)


resetP :: Playlist -> Playlist
resetP (Play i te) = nuevaP te


----------------------- TEST ----------------------------

t1 = (agregarT "Pop" (nuevoT "n1" "d1"))
t2= (agregarT "Trap" (nuevoT "n2" "d2"))
t3 = (agregarT "Pop" (nuevoT "n3" "d3"))
playlist = nuevaP [t1,t2,t3]
playlist2 = skipP(skipP playlist)
playlist3 = backP playlist2


tp = all (== True)[nuevaP [t1,t2,t3] == Play 0 [t1,t2,t3],
      actualP playlist == t1,
      skipP playlist == Play 1 [t1,t2,t3],
      backP playlist2 == Play 1 [t1,t2,t3],
      actualP playlist3 == t2,
      resetP playlist2 == Play 0 [t1,t2,t3]
      ]