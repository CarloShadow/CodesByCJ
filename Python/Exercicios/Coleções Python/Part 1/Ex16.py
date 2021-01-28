"""
ler 5 inteiros e armazena-los num vetor
ler código inteiro (1 ou 2)
se for 1, mostrar o vetor na ordem direta
se for 2, mostrar ba inversa
se não for 1 ou 2, apresentar mesagem de erro
"""
lista = []

for i in range(5):
    n = int(input('Digite o número: '))
    lista.append(n)
for i in range(1):
    cod = int(input('Digite o código: '))
    if cod == 1:
        lista.sort()
        print(lista)
    elif cod == 2:
        lista.reverse()
        print(lista)
    else:
        print(f'Código {cod} inválido')
