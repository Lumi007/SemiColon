number_str = input("Enter a five digit number: ")
if number_str == number_str[::-1]:
	print("Number is a palindrome")
else:
	print("Number is not a palindrome")