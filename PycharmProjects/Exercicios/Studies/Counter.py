"""
Counter

Collections -> High-performance Container Datatypes

Counter - Recebe um interável como parâmetro e cria um objeto do tipo Collections counter que é parecido
com um dicionário, contendo como chave o elemento da lista passada como parâmetro e como valor a quantidade
de ocorrências desse elemento.
"""

# Utilizando o Counter
# Exemplo 1

from collections import Counter

lista = [1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 32, 32, 32, 32, 32, 3, 2]

# Utilizando  o Counter
res = Counter(lista)   # Contando a quantidade de cada número da coleção
print(res)

# Counter({1: 7, 2: 6, 32: 5, 3: 1})

# Exemplo 2

#  Contando strings
print(Counter('Carlos Alberto'))

# Exemplo 3

texto = """ 
I push my fingers into my eyes
It's the only thing that slowly stops the ache
But it's made of all the things I have to take
Jesus, it never ends, it works it's way inside
If the pain goes on
I have screamed until my veins collapsed
I've waited last, my time's elapsed
Now, all I do is live with so much fate
I've wished for this, I've bitched at that
I've left behind this little fact:
You cannot kill what you did not create
I've gotta say what I've gotta say
And then I swear I'll go away
But I can't promise you'll enjoy the noise
I guess I'll save the best for last
My future seems like one big past
You're left with me 'cause you left me no choice
"""

palavras = texto.split()

res = Counter(palavras)

print(res)

# Encontrando as 5 palavras com mais ocorrência no texto
print((res.most_common(5)))
