list_a = [5,4,6,8,7,6,3,5]
length = len(list_a)

for i in range(length-1) :
    # print(list_a) # check step by step
    smallest = i
    for j in range(i+1, length) :
        if list_a[j] < list_a[smallest] :
            smallest = j
    # swap
    tmp = list_a[smallest]
    list_a[smallest] = list_a[i]
    list_a[i] = tmp

print(list_a) 