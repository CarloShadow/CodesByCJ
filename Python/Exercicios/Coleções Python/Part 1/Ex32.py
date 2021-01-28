"""
ler 2 vetores inteiros x e y de 5 elementos cada (não pode ser elementos repetidos) - OK
somar cada elemento de x com o elemento da mesma posição que y - OK
multiplicar cada elemento de x com o elemento da mesma posição que y - OK

diferença entre x e y: todos os elementos de x que nao exista em y
interseção entre x e y: apenas elementos que apareção nos dois vetores
unir x e y: todos os elementos de x, e todos os elementos de y q nao estão em x
"""
x = []
y = []
soma = []
mult = []
for i in range(5):
    x.append(int(input('Digite os números da primeira coluna: ')))
for i in range(5):
    y.append(int(input('Digite os números da segunda coluna: ')))
for i in range(5):
    s = x[i] + y[i]
    soma.append(s)
for i in range(5):
    m = x[i] * y[i]
    mult.append(m)

print(f'A soma é {soma}')
print(f'A multiplicação é {mult}')

x = set(x)
y = set(y)

print(f'União: {x.union(y)}')
print(f'Difereça: {x.difference(y)}')
print(f'Interceção: {x.intersection(y)}')
