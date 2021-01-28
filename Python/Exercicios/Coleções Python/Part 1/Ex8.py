"""
receber 6 valores
Ler 6 valores
mostrar valores lidos na forma inversa
"""

lista = []

for i in range(0, 5):
    n = int(input('Digite o número: '))
    lista.append(n)
    lista.reverse()
print(lista)
