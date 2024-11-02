characters = ['B', 'C', 'D', 'b', 'c', 'd', '0', '1', '2', '$', '*', '+', ' ']


print("Character\tInteger Value")
print("-" * 25)


for char in characters:
    print(f"'{char}'\t\t{ord(char)}")