"""
Propose a program that displays all pairs of numbers from 1 to 100 such
that the sum of their divisors are equal.
(14,15)
14 : 1+2+7+14=24;
15 : 1+3+5+15=24;
"""


# PROGRAM STARTS
def divisorSum(n):
    sum = 0
    for i in range(1, n + 1):
        if (n % i == 0):
            sum = sum + i
    return int(sum)


for i in range(1, 100):
    cpt = 100
    while cpt > i:
        sum1 = divisorSum(i)
        sum2 = divisorSum(cpt)
        # print("(%d,%d):%d;%d" % (i, cpt, sum1, sum2))
        if sum1 == sum2:
            # print("%d:%d;%d" % (i, sum1, sum2))
            print("(%d;%d)" % (i, cpt))
        cpt -= 1
print("\n----------END OF PROGRAM-----------")