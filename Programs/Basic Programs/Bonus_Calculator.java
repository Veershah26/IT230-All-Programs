class bonus_calculator {
    public static void main(String[] args) {
        int base_salary = 12000, bonus_percentage, bonus_amount;

        if (base_salary < 2000) { 
            bonus_percentage = 5; 
        }
        else if (base_salary >= 2000 && base_salary <= 5000) { 
            bonus_percentage = 7; 
        }
        else if (base_salary >= 5000 && base_salary <= 7000) { 
            bonus_percentage = 9; 
        }
        else { 
            bonus_percentage = 12; 
        }
        bonus_amount = (base_salary * bonus_percentage)/100;
        System.out.println("The Bonus Amount For Employee Is: " + bonus_amount);
    }
}