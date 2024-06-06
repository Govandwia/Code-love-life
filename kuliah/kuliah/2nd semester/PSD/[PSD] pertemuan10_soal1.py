# function untuk check dan mengubah upper --> lower dan sebalikny
def convertUpperLower(letter) :
    if letter.isupper():
        return letter.lower()
    elif letter.islower():
        return letter.upper()
    else:
        return letter

def main():
    input_ = input("input : ") #input
    converted = list(map(convertUpperLower, input_)) #convert kalimat dari input
    res = "" # string untuk menyimpan hasil

    for i in range(len(converted)) :
        res += converted[i]
    print(res)

# start
main()

# Emilio 23/522018/SV/23568