class electrical_component_bill {
    public static void main(String[] args) {
        int order_amount = 7000, discount_percentage = 0, total_discount, billed_amount;
        String product = "Transistor";

        if (product == "Transistor") {
            if (order_amount > 1000) {
                discount_percentage = 10;
            }
        }
        else if (product == "Resistors") {
            if (order_amount > 500) {
                discount_percentage = 5;
            }
        }
        else if (product == "Capacitors") {
            if (order_amount >2000) {
                discount_percentage = 10;
            }
        }
        else {
            System.out.println("Invalid Product");
        }

        total_discount = (order_amount * discount_percentage)/100;
        billed_amount = order_amount - total_discount;
        System.out.println("Total Billed Amount Is: " + billed_amount);
    }
}