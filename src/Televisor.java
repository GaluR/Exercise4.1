public class Televisor {
    String televisor;

    Televisor(String t){
        televisor = t;
    }


    void turnON(){
        televisor = "Telewizor włączony";
    }


    void turnOff(){
        televisor = "Telewizor wyłączoony";
    }

    void showStatus(){
        System.out.println("Status telewizora: " + televisor);
    }
}
