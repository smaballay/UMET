# Imprime la representación de su parámetro entero en número romano

dicc = [(1000, 'M'), (900, 'CM'), (500, 'D'), (400, 'CD'), (100, 'C'), (90, 'XC'), (50, 'L'), (40, 'XL'), (10, 'X'), (9, 'IX'), (5, 'V'), (4, 'IV'), (1, 'I')]

def num_romano():
    romano = ''
    num = int(input("Ingrese un número: "))
    while num > 0:
        for i, r in dicc:
            while num >= i:
                romano += r
                num -= i

    return romano

print ("El número ingresado en romano es:", num_romano())