package com.zensar.bean;

import org.springframework.stereotype.Component;

@Component
public class ExamMark {
	int mark1=89;
	int mark2=78;
	@Override
	public String toString() {
		return "ExamMark [mark1=" + mark1 + ", mark2=" + mark2 + "]";
	}

}
