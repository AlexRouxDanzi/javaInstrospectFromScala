package me.phh.introspect;

interface TotoInterface {
	public int val();
};
public class TestClass implements TotoInterface {
	public String totoStr = "titi";

	public TestClass() { }
	public TestClass(int t) throws Exception {
		if(t != 3) throw new Exception();
	}

	public void totoFnc2(boolean titi) {
		System.out.println("totoFnc2 success");
	}

	public void totoFnc2(Boolean titi) throws Exception {
		throw new Exception("This shouldn't be called");
	}

	public void testInterface(TotoInterface i) {
		if(i.val() == 0)
			System.out.println("testInterface success");
	}

	public int val() {
		return 0;
	}
} 
