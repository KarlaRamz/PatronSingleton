public class Database {

    private boolean Conection;
    private static Database bad;


    private Database(){
        Conection = false;
    }

    static Database getInstance(){
        if(bad == null){
            if(bad == null){
                bad = new Database();
                System.out.println("Base de datos creada");
            }
        }
        return bad;
    }

    public boolean theConection(){
    return Conection;
    }

    public void notConection(){
        if(!theConection()){
            Conection = true;
            System.out.println("La base de datos esta conectada");
        }
        else{
            System.out.println("La base de datos ya se encuentra conectada");

        }
    }

    public void deleteConection(){
        if(theConection()){
            Conection = false;
            System.out.println("La base de datos esta desconectada");
        }
        else{
          
            System.out.println("La base de datos ya se encuentra desconectada");

        }
        
    }
}
