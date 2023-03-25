public class Main {
    public static void main(String[] args) {
    boolean result = Parametr.parametr("csd1641p", "123", "123");
  if (result){
      System.out.println(" Пароль и логин корректные.");}
  else {
      System.out.println("Пароль или логин некорректные.");
  }
    }
}