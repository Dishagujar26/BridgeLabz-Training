package com.bl.optionalclass.scenario2;

public class EmployeeOptionalDemo {
	public static void main(String[] args) {
		Employee mgr = new Employee("Manager1", null, 1000.0, null, "Ins-123", null);
		Employee emp = new Employee("John", mgr, null, null, null, "Michael");

		// 1. Fetch manager details
		String managerName = emp.getManager().map(m -> m.name).orElse("No Manager");
		System.out.println("Manager: " + managerName);

		// 2. Fetch bonus safely with default
		double bonus = emp.getBonus().orElse(0.0);
		System.out.println("Bonus: " + bonus);

		// 3. Find employee by email, throw custom exception
		try {
			String email = emp.getEmail().orElseThrow(() -> new RuntimeException("Employee email not found"));
			System.out.println("Email: " + email);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// 4. Fetch insurance safely
		String insurance = emp.getInsurance().orElse("No insurance");
		System.out.println("Insurance: " + insurance);

		// 5. Display middle name if present
		emp.getMiddleName().ifPresent(m -> System.out.println("Middle Name: " + m));
	}
}
