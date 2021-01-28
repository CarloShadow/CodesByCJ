"""
ler um número determinado de vetores
ler um número x
contar o multiplos do número x no vetor
mostrar os números na tela
"""

# lista = []
#
# for i in range(5):
#     n = int(input('Digite valor: '))
#     lista.append(n)
# for e in range(1):
#     x = int(input('Digite para o calculo: '))
#     if n % x == 0:
#         print(x)
lista = []
iguais = []

for i in range(0, 5):
    n = int(input('Digite valor: '))
    lista.append(n)
x = int(input('Digite o número para o calculo: '))
if n % x == 0:
    iguais.extend(x)
    conta = iguais.count()
    print(iguais)
    print(conta)
else:
    print(f'Esse número não é multiplo de {iguais.append(x)}')
