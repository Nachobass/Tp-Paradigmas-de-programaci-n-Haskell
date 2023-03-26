module Reproductor ( Reproductor, nuevoR, archivosR, listaParaR, temasR, playR, actualR, avanzarR, retrocederR, reiniciarR )
    where

import Tipos
import Tema
import Playlist
import FileSystem

data Reproductor = RP FileSystem Playlist deriving (Eq, Show)


nuevoR :: FileSystem -> Reproductor
nuevoR file = RP file (nuevaP [])


archivosR :: Reproductor -> FileSystem
archivosR (RP fileR _ ) = fileR


listaParaR :: Etiqueta -> Reproductor -> [Tema]
listaParaR e (RP f p ) = filtrarF e f


temasR :: Reproductor -> [Tema]
temasR (RP f p ) = temasF f


playR :: Reproductor -> Etiqueta -> Reproductor
playR (RP f p ) e = RP f (nuevaP (filtrarF e (archivosR (RP f p ))))


actualR :: Reproductor -> Tema
actualR (RP f p ) = actualP p


avanzarR :: Reproductor -> Reproductor
avanzarR (RP f p ) = RP f (skipP p) 


retrocederR :: Reproductor -> Reproductor
retrocederR (RP f p ) = RP f (backP p)


reiniciarR :: Reproductor -> Reproductor
reiniciarR (RP f p ) = RP f (resetP p)


----------------------- TEST ----------------------------

t1 = (agregarT "Pop" (nuevoT "n1" "d1"))
t2 = (agregarT "Trap" (nuevoT "n2" "d2"))
t3 = agregarT "Rock" (agregarT "Pop" (nuevoT "n3" "d3"))
t4 = (agregarT "Pop" (nuevoT "n4" "d4"))

fs1 = nuevoF
fs2 = agregarF t1 fs1
fs3 = agregarF t2 fs2
fs4 = agregarF t3 fs3
fs5 = agregarF t4 fs4

rep1 = nuevoR fs5
rep2 = playR rep1 "Pop"
rep3 = avanzarR rep2
rep4 = avanzarR rep3

p1 = nuevaP []
p2 = nuevaP [t3,t1,t4]
p3 = nuevaP [t2]
p4 = skipP p2
p5 = skipP p4

tr = all (== True)[nuevoR fs4 == RP fs4 p1,
      archivosR rep1 == fs5,
      listaParaR "Pop" rep1 == [t3,t1,t4],
      temasR rep1 == [t3,t1,t2,t4],
      playR rep1 "Pop" == RP fs5 p2,
      playR rep1 "Trap" == RP fs5 p3,
      actualR rep2 == t3,
      avanzarR rep2 == RP fs5 p4,
      avanzarR rep3 == RP fs5 p5,
      retrocederR rep4 == RP fs5 p4,
      reiniciarR rep4 == RP fs5 p2
     ]