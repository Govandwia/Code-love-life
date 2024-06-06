def selection_sort(a):
    for i in range(0, len(a)-1) :
        minIndex = i
        for j in range(i+1, len(a)):
            if a[j] < a[minIndex] :
                minIndex = j
        if minIndex != i :
            a[i], a[minIndex] = a[minIndex], a[i]

a = [1,3,4,5,3,4,5,6,78,6,43,23,54,34]
selection_sort(a)
print(a)