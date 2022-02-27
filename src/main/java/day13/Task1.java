package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1=new User("user1");
        User user2=new User("user2");
        User user3=new User("user3");
        user1.sendMessage(user2,"Hello!");
        user1.sendMessage(user2,"How are you?");
        user2.sendMessage(user1,"So-so");
        user2.sendMessage(user1,"And you?");
        user2.sendMessage(user1,"long time no see!");
        user3.sendMessage(user1,"Hi");
        user3.sendMessage(user1,"Let's meet?");
        user3.sendMessage(user1,"Today?");
        user1.sendMessage(user3,"Hi!");
        user1.sendMessage(user3,"May be...");
        user1.sendMessage(user3,"Later");
        user3.sendMessage(user1,"Well,send me.");
        MessageDataBase.showDialog(user1,user3);


    }
}
