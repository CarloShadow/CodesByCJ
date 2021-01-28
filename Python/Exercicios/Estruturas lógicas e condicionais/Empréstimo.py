sal = float(input('Informe o seu salário: '))
parc = float(input('Informe o valor das prestações: '))

if parc > sal*20/100:
    print('Empréstimo não concedido')
else:
    print('Empréstimo concedido')
