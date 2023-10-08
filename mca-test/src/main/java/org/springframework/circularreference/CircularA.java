package org.springframework.circularreference;

public class CircularA {

	private CircularB circularB;

	public CircularB getCircularB() {
		return circularB;
	}

	public void setCircularB(CircularB circularB) {
		this.circularB = circularB;
	}
}
