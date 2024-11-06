row_number = int(input("Please enter a row number: "))

for rows in range (1, row_number+1):
	for col in range (1, rows):
		print(col, end = " ")
	print()
for rows in range (1, row_number+1):
	for col in range(1, row_number-rows):
		print(col, end = " ")
	print()
		