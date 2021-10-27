public class Songverwaltung {
	Song[] songs = new Song[5];
	
	public static void main(String[] args) {
		
	}
	
	public void fuegeSongEin() {
		
	}
	
	public void gibAlleSongsAus() {
		for (int i = 0; i < songs.length; i++) {
			if(songs[i] != null) {
				System.out.println(songs[i].toString());
			}
		}
	}
}
