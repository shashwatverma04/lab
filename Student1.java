public class Student1 implements java.io.Serializable {
  private String name;
  private int age;
  private String department;

  // Constructor that takes all three attributes
  public Student1(String name, int age, String department) {
    this.name = name;
    this.age = age;
    this.department = department;
  }

  // Getter method for name
  public String getName() {
    return name;
  }

  // Setter method for name
  public void setName(String name) {
    this.name = name;
  }

  // Getter method for age
  public int getAge() {
    return age;
  }

  // Setter method for age
  public void setAge(int age) {
    this.age = age;
  }

  // Getter method for department
  public String getDepartment() {
    return department;
  }

  // Setter method for department
  public void setDepartment(String department) {
    this.department = department;
  }

  // Optional: You can add a toString() method for easy printing of the object
  @Override
  public String toString() {
    return "Student1{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", department='" + department + '\'' +
        '}';
  }

  public static void main(String[] args) {
    // Example of creating and using the Student1 JavaBean
    Student1 student = new Student1("Alice", 20, "Computer Science");
    System.out.println("Student Details:");
    System.out.println("Name: " + student.getName());
    System.out.println("Age: " + student.getAge());
    System.out.println("Department: " + student.getDepartment());

    // Using the setter methods to update attributes
    student.setAge(21);
    student.setDepartment("Information Technology");
    System.out.println("\nUpdated Student Details:");
    System.out.println(student); // Using the toString() method
  }
}