public class App {
    public static void main(String[] args) throws Exception {
        Perfumeria prod1=new Perfumeria(200, "perfume", "265754", 25790); 
        Perfumeria prod2=new Perfumeria(300, "Jabon", "265876", 2590);
        Perfumeria prod3=new Perfumeria(600, "Shampoo", "268764", 8790);
        Tabla tHash= new Tabla(); 

        tHash.insertar(prod1);
        tHash.insertar(prod2);
        tHash.insertar(prod3);

        System.out.println("MUESTRA TABLA");
        tHash.muestraArr();

    }
}
