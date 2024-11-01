
row_number = int(input("Please enter a number: "))


for i in range(1, row_number + 1):
   
    for j in range(i, row_number):
        print(" ", end="")
    
    for j in range(1, i):
        print("*", end="")
    
    for j in range(1, i + 1):
        print("*", end="")
    print()  


for i in range(1, row_number):
   
    for j in range(1, i + 1):
        print(" ", end="")
    
    for j in range(i, row_number):
        print("*", end="")
   
    for j in range(i, row_number):
        print("*", end="")
    print()