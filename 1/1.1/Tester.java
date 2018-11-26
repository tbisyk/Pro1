import java.lang.reflect.Method;

public class Tester {

	public static void test(Class<SomeClass> clas) {
		int a;
		int b;
		String s;
		try {
			Method[] methods = clas.getDeclaredMethods();
			for (Method method : methods) {
				if (method.isAnnotationPresent(Test.class)) {
					a = Test.a;
					b = Test.b;
					s = " - with anotation";
				} else {
					a = 1;
					b = 1;
					s = " - without atotation";
				}
				System.out.println(method.invoke(clas, a, b) + s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
