weightInKg = float(input("Please enter your weight in Kg: "))
	

heightInMeters = float(input("Please enter your height in meters: "))
		
bmi = weightInKg / (heightInMeters * heightInMeters)

print(f"Your BMI is: {bmi:.2f}")

if bmi < 18.5: 
	print("You are Under Weight")
elif bmi < 25: 
	print("You are Normal Weight")
elif bmi < 30:
	print("You are Over Weight")
else:
	print("You are Obese")