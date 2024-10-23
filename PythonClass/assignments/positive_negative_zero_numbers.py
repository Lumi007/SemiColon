negativeCount = 0;
positiveCount = 0;
zeroCount = 0;
count = 0;
        
while count < 5: 
	number = int(input(f"Enter Number {count + 1} : "))
	if number < 0:
		negativeCount+= 1
	elif number > 0:
		positiveCount+= 1
	else:
		zeroCount+= 1
	count+= 1
        
print("\nResults")
        
print(f"Number of negative numbers: {negativeCount}");
print(f"Number of positive numbers: {positiveCount}");
print(f"Number of zeros: {zeroCount}");
      