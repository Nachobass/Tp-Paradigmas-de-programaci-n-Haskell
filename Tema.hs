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
agregarT e (Tem n et d) = Tem n (e:et) d

  {-
  primero-----agregarT e (Tem n _ d) = Tem n [e] d

      Así funciona:
          ghci> agregarT "Etiquet" (Tem  "me" []  "hola")
          Tem "me" ["Etiquet"] "hola"
      
      PRUEBA FINAL:
          ghci> t1 = nuevoT "n1" "d1"
          ghci> t2 = nuevoT "n2" "d2"
          ghci> agregarT "e2" (agregarT "e1" t1)
          Tem "n1" ["e2","e1"] "d1"
          ghci> t3 = agregarT "e2" t2
          ghci> t4 = agregarT "e3" t3
          ghci> t4
          Tem "n2" ["e3","e2"] "d2"
    -}


aplicaT :: Etiqueta -> Tema -> Bool
aplicaT e (Tem n et d) = elem e (etiquetasT (Tem n et d))

  {-
      PRIMER VERSION:
        aplicaT et (Tem n [e] d) | [et] == etiquetasT (Tem n [e] d) = True
                       | otherwise = False

      Así funciona:
          ghci> aplicaT "hola" (Tem  "me" ["eti"]  "hola")
          False
          ghci> aplicaT "hola" (Tem  "me" ["hola"]  "hola")
          True
      
      PRUEBA FINAL:
          ghci> t1 = nuevoT "n1" "d1"
          ghci> t2 = nuevoT "n2" "d2"
          ghci> t3 = agregarT "e2" t2
          ghci> t4 = agregarT "e3" t3
          ghci> t4
          Tem "n2" ["e3","e2"] "d2"
          ghci> aplicaT "e1" t4
          False
          ghci> aplicaT "e2" t4
          True
          ghci> aplicaT "e3" t4
          True
          ghci> aplicaT "e5" t4
          False
    -}



   --t=[ (aplicaT "hola" (Tem  "me" ["eti"]  "hola")) == False,
   --]