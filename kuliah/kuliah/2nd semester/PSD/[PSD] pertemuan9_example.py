# Instal pustaka binarytree jika belum terinstal
# pip install binarytree

from binarytree import Node

# Membuat pohon biner
root = Node(1)
root.left = Node(2)
root.right = Node(3)
root.left.left = Node(4)
root.left.right = Node(5)

# Menampilkan pohon biner
print("Pohon Biner:")
print(root)

# Menampilkan traversal inorder dari pohon biner
def inorder_traversal(node):
    if node is not None:
        inorder_traversal(node.left)
        print(node.value, end=" ")
        inorder_traversal(node.right)

print("Traversal inorder dari pohon biner:")
inorder_traversal(root)
