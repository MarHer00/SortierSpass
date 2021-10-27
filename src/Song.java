
public class Song {
	String titel; //songname must be all lowercased
	String interpret;
	int songLength;
	
	public Song(String pTitel, String pInterpret) {
		titel = pTitel;
		interpret = pInterpret;
	}
	
	public void abspielen() {
		System.out.println("playing: "+titel+" by "+interpret);
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

	public String toString(){
		return ("Titel: "+titel+" Artist: "+interpret);
	}
}
