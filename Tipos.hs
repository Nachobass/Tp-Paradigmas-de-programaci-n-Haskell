module Tipos where

type Datos = String 
type Etiqueta = String 
type Nombre = String

insertar :: Ord a => a -> [ a ] -> [ a ]
insertar cancion playlist = reverse (cancion : reverse(playlist)) 


----------------------- TEST ----------------------------
ti = all (== True)[insertar "cancion1" [] == ["cancion1"],
     insertar "cancion2" ["cancion1"] == ["cancion1","cancion2"]
    ]