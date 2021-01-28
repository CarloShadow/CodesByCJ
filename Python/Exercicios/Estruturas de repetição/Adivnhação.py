from random import randint

while True:
    ale = randint(0, 9)
    num = int(input('Informe o número: '))
    if num > ale:
        print('O número é maior')
    elif num < ale:
        print('O número é menor')
    else:
        print('Acerto coroi')
        break
