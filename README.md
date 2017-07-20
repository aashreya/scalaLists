# Scala Collections 

Immutable implementation of Lists and Binary Search Tree

### Supported List options 

    - isEmpty
    - tail
    - head
    - union(secondList: IList[T])
    - map[T2](f: T => T2)
    - unique()
    - contains(element: T)
    - fold(acc: S, op: (S, S) => S): S
    - scan(acc: S, op: (S, S) => S): IList[S]
    - reverse()
    - count(elem: S)
 
### Supported BST options

    - insert(item: S)((S, S) => Boolean): Btree[S]
    - size() : Int
    - inorder() : Unit
    - map[R,S >:T](f:S => R) : BTree[R]
    - invert(): Btree[S]
    - find[S >: T](element: S): Boolean
    - maxSum() : Int