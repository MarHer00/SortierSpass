import java.lang.management.ThreadInfo;

public class SongSearch {
    Song[] songs;

    public SongSearch(Song[] pSongs){
      songs = pSongs;
    }

    public Song findSongByT(String searchedSongT) {// T for titel
      System.out.println("Suche "+searchedSongT+" in einem Array der L�nge "+songs.length);
      int linkerRand = 0;             // inklusiv
      int rechterRand = songs.length; // exklusiv
      System.out.println("linkerRand = "+linkerRand+" // rechterRand = "+rechterRand);
      int mitte;
      while (linkerRand < rechterRand) {
        mitte = (linkerRand+rechterRand)/2;
        System.out.println("mitte = "+mitte);
        System.out.print("array["+mitte+"] = "+songs[mitte].toString()+" --> ");
        if (songs[mitte].titel.equals(searchedSongT)) {
          System.out.println("Gesuchter Song wurde gefunden.");
          return songs[mitte];
        }
        if (vorAktSong(searchedSongT , songs[mitte].titel)) {
          System.out.println("Gesuchter Song ist vor ("+searchedSongT+"<"+songs[mitte].toString()+").");
          rechterRand = mitte;
          System.out.println("linkerRand = "+linkerRand+" // rechterRand = mitte = "+rechterRand);
        } else {
          System.out.println("Gesuchter Song ist nach ("+searchedSongT+"<"+songs[mitte].toString()+").");
          linkerRand = mitte + 1;
          System.out.println("linkerRand = mitte+1 = "+linkerRand+" // rechterRand = "+rechterRand);
        }
      }
      System.out.println("LinkerRand = rechteRand = "+rechterRand+" --> Gesuchte Zahl ist nicht im Array vorhanden.");
      return new Song("", "");
    }

    public boolean vorAktSong(String searchedSong, String aktSong){
      return vorAktSong(searchedSong, aktSong, 0);
    }

    public boolean vorAktSong(String searchedSong, String aktSong, int i){ //returns true wenn gesuchte Song alphabetisch vor dem aktuellen Song ist
      int charSSongInAlph = getCharposInAlph(searchedSong.charAt(i));
      int charASongInAlph = getCharposInAlph(aktSong.charAt(i));

      searchedSong = searchedSong.substring(i+1);
      aktSong = aktSong.substring(i+1);

      if (charSSongInAlph<charASongInAlph) {
        return true;
      } else if (charSSongInAlph == charASongInAlph) {
        return vorAktSong(searchedSong, aktSong, i);
      } else{
        return false;
      }
    }

    public int getCharposInAlph(char cChar){
      String alph = "abcdefghijklmnopqrstuvwxyz";
      for (int i = 0; i<26; i++) {
        if (cChar == alph.charAt(i)){
          return i;
        }
      }
      return -1;
    }
}
