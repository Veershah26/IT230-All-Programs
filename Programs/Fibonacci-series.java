class Fibonacci{
    public static void main(String args[]){
        int n1 = 0, n2 = 1, n3, i, count = 20;
        System.out.print(n1 + " " + n2);// This line prints 0 & 1

        for(i = 2; i < count; i++){// This loop adds the third element as the sum of previous two elements as long as i<count
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}