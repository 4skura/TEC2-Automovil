public class Automovil {
    private String marca;
    private String modelo;
    private int anio;
    private String transmision;
    private int velocidad;

    public Automovil(String marca, String modelo, int anio, String transmision, int kilometros){
        System.out.println("El auto es "+ marca + ", modelo " + modelo + "de " + anio +
                ". es de transmision " + transmision + " y viajará " + kilometros + "kms.");
        return;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void Avanzar(int km){
        System.out.println("Avanzar por " + km + " kilometros");
    }

    public void Frenar(){
        System.out.println("El auto se detuvo");
    }
}
