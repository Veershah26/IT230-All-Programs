class lorry_driver_bill {
    public static void main(String[] args) {
        int distance = 3000, rate_per_km = 3, journey_days = 10, total_bill;
        int driver_daily_expense = 750;
        String lorry_number = "GJ 06 Bk 1234";

        total_bill = (distance * rate_per_km) + (journey_days * driver_daily_expense);
        System.out.println("*******************************************");
        System.out.println("*                                         *");
        System.out.println("*   Lorry Number          : " + lorry_number + " *"); 
        System.out.println("*   Distance Travelled    : " + distance + "          *");
        System.out.println("*   Rate Per Km           : " + rate_per_km + "             *");
        System.out.println("*   Number Of Journey Days: " + journey_days + "            *");
        System.out.println("*   Total Bill Amount     : " + total_bill + "         *");
        System.out.println("*                                         *");
        System.out.println("*******************************************");
    }
}