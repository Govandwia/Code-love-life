def merge_sort(a):
    merge_sort2(a,0,len(a)-1)
def merge_sort2(a,first,last) :
    if first < last :
        middle = (first + last) // 2
        merge_sort2(a,first,middle)
        merge_sort2(a,middle+1,last)
        merge(a,first,middle,last)
def merge(a,first, middle, last) :
    L = a[first:middle]
    R = a[middle:last+1]
    L.append(999999999)
    R.append(999999999)

    i=j=0

    for k in range(first, last+1):
        if L[i] <= R[j] :
            a[k] = L[i]
        else : 
            a[k] = R[j]
            j+=1


a = [1,3,4,5,3,4,5,6,78,6,43,23,54,34,45 ,45 ,567 ,2342, 345234, 453, 453, 231, 453, 6576, 7823, 223 ,1 ,12 ,223 ,345 ,55 ,56 ,767 ,676 ,87898 ,676]
merge_sort(a)
print(a)


# tf is this code goofy ahh
