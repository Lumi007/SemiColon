number = int(input("Enter a number between 100 and 999: "))
first_digit = number // 100
second_digit = (number // 10) % 10
third_digit = number % 10
print(third_digit, second_digit, first_digit)