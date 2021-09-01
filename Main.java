class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");
    int avgPieces = 55;
    int bags = 11;
    int totalPieces = avgPieces * bags;


    double blue = totalPieces * .24, brown = totalPieces * .13, green = totalPieces * .16, orange = totalPieces * .20, red = totalPieces * .13, yellow = totalPieces * .14;

    System.out.println("Blue: " + blue);
    System.out.println("Brown: " + brown);
    System.out.println("Green: " + green);
    System.out.println("Orange: " + orange);
    System.out.println("Red: " + red);
    System.out.println("Yellow: " + yellow);

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