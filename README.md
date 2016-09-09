This is a java console application which includes all my sample codes.
1. When the user enters the name of a shape followed by the corresponding
number of numeric parameters, define that shape and keep it in memory. The
numbers may be of type float. Examples:
circle 1.7 5.05
6.9
square 3.55 4.1 2.77
rectangle 3.5 2.0 5.6 7.2
triangle 4.5 1 2.5
33
23 0.3
donut 4.5 7.8 1.5 1.8
For the circle, the numbers are the x and y coordinates of the centre
followed by the radius.
 For the square it is x and y of one corner followed by the length of the side.
 For the rectangle it is x and y of one corner followed by the two sides.
 For the triangle it is the x and y coordinates of the three vertices (six
numbers in total).
 For the donut it is the x and y of the centre followed by the two radiuses.
In addition, every time such a line is entered, the application should give it a
unique identifier and print it out in a standardised form, for example:
=> shape 1: circle with centre at (1.7, 5.05) and radius 6.9
2. When the user enters a pair of numbers, the application should print out all the shapes that include that point in the (x, y) space, i.e. it should print out shape X if the given point is inside X. (A point is inside a donut shape if it is inside the outer circle but not inside the inner one.) It should also print out the surface area of each shape found, and the total area of all the shapes returned for a given point.
3. It should accept the commands “help” for printing instructions and “exit” for terminating the execution (“exit” is not necessary in the Javascript app).
4. If the user enters anything unexpected (including errors like too few/many arguments, incorrect number format, etc.), it should print a meaningful error message and continue the execution.

================================================
APPLICATION INSTRUCTIONS
================================================

This is a netbeans project. All source code is in src folder, all junit tests are in test folder. The unit test coverage is greater than 90%. The main class is defined in Command.java 

Packages:
dingwen - Command includes all interface interaction with users.
dingwen.cache - Operations on shapes stored in memory.
dingwen.shapes - shape factory, interface etc.
dingwen.shapes.imp - implementation of shape interface such as donut, circle etc.
dingwen.utils - all common constants and helper class.

if not specify the input file name, the program will look for “input_sample.txt”. input_sample.txt includes input samples.

Shape types : circle, square, rectangle, triangle, donut and ellipse.

=======================================================
for command instructions : help
========================================================
Note: parameters are separated by one whitespce; multiple whitepaces are seen as invalid input.

-Add a shape: add [shape type] [x coordinate of center] [y coordinate of center] [...]
i.e. add circle 1.7 -5.05 6.9
More details about each type of shape, please type 'help shape’.

-Remove a shape: remove [shape id]
i.e. remove 1

-List shapes with id; if no id specified, list all shapes: list [id]
i.e. list 1

-List type,surface area, and total area of shapes that contain a point specified: cointains [x coordinate] [y coordinate]
i.e. contains 1.7 -5.05

-Show help instructions: help

-Exit: exit


=======================================
Add a shape for help : help shape
=======================================
-Add a circle: add circle [x coordinate of center] [y coordinate of center] [radius]
i.e. add circle 1.7 -5.05 6.9

-Add a donut: add donut [x coordinate of center] [y coordinate of center] [inner radius] [outer radius]
i.e. add donut 3.5 2.0 5.6 7.2

-Add a ellipse: add ellipse [x coordinate of center] [y coordinate of center] [height] [width]
i.e. add ellipse 3.5 2.0 5.6 7.2

-Add a rectangle: add rectangle [x coordinate of left upper corner] [y coordinate of left upper corner] [height] [width]
i.e. add rectangle 3.5 2.0 5.6 7.2

-Add a square: add square [x coordinate of left upper corner] [y coordinate of left upper corner] [length]
i.e. add square 3.5 2.0 5.6

-Add a triangle: add triangle [point 1 - x coordinate] [point 1 - y coordinate] [point 2 - x coordinate] [point 2 - y coordinate] [point 3 - x coordinate] [point 3 - y coordinate]
i.e. add triangle 3.5 2.0 5.6 7.2 1 1
