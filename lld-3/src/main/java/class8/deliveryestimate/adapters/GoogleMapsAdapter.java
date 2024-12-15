package class8.deliveryestimate.adapters;

import class8.deliveryestimate.libraries.GoogleMapsApi;
import class8.deliveryestimate.libraries.models.GLocation;
import org.springframework.stereotype.Component;

@Component
public class GoogleMapsAdapter implements MapsAdapter{

    private final GoogleMapsApi googleMapsApi = new GoogleMapsApi();

    @Override
    public int getEstimatedTime(double srcLat, double srcLong, double destLat, double destLong) {
        GLocation src = new GLocation();
        src.setLatitude(srcLat);
        src.setLongitude(srcLong);
        GLocation dest = new GLocation();
        dest.setLatitude(destLat);
        dest.setLongitude(destLong);
        return googleMapsApi.estimate(src, dest);
    }
}
