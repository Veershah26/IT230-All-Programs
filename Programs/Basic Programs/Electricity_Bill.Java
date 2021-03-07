class electricity_bill {
    public static void main(String[] args) {
        double units_consumed, current_reading = 3684, past_reading = 3148;
        double total_bill, charge_per_unit = 3.2;
        int customer_no = 400;
        String customer_name = "Baburao Ganpatrao Apte";
        units_consumed = current_reading - past_reading;
        total_bill = units_consumed * charge_per_unit;
        System.out.println("            Electricity Bill");
        System.out.println(" ------------------------------------------");
        System.out.println("| Customer No     : " + customer_no + "                    |");
        System.out.println("| Customer Name   : " + customer_name + " |");
        System.out.println("| Past Reading    : " + past_reading + "                 |");
        System.out.println("| Current Reading : " + current_reading + "                 |");
        System.out.println("| Units Consumed  : " + units_consumed + "                  |");
        System.out.println("| Charge Per Unit : " + charge_per_unit + "                    |");
        System.out.println("| Billed Amount   : " + total_bill + "                 |");
        System.out.println(" ------------------------------------------");

    }
}