# https://www.youtube.com/watch?v=4r_XR9fUPhQ

class TreeNode :
    def __init__(self,data):
        self.data = data
        self.children = []
        self.parent = None

    def add_child(self,child) :
        child.parent = self
        self.children.append(child)

        