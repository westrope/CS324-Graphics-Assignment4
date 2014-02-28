/* Point3D.java

   Ian Westrope
   CS 324
   HW #4

*/

public class Point3D
{
    private double x;
    private double y;
    private double z;

    public Point3D( double xval, double yval, double zval )
    {
	x = xval;
	y = yval;
	z = zval;
    }

    public Point3D()
    {
	x = 0.0;
	y = 0.0;
	z = 0.0;
    }

    public void SetX( double val )
    {
	x = val;
    }

    public void SetY( double val )
    {
	y = val;
    }

    public void SetZ( double val )
    {
	z = val;
    }

    public double GetX()
    {
	return x;
    }

    public double GetY()
    {
	return y;
    }

    public double GetZ()
    {
	return z;
    }
}
