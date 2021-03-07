class armstrong {
    public static void main(String[] args) {
        int x = 0, y, temp;
        int z = 153;
        temp = z;
        while (z > 0){
            y = z % 10;
            z = z / 10;
            x = x + (y * y * y);
        }
        if (temp == x){
            System.out.println(temp + " Is An Armstrong Number");
        }
        else{
            System.out.println(temp + " Is Not An Armstrong Number");
        }
    }
}