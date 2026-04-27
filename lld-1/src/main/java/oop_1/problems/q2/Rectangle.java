package oop_1.problems.q2;

public class Rectangle {
    Point topLeft;
    int height;
    int width;

    Point getBottomRight() {
        Point br = new Point();
        br.x = this.topLeft.x + this.width;
        br.y = this.topLeft.y - this.height;
        return br;
    }

    int getArea() {
        return this.height * this.width;
    }

    int getPerimeter() {
        return 2 * (this.height + this.width);
    }
}