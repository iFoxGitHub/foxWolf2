import java.io.File;

public class FileCreating {

    public static void main(String[] args) {

        // SCRIPT REFACTORED IN GITHUB
        
        // CREATE A FILE
        try
        {
            File myFile = new File("filename.md");
            if (myFile.createNewFile())
                System.out.println("File created: " + myFile.getName());
            else
                System.out.println("File already exists.");
        }
        catch (Exception e)
        {
            System.out.println("An error ocurred.");
            e.printStackTrace();
        }
        
    }
}
