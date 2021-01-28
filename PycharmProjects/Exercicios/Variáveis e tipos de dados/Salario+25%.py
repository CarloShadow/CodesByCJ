salario = float(input('Digite o seu salario R$: '))

novo = salario + (salario*25/100)
dif = novo - salario

print('O seu salario aumentou de R${0:.2f} para R${1:.2f}'.format(salario, novo))
print('O aumento é de R${0:.2F}'.format(dif))
