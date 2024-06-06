# recursive

def fibonacci(n) :
    if n <= 1:
        return n
    else :
        return fibonacci(n-1) + fibonacci(n-2)
    
n_input = int(input("input number: "))

if n_input <= 0 :
    print('please enter a positive integer')
else: 
    print('Fibonacci sequence:')
    for i in range(1,n_input+1) :
        print(fibonacci(i))