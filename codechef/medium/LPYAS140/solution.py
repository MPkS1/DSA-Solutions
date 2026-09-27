def calculate_area(length, width):
    # Write your code here
    return length*width
    
    
def main():
    length, width = map(int, input().split())
    area = calculate_area(length, width)
    print(area)


main()
