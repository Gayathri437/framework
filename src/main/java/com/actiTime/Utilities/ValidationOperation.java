package com.actiTime.Utilities;

import org.testng.Assert;

public class ValidationOperation {
	public static boolean validateTestscript(String exp,String act)
	{
		try{
			Assert.assertEquals(exp, act);
			return true;
		
	}
	catch(AssertionError rv)
	{
		return false;
	}

}
}
