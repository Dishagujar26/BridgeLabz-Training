package com.bl.annotations.maxlength;
import java.lang.reflect.Field;

public class User {

    @MaxLength(10)
    private String username;

    public User(String username) {
        validate(username);
        this.username = username;
    }

    private void validate(String username) {
        try {
            Field field = this.getClass().getDeclaredField("username");
            if (field.isAnnotationPresent(MaxLength.class)) {
                MaxLength max = field.getAnnotation(MaxLength.class);
                if (username.length() > max.value()) {
                    throw new IllegalArgumentException("Username exceeds max length of " + max.value());
                }
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public String getUsername() {
        return username;
    }

    public static void main(String[] args) {
        User u1 = new User("Disha"); // valid
        System.out.println(u1.getUsername());

        // This will throw exception
        User u2 = new User("ThisIsAVeryLongUsername"); 
    }
}
