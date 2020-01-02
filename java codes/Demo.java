class  Demo{
  public static void main(String args[])
    {
      int i;
      i=10;
      System.out.println("Value of i:"+ i);

      Room r1 = new Room();
      r1.length = 20;
      r1.breadth = 10;
      r1.height = 15;

      int floorArea = r1.calculateFloorArea();
      System.out.println("FloorArea:"+ floorArea);

      int paintCost = r1.calculatePaintCost();
      System.out.println("PaintCost:"+ paintCost);

      Room r2 = new Room();
      r2.length = 10;
      r2.breadth = 10;
      r2.height = 10;

      floorArea = r2.calculateFloorArea();
      System.out.println("FloorAreaForRoom2:"+ floorArea);

      paintCost = r2.calculatePaintCost();
      System.out.println("PaintCostForRoom2:"+ paintCost);
   }
}