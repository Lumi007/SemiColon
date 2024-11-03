principal=1000.00 
rate=0.07
for year in range(1, 31):
	principal = principal * (1 + rate)
	print(f'Year {year:>2}: ${principal:,.2f}')