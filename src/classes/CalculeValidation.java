package classes;

public class CalculeValidation {
public boolean verif_division(int b)
{
	
return b!=0;
// if(b==0) return false; else return true;

}
public void conversible(String x)
{
Integer.parseInt(x);	

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
}
