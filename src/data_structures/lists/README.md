This package includes the implementation of some list ADTs in Java.

The `List` interface that is implemented by the `ArrayList` and `LinkedList` classes includes:
- `boolean add(AnyType element)`
- `void add(int index, AnyType element)`
- `void clear()`
- `boolean contains(AnyType element)`
- `AnyType get(int index)`
- `boolean isEmpty()`
- `void set(int index, AnyType element)`
- `boolean remove(AnyType element)`
- `AnyType remove(int index)`
- `int size()`
- `String toString()`

Visualization of `ArrayList`:

```

       +-----+-----+-----+-----+-----+-----+
       |  a  |  r  |  r  |  a  |  y  |  s  |
       +-----+-----+-----+-----+-----+-----+

index:    0     1     2     3     4     5
```

Visualization of `LinkedList`:

```
       +------+---+   +------+---+   +------+---+   +------+---+   +------+---+   +------+---+
       |  56  | --|-->|  37  | --|-->|  21  | --|-->|  68  | --|-->|  74  | --|-->|  92  | --|-->NULL
       +------+---+   +------+---+   +------+---+   +------+---+   +------+---+   +------+---+

index:       0              1              2              3              4              5
```

The `Stack` interface that is implemented by the `ArrayStack` and `LinkedStack` classes includes:
- `boolean isEmpty()`
- `AnyType peek()`
- `AnyType pop()`
- `AnyType push(AnyType element)`
- `int search(AnyType element)`
- `int size()`
- `String toString()`

Visualization of `Stack`:

```
			   Position: Follows the LIFO principle - Last In First Out
		+-----+
		| abc |    1      --> Top of stack: Where all the operations happen.
		+-----+
		| def |    2
		+-----+
		| adf |    3
		+-----+
		| ghi |    4
		+-----+

```
The `Queue` interface that is implemented by the `ArrayQueue` and `LinkedQueue` classes includes:
- `boolean isEmpty()`
- `AnyType enqueue(AnyType element)`
- `AnyType dequeue()`
- `AnyType poll()`
- `int search(AnyType element)`
- `int size()`
- `String toString()`

Visualization of `Queue`:

```
				  Position: Follows the FIFO principle - First In First Out
		+--------+
		| Green  |    1      --> Front of queue: The only position in the queue where the elements can leave. 
		+--------+
		| Blue   |    2
		+--------+
		| Orange |    3
		+--------+
		| Red    |    4      --> End of queue: The only position in the queue where the elements can be inserted.
		+--------+

```
