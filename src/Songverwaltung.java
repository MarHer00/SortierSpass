public class Songverwaltung {
	int length = 10;
	Song[] songs = new Song[length];

	public Songverwaltung(int length){
		this.length = length;
	}

	public void fillArray(){
		for (int i = 0; i < songs.length; i++) {
			songs[i] = getSong(i);
		}
	}

	public Song getSong(int songNmbr){
		switch (songNmbr) {
			case 0:
				Song asong = new Song("aTitel", "aArtist");
				return asong;
				
			case 1:
				Song bsong = new Song("bTitel", "bArtist");
				return bsong;
				
			case 2:
				Song csong = new Song("cTitel", "cArtist");
				return csong;
				
			case 3:
				Song dsong = new Song("dTitel", "dArtist");
				return dsong;
				
			case 4:
				Song esong = new Song("eTitel", "eArtist");
				return esong;
				
			case 5:
				Song fsong = new Song("fTitel", "fArtist");
				return fsong;
				
			case 6:
				Song gsong = new Song("gTitel", "gArtist");
				return gsong;
			
			case 7:
				Song hsong = new Song("hTitel", "hArtist");
				return hsong;
				
			case 8:
				Song isong = new Song("iTitel", "iArtist");
				return isong;
				
			case 9:
				Song jsong = new Song("jTitel", "jArtist");
				return jsong;
				
			default:
				Song ksong = new Song("kTitel", "kArtist");
				return ksong;
		}
	}
	
	public void fuegeSongEin(Song pSong) {
		// noch zu implementieren
	}

	public void gibAlleSongsAus() {
		for (int i = 0; i < songs.length; i++) {
			if(songs[i] != null) {
				System.out.println(songs[i].toString());
			}
		}
	}

	public Song sucheUndSpieleSong(){
		Song fSong = SongSearch.start(songs);
		return fSong; //f stands for found
	}
}
