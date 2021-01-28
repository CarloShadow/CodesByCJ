vetor = []

for _ in range(7):
    num = int(input('Informe os números: '))
    vetor.append(num)
    if num == 0:
        vetor.pop()
print(vetor)
