class leap_year_or_not {
    public static void main(String[] args) {
        int Year = 2020;
        
        boolean isLeapYear = false;

        if (Year % 4 == 0) { 
            if (Year % 100 == 0) { 
                if (Year % 400 == 0) { 
                    isLeapYear = true; 
                } 
                else { 
                    isLeapYear = false; 
                } 
            } 
            else { 
                isLeapYear = true; 
            } 
        } 
        else { 
            isLeapYear = false; 
        }

        if (isLeapYear = true) { 
            System.out.println(Year + " Is A Leap Year."); 
        } 
        else { 
            System.out.println(Year + " Is Not A Leap Year."); 
        }
    }
}