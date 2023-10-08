package org.springframework.circularreference;

public class CircularB {

	private CircularA circularA;

	public CircularA getCircularA() {
		return circularA;
	}

	public void setCircularA(CircularA circularA) {
		this.circularA = circularA;
	}
}
