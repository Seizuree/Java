
/*
 *
 * Smell code			: Multipath Hierarchy
 * potential cause(s)	: Repeated inheritance
 * solution(s)			: Delete BangunDatar implements for class Kubus
 *
 */

public class Kubus extends BangunRuang {
	private int rusuk;
	
	public Kubus(int rusuk) {
		super();
		this.rusuk = rusuk;
	}
	
	public int getRusuk() {
		return rusuk;
	}

	public void setRusuk(int rusuk) {
		this.rusuk = rusuk;
	}

	@Override
	public float computeArea() {
		// TODO Auto-generated method stub
		return 6*this.rusuk*this.rusuk;
	}

	@Override
	public float computeAround() {
		// TODO Auto-generated method stub
		return 12*this.rusuk;
	}

	@Override
	public float computeVolume() {
		// TODO Auto-generated method stub
		return this.rusuk*this.rusuk*this.rusuk;
	};


}
