"""
ler 10 números diferentes
armazenar num vetor na ordem que forem sendo lindos
se o usuario digitar um numero igual aos outros, o programa pede para digitar outro número

"""

vetor = []

for _ in range(5):
    num = int(input('Digite os números: '))
    vetor.append(num)
    if vetor.count(num):
        num = int(input('Não pode haver duplicações. Digite os números: '))
        vetor.append(num)
print()