"""
Named Tuple

 - São tuplas, diferenciadas, onde, especificamos um nome para a mesma e também parâmetros.

"""

from collections import  namedtuple

# Forna 1
# Declaração Named Tuple
cachorro = namedtuple('Cachorro', 'idade raça nome')

# Forma 2
cachorro = namedtuple('cachorro', 'idade, raça, nome')

# Forma 3
cachorro = namedtuple('cachorro', ['idade', 'raça', 'nome'])

# Usando

dogson = cachorro(idade=2, raça='Husky', nome='Dogson')

print(dogson)

# Acessando dados

# Forma 1

print(dogson[0])  # idade
print(dogson[1])  # raça
print(dogson[2])  # nome

# Forma 2

print(dogson.idade)  # idade
print(dogson.raça)   # raça
print(dogson.nome)   # nome
