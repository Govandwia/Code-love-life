class queue:
    def __init__(self):
        self.list_queue = []

    def display(self):
        print(self.list_queue)
    
    def enqueue(self,data):
        return self.list_queue.append(data)
    
    def dequeue(self) :
        if not self.isEmpty():
            return self.list_queue.pop(0)
        else:
            return "queue is empty."
        
    def peek(self):
        return self.list_queue[0]
    
    def isEmpty(self):
        return len(self.list_queue) == 0
    
    def lenQueue(self):
        return len(self.list_queue)
    
    def where(self,data):
        for i in range(len(self.list_queue)):
            if self.list_queue == data:
                return i
        return 'data not found'
    

# test
q = queue()
q.enqueue(10)
q.enqueue(11)
q.display()
print(q.where(10))
print(q.dequeue())