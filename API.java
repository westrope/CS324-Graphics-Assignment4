/* API.java

   Ian Westrope
   CS 324
   HW #4

*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class API extends JComponent
{
    // frame dementions
    int FRAME_WIDTH = 700;
    int FRAME_HEIGTH = 700;

    // viewport min and max points 
    double VP_xmin;
    double VP_ymin;
    double VP_xmax;
    double VP_ymax;

    // 3d window min and max points
    double W_xmin;
    double W_ymin;
    double W_zmin;
    double W_xmax;
    double W_ymax;
    double W_zmax;


    public static void DefineFrame()
    {
	JFrame f = new JFrame("HW 4");

	f.addWindowListener( new WindowAdapter()
	{
	    public void widnowClosing( WindowEvent e )
	    {
		System.exit(0);
	    }
	}
	);

	f.setSize( FRAME_WIDTH, FRAME_HEIGTH );
	f.getContentPane().add( new API() );
	f.setVisible( true );
    }

    public static void DefineViewport( double xmin, double ymin, double xmax, double ymax )
    {
	VP_xmin = xmin;
	VP_ymin = ymin;
	VP_xmax = xmax;
	VP_ymax = ymax;
    }

    public static void DefineWindow( double xmin, double ymin, double zmin, double xmax, double ymax, double zmax)
    {
	W_xmin = xmin;
	W_ymin = ymin;
	W_zmin = zmin;
	W_xmax = xmax;
	W_ymax = ymax;
	W_zmax = zmax;
    }

    public static void Move3D()
    {

    }

    public static void Draw3D()
    {

    }

    public static Matrix PreMultiply()
    {

    }

}
