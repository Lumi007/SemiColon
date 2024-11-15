from random import randrange


def number_game():
	count = 1
	wrong_answers = 0
	right_answers = 0
	failed_answers = []

	while count <= 5:
		first_number = randrange (1,1001)
		second_number = randrange(1,1001)
		answer =  float(input(f"{first_number} + {second_number} = "))

		if answer == first_number + second_number:
			right_answers+= 1
		else:

			wrong_answers+= 1
			failed_answers.append(f"{count} : {first_number + second_number}")
		count+= 1
	count = 6
	while count < 9:
		first_number = randrange (1,1001)
		second_number = randrange(1,1001)
		answer =  float(input(f"{first_number} * {second_number} = "))

		if answer == first_number * second_number:
			right_answers+= 1
		else:
			wrong_answers+= 1
			failed_answers.append(f"{count} : {first_number * second_number}")
		
		count+= 1
	count = 9
	while count < 11:
		first_number = randrange (1,1001)
		second_number = randrange(1,1001)
		answer =  float(input(f"{first_number} - {second_number} = "))

		if answer == first_number - second_number:
			right_answers+= 1
		else:
			wrong_answers+= 1
			failed_answers.append(f"{count} : {first_number + second_number}")
		count+= 1

	print(f"you got {right_answers} right and {wrong_answers} wrong")
	print("Theses are the answers to the wrong questions")
	for i in failed_answers:
		print(i)
	
	
		

number_game()