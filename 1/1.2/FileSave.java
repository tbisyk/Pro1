import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class FileSave {

	public static void saveDo(Class<FileOperation> clas, String hw) {
		if(clas.isAnnotationPresent(Save.class)) {
			Method[] methods = clas.getDeclaredMethods();
			for (Method method : methods) {
				if(method.isAnnotationPresent(Savedo.class)) {
					FileOperation fo = new FileOperation();
					try {
						method.invoke(fo, hw);
					} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
						e.printStackTrace();
					}
					System.out.println("done");
				}
			}
		}else {
			System.out.println("no anotation");
		}
	}
}
