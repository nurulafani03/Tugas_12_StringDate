import java.text.SimpleDateFormat;
import java.util.Date;

public class SupermarketTransaction {
    private String transactionDate;
    private String transactionTime;
    private CustomerData customerData;
    private String productCode;
    private String productName;
    private double productPrice;
    private int quantity;
    private double totalPayment;
    private String cashier;

    // Constructor
    public SupermarketTransaction(Date date, String time, CustomerData customerData,
                                  String productCode, String productName, double productPrice,
                                  int quantity, String cashier) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("E, dd/MM/yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss z");

        this.transactionDate = dateFormat.format(date);
        this.transactionTime = timeFormat.format(date);
        this.customerData = customerData;
        this.productCode = productCode;
        this.productName = productName.toUpperCase(); // Konversi ke huruf kapital
        this.productPrice = productPrice;
        this.quantity = quantity;
        this.totalPayment = productPrice * quantity;
        this.cashier = cashier.toUpperCase(); // Konversi ke huruf kapital
    }

    // Display transaction details
    public void displayTransaction() {
        System.out.println("NAMA SUPERMARKET/MINI MARKET");
        System.out.println("Tanggal : " + transactionDate);
        System.out.println("Waktu   : " + transactionTime);
        System.out.println("========================");
        System.out.println("DATA PELANGGAN");
        System.out.println("---------------------");
        System.out.println("Nama Pelanggan : " + customerData.getName());
        System.out.println("No. HP         : " + customerData.getPhoneNumber());
        System.out.println("Alamat         : " + customerData.getAddress());
        System.out.println("++++++++++++++++++++++++");
        System.out.println("DATA PEMBELIAN BARANG");
        System.out.println("------------------------------");
        System.out.println("Kode Barang    : " + productCode);
        System.out.println("Nama Barang    : " + productName);
        System.out.println("Harga Barang   : " + productPrice);
        System.out.println("Jumlah Beli    : " + quantity);
        System.out.println("TOTAL BAYAR    : " + totalPayment);
        System.out.println("++++++++++++++++++++++++");
        System.out.println("Kasir          : " + cashier);
    }
}
