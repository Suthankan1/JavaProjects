package emailApp;

public class EmailApp {
    public static void main(String[] args){
        Email em1 = new Email ("Suthankan", "Balenthiran");

        em1.setAlternateEmail("suthankanb@gmail.com");
        System.out.println(em1.getAlternateEmail());
        System.out.println(em1.showInfo());


    }
}
