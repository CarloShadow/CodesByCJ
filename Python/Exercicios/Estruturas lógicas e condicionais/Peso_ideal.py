sexo = input('Informe o seu sexo com "Masculino" ou "Feminino" : ')
alt = float(input('Informe sua altura: '))

if sexo == 'Masculino'.lower().upper():
    pes = (72.7*alt)-58
    print(f'Seu peso ideal é {pes:.3f}')
elif sexo == 'Feminino'.lower().upper():
    pes1 = (62.1*alt)-44.7
    print(f'Seu peso ideal é {pes1:.3f}')
else:
    print('Sexo invalido')
