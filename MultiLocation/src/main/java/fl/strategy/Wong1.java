package fl.strategy;

import fl.statement.Quad;

public class Wong1 implements Coefficient{
	public double calculate(Quad wQuad,int numOfLine) {
		
		return (double)wQuad.getNcf()/wQuad.getNf();
	}
}
