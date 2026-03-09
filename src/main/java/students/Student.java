package students;

public class Student {
    int numarMatricol;
    String prenume;
    String nume;
    String formațieDeStudiu;

    public Student(int numarMatricol, String prenume, String nume, String formațieDeStudiu) {
        this.numarMatricol = numarMatricol;
        this.prenume = prenume;
        this.nume = nume;
        this.formațieDeStudiu = formațieDeStudiu;
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

    public String getFormațieDeStudiu() {
        return formațieDeStudiu;
    }

@Override public String toString() {
//    return "Student{" +
//            "numarMatricol=" + numarMatricol +
//            ", prenume='" + prenume + '\'' +
//            ", nume='" + nume + '\'' +
//            ", formațieDeStudiu='" + formațieDeStudiu + '\'' +
//            '}';
    return String.format("%5d %10s %10s %8s", numarMatricol, prenume, nume, formațieDeStudiu);
}}
