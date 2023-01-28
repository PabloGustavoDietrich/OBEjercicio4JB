package Ejercicio4JB;

public class SmartDevice {
    private String bateria;
    private String marca;
    private String sistemaOperativo;
    private boolean bluetooth;

    public SmartDevice() {
    }

    public SmartDevice(String bateria, String marca, String sistemaOperativo, boolean bluetooth) {
        this.bateria = bateria;
        this.marca = marca;
        this.sistemaOperativo = sistemaOperativo;
        this.bluetooth = bluetooth;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "bateria='" + bateria + '\'' +
                ", marca='" + marca + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", wifi=" + bluetooth +
                '}';
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }
}
