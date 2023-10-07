
/*
 *
 * Smell code			: Multipath Hierarcy
 * potential cause(s)	: Mo Yung
 * solution(s)			: Hapus yang Mo Yung 
 *
 */

/*
 *
 * Smell code			: Deficient Encapsulation
 * potential cause(s)	: Kalau misalkan dia pakai public 
 * solution(s)			: ubah jadi private
 *
 */

public class Kubus extends BangunRuang  {
	private int rusuk;

	public int getRusuk() {
		return rusuk;
	}

	public void setRusuk(int rusuk) {
		this.rusuk = rusuk;
	}

	public Kubus(int rusuk) {
		super();
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
