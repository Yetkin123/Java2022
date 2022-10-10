public class Main {
    public static void main(String[] args) {

        // IoC Container, yani dependency injection aslında yaptığımız olay.
        CustomerManager customerManager = new CustomerManager(new Customer(), new CarCreditManager());
        customerManager.giveCredit();

        /*
        CreditManager creditManager = new CreditManager();
        creditManager.calculate();
        creditManager.calculate();
        creditManager.save();

        Customer customer = new Customer(); // örneğini oluşturmak, instance creation
        customer.id = 1;
        customer.city = "Ankara";

        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.save();
        customerManager.delete();

        Company company = new Company();
        company.taxNumber = "100000";
        company.companyName = "Arçelik";
        company.id = 100;

        CustomerManager customerManager2 = new CustomerManager(new Company());

        Person person = new Person();
        person.firstName = "Engin";
        person.nationalIdentity = "";

        Customer c1 = new Customer();
        Customer c2 = new Person();
        Customer c3 = new Company();
         */
    }
}