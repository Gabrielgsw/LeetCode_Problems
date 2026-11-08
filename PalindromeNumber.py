class Solution:
    def isPalindrome(self, x: int) -> bool:

        num = x
        invertido = 0

        if x < 0:
            return False


        while num > 0:
            digito = num % 10
            invertido = (invertido * 10) + digito
            num = num // 10


        print (invertido)
        if invertido == x:
            return True

        return False
        
