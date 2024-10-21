principalAmount = float(input("Enter the principal amount: "))
annualInterestRate = float(input("Enter the annual interest rate: "))
durationInYears = float(input("Enter the duration in years: "))

monthlyInterestRate = (annualInterestRate / 100) / 12
durationInMonths = durationInYears * 12

monthlyPayment = principalAmount * ((monthlyInterestRate * ((1 + monthlyInterestRate) ** durationInMonths)) / (((1 + monthlyInterestRate) ** durationInMonths) - 1))

print(f"Your monthly payment is: {monthlyPayment:.2f}")