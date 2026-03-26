


class Person {
private String name;  // hidden data
// Getter
public String getName() {
return name;
}
// Setter
public void setName(String newName) {
this.name = newName;
}
}
public class encap{
public static void main(String[] args) {
Person myObj = new Person();
myObj.setName("John");
System.out.println(myObj.getName());
}
}
