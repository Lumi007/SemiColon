scores = []

while len(scores) < 10 :
	score = int(input("Enter a valid score between 1 to 100 :"))
	if (score > 0 and score < 100):	
		scores.append(score)
	else: 
		print("enter a valid score")
print(max(scores))
	