package class8.deliveryestimate.services;

import class8.deliveryestimate.adapters.MapsAdapter;
import class8.deliveryestimate.exceptions.AddressNotFoundException;
import class8.deliveryestimate.exceptions.ProductNotFoundException;
import class8.deliveryestimate.models.Address;
import class8.deliveryestimate.models.DeliveryHub;
import class8.deliveryestimate.models.Product;
import class8.deliveryestimate.models.Seller;
import class8.deliveryestimate.repositories.AddressRepository;
import class8.deliveryestimate.repositories.DeliveryHubRepository;
import class8.deliveryestimate.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;
    private AddressRepository addressRepository;
    private DeliveryHubRepository deliveryHubRepository;

    private MapsAdapter mapsAdapter;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository, AddressRepository addressRepository, DeliveryHubRepository deliveryHubRepository, MapsAdapter mapsAdapter) {
        this.productRepository = productRepository;
        this.addressRepository = addressRepository;
        this.deliveryHubRepository = deliveryHubRepository;
        this.mapsAdapter = mapsAdapter;
    }

    @Override
    public Date estimateDeliveryDate(int productId, int addressId) throws ProductNotFoundException, AddressNotFoundException {
        Product product = this.productRepository.findById(productId).orElseThrow(() -> new ProductNotFoundException("Product not found"));
        Address userAddress = this.addressRepository.findById(addressId).orElseThrow(() -> new AddressNotFoundException("Address not found"));

        Seller seller = product.getSeller();
        Address sellerAddress = seller.getAddress();
        DeliveryHub deliveryHub = this.deliveryHubRepository.findByAddress_ZipCode(sellerAddress.getZipCode()).orElseThrow(() -> new AddressNotFoundException("Delivery hub not found"));

        //Calculate time estimate between seller and hub
        int estimate = mapsAdapter.getEstimatedTime(sellerAddress.getLatitude(), sellerAddress.getLongitude(), deliveryHub.getAddress().getLatitude(), deliveryHub.getAddress().getLongitude());
        //Calculate time estimate between hub and user
        estimate += mapsAdapter.getEstimatedTime(deliveryHub.getAddress().getLatitude(), deliveryHub.getAddress().getLongitude(), userAddress.getLatitude(), userAddress.getLongitude());

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND, estimate);
        return calendar.getTime();
    }
}
