public class cobaPerson {
  public static void main(String[] args) {
    person Person = new person("Yahya", 16);

    Person.setHobby("main game");

    System.out.println("Nama : " + Person.getNama());
    System.out.println("Umur : " + Person.getUmur());
    System.out.println("Hobby : " +   Person.getHobby());
  }
}
