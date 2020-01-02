package com.abc;

public class HelloWolrd {
   private String message;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}
void greet() {
	System.out.println("Good" + message);
}
}
