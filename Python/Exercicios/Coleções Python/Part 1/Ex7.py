"""
Receber 10 valores
encontrar o maior valor
mostrar em qual posição ele se encontra

"""

lista = []

for i in range(0, 5):
    n = int(input('Digite o núemro: '))
    lista.append(i)
    maior = max(lista)
print(f'Maior valor: {maior}')
print(f'O mior número se encontrar na posição {lista.index(maior)} começando de zero')

