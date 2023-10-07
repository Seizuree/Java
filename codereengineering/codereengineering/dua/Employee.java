
/*
 *
 * Smell code			: Wide Hierarchy
 * potential cause(s)	: Extend kepada class yang tidak memerlukan semua method Employee
 * solution(s)			: Introduce intermediate class 
 *
 */

public abstract class Employee {
	private String nip;
	private String nama;
	private String alamat;
	private String email;
	private int gaji;

	public Employee(){}
	public Employee(String nip, String nama, String alamat, String email,int gaji) {
		super();
		this.nip = nip;
		this.nama = nama;
		this.alamat = alamat;
		this.email = email;
		this.gaji = gaji;
	}
	public String getNip() {
		return nip;
	}
	public String getNama() {
		return nama;
	}
	public String getAlamat() {
		return alamat;
	}
	public String getEmail() {
		return email;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setGaji(int gaji){
		this.gaji = gaji;
	}
	public int getGaji(){
		return gaji;
	}
}
