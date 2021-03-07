class Primenumbers{
    public static void main(String args[]){
        int i, x = 0, flag = 0;
        int y = 17;
        x = y/2;
        if(y == 0 || y == 1){
            System.out.println(y + " Is Not A Prime Number");
        }
        else{
            for(i = 2; i <= x; i++){
                if(y % i == 0){
                    System.out.println(y + " Is Not A Prime Number");
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.println(y + " Is A Prime Number");
            }
        }
    }
}