km = int(input('Digite a quantidade KM: '))
gas = int(input('Digite a quantidade de gasolina: '))

med = km/gas

if med < 8:
    print(f'Seu faz {med:.2f}Km por litro')
    print('Venda o carro')
elif (med >= 8) and (med <= 12):
    print(f'Seu faz {med:.2f}Km por litro')
    print('Econômico')
else:
    print(f'Seu faz {med:.2f}Km por litro')
    print('Super econômico')
