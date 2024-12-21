package structural.decorator.q1;

import structural.decorator.q1.utils.Image;
import structural.decorator.q1.utils.ImageUtils;

/**
 * TODO Task 4a - Extend the {@link BaseImageDecorator} interface to apply a blur filter to the image.
 * Remember
 * 1. When you inherit from the {@link BaseImageDecorator}, you will have to implement the readImage method.
 * 2. You will also need to call the next layer from {@link BaseImageDecorator} in the chain to get the image and then apply the blur filter.
 * 3. Each decorator would also need a constructor that takes the next layer of type {@link ImageEditor} and calls the super constructor.
 */
public class BlurImageDecorator extends BaseImageDecorator {

    public BlurImageDecorator(ImageEditor nextLayer) {
        super(nextLayer);
    }

    @Override
    public Image readImage(String filePath) {
        Image image = nextLayer.readImage(filePath);
        return ImageUtils.applyBlur(image);
    }
}