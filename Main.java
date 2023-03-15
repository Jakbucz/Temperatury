 class Main {

  public static void main(String[]args) {
    double stopnie_celsjusza, stopnie_fahrenheita;

      System.out.println("Stopnie od 0 do 300: ");
    for (stopnie_celsjusza = 0; stopnie_celsjusza <= 300; stopnie_celsjusza += 10){
      stopnie_fahrenheita = (stopnie_celsjusza * 9 / 5) + 32;
      System.out.printf("%.1f C = %.1f F\n", stopnie_celsjusza, stopnie_fahrenheita);
    }
  }
}