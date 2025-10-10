def is_mutable(my_attribute):
    """Checks if a built-in data type is mutable."""
    original_id = id(my_attribute)

    # Try to perform an in-place operation.
    # We'll try to add an element if possible.
    try:
        # This works for lists, sets, dictionaries, etc.
        my_attribute += [1]
    except TypeError:
        # If '+=' with a list fails, it might be an immutable type like a string or tuple.
        # Let's try a different in-place operation for numbers.
        try:
            my_attribute += 1
        except TypeError:
            # If that also fails, it's likely a truly immutable type (like a tuple or string).
            # We can't change it in-place, so it's immutable.
            return False

    # Check if the ID is the same after the operation
    new_id = id(my_attribute)
    return original_id == new_id


myList = [123, 456, 789]
myTuple = (123, 456, 789)
myString = "JCU"
myInt = 123
myDict = {"Budejovice": 1}

print(is_mutable(myList))
print(is_mutable(myTuple))
print(is_mutable(myString))
print(is_mutable(myInt))
print(is_mutable(myDict))
