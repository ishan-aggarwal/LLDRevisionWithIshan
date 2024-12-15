package structural.facade.q3;

import structural.facade.q3.services.*;

public class ImageEditingManager {
    private ImageProcessor imageProcessor;

    public ImageEditingManager(ImageLoader imageLoader, FilterService filterService, ImageModifier imageModifier, ImageWriter imageWriter, AnalyticsService analyticsService) {
        this.imageProcessor = new ImageProcessor(imageLoader, filterService, imageModifier, imageWriter, analyticsService);
    }

    public void editImage(String imagePath, String filterType, int brightness) {
        imageProcessor.process(imagePath, filterType, brightness);
    }

}
