
/*
 *
 * Smell code			:
 * potential cause(s)	:
 * solution(s)			:
 *
 */

public class Persegi implements BangunDatar {
	public int sisi;

	public Persegi(){}
	public Persegi(int sisi) {
		super();
		this.sisi = sisi;
	}

	@Override
	public float computeArea() {
		// TODO Auto-generated method stub
		return this.sisi*this.sisi;
	}

	@Override
	public float computeAround() {
		// TODO Auto-generated method stub
		return 4*this.sisi;
	}

}
