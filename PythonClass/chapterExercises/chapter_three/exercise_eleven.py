total_miles = 0
total_gallons = 0
    
while True:
	miles = float(input('Enter miles driven (-1 to quit): '))
	if miles == -1:
		break
            
	gallons = float(input('Enter gallons used: '))
	mpg = miles / gallons
	print(f'MPG this tankful: {mpg:.2f}')
        
	total_miles += miles
	total_gallons += gallons

	if total_gallons > 0:
		print(f'Combined MPG: {total_miles/total_gallons:.2f}')
