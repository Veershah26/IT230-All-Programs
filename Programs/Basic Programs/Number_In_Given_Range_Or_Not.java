class number_in_range {
    public static void main(String[] args) {
        int number = 12, lower_limit = 3, upper_limit = 27;
        if (lower_limit <= number && number <= upper_limit) { 
            System.out.println(number + " Is In The Range"); 
        }
        else { 
            System.out.println(number + "Is Not In The Range"); 
        }
    }
}