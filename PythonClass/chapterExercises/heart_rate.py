
age = int(input("Enter your age in years: "))


max_heart_rate = 220 - age


target_min = max_heart_rate * 0.50
target_max = max_heart_rate * 0.85


print("\nBased on the American Heart Association guidelines:")
print(f"Your maximum heart rate is {max_heart_rate} beats per minute")
print(f"Your target heart rate range is {target_min:.0f} - {target_max:.0f} beats per minute")

print("\nIMPORTANT NOTE:")
print("These calculations are estimates provided by the American Heart Association.")
print("Maximum and target heart rates may vary based on individual health,")
print("fitness level, and gender. Always consult a physician or qualified")
print("healthcare professional before beginning or modifying an exercise program.")