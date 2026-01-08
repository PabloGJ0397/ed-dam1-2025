package features.factura;

public class Factura {
    private int numeroFactura;
    private String concepto;
    private String precio;
    private String fecha;
    private String hora;

    public Factura(int numeroFactura, String concepto, String precio, String fecha, String hora) {
        this.numeroFactura = numeroFactura;
        this.concepto = concepto;
        this.precio = precio;
        this.fecha = fecha;
        this.hora = hora;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

}
