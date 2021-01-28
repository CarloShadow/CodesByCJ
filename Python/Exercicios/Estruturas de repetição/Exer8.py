soma = 0

for num in range(1, 4):
    num = float(input('Digite um número positivo: '))
    if num >= 0:
        soma = soma+num

med = soma/3
print(f'Resultado: {soma}')
print(f'Média: {med:.1f}')
