
/*
 *
 * Smell code			:Wide hierarcy
 * potential cause(s)	:Dia itu ada nge extend function yang tidak diperlukan 
 * solution(s)			:Introducte Intermediate Class (Class penengah)
 *
 */
/*
 *
 * Smell code			:Leaky Encapsulation
 * potential cause(s)	:Dia langsung return atau bisa disebut dengan shallow copy
 * solution(s)			:deep copy -> clone in istilahnya
 *
 */

public abstract class Employee {
	protected String nip;
	protected String nama;
	protected String alamat;
	protected String email;
	protected int gaji;
	protected float kpi;

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
