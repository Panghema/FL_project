package fl.strategy;

import fl.statement.Quad;

public class Tarantula implements Coefficient {

    public double calculate(Quad wQuad,int numOfLine) {
        final double suspiciousenesses;
        final double ncf = (double)wQuad.getNcf();
        final double ncs = (double)wQuad.getNcs();
        final double nf = (double)wQuad.getNf();
        final double ns = (double)wQuad.getNs();
        //System.out.println(ncf+" "+" "+ncs+" "+nf+" "+ns);
        if (nf == 0 || ns == 0 || ncf / nf + ncs / ns == 0){
            suspiciousenesses = 0;
        }else{
            suspiciousenesses = (ncf / nf) / (ncf / nf + ncs / ns);
        }
        return suspiciousenesses;
    }
}