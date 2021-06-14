package fl.strategy;

import fl.statement.Quad;

public interface Coefficient {
	public double calculate(Quad wQuad,int numOfLine);
}
