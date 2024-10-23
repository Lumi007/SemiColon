
print("number\tsquare\tcube")


for number in range(6):
    square = number ** 2
    cube = number ** 3
    print(f"{number}\t{square}\t{cube}")


print("\nRight-aligned version:")
print("number\tsquare\tcube")


for number in range(6):
    square = number ** 2
    cube = number ** 3
    print(f"{number:>6}{square:>8}{cube:>8}")