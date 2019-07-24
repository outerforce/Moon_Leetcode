### Hashing
Efficient for following operations:
x -> (Key, [X]) cost constant time
- Insert()
- delete()
- search()

simple explanation:
+ hashCode() returns an integer value, generated by a hashing algorithm.
+ hashCode() is used for bucketing in Hash, value returned by hashCode() is used as bucket number for storing the address of element.

### How to Resolve Collision?

#### 1. By chaining

Link records in the same slot into a list
+ Worst => every key linked to the same slot O(n)
+ Average => randomly distributed key O(1+&alpha;)

      Load factor: &alpha; = n/m (total keys/slots)

##### Choose hash function
1. Division: h(k) = k mod m

  - k = 101100110001100
  - m = prime

2. Multiplication:
 - m = 2 <sup>r</sup> (2 to the r)
 - w bits
 - h(k) = (A * k) % 2<sup>w</sup>






#### 2. By open addressing
no storage for links
probe/sequence

hash->hash2->hash3
probe table util empty
slot is found