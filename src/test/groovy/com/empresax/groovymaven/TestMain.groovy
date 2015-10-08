package com.empresax.groovymaven;

import groovy.transform.CompileStatic

import org.junit.Test

@CompileStatic
class TestMain {
	
	@Test
	void testSayHello() {
		
		def main = new Main()
		
		def expected = "ciclano"
		
		def actual = main.sayHello(expected)
		
		assert actual.contains(expected)
	}

}
