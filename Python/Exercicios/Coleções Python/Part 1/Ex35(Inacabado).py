"""
Ler dois números a e b (positivos menores que 10000) OK

criar um vetor onde cada posição é um algarismo do número. a primeira posição é o menor algarismo
criar um vetor que seja a soma de A e B, usando os vetores anteriormente

"""

a = int(input('Digite o primeiro número: '))
b = int(input('Digite o segundo número: '))

lista = []

while (a > 0) and (a <= 10000) and (b > 0) and (b <= 10000):
    lista.extend([a, b])

print(lista)
