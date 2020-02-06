package com.epam.mavendemo;

public class candytype extends gift {
	int candyp=10;
	public int toffee(int x) {
			if(x<candyp)
				return 0;
			else if(x==candyp)
				return 1;
			else
				return x/candyp;
	
}
}