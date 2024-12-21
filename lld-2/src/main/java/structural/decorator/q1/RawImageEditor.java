package structural.decorator.q1;

import structural.decorator.q1.utils.Image;
import structural.decorator.q1.utils.ImageUtils;

/**
 * TODO: Task 2 - Implement the ImageEditor interface to simply reads and return the image without any modifications.
 * Methods you can use
 * 1. {@link structural.decorator.q1.utils.ImageUtils#read(String)}
 */
public class RawImageEditor implements ImageEditor {
    @Override
    public Image readImage(String filePath) {
        return ImageUtils.read(filePath);
    }
}