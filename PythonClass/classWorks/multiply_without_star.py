number = float(input("Enter the first number: "))
multiplier = float(input("Enter the number to multiply the first number by: "))

def multiply_without_star(number, multiplier):
	if type(number and multiplier) in [int,float]:
		mult = number
		for i in range(multiplier-1):
			mult += number
		return mult
	return TypeError



print(multiply_without_star(number, multiplier))