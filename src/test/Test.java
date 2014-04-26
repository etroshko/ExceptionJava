package test;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test {
    @Test
    public void test() {
        Treap treap=new Treap();
        int result=treap.getRoot();
        assertEquals(0, result);
    }
}
