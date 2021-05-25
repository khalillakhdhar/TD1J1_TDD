package classes;

public class CalculeValidation {
	//classe de code de teste
public boolean verif_division(int b)
{
	
return b!=0;
// if(b==0) return false; else return true;

}
public int conversible(String x)
{
return Integer.parseInt(x);	

}
public boolean soustraction(int a,int b)
{
return a>b; 
// return a-b>0;


}
public boolean different(int a,int b)
{
return a!=b;	

}
public boolean parite(int p)
{
if(p%2==0)
	return true;
else 
	return false;

}
public boolean verif_chaine(String ch)
{
return ch.isBlank();

}
}
