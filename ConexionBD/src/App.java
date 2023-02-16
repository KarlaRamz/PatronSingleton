public class App {
    public static void main(String[] args) throws Exception {
        
        Database database = Database.getInstance();
        Database database1 = Database.getInstance();

        database.theConection();
        database.notConection();
        database1.notConection();
        database.deleteConection();

    }
}
