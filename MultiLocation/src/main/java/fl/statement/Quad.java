package fl.statement;

public class Quad {
	private int numOfLine;
	private double ncf;
	private double nuf;
	private double ncs;
	private double nus;
	
	public Quad(int numOfLine,int ncf,int nuf,int ncs,int nus) {
		this.numOfLine = numOfLine;
		this.ncf = ncf;
		this.nuf = nuf;
		this.ncs = ncs;
		this.nus = nus;
	}
	
	public Quad(int numOfLine,double ncf,double nuf,double ncs,double nus) {
		this.numOfLine = numOfLine;
		this.ncf = ncf;
		this.nuf = nuf;
		this.ncs = ncs;
		this.nus = nus;
	}
	
	public int getLineNumber() {
		return numOfLine;
	}
	
	public double getNcf() {
		return ncf;
	}
	
	public double getNuf() {
		return nuf;
	}
	
	public double getNcs() {
		return ncs;
	}
	
	public double getNus() {
		return nus;
	}
	
	public double getNf() {
		return ncf+nuf;
	}
	
	public double getNs() {
		return ncs+nus;
	}
}
