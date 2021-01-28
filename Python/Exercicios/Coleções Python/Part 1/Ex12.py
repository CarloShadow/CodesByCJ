"""
receber 5 valores
ler 5 valores
mostrar todos os valores lidos
mostrar o maior
mostrar o menor
mostrar a média
"""
lista = []

for num in range(0, 5):
    num = int(input('Digite o número: '))
    lista.append(num)
    maior = max(lista)
    menor = min(lista)
    soma = sum(lista)
    media = soma / 5
print(f'Números digitados: {lista}')
print(f'Maior número: {maior}')
print(f'Menor número: {menor}')
print(f'Média: {media}')
