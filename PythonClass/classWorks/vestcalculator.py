investment_amount = float(input("Please enter an amount to invest: "))
monthly_interest_rate = (float(input("Please enter the monthly interest rate: ")))/100
months = (float(input("Please enter the number of years for your investment: ")))/12


def future_investment_amount(investment_amount, monthly_interest_rate, months):
	future_invest_amount = investment_amount *(( 1 + monthly_interest_rate)**months)
	return future_invest_amount

print(round(future_investment_amount(investment_amount, monthly_interest_rate, months),2))