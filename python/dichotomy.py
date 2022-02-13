def resoudreEquationFonctionCroissanteDichotomie(f, k, a, b, e=0.000001):
    start = a
    end = b
    # calculating the length of [a,b]
    discard = b - a
    count = 0
    while discard > e:
        count += 1
        # calcul du milieu
        m = (start + end) / 2
        if f(m) > k:
            # the solution is less than m
            end = m
        else:
            # the solution is greater than m
            start = m
        discard = end - start
    print(count, end, start, m)

def f(x):
    return x**3-x-2;
resoudreEquationFonctionCroissanteDichotomie(f,0,1,2)
