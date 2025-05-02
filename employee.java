public class employee {
  int id;
  protected int age;
  protected String name;

  protected boolean isPermanent;

  public static void main(String[] args) {
    // tring to assign 35.5 age directly would cause an error

    employee emp = new employee();
    // correct way to written
    emp.age = (int) 35.5;
    System.out.println("sucessful");
  }
}
