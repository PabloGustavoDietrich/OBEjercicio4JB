package Ejercicio4JB;

public class SmartWatch extends SmartDevice{
    private String correa;

    public SmartWatch() {
    }

    public SmartWatch(String bateria, String marca, String sistemaOperativo, boolean bluetooth, String correa) {
        super(bateria, marca, sistemaOperativo, bluetooth);
        this.correa = correa;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "correa='" + correa + '\'' +
                "} " + super.toString();
    }

    public String getCorrea() {
        return correa;
    }

    public void setCorrea(String correa) {
        this.correa = correa;
    }
}
