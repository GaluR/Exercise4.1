public class Televisor {
    String onOFF;


    String turnON(){
        onOFF = "Telewizor włączony";
        return onOFF;
    }


    String turnOff(){
        onOFF = "Telewizor wyłączoony";
        return onOFF;
    }

    void showStatus(){
        System.out.println("Status telewizora: " + onOFF);
    }
}
