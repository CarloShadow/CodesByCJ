"""
ler uma matriz 4 x 4 OK

imprimi-la e mostrar a coluna e indice do maior valor

"""
matriz = [[], [], [], []]

for linha in range(4):
    for coluna in range(4):
        num = int(input(f'Digite o valor [{linha}, {coluna}]: '))
        matriz[linha].append(num)

print('=' * 30)

for linha in range(4):
    for coluna in range(4):
        print(f'[{matriz[linha][coluna]:^5}]', end='')
    print()

maxi = max(matriz)
indice = matriz.index(maxi)
if indice == 0:
    print('O número maior esta na linha 1 e coluna 1')
