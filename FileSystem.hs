module FileSystem ( FileSystem, nuevoF, etiquetasF, temasF, agregarF, filtrarF )
    where
import Tipos
import Tema
data FileSystem = FS [Etiqueta] [Tema] deriving (Eq, Show)

nuevoF :: FileSystem
nuevoF = FS [] []


etiquetasF :: FileSystem -> [ Etiqueta ]
etiquetasF (FS etiquetasf _ ) = etiquetasf


temasF :: FileSystem -> [ Tema ]
temasF (FS _ temasf ) = temasf


agregarF :: Tema -> FileSystem -> FileSystem
agregarF t (FS etiqueta temas) = FS (reverse (foldl evaluar etif etit)) (reverse(t:temas))
                        where 
                            etit = etiquetasT t
                            etif = etiquetasF ((FS etiqueta temas))
                            evaluar :: Eq a => [a] -> a -> [a]
                            evaluar lista elemento
                                | elemento `elem` lista = lista
                                | otherwise = elemento:lista


filtrarF :: Etiqueta -> FileSystem -> [ Tema ]
filtrarF eti (FS et te) = filter (\t -> elem eti (etiquetasT t)) temafi
    where
        temafi = temasF (FS et te)


----------------------- TEST ----------------------------

t1 = (agregarT "Pop" (nuevoT "n1" "d1"))
t2 = (agregarT "Trap" (nuevoT "n2" "d2"))
t3 = agregarT "Rock" (agregarT "Pop" (nuevoT "n3" "d3"))

fs1 = nuevoF
fs2 = agregarF t1 fs1
fs3 = agregarF t2 fs2
fs4 = agregarF t3 fs3


tf = all (== True)[nuevoF == FS [] [],
    etiquetasF fs1 == [],
    etiquetasF fs2 == ["Pop"],
    etiquetasF fs4 == ["Trap","Pop","Rock"],
    temasF fs1 == [],
    temasF fs4 == [t2,t1,t3],
    agregarF t2 fs2 == FS ["Pop","Trap"] [t1,t2],
    agregarF t3 fs3 == FS ["Trap","Pop","Rock"] [t2,t1,t3],
    filtrarF "Pop" fs4 == [t1,t3],
    filtrarF "Trap" fs4 == [t2]
    ]