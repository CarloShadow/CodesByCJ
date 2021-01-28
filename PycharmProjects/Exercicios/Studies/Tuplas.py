"""
VETOR
Tuplas (Tuple)
Tuplas são bem parecidas com listas.
Exitem basicamente duas diferenças:

1 - As tuplas são representadas por parênteses ()
2 - As tuplas são imutáveis: Isso significa que ao se criar uma tuplas ela não muda.
toda operção em uma tupla gera uma nova tupla

- Por  quê usar tuplas?

1 - Tuplas são mais rapidas do que listas
2 - Tuplas são mais seguras*
- * isso porque trabalhar elementos imutáveis tras mais segurança ao código.

OBS: Métodos para adição e remoção de elementos não existem em tuplas, porque elas são imutáveis
OBS: Soma, valor maximo, valor minimo e tamanho são as mesmos códigos para as listas
"""
# Dica: Devemos ultilizar tuplas SEMPRE que não precisarmos modificar os dados contidos em uma coleção
# Exemplo 1
meses = ('Janeiro', 'Fevereiro', 'Março', 'Abril', 'Maio', 'Junho', 'Julho', 'Agosto', 'Setembro', 'Outubro', 'Novembro', 'Desembro')

# O acesso a elementos de uma tupla também é semelhante a de uma lista

print(meses[5])

# Iterar com while

i = 0

while i < len(meses):
    print(meses[i])
    i += + 1

# Verificando em qual índice um elemento está a tupla
print(meses.index('Junho'))

# Slicing
# tupla[inicio:fim:paso]
print(meses[5:9])

# CUIDADO 1: As tuplas são representadas por (), mas veja:

tupla1 = 1, 2, 3, 4, 5, 6, 7,  # Isso é uma tupla
print(tupla1)

tupla2 = 1, 2, 3, 4, 5, 6, 7,   # Isso é uma tupla
print(tupla2)

# CUIDADO 2: Tuplas com 1 elemento

tupla3 = (1)  # Isso não é uma tupla
print(tupla3)

tupla4 = (4,)  # Isso é uma tupla
print(tupla4)

tupla5 = 4,  # Isso é uma tupla
print(tupla5)

# CUIDADO: Podemos concluir que tuplas são definidas pela VÍRGULA e não pelo uso de parênteses

#                ---------------------------------------------------------

# Podemos gerar uma tupla dinamicamente com range(inicio,fim,passo)
tupla6 = tuple(range(11))
print(tupla6)

# Desempacotamento de tupla
tupla7 = ('Carlos Alberto', '25')
nome, idade = tupla7
print(nome)
print(idade)

# Verificar se determinado elemento está contido na tupla
tupla11 = (1, 2, 3)
print(3 in tupla11)

#               ---------------------------------------------------------------------------

# Concatenação de tuplas (Juntando tuplas)

tupla8 = (1, 2, 3)
print(tupla8)

tupla9 = (4, 5, 6)
print(tupla9)

print(tupla8 + tupla9)   # Printando a junção de duas duplas

print(tupla8)  # As duas tuplas juntadas 8 e 9 continuam as mesmas pois são imutavéis
print(tupla9)

tupla10 = tupla8 + tupla9  # Adicionando as duas tuplas em uma nova tupla
print(tupla10)

tupla8 = tupla8 + tupla9   # Adicionando a tupla 9 na 8, e assim modificando a 8
print(tupla8)
#               -------------------------------------------------------------------------------

# Iterando sobre uma tupla
tupla12 = (1, 2, 3)

for n in tupla12:   # Imprimindo cada elemento, um em baixo do outro
    print(n)

for indice, valor in enumerate(tupla12):   # Como saber o indice de cada elemento
    print(indice, valor)
#                   ----------------------------------------------------------------------

#  Contando elementos dentro de uma tupla

tupla12 = ('C', 'a', 'r', 'l', 'o', 's', ' ' 'A', 'l', 'b', 'e', 'r', 't', 'o')
print(tupla12.count('o'))     # Contando os elementos

nome = tuple('Carlos Alberto')    # Convertendo uma string para uma tupla
print(nome.count('o'))    # Contando os elementos
# ---------------------------------------------------------------------------------------------------------

# Copiando uma tupla para outra

tupla13 = (1, 2, 3)
print(tupla13)

nova = tupla13  # Na tupça não temos o problema de Shallow copy

print(nova)
print(tupla13)

outra = (4, 5, 6)

nova = nova + outra

print(nova)
print(tupla13)

