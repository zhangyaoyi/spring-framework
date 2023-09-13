package org.springframework.aware;

import org.springframework.beans.factory.Aware;

public interface TestAware extends Aware {

	void setTest(Test test);
}
