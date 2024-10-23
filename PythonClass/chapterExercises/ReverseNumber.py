number = int(input("Enter a number between 100 and 999: "))
first_digit = number // 100
second_digit = (number // 10) % 10
third_digit = number % 10
odd_counter = 0
even_counter = 0

if (first_digit % 2 == 0) : even_counter+= 1
else : odd_counter+= 1

if (second_digit % 2 == 0) : even_counter+= 1  
else : odd_counter+= 1

if (third_digit % 2 == 0) : even_counter+= 1 
else : odd_counter+= 1

print("Number of odd Number", odd_counter)
print("Number of even Number", even_counter)