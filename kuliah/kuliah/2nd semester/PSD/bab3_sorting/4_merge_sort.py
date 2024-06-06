def merge_sort(array):
    if len(array) > 1 :
        mid = len(array) // 2 #where is the middle of an array
        left = array[:mid] #divide array to two halves (left part)
        right = array[mid:] #divide array to two halves (right part)

        merge_sort(left)
        merge_sort(right)

        i=j=k=0

        # data to temp array L[] and R[]
        while i < len(left) and j < len(right) :
            if left[i] < right [j] :
                array[k] = left[i]
                i+=1
            else :
                array[k] = right[j]
                j+=1
            k+=1

        # checking if there is any element was left
        while i < len(left) :
            array[k] = left[i]
            i+=1
            k+=1
        while j < len(right) :
            array[k] = right[j]
            j+=1
            k+=1


# Code to print the list
def print_list(array1):
    for i in range(len(array1)):
        print(array1[i], end=" ")
    print()


# driver code to test the above code
if __name__ == '__main__':
    array = list(map(int, input("input numbers(seperate it with space): ").split()))
    print("Given array is", end="\n")
    print_list(array)
    merge_sort(array)
    print("Sorted array is: ", end="\n")
    print_list(array)
