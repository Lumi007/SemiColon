student_average = int(input("Enter the student grade: "))

if student_average >= 90:
	print('A')
else:
	if student_average >= 80:
		print('B')
	else:
		if student_average >= 70:
			print('C')
		else:
			print('F')
