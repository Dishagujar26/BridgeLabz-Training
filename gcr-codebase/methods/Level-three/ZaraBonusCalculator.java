// create ZaraBonusCalculator class to calculate bonus
public class ZaraBonusCalculator {

    // Method to generate salary (5-digit) and years of service
    public static double[][] generateEmployeeData(int employees) {
        double[][] data = new double[employees][2];

        for (int i = 0; i < employees; i++) {
            // generate 5-digit salary
            data[i][0] = (int)(Math.random() * 90000) + 10000;

            // generate years of service
            data[i][1] = (int)(Math.random() * 10) + 1;
        }
        return data;
    }

    // Method to calculate new salary and bonus
  
    public static double[][] calculateBonus(double[][] data) {
        double[][] result = new double[data.length][4];

        for (int i = 0; i < data.length; i++) {
            double salary = data[i][0];
            double years = data[i][1];
            double bonus;

            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            result[i][0] = salary;
            result[i][1] = years;
            result[i][2] = bonus;
            result[i][3] = salary + bonus;
        }
        return result;
    }

    // Method to calculate total and display data 
    public static void displayReport(double[][] data) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Emp\tOldSalary\tYears\tBonus\t\tNewSalary");

        for (int i = 0; i < data.length; i++) {
            System.out.printf("%d\t%.0f\t\t%.0f\t%.2f\t%.2f\n",(i + 1),data[i][0],data[i][1],data[i][2],data[i][3]);

            totalOldSalary += data[i][0];
            totalBonus += data[i][2];
            totalNewSalary += data[i][3];
        }

        System.out.println("--------------------------------------------------------");
        System.out.printf("TOTAL\t%.0f\t\t\t%.2f\t%.2f\n",totalOldSalary, totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {

        int employees = 10;

        // generate salary and years of service
        double[][] employeeData = generateEmployeeData(employees);

        // calculate bonus and new salary
        double[][] finalData = calculateBonus(employeeData);

        displayReport(finalData);
    }
}
