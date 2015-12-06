public class MonetaryCoin{

private String	face;
private int	monetary;


int head,tail;

public MonetaryCoin(String face, int monetary)
{
   this.face = face;
   this.monetary = monetary;
}


public void	setFace(String	face)
{
   this.face = face;

}
public String getFace()
{
	return face;

}

public void	setMonetary(int monetary){

	this.monetary = monetary;
}
public int getMonetary()
{
	return monetary;

}

public String toString()
{
	String monetaryVal = Integer.toString(monetary);
	return face+" "+monetaryVal;

}

public void flip()
{
int x = (int)(Math.random()*2);
   if(x == 0)
      this.face = "Heads";
   else
      this.face = "Tails";
 
 }
 
 public int add(int value)
 {
   return this.monetary+value;
 }
 
 public boolean equals(MonetaryCoin other)
 {
   return this.monetary == other.monetary;
 }
 
 
}