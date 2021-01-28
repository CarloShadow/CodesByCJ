"""
MATRIZES
Listas

Listas em python funcionam como vetores ou matrizes (arrays) em outras linguagens, com a diferença de serem
dinamicos e tbm podemos colocarmos QUALQUER tipo de dado.

Linguagem C/Java: Arrays
     - Possuem tamanho e tipo de dado fixo;
     Ou seja, nestas linguagens se voçê criar um array do tipo int e com tamanho 5,
     este array será SEMPRE do tipo inteiro e poderá ter SEMPRE no maximo 5 valores.

Já em Python:


 - Dinâmico: Não possuem tamanho fixo; Ou seja, podemos criar a lista e ir adicionando elemtento.
 - Qualquer tipo de dado: Não possuem tipo de dado fixo; Ou seja podemos colocar qualquer tipo de dado;

As listas em Python são representadas pro colchetes: []
"""


lista1 = [1, 99, 4, 27, 15, 22, 3, 1, 44, 42, 27]
lista2 = ['C', 'a', 'r', 'l', 'o', 's']
lista3 = []
lista4 = list(range(11))
lista5 = list('Carlos Alberto')

# PODEMOS COLOCAR QUALQUER TIPO DE DADO EM UMA LISTA, INCLUSIVE MISTURANDO
lista7 = [1, 22.6554, True, 'Carl', 'b', [1, 2, 2], 6566]
print(lista7)
print(type(lista7))

# Podemos facilmente checar se determinado valor está dentro da lista
# Conseguimos apenas verificar um conjunto ou um valor por vez
if 27 in lista1:
    print('Achei')
else:
    print('Achei não paça')

# Podemos facilmente colocar uma lista em ordem
lista1.sort()
print(lista1)

# Podemos facilmente contar o número de ocorrências como (int e strings) dentro da lista
print(f'A lista contem {lista1.count(1)} numeros 1')
print(f'A lista contem {lista5.count("o")} letras o')

# Aidcinonar elementos em listas
# Para adicionar elementos e valores nas listas, usamos a função append
print(lista1)
lista1.append(25)
print(lista1)

# Com append podemos adicionar só 1 elemento ou valor por vez e coloca a lista como elemento único
# lista1.append(25, 10, 80) ~ERROR
lista1.append([1, 5, 6])  # Mas podemos colocar uma lista dentro de outra
print(lista1)

# Podemos usar a função extend que coloca cada elemento individualmente adicionando 1 a 1
lista1.extend([110, 56254, 5222])
print(lista1)

# Podemos inserir um novo elemento informando a posição do indice
# Isso não substitui o valor inical. O mesmo será deslocado para a direira da lista.
lista1.insert(2, 'Novo valor')
print(lista1)

# Podemos facilmente juntar listas de duas formas
# lista6 = lista1 + lista2
lista1.extend(lista2)
print(lista1)

# Podemos inverter uma lista ultilziando o reverse ou [::-1]
# Forma 1
lista1.reverse()
print(lista1)

# Forma 2
print(lista1[::-1])

# Copiar uma lista

lista6 = lista2.copy()
print(lista6)

# Contar quantos elementos há na lista
print(len(lista2))

# Podemos remover o último elemento de uma lista com o pop
# OBS: O pop não somente remove o último elemento, mas também o retorna (no terminal)

print(lista5)
lista5.pop()
print(lista5)

# Podemos remover um elemento pelo indice
# OBS: Os elementos á direita deste índice serão deslocados para a esquerda
# OBS: Se não houver elemento no indice informado, teremos o erro IndexError
lista5.pop(3)
print(lista5)

# Podemos remover TODOS os elementos com clear
print(lista5)
lista5.clear()
print(lista5)

# Podemos repetir elementos em uma lista
new = [1, 2, 3]
new = new * 3
print(new)

# Podemos facilmente converter uma string para uma lista
# Exemplo 1
curso = 'Programação em Python: Essencial'
print(curso)
curso = curso.split()
print(curso)

# OBS: Por padrão, o split separa os elementos da lista pelo espaço entre elas

# Exemplo 2
eu = 'Carlos,Alberto,da,Cruz,Bastos,Junior'
print(eu)
eu = eu.split(',')  # Neste caso ele vai entender que o espaçamento é a vírgula que foi especificada
print(eu)

# Convertendo uma lista em uma string
lista6 = ['Programação', 'em', 'Python:', 'Essencial']
print(lista6)

# Abaixo estamos falando: Pega a lista6, coloca espaço entre cada elemento e transforma em uma string usando o join
curso = ' '.join(lista6)
print(curso)
# Podemos fazer com qualquer caractere usando o join
curso = '#'.join(lista6)
print(curso)

# Iterando sobre listas

# Exemplo 1 (Utilziando for)
# Para cada elemento dentro desta list, imprime este elemento
for elemento in lista1:
    print(elemento)

# (Somando todos os elementos)
soma = 0
for elemento in lista4:
    print(elemento)
    soma += elemento
print(soma)

# Exemplo 2 (Ultilizando while)
carrinho = []
produto = ''

while produto != 'sair':
    print("Adicione um produto na lista ou digite 'sair' para sair: ")
    produto = input()
    if produto != 'sair':
        carrinho.append(produto)

