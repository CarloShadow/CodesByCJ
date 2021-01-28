"""
Dicionários:
o que é...
São coleções do tipo chave/valor (um mapeamente entre chave/valor)
OBS: em algumas linguagens de programação, os dicionários são conhecidos por mapas
Diciocários são representados por chaves {}

OBS:
  - Chave e valor são separados por dois pontos 'chave:valor';
  - Tanto chave quanto valor podem ser de qualquer tipo de dado
  - Podemos misturar tipos de dados;
"""

# Criação de dicionários
# Forma 1 (mais comum)

paises = {'br': 'Brasil', 'eua': 'Estados Unidos', 'py': 'Paraguai'}
print(paises)

# Forma 2 (menos comum)

paises1 = dict(br='Brasil', eua='Estados Unidos', py='Paraguay')
print(paises1)

# =====================================================================================================================

# Acessando elementos

# Forma 1 - Acessando via chave, da mesma forma que lista/tupla

print(paises['br'])

# Forma 2 - Acessando via get - Recomendada

print(paises.get('br'))
print(paises.get('ru'))  # valor 'ru' inexistente no dicionário = None

pais = paises.get('br')

if pais:
    print(f'Encontrei o país {pais}')
else:
    print('Não encontrei o paí')

pais = paises.get('br', 'Não encontrado')  # Nessa variacel pais encontra a chave 'ru', caso nao encontre coloque
#  o valor 'Não encontrado' no lugar

print(f'Resultado: {pais}')

# Podemos verificar se a determinada chave se encontra em um dicionário

print('br' in paises)
print('ru' in paises)
print('Estados Unidos' in paises)

if 'ru' in paises:
    russia = paises['ru']

# ====================================================================================================================

# Podemos utilizar qualquer tipo de dado (int, float, string, boolean), inclusive lista, tupla dicionário, como chaves
# de dicionários.

# Tuplas por exemplo são bastante interessantes de serem utilizadas como chave de dicionários, pois as mesmas
# são imutáveis.

telefones = {
    ('Pizzaria', 'Escarpone'): 1198461-2596,
    ('Zé', 'Buceta'): 1199645-8423,
    'Chupisco': 1198546-1651,
}

if ('Pizzaria', 'Escarpone') in telefones:
    print('yes')

print(type(telefones))

# =====================================================================================================================

# Adicionar elementos em um dicionário

receita = {'jan': 100, 'fev': 120, 'mar': 300}

print(receita)

# Forma 1 - Mais comum

receita['abr'] = 350
print(receita)

# Forma 2

novo_dado = {'mai': 500}

receita.update(novo_dado)

print(receita)

# Atualizando(substituindo) dados de um dicionário
# Forma 1

receita['mai'] = 550

print(receita)

# Forma 2

receita.update({'mai': 600})
print(receita)

# CONCLUSÃO 1: A forma de adicionar novos elementos ou atualizar dados em um dicionário é a mesma.
# CONCLUSÃO 2: Em dicionário, NÃO podemos ter chaves repetidas.

# ===================================================================================================================

# Remover dados de um dicionário

receita = {'jan': 100, 'fev': 120, 'mar': 300}

print(receita)

# Forma 1 - Mais comum

ret = receita.pop('mar')
print(ret)

print(receita)

# OBS 1: Aqui precisamos SEMPRE informar a chave, e caso não encontre o elemento, um KeyError é retornado
# OBS 2: Ao removermos um objeto, o valor deste objeto é sempre retornado.

# Forma 2

del receita['fev']

print(receita)

# Se a chave não existir será gerado um KeyError.
# OBS: Neste caso o valor removido não é retornado.

# ====================================================================================================================

# Quando utilizar os dicionários?

# Imagine que voçê tem um comércio eletrônico, onde temos um carrinho de compras na qual adicionamos produtos.

"""
Carrinho de Compras:
    produto 1:
        - nome;
        - quantidade;
        - preço;
    produto 2:
        - nome;
        - quantidade;
        - preço;
"""

# 1 - Poderíamos utilizar uma Lista para isso? A resposta é sim
# Teríamos que saber qual índice de cada informção no produto.
carrinho = []

produto1 = ['Playstation', 1, 2300.00]
produto2 = ['God of War 4', 1, 150.00]

carrinho.append(produto1)
carrinho.append(produto2)

print(carrinho)

# 2 - Poderíamos utilizar uma tupla pra isso? A resposta é sim
# Teríamos que saber qual índice de cada informção no produto.

produto1 = ('Playstation 4', 1, 2300.00)
produto2 = ('God of War', 1, 150.00)

carrinho = (produto1, produto2)

print(carrinho)

# 3 - Poderíamos utilizar um dicionário pra isso? A resposta é sim

carrinho = []

produto1 = {'nome': 'Playstation 4', 'Quantidade': 1, 'preço': 2300.00}
produto2 = {'nome': 'God of War', 'quantidade': 1, 'preço': 150.00}

carrinho.append(produto1)
carrinho.append(produto2)

print(carrinho)

# Desta forma, facilmente adicionamos ou removemos produtos no carrinho e em cada produto
# podemos ter a certeza sobre cada informação

# ====================================================================================================================

# Métodos de dicionários.

d = dict(a=1, b=2, c=3)

print(d)

# Copiando um dicionário para outro
# Forma 1

novo = d.copy()  # Deep Copy - Só a copia a copia é alterada

print(novo)

novo['d'] = 4   # Pega esse dicionario novo e add a chave 'd' com valor 4

print(d)
print(novo)

# Forma 2 - Shallow Copy - Os dois são alterados

novo = d

print(novo)

novo['d'] = 4

print(d)
print(novo)

# Limpando o dicionário (Zerar dados)

d.clear()

print(d)

# ====================================================================================================================

# Forma não usual de criação de dicionários

outro = {}.fromkeys('a', 'b')  # chave = 'a',  valor = 'b'

print(outro)

#  Adicionando o valor 'desconhecido' a todas a chaves entre []
usuario = {}.fromkeys(['nome', 'pontos', 'email', 'profile'], 'desconhecido')
print(usuario)

# O método fromkeys recebe dois parâmetros: um interável e um valor.
# Ele vai gerar para cada valor do iteravel uma chave e irá atribuir a esta chave o valor informado.

veja = {}.fromkeys('teste', 'valor')  # Atribuindo a cada letra da palavra 'teste' o valor 'valor', menos as duas...
#  ultimas letras 'te' por que em dicionários não se repete a chave.
print(veja)

#  Utilizando range

veja = {}.fromkeys(range(1, 10), 'novo')   # Atribuindo aos numeros(chaves) de 1 a 10 os valores 'novo'
print(veja)
