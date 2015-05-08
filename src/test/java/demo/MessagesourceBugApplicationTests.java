package demo;

import java.util.Locale;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.MessageSource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MessagesourceBugApplication.class)
public class MessagesourceBugApplicationTests {
    
    @Autowired 
    private MessageSource messageSource;

	@Test
	public void loadsMessage() {
	    Assert.assertEquals("Hello World!", messageSource.getMessage("hello.message", null, Locale.getDefault()));
	}

}
