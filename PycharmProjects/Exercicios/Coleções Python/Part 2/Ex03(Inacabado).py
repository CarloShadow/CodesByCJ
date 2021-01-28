"""
fazer um programa que preenche uma matriz 4 x 4
imprimir o produto de cada elemento das linhas e colunas

"""

matriz1 = [[], []]

for linha in range(0, 2):
    for coluna in range(0, 2):
        num = int(input(f'Digite um número para [{linha}, {coluna}]: '))
        matriz1[linha].append(num)
print('=' * 30)

for linha in range(0, 2):
    for coluna in range(0, 2):
        print(f'[{matriz1[linha][coluna]:^5}]', end='')
    print()
