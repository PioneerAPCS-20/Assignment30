# Assignment 30

Given a 2D array, an hourglass is a selection of values shaped like this:

```
a b c
  d
e f g
```

For example, if I create an hourglass with ones within a 2D array of zeros it may look like this:

```
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
```

There are actually 16 hourglasses in the 6x6 2D array above. The three leftmost hourglasses at the top of the 2D array are the following:

```
1 1 1     1 1 0     1 0 0
  1         0         0
1 1 1     1 1 0     1 0 0
```

The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.

In this problem you have to print the largest sum among all the hourglasses in the array.

### Directions

Download the starter code (`Runner.java` and `Grid.java`) and the .txt files (`grid1.txt`, `grid2.txt`, and `grid3.txt`). 
Then, add your implementation for the `largestHourglass()` method and complete the `Runner` class.

Read the comments of the provided methods carefully so you know what they do and how to use them.

### Test Outputs

```
grid1.txt: 13

grid2.txt: 19

grid3.txt: 52
```


### Challenge

In addition to printing the sum, also print the location (row and column of the top left value of the hourglass) of the largest sum. This can be done without creating an extra method.

Outputs:

```
grid1.txt: 13 [1, 0]

grid2.txt: 19 [3, 2]

grid3.txt: 52 [3, 1]
```

<details>
    <summary>Click to see a hint</summary>
        <p>
            Create an `int` array that holds three values: the sum, the row number, and the column number. Return this array in the `largestHourglass` method and then access the three values in the array in `Main`.
        </p>
</details>

### Grading

Please make sure you have comments for every method you create. As always, your program will be graded on its functionality according to the project specifications and proper code style.

