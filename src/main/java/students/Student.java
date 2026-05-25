package students;

public record Student(
        int numarMatricol,
        String prenume,
        String nume,
        String formatieDeStudiu,
        int nota
) {

    public String toCSV() {
        return numarMatricol + "," +
                prenume + "," +
                nume + "," +
                formatieDeStudiu + "," +
                nota;
    }

    @Override
    public String toString() {
        return String.format("%5d %10s %10s %8s %3d",
                numarMatricol,
                prenume,
                nume,
                formatieDeStudiu,
                nota);
    }
}