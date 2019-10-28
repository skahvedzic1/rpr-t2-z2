package ba.unsa.etf.rpr.tutorijal02;

import java.util.Objects;

public class Interval {
    private double pocetna_tacka;
    private double krajnja_tacka;
    private boolean pocetak_pripada;
    private boolean kraj_pripada;

    public double getPocetna_tacka() {
        return pocetna_tacka;
    }

    public double getKrajnja_tacka() {
        return krajnja_tacka;
    }

    public Interval(double v, double v1, boolean b, boolean b1) {
        if ( v > v1) throw new IllegalArgumentException();
        pocetna_tacka = v;
        krajnja_tacka = v1;
        pocetak_pripada = b;
        kraj_pripada = b1;
    }

    public Interval() {
        this(0,0,false,false);
    }

    public static Interval intersect(Interval i, Interval i2) {
        if (i2.getPocetna_tacka() > i.getPocetna_tacka() && i2.getPocetna_tacka() < i.getKrajnja_tacka()) {
            return new Interval(i2.getPocetna_tacka(),i.getKrajnja_tacka(),true,true);
        }
        return null;
    }

    public Interval intersect(Interval interval) {
        if(interval.getPocetna_tacka() > this.getPocetna_tacka() && interval.getPocetna_tacka() < this.getKrajnja_tacka()) {
            return new Interval(interval.getPocetna_tacka(),this.getKrajnja_tacka(),true,true);
        }
        return null;
    }
    public boolean isIn(double v) {
        if (getPocetna_tacka() > v && getKrajnja_tacka() < v) return true;
        return false;
    }

    public boolean isNull() {
        if (getKrajnja_tacka()== 0 && getPocetna_tacka()== 0) return true;
        return false;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Interval interval = (Interval) o;
        return Double.compare(interval.pocetna_tacka, pocetna_tacka) == 0 &&
                Double.compare(interval.krajnja_tacka, krajnja_tacka) == 0 &&
                pocetak_pripada == interval.pocetak_pripada &&
                kraj_pripada == interval.kraj_pripada;
    }

    @Override
    public String toString() {
        return "Interval{" +
                pocetna_tacka +
                ", " + krajnja_tacka +
                "} pocetak_pripada= " + pocetak_pripada +
                " , kraj_pripada= " + kraj_pripada +
                '.';
    }

}