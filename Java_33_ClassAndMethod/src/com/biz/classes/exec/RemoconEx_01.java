package com.biz.classes.exec;

import com.biz.classes.service.children.TvClassV1;

public abstract class RemoconEx_01 {

	public static void main(String[] args) {
		
		TvClassV1 tv = new TvClassV1();
		tv.power();

	}
	
	public abstract void volUp();
	public abstract void voldown();
	
	public abstract void ChUp();
	public abstract void Chdown();

	
}
