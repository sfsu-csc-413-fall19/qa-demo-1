import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Main {

  public static int i = 0;

  @BeforeTest
  public void setupTest(){
    i = 1;
  }

  @Test
  public void doSimpleTest(){
    Assert.assertEquals(i, 1);
  }

}
