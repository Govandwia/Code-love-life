# def insertion_sort(a):
#     for i in range(1, len(a)) :
#         curNum = a[i]
#         for j in range(i-1, 0 , -1):
#             if a[j] > curNum :
#                 a[j+1] = a[j]
#             else : 
#                 a[j+1] = curNum
#                 break

def insertion_sort(a) :
    for i in range(1, len(a)):
        j = i-1
        while a[j] > a[j+1] and j >= 0:
            a[j],a[j+1] = a[j+1], a[j]
            j -= 1

a = [1,3,4,5,3,4,5,6,78,6,43,23,54,34]
insertion_sort(a)
print(a)