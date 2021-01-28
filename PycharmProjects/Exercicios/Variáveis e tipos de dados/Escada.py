deg = float(input('Informe a altura do degrau em CM: '))
altura_dese = int(input('Informe a altura que deseja alcançar em metros : '))

res = int(100/deg/100*altura_dese)
print(f'Voçê terá que subir {res} degraus')
