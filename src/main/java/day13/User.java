package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final String username;
    private final List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        this.subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        for (User user1 : subscriptions) {
            if (user1.getUsername().equals(user.getUsername())) {
                return true;
            }
        }
        return false;
    }

    public boolean isFriend(User user) {
        return this.isSubscribed(user) && user.isSubscribed(this);
    }

    public void sendMessage(User user, String text) {
        MessageDataBase.addNewMessage(this, user, text);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }
}
