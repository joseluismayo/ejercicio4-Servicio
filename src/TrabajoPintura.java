import java.time.LocalDate;

public class TrabajoPintura extends Servicio{
    double Superficie;
    double PrecioPintura;

    public TrabajoPintura(String trabajador, LocalDate fechaInicio, String cliente, double superficie, double precioPintura) {
        super(trabajador, fechaInicio, cliente);
        Superficie = superficie;
        PrecioPintura = precioPintura;
    }

    public double costeMaterial() {
        return((this.Superficie/7.8)*this.PrecioPintura);
    }
    public double costeManoObra() {
        return((this.Superficie/10)*9.5);
    }
    public double costeTotal() {
        if (Superficie < 50) {
            return ((costeMaterial()+costeManoObra())*1.15);
        }
        return (costeMaterial()+costeManoObra());
    }

    public String detalleServicio() {
        return "TRABAJO DE PINTURA\nCliente: " + this.Cliente + "\nFecha de inicio: " + this.FechaInicio +
                "\n----------------------------------------\nPintor: " + this.Trabajador + "\nCoste material..... " +
                this.costeMaterial() + "\nCoste mano obra.... " + this.costeManoObra() + "\nTOTAL.............. " + this.costeTotal();
    }
}
