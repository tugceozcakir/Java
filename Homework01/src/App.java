import java.util.ArrayList;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> classes = new HashMap<>();

         // Add students to the classes
        ArrayList<String> class9a = new ArrayList<>();
        class9a.add("Tugce Ozcakir");
        class9a.add("Anil Caliskan");
        class9a.add("Berk Aktoprak");
        class9a.add("Ayse Genc");
        class9a.add("Fatma Kara");
        class9a.add("Elif Yilmaz");
        class9a.add("Rumeysa Sarigul");
        class9a.add("Ali Bulut");
        class9a.add("Harun Dag");

        ArrayList<String> class9c = new ArrayList<>();
        class9c.add("Oguzhan Koc");
        class9c.add("Duygu Sekerci");
        class9c.add("Nese Kara");
        class9c.add("Atakan Ozyurt");
        class9c.add("Elifnaz Caliskan");
        class9c.add("Zeynep Tembel");
       
        ArrayList<String> class10b = new ArrayList<>();
        class10b.add("Ali Varli");
        class10b.add("Ahmet Aymaz");
        class10b.add("Serkan Erdin");
        class10b.add("Burhan Altintop");
        class10b.add("Tugce Akyilmaz");
        class10b.add("Koray Dag");
        class10b.add("Feyza Kaz");

        ArrayList<String> class11c = new ArrayList<>();
        class11c.add("Mehmet Demirbas");
        class11c.add("Beyza Cavus");
        class11c.add("Anil Bereket");
        class11c.add("Birkan Altin");
        class11c.add("Alihan Koc");
        class11c.add("Eda Deniz");
        class11c.add("Sedatcan Kose");

        ArrayList<String> class12d = new ArrayList<>();
        class12d.add("Kadir Ak");
        class12d.add("Asli Kaya");
        class12d.add("Hicran Erol");
        class12d.add("Pinar Tarak");
        class12d.add("Emrehan Keskin");
        class12d.add("Meltem Yay");
        class12d.add("Haluk Hak");

        classes.put("9a", class9a);
        classes.put("9c", class9c);
        classes.put("10b", class10b);
        classes.put("11c", class11c);
        classes.put("12d", class12d);

        //Sort all students in classes
        for(String className : classes.keySet()){
            ArrayList<String> students = classes.get(className);
            System.out.println(students);
            
            System.out.println("Class " + className + " Students whose names end with an:");

            //Split first and last name
            for(String student : students){
                String[] nameSplit = student.split(" ");
                String firstName = nameSplit[0];
                //System.out.println(firstName);

                //Students whose names end with an
                if(firstName.endsWith("an")){
                    System.out.println(firstName);
                } 
            }
        }        
    }
}
