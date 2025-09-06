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

Common methods:

- Initialization: `ArrayList<Object> arrayName = new ArrayList<>();`
- `boolean add(E e)`
- `void add(int index, E element)`
- `void clear()`
- `Object clone()`
- `boolean contains(Object o)`
- `void ensureCapacity(int minCapacity)`
- `E get(int index)`
- `int indexOf(Object o)`
- `boolean isEmpty()`
- `int lastIndexOf(Object o)`
- `E remove(int index)`
- `boolean remove(Object o)`
- `E set(int index, E element)`
- `int size()`
- `List<E> subList(int fromIndex, int toIndex)`
- `Object[] toArray()`
- `void trimToSize()`

## Strings

A string is a sequence of characters.

Common methods:

- Initialization: `String variableName = "";`
- `char charAt(int index)`
- `int codePointAt(int index)` (Unicode code point)
- `int codePointBefore(int index)` (Unicode code point)
- `int codePointCount(int beginIndex, int endIndex)` (Unicode code point)
- `int compareTo(String anotherString)`: Compares two strings lexicographically
- `int compareToIgnoreString(String anotherString)`: Compares two strings lexicographically ignoring case differences
- `String concat(String str)`
- `int indexOf(String str)`
- `boolean isEmpty()`
- `int length()`
- `boolean matches(String regex)`: [regular expression](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html#sum)
- `boolean isLetter(char c)`
- `boolean isDigit(char c)`
- `boolean isLowerCase(char c)`
- `boolean isUpperCase(char c)`