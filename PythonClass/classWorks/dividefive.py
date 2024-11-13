import math

number = float(input("Please enter a numbr to check:   "))


def divisible_by_five (number):

	if number < 0:
		raise ValueError
	if number % 5 == 0:
		return round(math.sqrt(number), 2)
	else:
		return number % 5
	raise TypeError

print(divisible_by_five(number))