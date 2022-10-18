public class Main {
    public static void main(String[] args) {
        // ICustomerDal customerDal = new OracleCustomerDal();

        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        // customerManager.customerDal = new MySqlCustomerDal(); // gerek yok artık
        customerManager.add();
    }
}