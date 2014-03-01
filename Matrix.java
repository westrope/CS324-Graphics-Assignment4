/* Matrix.java

   creates a MATRIX_HEIGHTxMATRIX_WIDTH matrix object

   Ian Westrope
   CS 324
   HW #4

*/

import java.io.*;
import java.util.*;

public class Matrix
{
    private int MATRIX_HEIGHT = 4;
    private int MATRIX_WIDTH = 4;
    private double m[][] = new double[MATRIX_HEIGHT][MATRIX_WIDTH];

    // empty constructor initializes matrix to 0.0
    public Matrix()
    {
	for (int i = 0; i < MATRIX_HEIGHT; i++)
	{
	    for ( int j = 0; j < MATRIX_WIDTH; j++)
	    {
		m[i][j] = 0.0;
	    }
	}
    }

    public Matrix( double m_00, double m_01, double m_02, double m_03,
		   double m_10, double m_11, double m_12, double m_13,
		   double m_20, double m_21, double m_22, double m_23,
		   double m_30, double m_31, double m_32, double m_33)
    {
	m[0][0] = m_00;
	m[0][1] = m_01;
	m[0][2] = m_02;
	m[0][3] = m_03;
	m[1][0] = m_10;
	m[1][1] = m_11;
	m[1][2] = m_12;
	m[1][3] = m_13;
	m[2][0] = m_20;
	m[2][1] = m_21;
	m[2][2] = m_22;
	m[2][3] = m_23;
	m[3][0] = m_30;
	m[3][1] = m_31;
	m[3][2] = m_32;
	m[3][3] = m_33;
    }

    public double GetValue( int height, int width )
    {
	if( (height >= MATRIX_HEIGHT) || (height < 0) )
	{
	    System.out.println("GetValue received a height that fell outside of matrix bounds. The value was: " + height);
	    System.exit(1);
	}

	if( (width >= MATRIX_WIDTH) || (width < 0) )
	{
	    System.out.println("GetValue received a height that fell outside of matrix bounds. The value was: " + width);
	    System.exit(1);
	}

	return m[height][width];
    }

    public void SetValue( int height, int width, double val )
    {
	if( (height >= MATRIX_HEIGHT) || (height < 0) )
	{
	    System.out.println("SetValue received a height that fell outside of matrix bounds. The value was: " + height);
	    System.exit(1);
	}

	if( (width >= MATRIX_WIDTH) || (width < 0) )
	{
	    System.out.println("SetValue received a height that fell outside of matrix bounds. The value was: " + width);
	    System.exit(1);
	}

	// need to check if val is a real number or number at all. will do later.

	m[height][width] = val;
    }

	    
}
