package rocks.zipcode.assessment2.objectorientation;

import java.util.Objects;

/**
 * @author leon on 28/11/2018.
 */
public class Address {
    private String getAddressLine1;
    private String getAddressLine2;
    private String city;
    private String state;
    private String zipcode;

    public Address() {
        this.getAddressLine1 = "";
        this.getAddressLine2 = "";
        this.city = "";
        this.state = "";
        this.zipcode = "";
    }

    /**
     * @param addressLine1 - first address line
     * @param addressLine2 - second address line
     * @param city         - city of location
     * @param state        - state of city
     * @param zipcode      - zipcode of region
     */
    public Address(String addressLine1, String addressLine2, String city, String state, String zipcode) {
        this.getAddressLine1 = addressLine1;
        this.getAddressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getAddressLine1() {
        return getAddressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.getAddressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return getAddressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.getAddressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    // command N made this whole toString()
//    @Override
//    public String toString() {
//        return "Address{" +
//                "getAddressLine1='" + getAddressLine1 + '\'' +
//                ", getAddressLine2='" + getAddressLine2 + '\'' +
//                ", city='" + city + '\'' +
//                ", state='" + state + '\'' +
//                ", zipcode='" + zipcode + '\'' +
//                '}';
//  }
    @Override
    public String toString(){
        return String.format("Address{addressLine1='%s', addressLine2='%s', city='%s', state='%s', zipcode='%s'}",
                getAddressLine1, getAddressLine2, city, state, zipcode);
    }

    @Override
    public boolean equals(Object o) {
        if(! (o.getClass() == this.getClass())){
            return false;
        }
        Address ad = (Address)o;
        return(Objects.equals(getAddressLine1, ad.getAddressLine1()) &&
                Objects.equals(getAddressLine2, ad.getAddressLine2()) &&
                Objects.equals(city, ad.getCity()) &&
                Objects.equals(state, ad.getState()) &&
                Objects.equals(zipcode, ad.getZipcode()));
    }

}
