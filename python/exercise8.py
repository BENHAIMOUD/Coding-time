"""
Write a program that displays the following result:
 1 * 1 = 1
 11 * 11 = 121
 111 * 111 = 12321
 1111 * 1111 = 1234321
 11111 * 11111 = 123454321
 111111 * 111111 = 12345654321
 1111111 * 1111111 = 1234567654321
 11111111 * 11111111 = 123456787654321
 111111111 * 111111111 = 12345678987654321
"""
# PROGRAM STARTS
a = 1
b = 1
cpt = 10
print("%d * %d = %d" % (a, b, a * b))
for i in range(0, 8):
    a += cpt
    b += cpt
    print("%d * %d = %d" % (a, b, a * b))
    cpt = cpt * 10
print("\n----------END OF PROGRAM-----------")
