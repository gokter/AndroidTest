package com.flyingh.service.impl;

import junit.framework.Assert;
import android.test.AndroidTestCase;

import com.flyingh.service.CalcService;

public class CalcServiceTest extends AndroidTestCase {

	public void testAdd() {
		CalcService calcService = new CalcServiceImpl();
		Assert.assertEquals(2, calcService.add(1, 1));
		Assert.assertEquals(0, calcService.divide(2, 0));
	}

}
