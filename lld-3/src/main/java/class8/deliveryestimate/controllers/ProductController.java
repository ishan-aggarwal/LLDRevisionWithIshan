package class8.deliveryestimate.controllers;

import class8.deliveryestimate.dtos.DeliveryEstimateRequestDto;
import class8.deliveryestimate.dtos.DeliveryEstimateResponseDto;
import class8.deliveryestimate.dtos.ResponseStatus;
import class8.deliveryestimate.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Date;

@Controller
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    public DeliveryEstimateResponseDto estimateDeliveryTime(DeliveryEstimateRequestDto requestDto){
        DeliveryEstimateResponseDto responseDto = new DeliveryEstimateResponseDto();
        try{
            Date estimateDeliveryDate = productService.estimateDeliveryDate(requestDto.getProductId(), requestDto.getAddressId());
            responseDto.setExpectedDeliveryDate(estimateDeliveryDate);
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
            return responseDto;
        } catch (Exception e){
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
            return responseDto;
        }
    }
}
