package br.com.wcc;

public class SomaInteiro implements Soma{
    int n1,n2;
    public void setInteiro( int n1 , int n2){
        this.n1=n1;
        this.n2=n2;

    }

    @Override
    public double Soma() {
        return n1+n2;
    }


}
