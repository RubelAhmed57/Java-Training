public class day3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int x =10;
        if(x == 10)
        {
            int y = 200;
            System.out.println(x);
            System.out.println(y);
        }
        y = 100;
        System.out.println(x*y);
       
         
}
}
*/
This program gives not output rather error.
because the scope of y varible is only with if block.
outside of this block it does not exists. 
/*