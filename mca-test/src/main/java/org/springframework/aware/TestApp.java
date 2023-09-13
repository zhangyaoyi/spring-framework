package org.springframework.aware;

public class TestApp implements TestAware {

	private Test test;

	@Override
	public void setTest(Test test) {
		this.test = test;
	}

	public Test getTest() {
		return test;
	}
}
