package Test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Apptests extends TestCase
{
    
    public Apptest( String testName )
    {
        super( testName );
    }

    
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    
    public void testApp()
    {
        assertTrue( true );
    }
} 

