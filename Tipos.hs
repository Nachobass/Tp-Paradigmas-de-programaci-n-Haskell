{-insertar x [] = [x]
insertar x (y:ys)
    | x <= y  =  x:y:ys
    | otherwise = y : insertar x ys

    -}

module Tipos where
type Datos = String 
type Etiqueta = String 
type Nombre = String

insertar :: Ord a => a -> [ a ] -> [ a ]
--con el => se indica que a tiene que ser Ord

insertar cancion playlist = reverse (cancion : reverse(playlist)) 


