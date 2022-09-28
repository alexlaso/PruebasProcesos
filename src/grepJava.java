import java.io.*;

public class grepJava {
    public static void main(String[] args){
        try{
            Process p = Runtime.getRuntime().exec("grep Java");
            OutputStream out =  p.getOutputStream();
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
            pw.println("Me gusta PSP y java");
            pw.println("Soy un crack de java");
            pw.println("No se me escapa ni una");
            pw.println("Pedazo de clase de java");
            pw.println("java y los procesos me quieren");
            pw.close();

            InputStream in = p.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                br.close();
                p.waitFor();
                System.out.println("Valor de salida: " + linea);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
