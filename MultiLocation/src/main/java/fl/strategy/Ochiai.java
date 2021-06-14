package fl.strategy;

import fl.statement.Quad;

public class Ochiai implements Coefficient{
	public double calculate(Quad wQuad,int numOfLine) {
		final double suspiciousenesses;
        final double ncf = (double)wQuad.getNcf();
        final double ncs = (double)wQuad.getNcs();
        final double nuf = (double)wQuad.getNuf();
        final double nus = (double)wQuad.getNus();
        if((ncf+nuf)==0||(ncf+ncs)==0) {
        	suspiciousenesses = 0;
        }
        else {
        	suspiciousenesses = ncf/Math.sqrt((ncf+nuf)*(ncf+ncs));
        }
        
        return suspiciousenesses;
	}
}
