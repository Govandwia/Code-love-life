# def check_berat_barang(array) :
#     res_dict = {}
#     for i in range(len(array)):
#         sum = 0
#         for j in range(len(array[i][1])):
#             sum += array[i][1][j][1]
#             # print(sum)
#             res_dict[array[i][0]] = sum
#     print(res_dict)
        
# Data_barang_penumpang = [

#     ("Slamet", [("Sepatu", 2), ("Laptop", 1), ("Jeruk", 3)]),

#     ("Ani", [("Pisang", 1), ("Ketela", 4), ("Baju", 5)]),

#     ("Budi", [("Seterika", 2), ("Buku", 3), ("Kamera", 4)])

# ]
# # print(Data_barang_penumpang[0][1][0][1])
# check_berat_barang(Data_barang_penumpang)

#qnwdihuh9ey8qdo

# -------------------------------------
def calculate_total_weight(items):
    # Menghitung total berat dari daftar barang
    return sum(map(lambda x: x[1], items))

def check_berat_barang(array):
    res_dict = {}
    for person, items in array:
        total_weight = calculate_total_weight(items)
        res_dict[person] = total_weight
    print(res_dict)

Data_barang_penumpang = [
    ("Slamet", [("Sepatu", 2), ("Laptop", 1), ("Jeruk", 3)]),
    ("Ani", [("Pisang", 1), ("Ketela", 4), ("Baju", 5)]),
    ("Budi", [("Seterika", 2), ("Buku", 3), ("Kamera", 4)])
]

check_berat_barang(Data_barang_penumpang)