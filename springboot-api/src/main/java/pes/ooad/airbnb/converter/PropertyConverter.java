package pes.ooad.airbnb.converter;

import pes.ooad.airbnb.model.property.Property;
import pes.ooad.airbnb.model.property.PropertyAdd;
import pes.ooad.airbnb.model.property.PropertyDisplay;
import pes.ooad.airbnb.principal.CurrentUser;

import java.util.ArrayList;
import java.util.List;

public class PropertyConverter {

    public static PropertyDisplay propertyToPropertyDisplay(Property property){
        PropertyDisplay propertyDisplay = new PropertyDisplay();
        propertyDisplay.setProperty_id(property.getProperty_id());
        propertyDisplay.setPropertyName(property.getPropertyName());
        propertyDisplay.setCity(property.getCity());
        propertyDisplay.setAddress(property.getAddress());
        propertyDisplay.setBedrooms(property.getBedrooms());
        propertyDisplay.setParking(property.getParking());
        propertyDisplay.setSwimmingPool(property.getSwimmingPool());
        propertyDisplay.setArea(property.getArea());
        propertyDisplay.setPrice(property.getPrice());
        propertyDisplay.setHostName(property.getHost().getFirstname() + " " + property.getHost().getLastname());
        propertyDisplay.setHostPhone(property.getHost().getPhone());
        propertyDisplay.setHostEmail(property.getHost().getEmail());
        propertyDisplay.setAverageRating(property.getAverageRating());
        propertyDisplay.setLongitude(property.getLongitude());
        propertyDisplay.setLatitude(property.getLatitude());
//        propertyDisplay.setReviewDisplay(ReviewConverter.reviewsToReviewDisplays(property.getReviews()));
        return propertyDisplay;
    }

    public static Property propertyAddToProperty(PropertyAdd propertyAdd){
        Property property = new Property();
        property.setPropertyName(propertyAdd.getPropertyName());
        property.setCity(propertyAdd.getCity());
        property.setAddress(propertyAdd.getAddress());
        property.setBedrooms(propertyAdd.getBedrooms());
        property.setParking(propertyAdd.getParking());
        property.setSwimmingPool(propertyAdd.getSwimmingPool());
        property.setArea(propertyAdd.getArea());
        property.setPrice(propertyAdd.getPrice());
        property.setLongitude(propertyAdd.getLongitude());
        property.setLatitude(propertyAdd.getLatitude());
        property.setAverageRating(0.0);
        property.setNumOfReviews(0);
        return property;
    }

    public static List<PropertyDisplay> propertiesToPropertyDisplays(List<Property> properties) {
        List<PropertyDisplay> propertyDisplays = new ArrayList<PropertyDisplay>();
        for(Property property : properties) {
            PropertyDisplay propertyDisplay = propertyToPropertyDisplay(property);
            propertyDisplays.add(propertyDisplay);
        }
        return propertyDisplays;
    }

}