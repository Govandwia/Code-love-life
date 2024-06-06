# def stack():
#     a = []
#     return a

# def push(a,something) :
#     a.append(something)

# def pop(a):
#     isi = a.pop()
#     return isi

# def peek(a) :
#     return(a[len(a)-1])

# def isEmpty(a):
#     return(a==[])

# def size(a) :
#     return (len(a))

class Stack :
    def __init__(self):
        self.items = []

    def isEmpty(self):
        return self.items == []
    
    def push(self, items) :
        self.items.append(items)
    
    def pop(self):
        return self.items.pop()
    
    def peek(self):
        return self.items[len(self.items)-1]
    
    def size(self):
        return len(self.items)
    
    def get_items(self):
        return self.items

# 
# im confused about the class thing.


# convertion infix to postfix
infix = input("input infix: ")
infix = Stack()

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
            while stack.peek(st) != '(' :
                res+=stack.pop(st)
            stack.pop(st)
        elif i == '(' :
            stack.push(st, i)
        else :
            while not stack.isEmpty(st) and stack.peek(st) != '(' and pr[i] <= pr[stack.peek(st)]:
                res+=stack.pop(st)
            stack.push(st, i)
    
    while not stack.isEmpty(st) :
        res+=stack.pop(st)
    return res


print("Starting...")
print("Postfix: ", infixToPostfix(infix))
print("Ended.")