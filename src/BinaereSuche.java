class BinaereSuche {
  
  public static int suche(int[] array, int gesuchteZahl) {
    System.out.println("Suche "+gesuchteZahl+" in einem Array der Länge "+array.length);
    int linkerRand = 0;             // inklusiv
    int rechterRand = array.length-1; // inklusiv
    System.out.println("linkerRand = "+linkerRand+" // rechterRand = "+rechterRand);
    int mitte;
    while (linkerRand < rechterRand) {
      mitte = (linkerRand+rechterRand)/2;
      System.out.println("mitte = "+mitte);
      System.out.print("array["+mitte+"] = "+array[mitte]+" --> ");
      if (gesuchteZahl == array[mitte]) {
        System.out.println("Gesuchte Zahl wurde gefunden.");
        return mitte;
      }
      if (gesuchteZahl < array[mitte]) {
        System.out.println("Gesuchte Zahl ist kleiner ("+gesuchteZahl+"<"+array[mitte]+").");
        rechterRand = mitte;
        System.out.println("linkerRand = "+linkerRand+" // rechterRand = mitte = "+rechterRand);
      } else {
        System.out.println("Gesuchte Zahl ist größer ("+gesuchteZahl+">"+array[mitte]+").");
        linkerRand = mitte + 1;
        System.out.println("linkerRand = mitte+1 = "+linkerRand+" // rechterRand = "+rechterRand);
      } 
    }
    System.out.println("LinkerRand = rechteRand = "+rechterRand+" --> Gesuchte Zahl ist nicht im Array vorhanden.");
    return -1;
  }
  
  public static void main(String[] args) {
    int[] array = new int[127];
    array[0] = (int) (Math.random() * 32);
    for (int i=1; i < array.length; i++) {
      int zufallszahl = (int) (Math.random() * 2 + 1);
      array[i] = array[i-1]+zufallszahl;
    }
    int gesuchteZahl = (int) (Math.random() * 255);
    int index = suche(array, gesuchteZahl);
  }
  
}