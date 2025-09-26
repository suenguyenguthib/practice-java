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