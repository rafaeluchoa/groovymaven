package com.empresax.groovymaven;

import groovy.transform.CompileStatic;

@CompileStatic
class Main {
	
	String sayHello(String name) {
		return "Hello " + name
	}
	
	static void main(String[] args) {
		
		println(new Main().sayHello("Fulano"))
		
	}

}
