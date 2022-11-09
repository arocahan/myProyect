import java.sql.SQLOutput;

public class App {
    public static void main(String[]args){
        System.out.println("Hello world");
        Player player1 = new Player("Pedro", "Roca", "Pedrito", "to play baseball");
        System.out.println(player1.Name);
        System.out.println(player1.LastName);
        System.out.println(player1.getNickname());
        System.out.println(player1.Hobby);
    }
}