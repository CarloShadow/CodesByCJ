"""
receber uma quantidade determinada de números
colocar o números no vetor
mostrar a quantidade de números negativos
mostrar a soma dos números positivos
"""
lista = []
pos = []
neg = []
for i in range(0, 5):
    num = int(input("Digite os números: "))
    lista.append(num)
    if num > 0:
        pos.append(num)
        soma = sum(pos)
    else:
        neg.append(num)
        qtd = len(neg)
print(f'A soma dos positivos é: {soma}')
print(f'A quantidade de negativos é: {qtd}')
