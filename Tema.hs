module Tema (Tema, nuevoT, nombreT, datosT, etiquetasT, agregarT, aplicaT )
  where

import Tipos


data Tema = Tem Nombre [ Etiqueta ] Datos deriving (Eq, Show, Ord)


nuevoT :: Nombre -> Datos -> Tema
nuevoT n d = Tem n [] d


nombreT :: Tema -> Nombre
nombreT (Tem nombret _ _) = nombret


datosT :: Tema -> Datos
datosT (Tem _ _ datost) = datost


etiquetasT :: Tema -> [ Etiqueta ]
etiquetasT (Tem _ etiquetast _) = etiquetast


agregarT :: Etiqueta -> Tema -> Tema
agregarT e (Tem n et d) = Tem n (e:et) d


aplicaT :: Etiqueta -> Tema -> Bool
aplicaT e (Tem n et d) = elem e (etiquetasT (Tem n et d))


----------------------- TEST ----------------------------

t1 = nuevoT "t1" "d1"
t2 = agregarT "e21" (agregarT "e2" (nuevoT "t2" "d2"))
te = all (== True)[nuevoT "t1" "d1" == Tem "t1" [] "d1",
        nombreT t1 == "t1",
        datosT t1 == "d1",
        etiquetasT t1 == [],
        etiquetasT t2 == ["e21","e2"],
        agregarT "e1" t1 == Tem "t1" ["e1"] "d1",
        aplicaT "e3" t1 == False,
        aplicaT "e2" t2 == True
    ]