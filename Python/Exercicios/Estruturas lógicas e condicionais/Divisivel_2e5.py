num = int(input('Digite o número: '))

if num % 3 == 0:
    print(f'O número {num} é divisível por 3')
elif num % 5 == 0:
    print(f'O número {num} é divisível por 5')
else:
    print(f'O número {num} não é divisível por 3 e nem por 5')
