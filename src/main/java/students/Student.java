package students;


public class Student {
    int numarMatricol;
    String prenume;
    String nume;
    String formatieDeStudiu;


    public Student(int numarMatricol, String prenume, String nume, String formatieDeStudiu) {
        this.numarMatricol = numarMatricol;
        this.prenume = prenume;
        this.nume = nume;
        this.formatieDeStudiu = formatieDeStudiu;
    }


    public int getNumarMatricol() {
        return numarMatricol;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getNume() {
        return nume;
    }

    public String getFormatieDeStudiu() {
        return formatieDeStudiu;
    }

    public String toCSV() {
        return numarMatricol + "," +
                prenume + "," +
                nume + "," +
                formatieDeStudiu;
    }

    @Override
    public String toString() {
        return String.format("%5d %10s %10s %8s", numarMatricol, prenume, nume, formatieDeStudiu);
    }
}