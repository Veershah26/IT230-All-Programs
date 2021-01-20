class Fibonacci{
    public static void main(String args[]){
        int m1 = 0, m2 = 1, m3, i, count = 20;
        System.out.print(m1 + " " + m2);// This line prints 0 & 1

        for(i = 2; i < count; i++){// This loop adds the third element as the sum of previous two elements as long as i<count
            m3 = m1 + m2;
            System.out.print(" " + m3);
            m1 = m2;
            m2 = m3;
        }
    }
}