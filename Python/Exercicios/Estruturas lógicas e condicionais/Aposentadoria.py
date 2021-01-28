idade = int(input('Informe sua idade: '))
tempo = int(input('Informe o tempo trabalhado: '))

if (idade >= 65) or (tempo >= 30):
    print('Idade ou tempo ok')
elif (idade >= 60) and (tempo >= 25):
    print('Idade e tempo ok')
else:
    print('Voçê não tem os requisitos para se aposentar')
