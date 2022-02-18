"""
Ecrire un programme en langage PYTHON qui permet de lire une succession de notes (strictement positives)
entrées au clavier. La saisie d’une note  négative est la fin.
Le programme affiche la plus grande et la plus petite note ainsi que le
nombre de fois où ce maximum et ce minimum ont été entrés.
Le programme affiche aussi la moyenne de ces notes.

Exemple d’exécution :
Veuillez saisir vos notes :
5 10 18 10 18 16 5 15 18 -2
Max = 18, saisi 3 fois
Min = 5, saisi 2 fois
Moyenne des notes = 12
"""
# creating an empty list
lst = []
# number of elements as input
n = int(input("Enter number of elements : "))
sum = 0
moyen = 0
# iterating till the range
for i in range(0, n):
    ele = int(input(f"entrez la valeur des element{i + 1} :"))
    lst.append(ele)  # adding the element
    sum = sum + ele
    moyen = sum / n
print(sum, moyen)
max = lst[0]
min = lst[0]
repMax = 0
repMin = 0
for j in lst[0:len(lst)]:
    if j > max:
        max = j
    if j < min:
        min = j

for i in lst[0:len(lst)]:
    if i == max:
        repMax += 1
    if i == min:
        repMin += 1
print(lst)
print("Max = ", max, " saisi", repMax, "fois")
print("min= ", min, " saisi", repMin, "fois")
print("Moyenne des notes =", moyen)
quit()

