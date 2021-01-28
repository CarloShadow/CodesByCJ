"""
Ler uma quantidade de notas determinada de alunos
armazenar no vetor
calcular média
imprimir média
"""

lista = []
for i in range(0, 5):
    notas = int(input('Digite as notas: '))
    lista.append(notas)
soma = sum(lista)
media = soma / 5
print(media)
