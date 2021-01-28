"""
Ler dois conjuntos de 10 valores
conjunto 1 é o código dos alunos
conjunto 2 é a altura dos alunos
encontrar aluno mais baixo e mais alto
mostrar numero do aluno mais baixo e alto junto com suas alturas

"""
cod = []
alt = []

for _ in range(3):
    num1 = input('Digite o seu nome: ')
    num2 = (float(input('Digite sua altura: ')))
    cod.append(num1)
    alt.append(num2)
aluno = [cod, alt]
maior = max(aluno)
menor = min(aluno)

print(f'O aluno mais alto é o {maior} ')
print(f'O aluno mais baixo é o {menor}')


