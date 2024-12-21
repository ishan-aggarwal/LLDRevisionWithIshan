package structural.decorator.q1;

import lombok.AllArgsConstructor;

/**
 * TODO Task 3a - Each decorator should have the same methods as the product it decorates i.e. readImage
 * Inherit from the image editor interface {@link ImageEditor}.
 */
@AllArgsConstructor
public abstract class BaseImageDecorator implements ImageEditor {
    /**
     * TODO Task 3b - Each decorator will have to call the next decorator in the chain and finally call the raw image editor.
     * To achieve this, you will need to store a reference to the next layer. Add a field that stores the next layer of
     * type {@link ImageEditor}. This should be protected so that it can be accessed by the subclasses.
     */
    protected ImageEditor nextLayer;
}