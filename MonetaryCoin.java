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

public String flip()
{
int x = (int)(Math.random()*2);
   if(x == 0)
      this.face = "Heads";
   else
      this.face = "Tails";
 
   return this.face;
 }
 
 public int add(int value)
 {
   return this.monetary+value;
 }
 
 public boolean equals(MonetaryCoin other)
 {
   return (this.monetary == other.monetary)&&(this.face.equals(other.face));
 }
 
 public static void main(String[] args){
   MonetaryCoin c1 = new MonetaryCoin("head", 2);
   MonetaryCoin c2 = new MonetaryCoin("head", 2);
   System.out.println(c1.equals(c2));
 }
}