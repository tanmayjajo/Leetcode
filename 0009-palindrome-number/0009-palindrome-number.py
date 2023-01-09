class Solution:
	def isPalindrome(self, n):
	    bool = True 
	    n = str(n)
	    for i in range(len(n)):
	        if len(n)-i-1 >= i and n[i] != n[len(n) -i -1]:
	            bool = False
	            break
	    return bool