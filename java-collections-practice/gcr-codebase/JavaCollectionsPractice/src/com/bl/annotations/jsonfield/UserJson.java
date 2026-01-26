package com.bl.annotations.jsonfield;
import java.lang.reflect.Field;

public class UserJson {

    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_email")
    private String email;

    public UserJson(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String toJson() throws IllegalAccessException {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        Field[] fields = this.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            if (fields[i].isAnnotationPresent(JsonField.class)) {
                JsonField jf = fields[i].getAnnotation(JsonField.class);
                sb.append("\"").append(jf.name()).append("\":\"").append(fields[i].get(this)).append("\"");
                if (i < fields.length - 1) sb.append(",");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        UserJson user = new UserJson("Disha", "disha@gmail.com");
        System.out.println(user.toJson());
    }
}
