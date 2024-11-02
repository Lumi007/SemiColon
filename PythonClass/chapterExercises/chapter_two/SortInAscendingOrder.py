num1 = float(input("Please enter your first number: "))
num2 = float(input("Please enter your first number: "))
num3 = float(input("Please enter your first number: "))



if num1 <= num2 <= num3:
	print (f"The numbers in ascending order are: {num1},{num2},{num3}")
elif num1 <= num3 <= num3:
	print(f"The numbers in ascending order are: {num1},{num3},{num2}")
elif num2 <= num1 <= num3:
	print(f"The numbers in ascending order are: {num2},{num1},{num3}")
elif num2 <= num3 <= num1:
	print(f"The numbers in ascending order are: {num2},{num3},{num1}")
elif num3 <= num1 <= num2:
	print(f"The numbers in ascending order are: {num3},{num1},{num2}")
else:
	print(f"The numbers in ascending order are: {num3},{num2},{num1}")

