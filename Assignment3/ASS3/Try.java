public class Try{
    public static void main (String[]args){
        char[][] table1 = new char[1][1];
        char[0][0] = 'b';
        Map m1 = new Map(table1);
        System.out.println(m1.numOfColors());
    }
}