
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main
{
    public static void main (String [] args)
    {

       Treap treap = new Treap();

        Logger log = Logger.getLogger(Treap.class.getName());
        try
        {
            File file = new File( "input.txt" );
            Scanner sc = new Scanner(file);
            while(sc.hasNext()){
                int temp = sc.nextInt();
                int priority=sc.nextInt();
                assert (temp>=0):"invalid value";

                treap.insert(temp, priority);
            }
        }
        catch (FileNotFoundException e1)
        {
            log.log(Level.INFO,"file error");
            System.exit(0);
        }
        treap.print();


       /* Logger log = Logger.getLogger(Treap.class.getName());

        try {
            throw new Exception("exception");

        } catch (Exception ex) {
            log.log(Level.SEVERE, "exception: ", ex);
        }

        */

    }
}


class MainUnit{
    public static void main(String[] args)
    {
        Treap treap=new Treap();
        int ar[]= {-1,0,1,2,3};
        for(int i=0; i<ar.length; ++i)
        {
            assert (ar[i]!=0): "invalid value";
            int rand = new Random().nextInt();
            treap.insert(ar[i], rand);
        }
        //assertEquals(0, result);
    }
}
