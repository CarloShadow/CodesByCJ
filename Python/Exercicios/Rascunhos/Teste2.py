matriz = [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]

for linha in range(0, 4):
    for coluna in range(0, 4):
        matriz[linha][coluna] = int(input(f'Digite um valor para [{linha}, {coluna}]: '))

for linha in range(0, 4):
    for coluna in range(0, 4):
        print(f'[{matriz[linha][coluna]:^4}]', end='')
    print()

maior = max(matriz)
posicao = matriz.index(maior)
print(posicao)
