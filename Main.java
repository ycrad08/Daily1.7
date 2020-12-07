import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

////////////////////////////////////////////////////////////////
  //Variables
    String itemOne;
    String itemTwo;
    String itemThree;
    String itemFour;
    
    int itemQuantityOne;
    int itemQuantityTwo;
    int itemQuantityThree;
    int itemQuantityFour;

    double itemPriceOne;
    double itemPriceTwo;
    double itemPriceThree;
    double itemPriceFour;

    double totalSaleOne;
    double totalSaleTwo;
    double totalSaleThree;
    double totalSaleFour;
    double totalSaleFinal;

////////////////////////////////////////////////////////////////
  //Item Name
    System.out.println("What is item One?");
      itemOne = input.nextLine();
      System.out.println("------------");
    
    System.out.println("What is item Two?");
      itemTwo = input.nextLine();
      System.out.println("------------");
    
    System.out.println("What is item Three?");
      itemThree = input.nextLine();
      System.out.println("------------");
    
    System.out.println("What is item Four?");
      itemFour = input.nextLine();
      System.out.println("------------");

////////////////////////////////////////////////////////////////
  //Item Quantity
    System.out.println("How many would you like for item One?");
    itemQuantityOne = Integer.parseInt(input.nextLine());
    System.out.println("------------");

    System.out.println("How many would you like for item Twp?");
    itemQuantityTwo = Integer.parseInt(input.nextLine());
    System.out.println("------------");

    System.out.println("How many would you like for item Three?");
    itemQuantityThree = Integer.parseInt(input.nextLine());
    System.out.println("------------");

    System.out.println("How many would you like for item Four?");
    itemQuantityFour = Integer.parseInt(input.nextLine());
    System.out.println("------------");

////////////////////////////////////////////////////////////////
  //Item Price
    System.out.println("What is the cost of item One?");
    itemPriceOne = Double.parseDouble(input.nextLine());
    System.out.println("------------");
    
    System.out.println("What is the cost of item Two?");
    itemPriceTwo = Double.parseDouble(input.nextLine());
    System.out.println("------------");
    
    System.out.println("What is the cost of item Three?");
    itemPriceThree = Double.parseDouble(input.nextLine());
    System.out.println("------------");
    
    System.out.println("What is the cost of item Four?");
    itemPriceFour = Double.parseDouble(input.nextLine());
    System.out.println("------------");

////////////////////////////////////////////////////////////////
  //Total Math and Print out
    totalSaleOne = itemPriceOne * itemQuantityOne;
  
    totalSaleTwo = itemPriceTwo * itemQuantityTwo;
  
    totalSaleThree = itemPriceFour * itemQuantityFour;
  
    totalSaleFour = itemPriceFour * itemQuantityFour;
  
    totalSaleFinal = totalSaleOne + totalSaleTwo + totalSaleThree +  totalSaleFour;
    
      System.out.print("$" + totalSaleFinal + " is your total");

  }
}