class Sphere
{
    private int diameter;
    
    public Sphere(int diameter)
    {
        setDiameter(diameter)       ;
    }
    private double volume()
    {
        return (4.0/3 * Math.PI * Math.pow( this.diameter/2, 3 ) );
    }
    private double area()
    {
        return 4 * Math.PI * Math.pow( this.diameter/2, 2 );
    }
    public int getDiameter()
    {
        return diameter;
    }
    public void setDiameter(int times)
    {
        this.diameter = times;
    }
    public String toString()
    {
        return "Diameter: " + getDiameter() + "]\t"+
        "Volume " + volume() + "]\t" +
        "Surface Area " + area()+"]";
    }
}