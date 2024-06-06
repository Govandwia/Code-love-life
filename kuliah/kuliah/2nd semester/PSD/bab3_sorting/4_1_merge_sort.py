def mergesort(list_a, l, r):
    if r > l:
        mid = (l + r) // 2
        
        # Rekursif untuk membagi list menjadi sub-list
        mergesort(list_a, l, mid)
        mergesort(list_a, mid + 1, r)
        
        # Merge
        i = l
        j = mid + 1
        k = 0
        temp_list = [0] * (r - l + 1)
        
        # Menggabungkan dua sub-list yang terurut menjadi satu
        while i <= mid and j <= r:
            if list_a[i] < list_a[j]:
                temp_list[k] = list_a[i]
                i += 1
            else:
                temp_list[k] = list_a[j]
                j += 1
            k += 1
        
        # Menyalin sisa elemen dari sub-list pertama ke temp_list
        while i <= mid:
            temp_list[k] = list_a[i]
            i += 1
            k += 1

        # Menyalin sisa elemen dari sub-list kedua ke temp_list
        while j <= r:
            temp_list[k] = list_a[j]
            j += 1
            k += 1

        # Menyalin kembali elemen dari temp_list ke list_a
        for i in range(len(temp_list)):
            list_a[l + i] = temp_list[i]

# Contoh penggunaan:
list_a = [5, 4, 2, 1, 3, 45 ,67 ,89 ,90, 56, 343, 23, 11, 911, 14045, 23, 32, 32, 32]
mergesort(list_a, 0, len(list_a) - 1)
print(list_a)