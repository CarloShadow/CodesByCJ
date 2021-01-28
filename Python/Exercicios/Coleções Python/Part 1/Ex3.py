"""
ler 10 elementos
armazenando os elementos em um vetor
calcular o quadrado dos elementos
armazenar o resultado em outro vetor
imprimir todos

"""

lista = []
quad = []

for i in range(0, 10):
    num = int(input('Digite os números: '))
    lista.append(num)
    calculo = num ** 2
    quad.append(calculo)
print(lista)
print(quad)
