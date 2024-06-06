from anytree import Node, RenderTree

# Membuat simpul-simpul pohon

# root
grandparents = Node("Grandfather & Grandmother")
# branch
a = Node("Mother & father", parent=grandparents)
b = Node("Uncle", parent=grandparents)
c = Node("Aunt & uncle", parent=grandparents)
d = Node("Uncle & Aunt", parent=grandparents)

# leaf (parent = a)
e = Node("Brother", parent=a)
f = Node("Sister", parent=a)
g = Node("Me", parent=a)
# leaf (parent = c)
h = Node('cousin', parent=c)
i = Node('cousin', parent=c)
# leaf (parent = d)
j = Node('cousin', parent=d)


# display family tree
print("Family Tree:")
for pre, fill, node in RenderTree(grandparents):
    print("%s%s" % (pre, node.name))
