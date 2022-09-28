import java.io.File;
import java.io.IOException;

public class ProcesoUno {
    public static void main(String[] args){
        try{
            String path = System.getProperty("user.dir");
            //necesita tener el archivo para no devolver un error
            String pathDir = path+ File.separator+"05-procesos.iml";
            System.out.println(pathDir);
            Process p1 = Runtime.getRuntime().exec ("code"+pathDir);
            p1.waitFor();
            System.out.println("valor de salida"+p1.exitValue());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
