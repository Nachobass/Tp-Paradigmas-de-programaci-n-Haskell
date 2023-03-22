module Playlist ( Playlist, nuevaP, actualP)
--, skipP, backP, resetP )
  where
import Tipos
import Tema
data Playlist = Play Int [ Tema ] deriving (Eq, Show)

nuevaP :: [ Tema ] -> Playlist
nuevaP [t] = Play 0 [t]

{-
nose si funciona
ghci> nuevaP [(t = (Tem  "me" []  "hola")),(p=(Tem  "hola" []  "ime"))]

<interactive>:58:12: error: parse error on input ‘=’
ghci> nuevaP [(t = Tem  "me" []  "hola"),(p=Tem  "hola" []  "ime")]

<interactive>:59:12: error: parse error on input ‘=’

-}

actualP :: Playlist -> Tema
actualP (Play i [t]) = head (drop (i-1) [t])