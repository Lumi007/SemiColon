investment_amount = float(input("Please enter an amount to invest: "))
monthly_interest_rate = float(input("Please enter the monthly interest rate: "))
years = float(input("Please enter the number of years for your investment: "))


def future_investment_amount(investment_amount, monthly_interest_rate, years):
	if investment_amount < 0 or years < 0 or monthly_interest_rate < 0:
		raise ValueError
	
	mir = monthly_interest_rate/100
	months = years/12
	
	future_invest_amount = investment_amount *(( 1 + mir)**months)
	return round(future_invest_amount,2)
	raise TypeError

print(future_investment_amount(investment_amount, monthly_interest_rate, years),2)
print(future_investment_amount(10000, 12, 25),2)