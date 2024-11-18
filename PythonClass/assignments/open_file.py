student_file = open("students.txt", "r" )
for student in student_file.readlines():
	print(student)	



student_file.close