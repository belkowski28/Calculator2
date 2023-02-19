package com.example.calculator.model;

public class Stamp {
    //najmniejszy wykrojnik w płycie
    private double punch_min;
    //największy wykrojnik w płycie
    private double punch_max;
    //długość posuwu
    private double feed_length;
    //skok EPE
    private double skip_epe;
    //skok Laminowany
    private double skip_laminated;
    //1mb = kszt EPE
    private double epe_kszt_mb;
    //1mb = kszt Laminowane
    private double laminated_kszt_mb;
    // takty na minute EPE
    private final double step_epe = 300;
    // takty na minute Laminowane
    private final double step_laminated = 250;
    //ilość kszt/h EPE
    private double epe_kszt_h;
    //ilość kszt/h Laminowane
    private double laminated_kszt_h;

    public Stamp(double punch_min, double punch_max, double feed_length, double skip_epe, double skip_laminated) {
        this.punch_min = punch_min;
        this.punch_max = punch_max;
        this.feed_length = feed_length;
        this.skip_epe = skip_epe;
        this.skip_laminated = skip_laminated;
        setEpe_kszt_mb();
        setLaminated_kszt_mb();
        setEpe_kszt_h();
        setLaminated_kszt_h();
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "punch_min=" + punch_min +
                ", punch_max=" + punch_max +
                ", feed_length=" + feed_length +
                ", skip_epe=" + skip_epe +
                ", skip_laminated=" + skip_laminated +
                ", epe_kszt_mb=" + epe_kszt_mb +
                ", laminated_kszt_mb=" + laminated_kszt_mb +
                ", step_epe=" + step_epe +
                ", step_laminated=" + step_laminated +
                ", epe_kszt_h=" + epe_kszt_h +
                ", laminated_kszt_h=" + laminated_kszt_h +
                '}';
    }
    private void setEpe_kszt_mb(){
        this.epe_kszt_mb= Math.round((this.skip_epe/(this.feed_length/1000.0)/1000.0)*1000.0)/1000.0;
    }
    private void setLaminated_kszt_mb(){
        this.laminated_kszt_mb= Math.round((this.skip_laminated/(this.feed_length/1000.0)/1000.0)*1000.0)/1000.0;
    }

    public void setEpe_kszt_h() {
        this.epe_kszt_h = ((step_epe*skip_epe)*60)/1000.0;
    }

    public void setLaminated_kszt_h() {
        this.laminated_kszt_h = ((step_laminated*skip_epe)*60)/1000.0;
        }

}
