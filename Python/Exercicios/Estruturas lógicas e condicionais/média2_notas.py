lab = float(input('Informe a nota do trabalho de laboratório: '))
sem = float(input('Informe a nota do avaliação semestral: '))
fin = float(input('Informe a nota do exame final: '))

media = ((lab*2)+(sem*3)+(fin*5))/10
print(f'{media:.1f}')
if media <= 2.9:
    print('O aluno foi reprovado ')
elif (media > 2.9) and (media <= 4.9):
    print('O aluno está de recuperação')
elif (media > 4.9) and (media <= 10):
    print('O aluno foi aprovado')
else:
    print('Nota invalida')
