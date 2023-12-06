public class CustomerData {
    private String name;
    private String phoneNumber;
    private String address;

    // Constructor
    public CustomerData(String name, String phoneNumber, String address) {
        this.name = name.toUpperCase();
        this.phoneNumber = phoneNumber;
        this.address = address.toUpperCase(); // Konversi ke huruf kapital
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }
}
