import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class DesktopBrowse {

    public static void main(String[] args){
        try {
            Desktop d=Desktop.getDesktop();
            d.browse(new URI("https://www.google.es"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
