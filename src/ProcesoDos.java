import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ProcesoDos {
    public static void main(String[] args){
        try{
            Process p = Runtime.getRuntime().exec("ls /Users/link");
            InputStream in = p.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String linea;
            while ((linea = br.readLine()) != null){
                System.out.println(linea);
            }
            br.close();
            p.waitFor();
            System.out.print("valor de salida" +p.exitValue());
        } catch (IOException | InterruptedException e) {
            System.out.print("Error: " + e.getMessage());
        }
    }
}
