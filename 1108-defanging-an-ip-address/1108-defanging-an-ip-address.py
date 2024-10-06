class Solution(object):
    def defangIPaddr(self, address):
        a = address.split(".")
        return "[.]".join(x for x in a)
        