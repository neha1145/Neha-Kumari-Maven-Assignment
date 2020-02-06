package com.epam.mavendemo;
import com.epam.mavendemo.*;
public class ChildrenGift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gift gift1= new gift();
		candytype c1=new candytype();
		bartype b1=new bartype();
		sweettype s1=new sweettype();
		int num_candy=c1.toffee(gift1.candy());
		int num_bar=b1.waffers(gift1.bar());
		int num_sweet=s1.sweetdish(gift1.sweet());
		System.out.println("number of candy:"+num_candy+"\nnumber of bar:"+num_bar+"\nnumber of sweet:"+num_sweet);
	}

}
