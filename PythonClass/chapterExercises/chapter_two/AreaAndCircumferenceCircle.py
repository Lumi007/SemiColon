pi = 3.14159

radius = float(input("Enter the radius of the circle: "))

diameter = 2 * radius
circumference = 2 * pi * radius
area = pi * radius**2


print(f"\nFor a circle with radius {radius}:")
print(f"Diameter: {diameter}")
print(f"Circumference: {circumference:.5f}")
print(f"Area: {area:.5f}")