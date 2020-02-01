# recursion-sequential-counter
Sequential counter for positive integer numbers using recursion.

Pure Java is used to run both methods. Gradle is used mainly for running tests, or if needed, to compile 
to .class files.
To build this small library use the `gradle build` command. The built jar file will appear in a standard
`builds/libs` folder.

Both methods are called as an example in the main() method. Methods are static as there is no need to instantiate 
objects from their class. The Counter therefore can't be used to create objects and can't be extended.

There are 2 methods to use:
* countUp() - will output all the numbers from <i>start</i> to <i>end</i> (including both of those values)
* countUpAndDown() - will output all the numbers from <i>start</i> to <i>end</i> and back to <i>start</i>

# countUp
Method outputs (to System.out) generated numbers starting from the provided <i>start</i> until and including 
the <i>end</i> parameter.

Method assumes both the <i>start</i> and <i>end</i> are positive integers (0 is considered to be positive)
and that <i>end</i> value is always bigger than the <i>start</i> value. 

### Example:
* Input:
```
countUp(0,7)
```
* Output
```
0
1
2
3
4
5
6
7
```

# countUpAndDown()
Method outputs (to System.out) generated numbers starting from the provided <i>start</i> until and including 
the <i>end</i> and back until to the <i>start</i> value.

Just like countUp(), this method assumes both the <i>start</i> and <i>end</i> are positive integers 
(0 is considered to be positive) and that <i>end</i> value is always bigger than the <i>start</i> value. 

### Example:
* Input:
```
countUp(1,5)
```
* Output
```
1
2
3
4
5
4
3
2
1
```

# Tests
Test can be run using the command `gradle test`