module Tema (Tema, nuevoT, nombreT, datosT, etiquetasT, agregarT, aplicaT )
  where

import Tipos


data Tema = Tem Nombre [ Etiqueta ] Datos deriving (Eq, Show, Ord)

nuevoT :: Nombre -> Datos -> Tema
nuevoT n d = Tem n [] d

nombreT :: Tema -> Nombre
nombreT (Tem nombret _ _) = nombret

  {-
    Así funciona:
        ghci> nombreT (nuevoT "me" "hola")
        "me"
  -}

datosT :: Tema -> Datos
datosT (Tem _ _ datost) = datost

  {-
    Así funciona:
        ghci> datosT (Tem  "me" []  "hola")
        "hola"
  -}

etiquetasT :: Tema -> [ Etiqueta ]
etiquetasT (Tem _ etiquetast _) = etiquetast

  {-
      Así funciona:
          ghci> etiquetasT (Tem "me" ["Etiquet"] "hola")
          ["Etiquet"]
    -}


agregarT :: Etiqueta -> Tema -> Tema
agregarT e (Tem n _ d) = Tem n [e] d

  {-
      Así funciona:
          ghci> agregarT "Etiquet" (Tem  "me" []  "hola")
          Tem "me" ["Etiquet"] "hola"
    -}


aplicaT :: Etiqueta -> Tema -> Bool
aplicaT et (Tem n [e] d) | [et] == etiquetasT (Tem n [e] d) = True
                       | otherwise = False

  {-
      Así funciona:
          ghci> aplicaT "hola" (Tem  "me" ["eti"]  "hola")
          False
          ghci> aplicaT "hola" (Tem  "me" ["hola"]  "hola")
          True
    -}



   --t=[ (aplicaT "hola" (Tem  "me" ["eti"]  "hola")) == False,
   --]