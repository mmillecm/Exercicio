package br.com.wcc;

public class Float implements Soma {
    private float n1,n2;
    public void setFloat( float n1 , float n2){
        this.n1=n1;
        this.n2=n2;

    }

    @Override
    public double Soma() {
        return n1+n2;
    }
}
