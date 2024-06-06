list_a = [5,4,6,8,7,6,3,5]
length = len(list_a)


# for j in range(length-1) :
#     if list_a[j] > list_a[j+1] :
#         tmp = list_a[j]
#         list_a[j] = list_a[j+1]
#         list_a[j+1] = tmp

for i in range(length-1) :
    for j in range(length-1) :
        if list_a[j] > list_a[j+1] :
            tmp = list_a[j]
            list_a[j] = list_a[j+1]
            list_a[j+1] = tmp

print(list_a)