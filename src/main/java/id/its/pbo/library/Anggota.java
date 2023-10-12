package id.its.pbo.library;

public class Anggota {
	
	String nama;
	String alamat;
	String nomorAnggota;
	
	public Anggota (String nama, String nomorAnggota) {
		this.nama = nama;
		this.alamat = "Alamat belum diisi";
		this.nomorAnggota = nomorAnggota;
	}
	
	public Anggota (String nama, String alamat, String nomorAnggota) {
		this.nama = nama;
		this.alamat = alamat;
		this.nomorAnggota = nomorAnggota;
	}
	
	
	public String getNama() {
		return nama;
	}
	
	public String getAlamat() {
		return alamat;
	}
	
	public String getNomorAnggota() {
		return nomorAnggota;
	}
	
	
	
	 public String getInfoAnggota() {
	        return nama + ", " + alamat + ", " + nomorAnggota;
	    }


}
