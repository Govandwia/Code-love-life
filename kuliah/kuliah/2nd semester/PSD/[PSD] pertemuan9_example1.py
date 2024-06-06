# Instal pustaka anytree jika belum terinstal
# pip install anytree

from anytree import Node, RenderTree

# Membuat simpul-simpul pohon
root = Node("A")
b = Node("B", parent=root)
c = Node("C", parent=root)
d = Node("D", parent=b)
e = Node("E", parent=b)
f = Node("F", parent=c)
g = Node("G", parent=c)
h = Node("H", parent=c)

# Menampilkan pohon
print("Pohon:")
for pre, fill, node in RenderTree(root):
    print("%s%s" % (pre, node.name))
