# coin change problem dengan metode pull
# Emilio 23/522018/SV/23568

nilaiCari = 23
maxCari = 25
jumlahKoin = 3
koin = [3,5,12]

c = ['']*(maxCari)
for i in range(maxCari) :
    c[i] = 'X'
# print(len(c))
for j in range(jumlahKoin) :
    c[koin[j] - 1] = "B"

for n in range (maxCari) :
    for j in range (jumlahKoin) :
        if (n-koin[j]) >= 1 :
            if c[n-koin[j]] == 'B' :
                c[n] = "B"

if c[nilaiCari] == 'B' :
    bBisaDicari = True
else :
    bBisaDicari = False

if bBisaDicari == True :
    print(f"Nilai {nilaiCari} bisa dicari dengan koin : {koin}")
else :
    print("lmao gabisa akwoakwo")

print(c)

# function untuk menghitung berapa kombinasi yang ada
def count_combinations(target, coins, index):
    # Kasus dasar: jika target menjadi 0, hanya ada satu kombinasi, yaitu tidak menggunakan koin sama sekali
    if target == 0:
        return 1
    
    # Jika target menjadi negatif atau kita telah menggunakan semua koin
    if target < 0 or index < 0:
        return 0
    
    # Hitung jumlah kombinasi dengan atau tanpa menggunakan koin pada indeks saat ini
    with_coin = count_combinations(target - coins[index], coins, index)
    without_coin = count_combinations(target, coins, index - 1)
    
    # Kembalikan jumlah total kombinasi
    return with_coin + without_coin

result = count_combinations(nilaiCari, koin, len(koin) - 1)
print("Jumlah kombinasi untuk angka", nilaiCari, "adalah:", result)
