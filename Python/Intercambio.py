NumeroNegativos = 0;
NumerosADigitar = input("¿Cuantos valores ingresara?")
NumerosDigitados = 0;
print(type(NumerosDigitados))
for i in range(NumerosADigitar):
    NumerosDigitados = input(f"Digite el numero {i}: ")
    if NumerosDigitados<0:
        NumeroNegativos = NumeroNegativos + 1
print(NumeroNegativos)
