package de.schauderhaft.issuejdbc1506nullembeddable;

record Child(String first, String last) {
	static int constructorCalls = 0;

	Child (String first, String last){
		constructorCalls++;
		this.first  = first;
		this.last = last;
	}
}
