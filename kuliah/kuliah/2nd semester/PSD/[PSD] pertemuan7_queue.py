# pertemuan 7 26/3/24
# PSD
# queue dan dequeue

# queue
from queue import Queue

# membuat objek antrian
data_queue = Queue()

# fungsi untuk memproses data dari antrian
def process_data(data):
    # logika pemrosesan data di sini
    print("Memproses data: ", data)

# fungsi untuk mengambil data dari antrian dan memprosesnya
def consume_data():
    while True :
        data = data_queue.get() # mengambil data dari antrian (blokir jika antrian kosong)
        process_data(data) # memproses data
        data_queue.task_done() # menandai bahwa data telah selesai diproses

# fungsi untuk mengirim data baru ke antrian
def produce_data(new_data):
    data_queue.put(new_data) # menambahkan data baru ke antrian


# contoh penggunaan
# mengirim data baru ke antrian
produce_data("Data 1")
produce_data("Data 2")
produce_data("Data 3")

# memulai proses pemrosesan data
consume_data()