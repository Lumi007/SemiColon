
num1 = int(input("Enter first integer: "))
num2 = int(input("Enter second integer: "))
num3 = int(input("Enter third integer: "))


sum_numbers = num1 + num2 + num3

average = sum_numbers / 3


product = num1 * num2 * num3


smallest = min(num1, num2, num3)
largest = max(num1, num2, num3)

print("\nResults:")
print(f"Sum is {sum_numbers}")
print(f"Average is {average:.2f}")
print(f"Product is {product}")
print(f"Smallest is {smallest}")
print(f"Largest is {largest}")