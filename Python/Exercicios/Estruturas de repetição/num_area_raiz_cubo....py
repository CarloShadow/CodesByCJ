"""
ler conjunto de números nao determinado de valores
escrever cada número o quadrado, o cubo e a raiz quadrada dele
finalizar se a entrada for negativa ou 0

"""
while True:
    num = int(input('Informe o número: '))
    if num <= 0:
        print(f'O número {num} é inválido')
        break
    else:
        quadra = num ** 2
        cubo = num ** 3
        raiz = num ** 0.5
    print(f'Número ao quadrado: {quadra}')
    print(f'Número ao cubo: {cubo}')
    print(f'Raiz quadrada do número: {raiz:.4f}')
