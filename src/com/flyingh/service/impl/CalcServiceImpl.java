package com.flyingh.service.impl;

import android.util.Log;

import com.flyingh.service.CalcService;

public class CalcServiceImpl implements CalcService {

	private static final String TAG = "info";

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int minus(int a, int b) {
		return a - b;
	}

	@Override
	public int multiply(int a, int b) {
		return a * b;
	}

	@Override
	public int divide(int a, int b) {
		try {
			return a / b;
		} catch (ArithmeticException e) {
			Log.i(TAG, "the divisor is zero!");
		}
		return 0;
	}

}
