import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class unitTestCB {

	HelloWorld helloWorldObject = new HelloWorld();

	@Test
	public void greeterSaysHello() {
		assertThat(helloWorldObject.sayHello(), containsString("Fail Please"));
	}

}
