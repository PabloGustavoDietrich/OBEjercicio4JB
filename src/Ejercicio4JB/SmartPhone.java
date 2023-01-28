package Ejercicio4JB;

public class SmartPhone extends SmartDevice{
    private String fundaProtectora;

    public SmartPhone() {
    }

    public SmartPhone(String bateria, String marca, String sistemaOperativo, boolean bluetooth, String fundaProtectora) {
        super(bateria, marca, sistemaOperativo, bluetooth);
        this.fundaProtectora = fundaProtectora;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "fundaProtectora='" + fundaProtectora + '\'' +
                "} " + super.toString();
    }

    public String getFundaProtectora() {
        return fundaProtectora;
    }

    public void setFundaProtectora(String fundaProtectora) {
        this.fundaProtectora = fundaProtectora;
    }
}
