# Inacabado

dias = int(input('Quantos dias voçê trabalhou? '))

if dias > 31:
    print('Digite um número menor que 31')
else:
    conta = dias*30
    sal = conta - (conta*8/100)
    desc = conta - sal

print('O seu salario com desconto é {0:.2f}'.format(sal))
print('O valor do desconto é de {0:.2f}'.format(desc))



