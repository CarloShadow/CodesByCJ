"""
Conjuntos
 - Conjuntos em qualquer linguagem de programação, estamos fazendo referência a Teoria dos conjuntos em matemáetica
 - Aqui no Python, os conjunto são chamados de Sets.
 Dito isto, da mesma forma que na matemática:
 - Sets (conjuntos) não possuem valores duplicados;
 - Sets (conjuntos) não possuem valores ordenados;
 - Elementos não são acessados via índice, ou seja, conjuntos não são indexados;

Conjuntos são bons para se utilizar quando precisamos armazenar elementos
mas não nos importamos com  a ordenação deles. Quando não precisamos se preocupar
com chaves, valores e ítens duplicados.

Os conjuntos (sets) são referenciados em Python com chaves {}

Diferença entre Conjuntos (set) e Mapas (Dicionários) em Python:
    - Um dicionário tem chave/valor;
    - Um comjunto tem apenas valor;
"""

s = {1, 2, 3, 4, 4, 5, 5, 6, 4}  # Vários valores repetidos que serão ignorados

print(s)

# OBS: Ao criar um conjunto, caso seja adicionado um valor já existente, o mesmo
# será ignorado sem gerar error e não fará parte do conjunto

# Podemos verificar se determinado número está contido no conjunto

if 3 in s:
    print('Tem o 3')
else:
    print('Não tem o 3')
# =================================================================================================================

# Podemos colocar qualquer tipo de dados misturados em sets

s = {1, 'b', True, 34.22, 44}

# Podemos iterar em um set normalmente

for valor in s:
    print(valor)

# ====================================================================================================================

# Usos interessantes de sets

# Imagine que fizemos um formulário de cadastro de visitantes em uma feira ou museu e os visitantes
# informam manualmente a cidade de onde moram

# Nós adicionamos cada cidade em uma lista Python, já que uma lista podemos adicionar novos elementos e te repetições

cidades = ['Belo Horizonte', 'São Paulo', 'Campo Grande', 'Cuiaba', 'Campo Grande', 'São Paulo', 'Cuiaba']

print(cidades)
print(len(cidades))

# Agora precisamos saber quantas cidades distintas, ou seja, únicas, temos.

# Podemos utilizar o set

print(len(set(cidades)))

# =====================================================================================================================

# Adicionando elementos em um conjunto
s1 = {1, 2, 3}

s.add(4)
s.add(4)   # Duplicidade não gerar erro. Simplesmente é ignorado e não é adiciondo

# Removendo elementos

# Forma 1

s1.remove(3)  # NÃO é índice! Informamos o valor a ser removido.

print(s1)

# OBS: Caso o valor não seja encontrado será gerado o erro KeyError. Nenhum valor é retornado

# Forma 2

s1.discard(2)

print(s1)

# OBS: Nessa forma se o valor não for encotrado, nenhum erro é gerado

# ====================================================================================================================

# Copiand um conjunto para outro...

# Forma 1 - Deep Copy  (Cada uma tem seu valor independetemente)
s2 = {1, 2, 3}
print(s2)

novo = s2.copy()
print(novo)

novo.add(4)

print(novo)
print(s2)

# Forma 2 - Shallow Copy (As duas vão ter o mesmo valor)

novo = s2

novo.add(5)

print(novo)
print(s2)

# Removendo todos os elementos do conjunto

s2.clear()
print(s2)

# =====================================================================================================================
# Métodos matemáticos de Conjuntos

# Imagine que temos dois conjuntos: Um contendo estudantes do curso python e um
# contendo estudantes do curso de Java

estudantes_python = {'Marcos', 'Patricia', 'Ellen', 'Pedro', 'Julia', 'Guilherme'}
estudantes_java = {'Fernando', 'Gustavo', 'Julia', 'Ana', 'Patricia'}

# Veja que alguns alunos que estudam python também estudam Java.

# Gerar um conjunto de estudantes que não estão no outro curso
so_python = estudantes_python.difference(estudantes_java)  # O estudantes de python que não estão em java
print(so_python)


so_java = estudantes_java.difference(estudantes_python)
print(so_java)

# Precisamos gerar um conjunto com nomes de estudantes únicos

# Forma 1 = Utilizando union
unicos1 = estudantes_python.union(estudantes_java)  # Excluindo as repetições e imprimindo os únicos
print(unicos1)

# Forma 2 - Utilizando o caractere pipe |   # Excluindo as repetições e imprimindo os únicos
unicos2 = estudantes_python | estudantes_java
print(unicos2)

# Gerando um conjunto de estudantes que estão em AMBOS os cursos

# Forma 1 - Utilizando intersection
ambos1 = estudantes_python.intersection(estudantes_java)
print(ambos1)

# Forma 2 - Utilizando o &
ambos2 = estudantes_python & estudantes_java
print(ambos2)

# Soma*, Valor Máximo*, Valor Mínimo*, Tamanho
# * Se os valores forem todos inteiros ou reais

s3 = {1, 2, 3, 4, 5, 6}

print(sum(s3))
print(max(s3))
print(min(s3))
print(len(s))

