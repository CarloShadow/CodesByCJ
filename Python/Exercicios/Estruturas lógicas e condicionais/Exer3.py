num1 = int(input('Digite o primeiro número: '))
num2 = int(input('Digite o segundo número: '))

if num1 > num2:
    dif = num1-num2
    print(f'O maior número é {num1}')
    print(f'A diferença entre eles é {dif}')
else:
    dif2 = num2-num1
    print(f'O maior número é o {num2}')
    print(f'A diferença entre eles é {dif2}')
