public class Player {
    String Name;
    public String LastName;
    private String Nickname;
    protected String Hobby;

    public Player (String name, String lastname, String nickname, String hobby){
        this.Name = name;
        this.LastName = lastname;
        this.Nickname = nickname;
        this.Hobby =  hobby;
    }

    public String getNickname() {
        return Nickname;
    }
}
