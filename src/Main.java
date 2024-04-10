public class Main
{
    public static void main(String[] args)
    {
        Book b = new Book("Ethan", "Java Programming", "9782329392");

        System.out.println(b);

        b.setOnLoan(true);

        System.out.println(b);
    }
}