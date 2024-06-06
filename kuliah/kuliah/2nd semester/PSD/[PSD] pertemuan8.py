import math
# cosine similarity
word1 = "Julie loves me more than Linda loves me"
word2 = "Jane likes me more than Julie loves me"

list_word1 = word1.lower().split()
# print(list_word1)
list_word2 = word2.lower().split()
# print(list_word2)

dict_word1 = {}
dict_word2 = {}

for i in list_word1 :
    counter = 0
    word = i
    for j in list_word1 :
        if j == word :
            counter += 1
        else :
            counter = 1
    dict_word1[word] = counter
print(dict_word1)

for i in list_word2 :
    counter = 0
    word = i
    for j in list_word2 :
        if j == word :
            counter += 1
        else :
            counter = 1
    dict_word2[word] = counter
print(dict_word2)

