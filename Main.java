class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");
    int avgPieces = 55;
    int bags = 11;
    int totalPieces = avgPieces * bags;


    double blue = totalPieces * .24, brown = totalPieces * .13, green = totalPieces * .16, orange = totalPieces * .20, red = totalPieces * .13, yellow = totalPieces * .14;

    System.out.println("blue: " + blue);
    System.out.println("brown: " + brown);
    System.out.println("green: " + green);
    System.out.println("orange: " + orange);
    System.out.println("red: " + red);
    System.out.println("yellow: " + yellow);

    double sum = blue + brown + green + orange + red + yellow;
    System.out.println("Sum: " + sum);

    if(blue < brown && red > orange)
      System.out.println("Blue under Brown and Red over Orange");
    if(brown >= green)
      System.out.println("Brown is greater than or equal to Green");
    if(sum == totalPieces)
      System.out.println("Numbers match");


  }
}