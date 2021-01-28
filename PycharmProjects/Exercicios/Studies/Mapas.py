"""
Mapas -> Conhecidos em Python como dicionários

"""

receita = {'jan': 100, 'fev': 120, 'mar': 300}

print(receita)

# Imprimindo as chaves iterando
for chave in receita:
    print(chave)

# Imprimindo os valores iterando
for chave in receita:
    print(receita[chave])

# Imprimindo a chave e o valor iterando em cada linha
for chave in receita:
    print(f'Em {chave} recebi {receita[chave]}')

# Imprimindo as chaves uma na frente da outra
print(receita.keys())

# Imprimindo os valores iterando 2
for chave in receita.keys():
    print(receita[chave])
# Imprimindo valores um na frente do outro
print(receita.values())

# Imprimindo os valores iterando 3
for valor in receita.values():
    print(valor)

# Imprimindo as chaves com os valores um em baixo do outro
for chave, valor in receita.items():
   print(f'Chave={chave} e valor={valor}')

# Valor minimo, maximo, soma e tamanho

print(min(receita.values()))
print(max(receita.values()))
print(sum(receita.values()))
print(len(receita))
