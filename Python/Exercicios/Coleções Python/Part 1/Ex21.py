"""
Fazer 2 vetores para receber dados do usuario, com 10 números cada
criar um terceiro vetor
calcular vetor3 = vetor1 - vetor2
mostrar na tela o resultado do terceiro vetor
"""
import numpy as sub

lista1 = []
lista2 = []
lista3 = []

for i in range(6):
    num = (int(input('Digite os números: ')))
    lista1.append(num)
for e in range(6):
    lista2.append(int(input('Digite os outros números: ')))

lista3 = list(sub.array(lista1) - sub.array(lista2))
print(lista3)

