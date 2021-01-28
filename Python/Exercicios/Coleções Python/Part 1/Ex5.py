"""
Receber 10 valores
contar quantos valores pares ele possui
printar estes valores

"""

lista = []
pares = []
for _ in range(0, 3):
    n = int(input('Digite os números: '))
    lista.append(n)
    if n % 2 == 0:
        pares.append(n)

print(pares)
print(f'A quantidade de números pares é {len(pares)}')
