package com.lgcns.m1.example.test;

import com.lgcns.m1.example.Building;

/**
 * package와 import 예제
 * 다른 패키지에 있는 클래스를 사용하고자 할때는 import를 사용한다.
 *
 * @see com.lgcns.m1.example.Building
 */
public class BuildingTest {
	public static void main(String[] args) {
		Building building = new Building();
		building.moveElevator();
	}
}
