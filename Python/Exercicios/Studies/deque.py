"""
Deque
 - Podemos dizer que o deque é uma lista de alta performance.

"""

from collections import deque

# Criando deques

deq = deque('Carlos')

print(deq)

# Adicionando elementos a deque

deq.appendleft('B')  # Adicinando elemento no começo

print(deq)

# Removendo elementos

print(deq.popleft())  # Removendo e retorna o primeiro elemento


