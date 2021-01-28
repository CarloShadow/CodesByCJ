"""
Loop for

Usamos loops para iterar sobre sequências e sobre valores iteráveis
Ex:
 - String
   nome = 'Carlos'

 - Lista
   lista = [1, 3, 5, 7, 9]

 - Range
   numero = range (1, 10)


# Iterando sobre uma string
nome = 'Carlos Alberto'
lista = [1, 2, 3, 4, 5]
numeros = range(1, 10)

for letra in nome:
    print(letra)

# Iterando sobre uma lista
for num in lista:
    print(num)

# Iterando sobre um range

for num1 in numeros:
    print(num1)


for valor in enumerate(nome):
    print(valor)


nome = 'Carlos Alberto'
for letra in nome:
    print(letra, end=' ')
"""

qtd = int(input('Quantas vezes deve rodar este loop?: '))
soma = 0

for n in range(1, qtd+1):
    num = int(input(f'Informe o {n}/{qtd} valor: '))
    soma = soma + num
print(f'A soma é {soma}')
