import java.io.File;

public class FileFinder {

    public static void main (String[] args) {
        FileFinder n = new FileFinder();
        File sol = n.find("/Users/Tejas/Documents/Old School Files/Grade 8/Drama");
        
        double mb = (double) sol.length()/1000000;
        
        System.out.println ("Path: " + sol.getPath() + "\t Size: " + mb + " MB");
    }

    public File find (String dir) {
        
        File f = new File(dir);
        if ( f.isFile() )
            return f;
        

        File[] list = f.listFiles();
        File biggest;
        biggest = list[0];

        for (File l:list) {
            if (l.isDirectory()) {
                biggest = find(l.getPath());
            }
            
            
            if (biggest.length ()< l.length())
            if (l.isDirectory()) {
                biggest = find(l.getPath());
            }
                biggest = l;
        }
        
        return biggest;
    }
}