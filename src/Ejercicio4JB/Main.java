package Ejercicio4JB;

public class Main {
    public static void main(String[] args) {
        /*En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
         Agregaréis atributos tal cual tendrían esos objetos en la realidad.
         Crear constructor vacío y con todos los parámetros para cada clase.
         Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.*/
     //SmartDevice
        SmartDevice smartDevice1 = new SmartDevice();
        SmartDevice smartDevice2 = new SmartDevice("OB-710","Motorola","Android",true);
        System.out.println(smartDevice2.toString());
      //SmartPhone
        SmartPhone smartPhone1 = new SmartPhone();
        SmartPhone smartPhone2 = new SmartPhone("OB-910","Xiomi","Android",true,"silicona");
        System.out.println(smartPhone2.toString());
      //SmartWatch
      SmartWatch smartWatch1 = new SmartWatch();
      SmartWatch smartWatch2 = new SmartWatch("OB-810","Samsung","S10watch",false,"silicona");
        System.out.println(smartWatch2);
    }
}