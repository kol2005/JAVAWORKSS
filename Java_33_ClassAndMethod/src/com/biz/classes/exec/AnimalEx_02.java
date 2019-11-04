package com.biz.classes.exec;

import com.biz.classes.service.children.Cat;
import com.biz.classes.service.children.Dog;
import com.biz.classes.service.parents.Animal;

public class AnimalEx_02 {

	public static void main(String[] args) {
		

		
		// �θ� Ŭ������ ������ �ϰ�
		// child Ŭ������ �ʱ�ȭ ������ �ϴ� ���
		Animal dog1 = new Dog();
		Animal cat1 = new Cat();

		// dog1�� �̸��� setName() method �� ȣ���ؼ�
		// ���̷� �����ϰ� �ʹ�
		// Animal���� ����, Dog���� �ִ� setName() method �� ȣ���Ϸ���
		((Dog)dog1).setName();
		viewName(dog1);
		
		((Cat)cat1).setName();
		viewName(cat1);
	}
	
	public static void viewName(Animal animal) {
		String name = animal.getName();
		System.out.println(name);
	}
}
