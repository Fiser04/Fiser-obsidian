# x = [(1, 12), ("A", 8), (7, 5)]
# min = x[0][1]
# max = min
# for i in range(0, len(x)):
#     if min > x[i][1]:
#         min = x[i][1]
#     if max < x[i][1]:
#         max = x[i][1]

# print(min)
# print(max)
def divide(x, y):
    try:
        result = x / y
    except ZeroDivisionError:
        print("You cannot divide by yero!")
    else:
        print("Result is", result)
    finally:
        print("Never give up")


divide(5, 3)
