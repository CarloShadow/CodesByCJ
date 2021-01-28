"""
Saindo de loops com breaks
Ultilizamos o break para sair de loops de maneira prejetada.

"""
# Exemplo com for

for num in range(10, 1, -1):
    if num <= 6:
        break
    else:
        print(num)
print('Fim')

# Exemplo com while

while True:
    comando = input('Me beija? ')
    if comando == 'sim':
        print('Só vem')
        break
    elif comando == 'talvez':
        print('Ta tirando a favela?')
        print('Fala sim pfvr')
    elif comando == 'hoje não':
        print('Quer ficar careca?')
        print('é agora ou nunca')
    elif comando == 'não':
        print('Não uma porra')
        print('Resposta errada')
    else:
        print('Resposta super errada parça')


