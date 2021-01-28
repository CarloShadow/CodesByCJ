"""
ler um vetor de 10 posições
colocar valor 0 para elementos negativos
"""

lista = []

for i in range(0, 5):
    n = int(input('Digite valor: '))
    if n < 0:
        lista.append(0)
    else:
        lista.append(n)
print(lista)
