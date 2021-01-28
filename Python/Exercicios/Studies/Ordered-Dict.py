"""
Ordered Dict - É uma função que orgazina em ordem os elementos de um dicionário

"""

from collections import OrderedDict

dicionario = OrderedDict({'PlayStation 5': 4.999, 'XBox Series X': 4.499, 'GeForce RTX 3080': 5.299})

print(dicionario)

for chave, valor in dicionario.items():
    print(f'Produto:{chave}       Preço:{valor}')
