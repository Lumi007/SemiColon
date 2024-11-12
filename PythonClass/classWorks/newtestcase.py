number = float(input("Enter the first number (Can be a float or an integer): "))
multiplier = int(input("Enter the number to multiply the first number by (must be an integer): "))

def multiply_without_star(number, multiplier):
	if type(number and multiplier) in [int, float]:
		mult = 0
		for i in range(multiplier):
			mult += number
		return mult
	raise TypeError



print(multiply_without_star(number, multiplier))