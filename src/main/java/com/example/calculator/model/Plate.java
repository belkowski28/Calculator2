package com.example.calculator.model;

public class Plate {
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

    public Plate(double punch_min,double punch_max, double feed_length,double skip_epe, double skip_laminated){
        this.punch_min = punch_min;
        this.punch_max = punch_max;
        this.feed_length = feed_length;
        this.skip_epe = skip_epe;
        this.skip_laminated = skip_laminated;
    }

}
