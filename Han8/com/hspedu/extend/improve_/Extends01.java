package com.hspedu.extend.improve_;

import com.hspedu.extend.Graduate;
import com.hspedu.extend.Pupil;

public class Extends01 {
	public static void main(String[] args) {
		Pupil pupil = new Pupil();
		pupil.name = "银角大王~";
	    pupil.age = 10;
	    pupil.teseting();
	    pupil.setScore(50);
	    pupil.showInfo();
	    
	    System.out.println("======");
	    Graduate graduate = new Graduate();
	    graduate.name = "金角大王~";
	    graduate.age = 22;
	    graduate.teseting();
	    graduate.setScore(80);
	    graduate.showInfo();
	}

}
