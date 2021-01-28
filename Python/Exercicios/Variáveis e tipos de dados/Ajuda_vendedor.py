valor = float(input('Digite o valor do produto: '))

desc = valor-(valor*10/100)
parc = valor/3
com_avis = (desc*5/100)
com_parc = (valor*5/100)

print(f'O valor total a paga com desconto de 10% fica: R${desc:.2f}')
print(f'O valor parcelado em 3x fica: R${parc:.2f}')
print(f'O valor da comissão do pagamento a vista é: R${com_avis:.2f}')
print(f'O valor da comissão do pagamento parcelado é: R${com_parc:.2f}')




