"""
fazer um vetor e add 6 números OK
atribuir os valores: 1, 0, 5, -2, -5, 7. OK

armazenar em uma variável int(simples) a soma dos números nas casas [0], [1] e [5] OK
printar na tela a soma OK

mudar o vetor na posição 4 para 100 OK
mostrar o vetor lista, um em cada linha OK

"""

lista = [1, 0, 5, -2, -5, 7]
print(lista)
num1, num2, num3, num4, num5, num6 = lista  # Desempacotando

soma = num1 + num2 + num6
print(f'A soma é igual a {soma}')

lista.pop(4)   # Removendo o indice 4 da lista
lista.insert(4, 100)  # Add o valor 100 no indice 4
print(lista)

for elemento in lista:
    print(elemento)
