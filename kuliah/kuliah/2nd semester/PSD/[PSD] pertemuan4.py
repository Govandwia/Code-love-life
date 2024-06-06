def tambah_mahasiswa() :
    jumlah_mahasiswa = int(input("Masukkan jumlah mahasiswa : "))
    data_mahasiswa = []

    for i in range(jumlah_mahasiswa) :
        # nim = input(f"Masukkan nim mahasiswa ke-{i} : ")
        nim = input("Masukkan nim mahasiswa ke-%d : " % (i + 1))
        nama = input("Masukkan nama mahasiswa ke-%d : " % (i + 1))
        asal = input("Masukkan asal daerah mahasiswa ke-%d : " % (i + 1))
        data_mahasiswa.append([nim,nama,asal])
    
    print("Data Mahasiswa : ")
    for i in range(len(data_mahasiswa)) :
        print("="*20)
        print("NIM : " + data_mahasiswa[i][0])
        print("Nama : " + data_mahasiswa[i][1])
        print("Asal daerah : " + data_mahasiswa[i][2])
    print("'"*20)

tambah_mahasiswa()