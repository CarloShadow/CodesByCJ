while True:
    ope = input('Escolha uma operação entre as opções abaixo \n | + | - | * | / | 0(sair)|: ')
    if ope == '0':
        break
    num1 = float(input('Digite o primeiro número: '))
    num2 = float(input('Digite o segundo número: '))
    if ope == '+':
        soma = num1 + num2
        print(f'Resultado: {soma:.1f}')
    elif ope == '-':
        sub = num1 - num2
        print(f'Resultado: {sub:.1f}')
    elif ope == '*':
        mult = num1 * num2
        print(f'Resultado: {mult:.1f}')
    elif ope == '/':
        div = num1 / num2
        print(f'Resultado: {div:.1f}')
    else:
        print('Operação inválida')

