def getSquare(n):
    return n * n

def main():
    for i in range(1, 6):
        result = getSquare(i)
        print("Square of "+ str(i) + " is: " + str(result))

main()