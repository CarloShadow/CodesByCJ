"""
ler uma quantidade determinada de valores
colocar no vetor
verificar se tem valores iguais
printar os valores iguais na tela
"""
vetor = set()
igual = set()
for i in range(5):
    vetor.add(int(input('Digite os números: ')))
    igual = vetor[i] & vetor[i]
print(igual)

