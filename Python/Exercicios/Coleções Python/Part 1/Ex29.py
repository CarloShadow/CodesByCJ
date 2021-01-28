"""
Ler 6 números e mostrar...
os números pares
a soma dos números pares digitados
os números ímpares digitados
a quantidade de números ímpares digitados
"""
pares = []
impar = []

for i in range(6):
    num = int(input('Digite os números: '))
    if num % 2 == 0:
        pares.append(num)
        soma = sum(pares)
    else:
        impar.append(num)
        qtd = len(impar)

print(f'Os números pares são: {pares}')
print(f'Soma de números pares: {soma}')
print(f'Os números impares são: {impar}')
print(f'A quantidade de números impares são: {qtd}')

