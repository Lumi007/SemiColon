number = int(input("Enter a three-digit integer: "))
 
        
firstChar = number // 100;
lastChar = number % 10;
        
        
if firstChar == lastChar:
	print(f"{number} is a palindrome")
else:
	print(f"{number} is not a palindrome")