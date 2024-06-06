import math

word1 = "Jul!ie loves me more than <Linda loves me"
word2 = "Jane likes! me more than Julie loves me"

# menghilangkan tanda baca + menjadi huruf kecil (preprocessing)
punctuation_chars = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~"
clear_word1 = ""
clear_word2 = ""

for i in word1 :
    if i not in punctuation_chars :
        clear_word1 += i.lower()
for i in word2 :
    if i not in punctuation_chars :
        clear_word2 += i.lower()

# tokenization
list_word1 = clear_word1.split()
list_word2 = clear_word2.split()

dict_word1 = {}
dict_word2 = {}
# Hitung frekuensi kata dalam word1
for word in list_word1:
    if word in dict_word1:
        dict_word1[word] += 1
    else:
        dict_word1[word] = 1

# Hitung frekuensi kata dalam word2
for word in list_word2:
    if word in dict_word2:
        dict_word2[word] += 1
    else:
        dict_word2[word] = 1

print(dict_word1)
print(dict_word2)

combined = set(list_word1 + list_word2) #set --> agar tidak ada key yang duplicate
# print(combined)

# a / (sqrt(b)*sqrt(c))
# a = pembilang
a = 0
for word in combined :
    perkalian = dict_word1.get(word,0) * dict_word2.get(word,0)
    a += perkalian
# print(a)

b = 0
for word1 in list_word1 :
    b += dict_word1.get(word1,0)
# print(b)

c = 0
for word2 in list_word2 :
    c += dict_word2.get(word2,0)
# print(c)

total = a / (math.sqrt(b) * math.sqrt(c))
print(total)