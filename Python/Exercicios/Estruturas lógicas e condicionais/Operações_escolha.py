ope = input('Escola uma operação entre soma(+), subtração(-), multiplicação(*) ou divisão(/): ')
valor1 = float(input('Informe o primeiro valor: '))
valor2 = float(input('Informe o segundo valor: '))

if ope == '+':
    soma = valor1+valor2
    print(f'Resultado: {soma}')
elif ope == '-':
    sub = valor1-valor2
    print(f'Resultado: {sub}')
elif ope == '*':
    mult = valor1*valor2
    print(f'Resultado: {mult}')
elif ope == '/':
    div = valor1/valor2
    print(f'Resultado: {div}')
else:
    print('Operação inválida')
