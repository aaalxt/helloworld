import org.testng.annotations.*;

public class demo {
    @Test
   public void testCase1(){
        System.out.println("这是测试用例1");
   }
   @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
    }
    @BeforeMethod
   public void beforeMoted(){
       System.out.println("测试方法之前运行的方法");
   }
   @AfterMethod
   public  void afterMoted(){
       System.out.println("这是方法之后的运行方法");
   }
   @BeforeClass
   public void beforeClass(){
       System.out.println("这是在类运行之前运行的方法");


   }
   @AfterClass
   public void afterClass(){
       System.out.println("这是在类运行之后的方法");
   }


}
