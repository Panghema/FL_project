package fl.strategy;

import fl.statement.Quad;

public class Naish1 implements Coefficient{
	public double calculate(Quad wQuad,int numOfLine) {
		if(wQuad.getNcf()<wQuad.getNf()) {
			return (double)-1/wQuad.getNs();
		}
		if(wQuad.getNcf()==wQuad.getNf()) {
			return (wQuad.getNs()-wQuad.getNcs())/wQuad.getNs();
		}
		return (double)0;
	}
}
