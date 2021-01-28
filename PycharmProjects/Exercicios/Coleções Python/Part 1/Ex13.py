"""
receber 5 valores
ler 5 valores
mostrar o indice do maior
mostrar o indice do menor
"""
lista = []

for n in range(0, 5):
    n = int(input('Digite o número: '))
    lista.append(n)
    maior = max(lista)
    menor = min(lista)
print(f'O maior número se encontra na posição {lista.index(maior)} começando de 0')
print(f'O menor número se encontra na posição {lista.index(menor)} começando de 0')
