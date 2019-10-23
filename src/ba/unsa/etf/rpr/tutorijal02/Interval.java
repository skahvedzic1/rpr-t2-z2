package ba.unsa.etf.rpr.tutorijal02;

public class Interval {
     double pocetna_tacka,krajnja_tacka;
     boolean pripada_pocetna,pripada_krajnja;

     Interval(double pt, double kt, boolean pp,boolean pk) {
         pocetna_tacka=pt;
         krajnja_tacka=kt;
         pripada_pocetna=pp;
         pripada_krajnja=pk;
     }

     Interval() {

     }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Interval interval = (Interval) object;
        return java.lang.Double.compare(interval.pocetna_tacka, pocetna_tacka) == 0 &&
                java.lang.Double.compare(interval.krajnja_tacka, krajnja_tacka) == 0 &&
                pripada_pocetna == interval.pripada_pocetna &&
                pripada_krajnja == interval.pripada_krajnja;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Interval{" +
                "pocetna_tacka=" + pocetna_tacka +
                ", krajnja_tacka=" + krajnja_tacka +
                ", pripada_pocetna=" + pripada_pocetna +
                ", pripada_krajnja=" + pripada_krajnja +
                '}';
    }
}
