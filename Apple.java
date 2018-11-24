public class Apple extends HelloWorld {
  public class apple
  {
    //Field declaration
    private String manufacturer;
    private String modelNumber;
    private double retailPrice;
    //Constructor with parameter
    public apple(String manufact, String modNum, double retail)
    {
      manufacturer = manufact;
      modelNumber = modNum;
      retailPrice = retail;
    }
    // Constructor without parameter
    public apple()
    {
      //Initialize the fields in the object
    }
    //Mutator methods
    public void setManufacturer(String manufact)
    {
      manufacturer = manufact;
    }
    public void setModelNumber(String modNum)
    {
      modelNumber = modNum;
    }
    public void setRetailPrice(double retail)
    {
      retailPrice = retail;
    }
    // Accessor methods
    public String getManufactuerer()
    {
      return manufacturer;
    }
    public String getmodelNumber()
    {
      return modelNumber;
    }
    public double getRetailPrice()
    {
      return retailPrice;
    }
    //Overload a method
    public class Calculator{
      public double sum(double num1, double num2) {
        return num1 + num2;//Do math
      }
      public double sum(int num1, int num2) {
        return num1 + num2;//Do slightly different math
      }
    }
  }




}
