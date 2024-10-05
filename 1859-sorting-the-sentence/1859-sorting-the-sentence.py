class Solution(object):
    def sortSentence(self, s):
        sen = s.split(" ")
        words = [""] * 9
    
        for w in sen:
            index = int(w[-1])-1
            words[index] = w[:-1]
        result = " ".join(word for word in words if word)
        return result
        