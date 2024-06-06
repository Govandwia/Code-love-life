# stack
def infixToPostfix(expression) :
    operators = ['+', '-', '*', '/', '(', ')', '^'] # collection of operators
    priority = {'+' : 1,'-' : 1,'*' : 2,'/' : 2,'^' : 3,}
    stack = [] #initialization of empty stack
    output = ''
    for character in expression:
        if character not in operators: 
            output += character
        elif character == '(':
            stack.append('(')
        elif character == ')':
            while stack and stack[-1] != '(':
                output += stack.pop()
            stack.pop()
        else :
            while stack and stack[-1] != '(' and priority[character] <= priority[stack[-1]]:
                output += stack.pop()
            stack.append(character)
    while stack :
        output += stack.pop()
    return output

expression = input('enter sum infix expression --> ')
print("infix : ", expression)
print("postfix : ", infixToPostfix(expression))