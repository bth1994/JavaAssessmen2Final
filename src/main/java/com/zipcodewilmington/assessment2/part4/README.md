# Java Interfaces

The following code is provided in the locked portion of the editor:

* The declaration for an interface named Rectangle containing a method signature for an area method.
* The declaration for an interface named Circle containing a method signature for an area method.
* A Solution class containing the following:
	* An implementedInterfaceNames function that takes an object and prints the names of the interfaces it implements.
	* A main method that creates a Geometry object, passes the Geometry object as an argument to implementedInterfaceNames, and tests the implementations of the overloaded area methods.
 

Complete the code in the editor below by writing the following:

1. A Geometry class that implements the Rectangle and Circle interfaces. Do not use an access modifier in the class declaration.
2. An area method that has two integer parameters, height and width, and returns an integer denoting the area of a height × width rectangle.
3. An area method that has one integer parameter, radius, and returns a double denoting the area of a circle (i.e., 3.14 × radius2).
 

**Note:** Use 3.14 (the truncated value for pi) to calculate the area of a Circle.


## Sample

```
@Test
public void areaTest1(){
  Geometry g = new Geometry(2,5,7);
  int height = 2;
  int width = 5;
  int expected = 10;
  int actual = g.getArea(height, width);
  // The rectangle area should be 10
  Assert.assertEquals(expected, actual);
}

@Test
public void areaTest2(){
  Geometry g =  new Geometry(2,5,7);
  int radius = 7;
  double expected = 153.86;
  double actual = g.getArea(radius);
  // The Circle area should be 153.86
  Assert.assertEquals(expected, actual, 0.001);
}
```



## Explanation 

The respective values for height, width, and radius are 2, 5, and 7.

area(height, width) = height × width = 10

area(radius) = 3.14 × radius × radius = 153.86