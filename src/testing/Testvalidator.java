package testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.Rule;
import classes.CalculeValidation;


import org.junit.rules.ExpectedException;
public class Testvalidator {
	//classe de testing et verification
	
@Rule
public ExpectedException exception=ExpectedException.none();
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
	assertTrue(validation.verif_division(9));
	//assertEquals(true, validation.verif_division(0));

}
@Test
public void testConvert()
{
exception.expect(Exception.class);	
validation.conversible("23A");
}

}
