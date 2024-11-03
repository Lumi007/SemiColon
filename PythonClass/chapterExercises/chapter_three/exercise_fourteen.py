terms = int(input("Enter the number of terms to calculate the value of pi to: "))
pi = 0
sign = 1

for i in range(terms):
    term = 4 / (2 * i + 1)
    pi += sign * term
    sign = -sign

print(f"Calculated value of pi after {terms} terms: {pi}")