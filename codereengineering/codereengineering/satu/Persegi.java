
/*
 *
 * Smell code			: Deficient Encapsulation
 * potential cause(s)	: Wrong access modifier in variables
 * solution(s)			: Change access modifier to private
 *
 */

public class Persegi implements BangunDatar {
	private int sisi;

	public Persegi(int sisi) {
		super();
		this.sisi = sisi;
	}

	public int getSisi() {
		return this.sisi;
	}

	public void setSisi(int sisi) {
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
