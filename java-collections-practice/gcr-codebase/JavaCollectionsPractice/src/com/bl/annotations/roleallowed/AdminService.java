package com.bl.annotations.roleallowed;
import java.lang.reflect.Method;

public class AdminService {

    @RoleAllowed("ADMIN")
    public void deleteUser() {
        System.out.println("User deleted successfully!");
    }

    public static void main(String[] args) throws Exception {
        AdminService service = new AdminService();

        String currentUserRole = "USER"; // try "ADMIN" to allow

        Method method = AdminService.class.getDeclaredMethod("deleteUser");

        if (method.isAnnotationPresent(RoleAllowed.class)) {
            RoleAllowed role = method.getAnnotation(RoleAllowed.class);
            if (role.value().equals(currentUserRole)) {
                method.invoke(service);
            } else {
                System.out.println("Access Denied!");
            }
        }
    }
}
