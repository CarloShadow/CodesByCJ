est = input('Informe o estado SP, RJ, MG ou MS em maísculo: ')
valor = int(input('Informe o valor do produto: '))

if est == 'SP':
    val1 = valor+(valor*12/100)
    dif1 = val1 - valor
    print(f'Valor toal: R${val1:.2f}')
    print(f'Valor da taxa: R${dif1:.2f}')
elif est == 'RJ':
    val2 = valor+(valor*15/100)
    dif2 = val2-valor
    print(f'Valor total: R${val2:.2f}')
    print(f'Valor da taxa: R${dif2:.2f} ')
elif est == 'MG':
    val3 = valor+(valor*7/100)
    dif3 = val3-valor
    print(f'Valor total: R${val3:.2f}')
    print(f'Valor da taxa: R${dif3:.2f}')
elif est == 'MS':
    val4 = valor+(valor*8/100)
    dif4 = val4-valor
    print(f'Valor total: R${val4:.2f}')
    print(f'Valor da taxa: R${dif4:.2f}')
else:
    print('Estado inválido')


