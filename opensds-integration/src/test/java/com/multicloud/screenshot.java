package com.multicloud;

import org.testng.ITestNGListener;
import org.testng.annotations.Test;
import org.testng.internal.annotations.IListeners;

public class screenshot extends baseClass implements IListeners {
  @Test
  public void f() {
  }

@Override
public Class<? extends ITestNGListener>[] getValue() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void setValue(Class<? extends ITestNGListener>[] value) {
	// TODO Auto-generated method stub
	
}
}
