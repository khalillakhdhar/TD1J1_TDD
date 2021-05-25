package testing;

import org.junit.Assert;
import org.junit.Test;

import classes.PasswordValidator;

public class ValidatePassword {
	@Test
	public void test() {
	PasswordValidator pv=new PasswordValidator();
	Assert.assertEquals(true,pv.isValid("123456"));
	
	}
}
