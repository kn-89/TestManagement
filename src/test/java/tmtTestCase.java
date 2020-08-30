import org.testng.Assert;
import org.testng.annotations.Test;

public class tmtTestCase {

    @Test
    public void test1(){
        System.out.println("Running Test 1");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(true,"Test 1");
    }

    @Test
    public void test2(){
        System.out.println("Running Test 2");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(true,"Test 2");
    }

    @Test
    public void test3(){
        System.out.println("Running Test 3");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(true,"Test 3");
    }

    @Test
    public void test4(){
        System.out.println("Running Test 4");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(true,"Test 4");
    }

    @Test
    public void test5(){
        System.out.println("Running Test 5");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(true,"Test 5");
    }

    @Test
    public void test6(){
        System.out.println("Running Test 6");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(true,"Test 6");
    }

}
