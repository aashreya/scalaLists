# scalaLists

Immutable implementation of Lists.

### Supported options 

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