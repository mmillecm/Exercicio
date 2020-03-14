package br.com.wcc;

public class Double  implements  Soma{
    private double n1,n2;
    public void setDouble( double n1 , double n2){
       this.n1=n1;
       this.n2=n2;

    }

    @Override
    public double Soma() {
        return n1+n2;
    }
}
