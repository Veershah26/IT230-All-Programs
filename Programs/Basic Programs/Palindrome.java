class Palindrome{
    public static void main(String args[]){
        int x, sum = 0, temp;
        int y = 71217;

        temp = y;
        while (y > 0){
            x = y % 10;
            sum = (sum * 10) + x;
            y = y/10;
        }
        if (temp == sum){
            System.out.println(temp + " Is A Palindrome");
        }
        else{
            System.out.println(temp + " Is Not A Palindrome"); 
        } 
    }
}