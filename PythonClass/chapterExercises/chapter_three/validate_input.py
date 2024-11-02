passes = 0
valid_inputs = 0
    
while valid_inputs < 5:  # Get 5 valid inputs
	value = int(input('Enter 1 or 2: '))
	if value in [1, 2]:
            valid_inputs += 1
            if value == 1:
                passes += 1
failures = valid_inputs - passes
   

print(f'Number of passes: {passes}')
print(f'Number of failures: {failures}')