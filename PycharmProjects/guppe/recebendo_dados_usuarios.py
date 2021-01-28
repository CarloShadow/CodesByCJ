"""
Recebendo dados do usuário
input() -> todo dado recebido via input é do tipo string

string -> Em Python, string é tudo que estiver entre:
- Aspas simples: 'Carlos'
- Aspas duplas: "Carlos"
- Aspas simples triplas: '''Carlos'''
"""
# - Aspas duplas triplas: """Carlos"""

print('Qual é o seu nome? ')
nome = input()

print(f'Seja bem-vindo {nome}')

# print('Qual sua idade? ')
# idade = int(input())

idade = int(input('Qual é a sua idade? '))

print(f'O(a) {nome} tem {idade} anos')

print(f'O(a) {nome} nasceu em {2020 - idade} ')


