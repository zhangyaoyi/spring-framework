package org.springframework.event;

import org.springframework.context.ApplicationEvent;

import java.io.Serial;
import java.io.Serializable;

public class TestApplicationEvent extends ApplicationEvent implements Serializable {

	@Serial
	private static final long serialVersionUID = -311847968964578686L;

	public TestApplicationEvent(Object source) {
		super(source);
	}
}
