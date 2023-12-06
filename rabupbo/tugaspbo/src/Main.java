import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Input data
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama Pelanggan : ");
        String name = scanner.nextLine();

        System.out.print("No. HP         : ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Alamat         : ");
        String address = scanner.nextLine();

        System.out.print("Kode Barang    : ");
        String productCode = scanner.nextLine();

        System.out.print("Nama Barang    : ");
        String productName = scanner.nextLine();

        System.out.print("Harga Barang   : ");
        double productPrice = scanner.nextDouble();

        System.out.print("Jumlah Beli    : ");
        int quantity = scanner.nextInt();

        System.out.print("Kasir          : ");
        String cashier = scanner.next();

        // Create CustomerData object
        CustomerData customerData = new CustomerData(name, phoneNumber, address);

        // Create Date object
        Date currentDate = new Date();

        // Create SupermarketTransaction object
        SupermarketTransaction transaction = new SupermarketTransaction(currentDate,
                "hh:mm:ss time zone", customerData, productCode, productName, productPrice,
                quantity, cashier);

        // Display transaction details
        transaction.displayTransaction();
    }
}
