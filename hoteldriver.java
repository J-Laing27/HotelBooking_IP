public class hoteldriver {

    public static void main(String[] args) {

        Customer c1 = new Customer("mary, singleton", "m.g@gmail.com");
        Customer c2 = new Customer();

        c1.display();
        c2.getname();
        c2.getemail();
        c2.display();
    }
}
