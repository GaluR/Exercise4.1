public class TestTelevisor {
    public static void main(String[] args) {
        Televisor televisor = new Televisor();
        televisor.onOFF = "Off" ;
        televisor.showStatus();
        televisor.turnON();
        televisor.showStatus();
        televisor.turnOff();
        televisor.showStatus();
    }
}
