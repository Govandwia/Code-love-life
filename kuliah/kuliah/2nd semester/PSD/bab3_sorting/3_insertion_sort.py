list_a = [5,4,6,8,7,6,3,5]
length = len(list_a)

for i in range(1, length-1) :
    sisip = list_a[i]
    j = i - 1
    while (j >= 0) and (list_a[j] > sisip) :
        list_a[j+1] = list_a[j]
        j -= 1
    list_a[j+1] = sisip

print(list_a)