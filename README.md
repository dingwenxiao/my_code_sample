=========================
Java console application - My code sample. 
===================
1. Users can create any number of shapes like circle,donut,ellipse, rectangle etc.
2. Print out the shapes in a certain format.
3. Calculate the area of a shape or overlapped area of multiple shapes.
4. test if two shapes are overlapped.
5. help instructions.
6. Error input handling - for anything unexpected input, the corresponding error message will given to users.


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
