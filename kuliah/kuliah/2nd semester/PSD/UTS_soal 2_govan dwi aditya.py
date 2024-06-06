class Queue:
    def __init__(self, maxSize):
        self.queue = [None] * maxSize
        self.maxSize = maxSize
        self.head = 0
        self.tail = -1

    def initialize_queue(self):
        self.head = 0
        self.tail = -1

    def push(self, item):
        if self.tail < self.maxSize - 1:
            self.tail += 1
            self.queue[self.tail] = item
        else:
            print("Queue is full")

    def pop(self):
        if self.head <= self.tail:
            self.head += 1
        else:
            print("Queue is empty")

    def front(self):
        if self.head <= self.tail:
            return self.queue[self.head]
        else:
            print("Queue is empty")

    def is_empty(self):
        if self.head > self.tail:
            return True
        else:
            return False

# Contoh penggunaan
maxSize = 5
queue = Queue(maxSize)
queue.push(1)
queue.push(2)
queue.push(3)
queue.push(4)
queue.push(5)
queue.push(6)
print(queue.front())  # Output: 1

# mengecek elemen front setelah pop
queue.pop()
print(queue.front())  # Output: 2

# mengecek apakah queue kosong
print(queue.is_empty())  # Output: False

# mengecek apakah queue kosong setelah semua elemen di pop 
queue.pop()
queue.pop()
print(queue.is_empty())  # Output: True