for produto in carrinho:
    print(produto)

# Ultilizando variáveis em listas
num1 = 1
num2 = 2
num3 = 3
num4 = 4
num5 = 5

numeros = [num1, num2, num3, num4, num5]
print(numeros)

# Fazemos acesso aos elementos de forma indexada
#            0        1        2        3
cores = ['verde', 'amarelo', 'azul', 'branco']

print(cores[0])
print(cores[1])
print(cores[2])
print(cores[3])

# Fazer acesso aos elementos de forma indexada inversa
#          -4        -3        -2      -1
cores = ['verde', 'amarelo', 'azul', 'branco']

print(cores[-1])
print(cores[-2])
print(cores[-3])
print(cores[-4])

cores = ['verde', 'amarelo', 'azul', 'branco']

for cor in cores:
    print(cor)

indice = 0
while indice < len(cores):  # Enquanto indice for menor que len(tamanho) de cores, no caso 4 cores
    print(cores[indice])    # imprima cores no indice
    indice += 1  # indice recebe indice + 1

# Gerar um indice em um for
cores = ['verde', 'amarelo', 'azul', 'branco']

for indice, cor in enumerate(cores):  # Coloca chave(núemros) em indice e o valor(cores) em cor
    print(indice, cor)

# Listas aceitam valores repetidos
lista14 = []

lista14.append(25)
lista14.append(25)
lista14.append(25)
lista14.append(50)
lista14.append(50)
lista14.append(25)

print(lista14)

# Encontrar o indice de um elemento na lista

numeros2 = [5, 6, 7, 5, 8, 9, 10]

# Em qual índice da lista está o valor 6?
print(numeros2.index(6))

# Em qual índice da lista está o valor 9?
print(numeros2.index(9))

# Caso haja dois elementos iguais, ele mostrará o qual estiver em primeiro

# Podemos fazer busca dentro de um range, ou seja, qual indice começar a buscar.
print(numeros2.index(5, 1))  # Encontre o valor 5 apartir do indice 1
print(numeros2.index(5, 2))  # Encontre o valor 5 apartir do indice 2

# Podemos fazer busca dentro de um range inicio/fim
print(numeros2.index(8, 3, 6))  # Ache o valor 8 entre 3 e 6

# OBS: Caso não haja este elemento na lista, será apresentado erro ValueError


# Slicing
# lista[inicio:fim:passo]
# range[inicio:fim:passo]

# Trabalhando com slice de lista com o parametro 'inicio'

lista9 = [1, 2, 3, 4]

print(lista9[1:])  # Iniciando no indice 1 e pegando todos os elementos restantes
print(lista9[::])  # Pegando todos os elementos

# Trabalhando com slice de lista com o parametro 'fim'

print(lista9[:3])  # Começa em 0, pega até o indice 2 - 1

print(lista9[:4])  # Começa em 0, pega até o índice 4 - 1

print(lista9[1:3])  # Começa em 1, pega até o índice 3 - 1

# Trabalhando com slice de lista com o parâmetro 'passo'
print(lista9[1::2])  # Começa em 1, vai até o final, de 2 em 2
print(lista9[::2])   # Começa em 0, vai até o final, de 2 em 2

# Invertendo valores em uma lista

nomes = ['Geek', 'University']

nomes[0], nomes[1] = nomes[1], nomes[0]  # Vai virar 'University Geek'

print(nomes)

# Outro jeito

nomes = ['Geek', 'University']

nomes.reverse()  # Vai virar 'University Geek'
print(nomes)


# Soma*, Valor máximo, Valor mínimo, tamanho
# * Se o valores forem todos inteiros ou reais
lista10 = [1, 2, 3, 4, 5, 6, 7, 8, 9]

print(sum(lista10))  # Soma
print(max(lista10))  # máximo valor
print(min(lista10))  # mínimo valor
print(len(lista10))  # tamanho da lista

# Transformar uma lista em tupla
lista11 = [1, 2, 3, 4, 5, 6, 7, 8, 9]
print(lista11)
print(type(lista11))

tupla = tuple(lista11)  # Convertendo lista em tuplas
print(tupla)
print(type(tupla))

# Desempacotamento
lista = [1, 2, 3]

num1, num2, num3 = lista

print(num1)
print(num2)
print(num3)

# OBS: Se houver uma quantidade de números diferente na variável, teremos ValueErros


# Copiando uma lista para outra (shallow copy e deep copy)

lista11 = [1, 2, 3]
print(lista11)

nova = lista11.copy()  # Cópia
print(nova)

nova.append(4)

print(lista11)
print(nova)

# Ao ultilziarmos a lista.copy() copiamos os dados da lista para uma nova lista, mas elas
# ficaram totalmente independetes, ou seja, modificando uma lista, não afeta a outra. Isso em python
# é chamado de Deep Copy

# Forma 2 - Shalow Copy
lista12 = [1, 2, 3]
print(lista12)

nova2 = lista12

nova2.append(4)

print(lista12)
print(nova2)

# Ao ultizarmos a cópia via atribuição e copiamos os dados da lista para a nova lisata,
# mas após realizar a modificação em uma das listas, essa modificação se refletiu em ambas listas.
# Isso em Python é chamado de Shallow Copy.
