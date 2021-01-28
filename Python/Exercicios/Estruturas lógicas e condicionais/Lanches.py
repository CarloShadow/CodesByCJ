cod = int(input('Digite o código do lanche: '))
qtd = int(input('Digite a quantidade: '))

if cod == 100:
    valor = qtd * 1.20
    print(f'Nome: Cachorro quente \n Valor total: R${valor:.2f}')
elif cod == 101:
    valor1 = qtd * 1.30
    print(f'Nome: Bauru simples \n Valor total: R${valor1:.2f}')
elif cod == 102:
    valor2 = qtd * 1.50
    print(f'Nome: Bauru com ovo \n Valor total: R${valor2:.2f}')
elif cod == 103:
    valor3 = qtd * 1.20
    print(f'Nome: Hamburguer \n Valor total: R${valor3:.2f}')
elif cod == 104:
    valor4 = qtd * 1.70
    print(f'Nome: Cheeseburguer \n Valor total: R${valor4:.2f}')
elif cod == 105:
    valor5 = qtd * 2.20
    print(f'Nome: Suco \n Valor total: R${valor5:.2f}')
elif cod == 106:
    valor6 = 1.00
    print(f'Nome: Refrigerante \n Valor total: R${valor6:.2f}')
else:
    print('Código invalido')
