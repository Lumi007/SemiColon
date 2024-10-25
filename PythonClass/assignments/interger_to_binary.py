

integerToConvert = int(input("Enter an Integer: "))
	
convertedBinary = ""
	
while integerToConvert != 0:
	rem = integerToConvert % 2
	integerToConvert //= 2
	convertedBinary  = str(rem) + convertedBinary
	
print(f"Binary number is {convertedBinary}");


