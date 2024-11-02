
principal = 1000 
rate = 0.07      


amount_10_years = principal * (1 + rate) ** 10
amount_20_years = principal * (1 + rate) ** 20
amount_30_years = principal * (1 + rate) ** 30


print("Investment Growth Projection (7% Annual Return)")
print("-" * 45)
print(f"Initial Investment: ${principal:,.2f}")
print("\nProjected Growth:")
print(f"After 10 years: ${amount_10_years:,.2f}")
print(f"After 20 years: ${amount_20_years:,.2f}")
print(f"After 30 years: ${amount_30_years:,.2f}")