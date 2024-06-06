from binarytree import Node as BinaryTreeNode

class Node : 
    def __init__(self, symbol, freq, left=None, right=None) :
        self.symbol = symbol
        self.freq = freq
        self.left = left
        self.right = right

    def __lt__(self,other) :
        return self.freq < other.freq
    
def count_freq(word):
    dict_char = {}
    for char in word:
        if char in dict_char :
            dict_char[char] += 1
        else :
            dict_char[char] = 1
    sorted_dict = dict(sorted(dict_char.item(), key=lambda item: item[1]))
    return sorted_dict

def create_huff
