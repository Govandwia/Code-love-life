# dari gpt
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


# Fungsi calculate_total_weight: Fungsi ini menerima daftar barang dan menggunakan map untuk mengekstrak 
# berat setiap barang (x[1]), kemudian menjumlahkan berat tersebut dengan sum.

# Menggunakan map dalam calculate_total_weight: map(lambda x: x[1], items) memetakan 
# setiap barang dalam daftar items ke beratnya, dan sum menjumlahkan semua berat tersebut.

# Penggunaan dalam check_berat_barang: Untuk setiap orang dalam Data_barang_penumpang,
#  kita menghitung total berat barang mereka menggunakan calculate_total_weight dan kemudian menyimpannya dalam dictionary res_dict.