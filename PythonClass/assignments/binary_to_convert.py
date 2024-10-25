binaryToConvert = int(input("Enter a Binary Number: "))
	
	
convertedInteger = 0;
counter = 0;
	
while (binaryToConvert != 0):
	rem = binaryToConvert % 10
	remPowered =  rem * (2**counter)
	binaryToConvert //=   10
	convertedInteger  += remPowered 
	counter+= 1
	
	
print(f"Decimal number is {convertedInteger}" )


	
