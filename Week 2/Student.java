public class Student {

    private int customerId; //Student/customer ID number
    private String firstName; //First Name
    private String lastName; //Last Name
    private String address1; //Address 1
    private String address2; //Address 2 - Apt#, Building#, etc...
    private String city; //Address city
    private String state; //Address state
    private String zip; //Address zip
    private String deliveryPreference; //Delivery preference - 1 = USPS, 2 = FedEx, 3 - UPS
    private int[] orders; //Array of order numbers related to purchases

    public Student(int customerId, String firstName, String lastName, String address1, String address2, String city,
                   String state, String zip, String deliveryPreference, int[] orders) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.deliveryPreference = deliveryPreference;
        this.orders = orders;
    }

    /*
     * Getter/Setter methods for constructor variables.
     */
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
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

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getDeliveryPreference() {
        return deliveryPreference;
    }

    public void setDeliveryPreference(String deliveryPreference) {
        this.deliveryPreference = deliveryPreference;
    }

    public int[] getOrders() {
        return orders;
    }

    public void setOrders(int[] orders) {
        this.orders = orders;
    }
}
