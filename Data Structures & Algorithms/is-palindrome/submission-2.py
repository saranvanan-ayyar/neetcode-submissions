class Solution:
    def isPalindrome(self, s: str) -> bool:
        r_s = ''
        for c in s:
            if c.isalnum():
                r_s +=c.lower()
        return r_s == r_s[::-1]

        
        