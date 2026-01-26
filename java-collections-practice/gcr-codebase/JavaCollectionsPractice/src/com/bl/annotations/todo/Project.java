package com.bl.annotations.todo;
import java.lang.reflect.Method;

public class Project {

    @Todo(task = "Implement login", assignedTo = "Disha")
    public void login() {}

    @Todo(task = "Add payment gateway", assignedTo = "Ravi", priority = "HIGH")
    public void payment() {}

    public static void main(String[] args) {
        for (Method m : Project.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Todo.class)) {
                Todo t = m.getAnnotation(Todo.class);
                System.out.println("Task: " + t.task() + ", Assigned To: " + t.assignedTo() + ", Priority: " + t.priority());
            }
        }
    }
}
