package com.epam.mavendemo;

public class sweettype extends gift{
	int sweetp=30;
	public int sweetdish(int s) {
		if(s<sweetp)
			return 0;
		else if(s==sweetp)
			return 1;
		else
			return s/sweetp;		
}
}
