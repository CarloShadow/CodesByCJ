"""
Leia uma matriz 4 x 4
contar e escrever quantos valores maior que 10 ela possui

"""

matriz = [[], [], [], []]
m = []

for linha in range(0, 4):
    for coluna in range(0, 4):
        num = int(input(f'Digite um valor para [{linha}, {coluna}]: '))  # Loop para pedir os valores
        matriz[linha].append(num)
        if num > 10:
            m.append(num)
print('=' * 30)
for linha in range(0, 4):
    for coluna in range(0, 4):
        print(f'[{matriz[linha][coluna]:^5}]', end='')
    print()   # dando espaço entre as linhas
print(f'Números maiores que 10: {m} \nQuantidade: {len(m)}')
