"""
ler um número indeterminado de idade de pessoas
calcular média de idade
para quando entrada for 0
"""

while True:
    idade = int(input('Informe sua idade: '))
    if idade == 0:
        print(f'A idade {idade} é inválida')
        break


