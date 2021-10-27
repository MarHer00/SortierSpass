
public class Song {
	String titel;
	String interpret;
	int songLength;
	
	public Song(String pTitel, String pInterpret) {
		titel = pTitel;
		interpret = pInterpret;
	}
	
	public void abspielen() {
		abspielen(0);
	}
	
	public void abspielen(int startPunkt) { 
		if (startPunkt<songLength) {
			
		}
	}
	
	public String gibTitel() {
		return titel;
	}
	
	public String gibInterpret() {
		return interpret;
	}
}
