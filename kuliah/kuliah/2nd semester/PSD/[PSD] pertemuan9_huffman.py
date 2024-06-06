# huffman 

def count_freq(word) :
    list_letter = []
    dict_letter = {}

    # insert to list
    for i in word :
        i = i.lower()
        list_letter.append(i)

    # count n insert to dict
    for letter in list_letter :
        if letter in dict_letter :
            dict_letter[letter] += 1
        else : 
            dict_letter[letter] = 1

    # sort dictionary
    sorted_dict = dict(sorted(dict_letter.items(), key=lambda item: item[1]))

    return(sorted_dict)



