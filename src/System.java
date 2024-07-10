//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.PrintStream;
//
//public final class System {
//    public static FileOutputStream fos;
//
//    static {
//        try {
//            fos = new FileOutputStream("output.txt");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    static final PrintStream out=new PrintStream(fos);
//
//    public System() throws FileNotFoundException {
//    }
//}
