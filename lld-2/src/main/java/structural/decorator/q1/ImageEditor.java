package structural.decorator.q1;


import structural.decorator.q1.utils.Image;

public interface ImageEditor {

    /**
     * Task 1a - Add a method readImage that accepts a filePath and that returns an image {@link structural.decorator.q1.utils.Image}.
     */
    Image readImage(String filePath);
}
