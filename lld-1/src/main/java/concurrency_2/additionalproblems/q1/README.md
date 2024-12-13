**Image Painter**
Implement a Java program that simulates image re-painting using 4 threads. The algorithm for painting is described as
under but your task is given an image, divide the image into 4 quadrants and let each thread paint one quadrant of the
image. The concurrent execution ensures image is painted efficiently.

Problem Statement:
You are provided a function paintImage. This function is designed to paint a square image, represented as a 2D integer
array, where each integer represents a color. The goal is to paint the image in such a way that each quadrant of the
image has a different color. The painting process for each quadrant should be performed concurrently using multiple
threads.

Tasks:
Implement the paintImage function
Divide the given image into four quadrants.
Paint each quadrant with a different color.
The base color will be provided as an input to the painting method, and each quadrant should use a variation of this
base color.
For first quadrant the color should be same as the given base color.
For second quadrant the color should be equal to 2*base color.
For third quadrant the color should be equal to 3*base color.
For fourth quadrant the color should be equal to 4*base color

Instructions
The image is represented as a 2D integer array.
Use a fixed thread pool size of 4 threads in your ExecutorService.
Handle any potential exceptions that may arise during the execution.
Implement the paintImage function and the constructor in the ImagePainter class.
Use Java's ExecutorService to execute the painting of each quadrant in a separate thread.
Ensure that the program waits for all quadrants to be fully painted before proceeding.
Properly shutdown your ExecutorService after the painting is completed to avoid any resource leaks.

