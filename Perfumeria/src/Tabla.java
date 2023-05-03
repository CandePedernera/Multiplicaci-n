public class Tabla {
//static final int m=1024; 
static final double r=0.6180334; //Este es una elección constante
Perfumeria[] arr;
public Tabla() {
    this.arr = new Perfumeria[1024];
  }

static long transClave(String clave){
    long d=0; 
    for(int i=0; i<Math.min(clave.length(),10); i++){ //condic, tiene que ser menor que el minimo entre la long de la clave o 10
        d=d*27+(int)clave.charAt(i); //Convierte el caracter en int en ascii
        if(d<0){ //Si es negativo lo paso a positivo
            d=-d; 
        }
    }
    return d; //d es el valor numerico de la clave que es caracter
}  
static int disperMult(long x){
    double t;//parte dec 
    int v; //entero y pos
    t= r*x-(Math.floor(r*x)); //calculo la parte decimal
    v=(int) (1027*t);//Calcula la pate entera y la posicion en la dispersión; 
    return v;
}
public void insertar( Perfumeria prod){
    long valor; 
    int posicion; 
    valor=transClave(prod.getProd()); //Guardo el valor entero de la clave de caracter
    valor= disperMult(valor); //Calculo la posición por el metodo de dispersión
    posicion= (int) valor; //Guardo en la posición el num entero de la disp
    arr[posicion]=prod; //se guarda el valor en la posición 
}
public void muestraArr(){
    for(int i=0; i<arr.length; i++){
        if(arr[i]!=null){
            System.out.println("posicion: "+ i + "producto guardado aquí: " + arr[i].getProd());
        }
    }
}
}
