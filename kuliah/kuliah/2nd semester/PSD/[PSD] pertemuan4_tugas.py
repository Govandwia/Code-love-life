def tambah_mahasiswa() :
    jumlah = int(input("Masukan jumlah mahasiswa : "))
    data = []

    kumpulan_nilai = []
    rata_Rata = []
    for i in range(jumlah) :
        nama = input("Masukkan nama mahasiswa ke-%d : " %(i+1))
        nim = input("Masukan NIM mahasiswa ke-%d : " %(i+1))
        jumlah_ujian = int(input("Masukkan jumlah ujian mahasiswa ke-%d : " %(i+1)))
        for j in range(jumlah_ujian) :
            nilai = int(input("Masukan nilai ujian ke-%d : "%(j+1)))
            kumpulan_nilai.append(nilai)
        rata_rata = sum(kumpulan_nilai) / len(kumpulan_nilai)

        data.append([nama,nim,rata_rata]) 
    
    for i in range(len(data)) :
        print(" ")
        print("Nama: " , data[i][0])    
        print("NIM: " , data[i][1])
        print("Rata-rata Nilai ujian: " , data[i][2])
        print(" ")
            

tambah_mahasiswa()
