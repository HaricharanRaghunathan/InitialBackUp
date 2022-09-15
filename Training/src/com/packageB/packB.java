package com.packageB;
import com.packageA.packA;

class packB {

	public static void main(String[] args) { 
		packA pack = new packA(); // We are able to access packA inside another package now because it is a public class. To access it, we just have to import it to our current package and it is available for access.
		pack.msg(); // Another thing to note is that we have to declare the function also to be public in order to access it in another package.

	}

}
