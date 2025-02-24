# Αλγόριθμος εύρεσης πρώτων αριθμών μεταξύ δύο διψήφιων αριθμών.
# 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
import os
os.system('cls')

print("Give me two numbers with two digits")

print("Please give me the first number")
a = int(input())
while(a<10 or a>99):
    print("Please give me number beetween 10 and 99.")
    a = int(input())

print("Please give me the second number")
d = int(input())
while(d<10 or d>99):
    print("Please give me number beetween 10 and 99.")
    d = int(input())

for number in range(a, d+1):
    isPrime = True
    for i in range(2, int(number/2) + 1):
        if(number % i == 0):
            isPrime = False
            break
    if(isPrime):
        print("The Number", number ,"is prime!")
    else:
        print("The Number", number ,"is not prime!")

os.system('pause')
