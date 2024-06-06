def stack(x):
    stack = []
    counter = 0
    for character in x:
        stack.append(character)
        if len(stack) >= 3:
            if stack[-3:] == ["a","b","c"]:
                counter += 1
                stack.pop()
                stack.pop()
                stack.pop()
    return print("sisa= ",stack,"counter= ",counter)

x = input("masukan huruf : ")
stack(x)

