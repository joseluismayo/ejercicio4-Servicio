public abstract class RevisionAlarma extends Servicio{
    int numAlarmasRevisar;
    public RevisionAlarma(String cliente, int numAlarmasRevisar) {
        super(cliente);
        this.numAlarmasRevisar = numAlarmasRevisar;
        this.Trabajador="Revisor Especialista Contraincendios";
    }
}
