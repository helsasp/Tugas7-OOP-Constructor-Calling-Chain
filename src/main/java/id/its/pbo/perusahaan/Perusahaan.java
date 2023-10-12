package id.its.pbo.perusahaan;

public class Perusahaan {
	
	public static void main (String [] args) {
		
		Direktur d1 = new Direktur ("Helsa", "HS362004", "IT Department", 1500.50);
		
		System.out.println("Nama Direktur : " + d1.getNama());
		System.out.println("ID Direktur : " + d1.getId());
		System.out.println("Departemen Direktur : " + d1.getDepartemen());
		System.out.println("Gaji Direktur : " + d1.getGaji());
	}

}
