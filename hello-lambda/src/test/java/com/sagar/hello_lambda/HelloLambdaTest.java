package com.sagar.hello_lambda;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HelloLambdaTest {

	@Test
	void test() {
		HelloLambda sut = new HelloLambda();
		System.out.println(sut.handlerRequest());
		Assertions.assertEquals("Hello world Lambda", sut.handlerRequest());
	}

}
