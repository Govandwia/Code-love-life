# class Stack:
#   def __init__(self):
#     self.operator = []
#     self.operand = []
#     self.postfix = [] #hasil dari semuanya

#   def is_empty(self):
#     return self.items == []

#   def push(self, item):
#     self.items.append(item)
#     periksa(item)

#   def pop(self):
#     return self.items.pop()

#   def peek(self):
#     return self.items[len(self.items)-1]

#   def size(self):
#     return len(self.items)
  
#   def periksaList(self): #fungsi untuk mengecek isi list
#     # meriksa semua element di item
#     if item.character
#         append.self.operand
#     else : 
#        append.self.operator

#     for i in range len(self.item) :
#         if 

#   def returnPostFix():

#   def get_items(self):
#     return self.items
  

# stack = Stack()
# Infix = "m*n+(p-q)+r"
# # pisahkan menjadi list
# # INfix = 
# for i in range len(Infix) :
#     push



######

# stack
def stack():
    a = []
    return a

def push(a,something) :
    a.append(something)

def pop(a):
    isi = a.pop()
    return isi

def peek(a) :
    return(a[len(a)-1])

def isEmpty(a):
    return(a==[])

def size(a) :
    return (len(a))


# convertion infix to postfix
def infixToPostfix(infix) :
    operator = ['+', '-', '*', '/', '(', ')']
    pr = {}
    pr['*'] = 3
    pr['/'] = 3
    pr['+'] = 2
    pr['-'] = 2
    pr['('] = 1
    pr[')'] = 1
        
    st = stack()
    res = " "
    space = " "

    for i in infix :
        if i == " ":
            space+=i
        elif i not in operator :
            res+=i
        elif i == ')':
            while peek(st) != '(' :
                res+=pop(st)
            pop(st)
        elif i == '(' :
            push(st, i)
        else :
            while not isEmpty(st) and peek(st) != '(' and pr[i] <= pr[peek(st)]:
                res+=pop(st)
            push(st, i)
    
    while not isEmpty(st) :
        res+=pop(st)
    return res

# starting converter
def start():
    print("Starting...")
    print()
    quit = True
    while(quit) :
        print()
        input_ = int(input("==Infix to Postfix converter== \n 1.Start converting infix to postfix \n 2.quit \n insert number to choose (1 or 2): "))
        if input_ == 1 :
            infix = input("input infix: ")
            print(infixToPostfix(infix))
        elif input_ == 2 :
            quit = False
        else : 
            start()
    print()
    print("Ended.")
        


start()
