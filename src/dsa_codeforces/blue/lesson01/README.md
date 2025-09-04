# Dynamic Arrays and Strings

## Arrays

In Java, arrays are linear data structures, and similar types of elements will be inserted in continuous memory locations.
However, size needs to be specified at time of declaration or taken from user.

Hence, ArrayList which serves the job as a dynamic array helps solve this problem.
Entries can be added as the array increases its size as it is full.
The size of the new array increases to double the size of the original array.
Now all elements are retained in the new array which is in the specified array domain size
and the rest are added after them in a newly formed way.
This array keeps on growing dynamically.

### Initialization

```
    ArrayList<Class> variable = new ArrayList<Class>();
```

Example: `ArrayList<Integer> arr = new ArrayList<Integer>();`

### Adding elements

```
    add(Class element)
```

Example: `arr.add(5);`

### Inserting element at a specific index

```
    add(int index, Class element)
```

Example: `arr.add(2, 9)`

### Getting size of the array

```
    size()
```

Example: `arr.size();`

### Getting and setting at a specified index

```
    get(int index)
    set(int index, Class element)
```

Example:

```
    int value = arr.get(2);
    a.set(2, 3);
```

### Removing element at a specified index

```
    remove(int index)
```

Example: `arr.remove(arr.size() - 1);`

### Clearing the entire array

```
    clear()
```

Example: `arr.clear();`

### Getting the sublist of the current array

```
    subList(int fromIndex, int toIndex)
```

Example: `arr.subList(2, 5);`

### Checking the emptiness of the array

```
    isEmpty()
```

Example: `arr.isEmpty();`