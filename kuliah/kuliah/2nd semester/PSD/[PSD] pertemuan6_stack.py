class Stack:
  def __init__(self):
    self.items = []

  def is_empty(self):
    return self.items == []

  def push(self, item):
    self.items.append(item)

  def pop(self):
    return self.items.pop()

  def peek(self):
    return self.items[len(self.items)-1]

  def size(self):
    return len(self.items)

  def get_items(self):
    return self.items
  

# initialize a new stack
name_stack = Stack()

# check if the stack empty
name_stack.is_empty()