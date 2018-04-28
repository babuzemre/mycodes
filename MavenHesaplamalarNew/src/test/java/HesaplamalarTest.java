import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamalarTest {

	@Test
	public void test() {
	int gercekSonuc = Hesaplamalar.topla(25,15);
	assertEquals(40,gercekSonuc);
	}

}
