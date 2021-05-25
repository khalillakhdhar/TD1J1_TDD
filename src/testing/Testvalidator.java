package testing;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import classes.CalculeValidation;

public class Testvalidator {
private CalculeValidation validation ;
@Before
public final void before()
{
validation=new CalculeValidation();	
//instanciation au niveau des testes
}
@Test
public void testdiv()
{
	assertTrue(validation.verif_division(0));

}
}
