package com.talwin.salary;

public class Summa {
    private String sum;
    private String fszn;
    private String bgs;
    private String pdn;
    private String prfsz;

    public Summa(String sum, String fszn, String bgs, String pdn, String prfsz) {
        double sum_fszn = Double.parseDouble(sum)*Double.parseDouble(fszn)/100;
        double sum_bgs = Double.parseDouble(sum)*Double.parseDouble(bgs)/100;
        double sum_pdn = Double.parseDouble(sum)*Double.parseDouble(pdn)/100;
        double sum_prfsz = Double.parseDouble(sum)*Double.parseDouble(prfsz)/100;
        double sum1 = Double.parseDouble(sum)-sum_fszn-sum_bgs-sum_pdn-sum_prfsz;

        this.fszn = String.valueOf(sum_fszn);;
        this.bgs = String.valueOf(sum_bgs);
        this.pdn = String.valueOf(sum_pdn);
        this.prfsz = String.valueOf(sum_prfsz);
        this.sum = String.valueOf(sum1);
    }

    public String getSum() {
        return sum;
    }

    public String getFszn() {
        return fszn;
    }

    public String getBgs() {
        return bgs;
    }

    public String getPdn() {
        return pdn;
    }

    public String getPrfsz() {
        return prfsz;
    }


}
