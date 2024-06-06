from binarytree import Node as BinaryTreeNode

class Node:
    def __init__(self, symbol, frequency, left=None, right=None):
        self.symbol = symbol
        self.frequency = frequency
        self.left = left
        self.right = right

    def __lt__(self, other):
        return self.frequency < other.frequency

# Fungsi untuk menghitung frekuensi karakter dalam kata
def count_freq(word):
    dict_letter = {}
    
    for letter in word:  # Mengonversi setiap huruf menjadi huruf kecil
        if letter in dict_letter:
            dict_letter[letter] += 1  # Jika huruf sudah ada, tambahkan frekuensinya
        else:
            dict_letter[letter] = 1  # Jika huruf belum ada, inisialisasi dengan 1

    sorted_dict = dict(sorted(dict_letter.items(), key=lambda item: item[1]))  # Urutkan dictionary berdasarkan frekuensi
    return sorted_dict

# Fungsi untuk membangun pohon Huffman
def build_huffman_tree(freq_dict):
    nodes = [Node(symbol, freq) for symbol, freq in freq_dict.items()]  # Buat node untuk setiap karakter berdasarkan frekuensinya

    while len(nodes) > 1:
        nodes = sorted(nodes)  # Urutkan node berdasarkan frekuensi
        left = nodes.pop(0)  # Ambil node dengan frekuensi terendah
        right = nodes.pop(0)  # Ambil node dengan frekuensi terendah berikutnya
        parent = Node(None, left.frequency + right.frequency, left, right)  # Buat node parent dengan menggabungkan dua node terendah
        nodes.append(parent)  # Tambahkan node parent ke daftar node

    return nodes[0]  # Kembalikan node terakhir sebagai akar pohon Huffman

# Fungsi untuk menghasilkan kode Huffman dengan melakukan traversal pada pohon Huffman
def generate_codes(node, code="", codes=None):
    if codes is None:
        codes = {}
    if node.symbol is not None:
        codes[node.symbol] = code  # Jika node adalah leaf, simpan kodenya
    else:
        generate_codes(node.left, code + "0", codes)  # Tambahkan '0' saat bergerak ke kiri
        generate_codes(node.right, code + "1", codes)  # Tambahkan '1' saat bergerak ke kanan
    return codes

# Fungsi untuk mengonversi node Huffman ke node binarytree untuk visualisasi
def convert_to_binarytree_node(node):
    if node is None:
        return None
    bt_node = BinaryTreeNode(node.frequency if node.symbol is None else node.symbol)  # Buat node binarytree
    bt_node.left = convert_to_binarytree_node(node.left)  # Rekursi ke kiri
    bt_node.right = convert_to_binarytree_node(node.right)  # Rekursi ke kanan
    return bt_node

# Fungsi utama Huffman coding yang menggabungkan semuanya
def huffman_coding(word):
    freq_dict = count_freq(word)  # Hitung frekuensi karakter dalam kata
    huffman_tree = build_huffman_tree(freq_dict)  # Bangun pohon Huffman
    codes = generate_codes(huffman_tree)  # Hasilkan kode Huffman
    return codes, huffman_tree

# Fungsi main untuk menjalankan program
def main():
    # word = input("Enter a word: ").replace(" ", "")  # Ambil input kata dari pengguna
    word = input("Enter a word: ")  # Ambil input kata dari pengguna
    codes, huffman_tree = huffman_coding(word)  # Dapatkan kode Huffman dan pohon Huffman

    print("\nSymbol\tCode")
    print("------\t----")
    for symbol, code in sorted(codes.items(), key=lambda x: (len(x[1]), x[1])):  # Cetak kode Huffman untuk setiap karakter
        print(f"{symbol}\t{code}")

    bt_root = convert_to_binarytree_node(huffman_tree)  # Konversi pohon Huffman untuk visualisasi
    print("\nHuffman Tree:")
    print(bt_root)  # Tampilkan pohon Huffman


main()  # Jalankan fungsi main