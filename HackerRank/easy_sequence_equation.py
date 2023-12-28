def permutationEquation(p):
    for i in p:
        p1 = p.index(i) + 1
        p2 = p.index(p1) + 1
        p3 = p.index(p2) + 1
        print(p3)

permutationEquation([4, 3, 5, 1, 2])