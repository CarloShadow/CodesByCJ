"""
Default Dict

 - Ao criar um dicionário utilizando um Default dict, nós informamos um valor default,
 podendo utiliza um lambda para isso. Este valor será utilizado sempre que não houver
 um valor definido. Caso tentamos acessar uma chave que não existe, essa chave será
 criada e o valor defautlt será atribuido.

 OBS: Lambdas são funções sem nome, que podem ou não receber parâmetros de entrada
 e reornar valores.
"""

from collections import defaultdict

dicionario = defaultdict(lambda: 'Não existe')

dicionario['curso'] = 'Programação em Python: Essencial'

print(dicionario)

print(dicionario['outro'])

print(dicionario)
