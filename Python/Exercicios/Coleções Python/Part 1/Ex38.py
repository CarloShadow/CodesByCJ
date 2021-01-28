"""
Ler 10 números do usuário
colocar números em ordem
imprimir números em ordem
"""

lista = []

for i in range(5):
    lista.append(int(input('Digite os números: ')))
    lista.sort()

print(lista)
