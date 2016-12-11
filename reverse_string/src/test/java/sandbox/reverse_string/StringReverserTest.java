package sandbox.reverse_string;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringReverserTest {
  private static final String TEST_INPUT = "some great input";

  // Set before each test is run
  private StringReverser rs;
  private String expected;

  @Before
  public void setUp() {
    rs = new StringReverser(TEST_INPUT);
    expected = new StringBuilder(TEST_INPUT).reverse().toString();
  }

  @Test
  public void shouldReverse() {
    Assert.assertEquals("Reversed string didn't match expectation", expected, rs.reverse());
  }

  @Test
  public void shouldReverseInPlace() {
    Assert.assertEquals("String reversed in place didn't match expectation", expected, rs.reverseInPlace());
  }
}

