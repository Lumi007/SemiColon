
integer = int(input("Enter an integer between 0 and 1000 :" ))
		
lastChar = integer % 10;
remainderChar = integer//10;

if remainderChar == 0: 
	print(f"the sum of the digits of the integer is {integer}");
else: 
	secondChar = remainderChar % 10;
	firstChar = remainderChar//10;
	if firstChar == 0:
		print(f"the sum of the digits of the integer is {secondChar + lastChar}");
	else :
		print(f"the sum of the digits of the integer is {firstChar + secondChar + lastChar}");



