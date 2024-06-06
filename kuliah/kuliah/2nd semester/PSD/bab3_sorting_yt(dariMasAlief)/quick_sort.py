def quick_sort(a) :
    quick_sort2(a, 0, len(a)-1)

def quick_sort2(a,low,hi):
    if low<hi :
        p = partition(a,low,hi)
        quick_sort2(a,low,p-1)
        quick_sort2(a,p+1,hi)

def get_pivot(a,low,hi) :
    mid = (hi + low) // 2
    pivot = hi
    if a[low] < a [mid] :
        if a[mid] < a[hi] :
            pivot = mid
    elif a[low] < a[hi] :
        pivot = low
    return pivot

def partition(a,low,hi):
    pivotIndex = get_pivot(a, low, hi)
    pivotValue = a[pivotIndex]
    a[pivotIndex], a[low] = a[low], a[pivotIndex]
    border = low

    for i in range(low,hi+1) :
        if a[i] < pivotValue:
            border += 1
            a[i],a[border] = a[border], a[i]
        a[low],a[border] = a[border], a[low]
    return border


a = [1,3,4,5,3,4,5,6,78,6,43,23,54,34]
quick_sort(a)
print(a)