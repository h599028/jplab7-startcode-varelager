package no.hvl.dat100.varelager;

public class VarelagerUtils {

	public static Vare finnBilligste(Vare[] varer) {
		
		Vare billigst = varer[0];
		
		for (Vare vare : varer) {
			
			if (vare.getPris() <= billigst.getPris()) {
				billigst = vare;
			}			
			
		}
		
		return billigst;

	}
	
	public static double totalPris(Vare[] varer) {		
		
		double total = 0;
		
		for (Vare vare : varer) {
			total += vare.getPris();
		}
		
		return total;
		
	}
	
	public static int[] finnVarenr(Vare[] varer) {
				
		int[] varenr = new int[varer.length];
		
		for (int i = 0; i < varenr.length; i++) {
			varenr[i] = varer[i].getVarenr();
		}
		
		return varenr;

	}
	
	public static double[] finnPrisDifferanser(Vare[] varer) {

		double[] differanser = new double[varer.length - 1];
		
		for (int i = 0; i < differanser.length; i++) {
			differanser[i] = Math.abs(varer[i].getPris() - varer[i + 1].getPris());
		}
		
		return differanser;

	}
}
