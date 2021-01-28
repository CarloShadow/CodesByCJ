maior = menor = quant = 0

for n in range(1, 6):
    n = int(input('Digite os números: '))
    quant += 1
    if quant == 1:
        maior = menor = n
    else:
        if n > maior:
            maior = n
        if n < menor:
            menor = n
print(f'Menor número: {menor} \nMaior número: {maior}')
