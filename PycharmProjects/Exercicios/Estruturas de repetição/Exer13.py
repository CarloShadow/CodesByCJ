"""
npar = int(input('Escreva um número par: '))

for n in range(npar, -2, -2):
    print(n)
"""
npar = int(input('Escreva um número par: '))

if npar % 2 == 0:
    for n in range(npar, -2, -2):
        print(n)
else:
    print(f'O número {npar} não é par')
print('FIM')
