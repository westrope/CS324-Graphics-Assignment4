/* Window3D.java

   Ian Westrope
   CS 324
   HW #4

*/

public class Window3D
{
    private double VP_xmin;
    private double VP_ymin;
    private double VP_xmax;
    private double VP_ymax;

    private double W_xmin;
    private double W_ymin;
    private double W_zmin;
    private double W_xmax;
    private double W_ymax;
    private double W_zmax;

    public Window3D( double vxmin, double vymin, double vxmax, double vymax,
		     double xmin, double ymin, double zmin,
		     double xmax, double ymax, double zmax )
    {
	VP_xmin = vxmin;
	VP_ymin = vymin;
	VP_xmax = vxmax;
	VP_ymax = vymax;

	W_xmin = xmin;
	W_ymin = ymin;
	W_zmin = zmin;
	W_xmax = xmax;
	W_ymax = ymax;
	W_zmax = zmax;
    }

    public Window3D( double vxmin, double vymin, double vxmax, double vymax,
		     Point3D min, Point max )
    {
	VP_xmin = vxmin;
	VP_ymin = vymin;
	VP_xmax = vxmax;
	VP_ymax = vymax;

	W_xmin = min.GetX();
	W_ymin = min.GetY();
	W_zmin = min.GetZ();
	W_xmax = max.GetX();
	W_ymax = max.GetY();
	W_zmax = max.GetZ();
    }

    public Window3D()
    {
	VP_xmin = 0.0;
	VP_ymin = 0.0;
	VP_xmax = 0.0;
	VP_ymax = 0.0;

	W_xmin = 0.0;
	W_ymin = 0.0;
	W_zmin = 0.0;
	W_xmax = 0.0;
	W_ymax = 0.0;
	W_zmax = 0.0;
    }

}
