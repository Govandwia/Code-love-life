def bubble_sort(a) :
    for i in range (0, len(a)-1):
        for j in range (0, len(a)-1 -i):
            if a[j] > a[j+1] :
                a[j], a[j+1] = a[j+1], a[j]
    return a

a = [1,3,4,5,3,4,5,6,78,6,43,23,54,34]
print(bubble_sort(a))