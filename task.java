import java.util.ArrayList;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

class NoteBook {
    int ram;
    int hdd;
    String os;
    String color;
    
    public NoteBook(int ram, int hdd, String os, String color) {
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }
}

public class task {
    public static void main(String[] args) {
        ArrayList<NoteBook> notebooks = new ArrayList<NoteBook>();
        notebooks.add(new NoteBook(4, 500, "Windows", "Black"));
        notebooks.add(new NoteBook(8, 1000, "MacOS", "Silver"));
        notebooks.add(new NoteBook(16, 2000, "Linux", "White"));
        notebooks.add(new NoteBook(32, 4000, "Windows", "Black"));
        notebooks.add(new NoteBook(8, 500, "MacOS", "Silver"));
        
        Map<Integer, String> criteria = new HashMap<Integer, String>();
        criteria.put(1, "ram");
        criteria.put(2, "hdd");
        criteria.put(3, "os");
        criteria.put(4, "color");
        
        System.out.println("Welcome to the Notebook Store!");
        System.out.println("Please choose a filter criterion:");
        System.out.println("1. RAM");
        System.out.println("2. HDD");
        System.out.println("3. Operating System");
        System.out.println("4. Color");
        
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        in.nextLine();
        String selectedCriterion = criteria.get(choice); 
                         
        if (selectedCriterion.equals("os") || selectedCriterion.equals("color")) {
            System.out.println("Please enter the minimum " + selectedCriterion + ":");
            String minValue = in.nextLine();
            ArrayList<NoteBook> filteredNotebooks = new ArrayList<NoteBook>();
            for (NoteBook notebook : notebooks) {
                if (selectedCriterion.equals("os") && notebook.os.equals(minValue) ||
                    selectedCriterion.equals("color") && notebook.color.equals(minValue)) {
                    filteredNotebooks.add(notebook);
                }
            }
            System.out.println("Here are the notebooks that match your criteria:");
            for (NoteBook notebook : filteredNotebooks) {
                System.out.println("RAM: " + notebook.ram + " | HDD: " + notebook.hdd + " | OS: " + notebook.os + " | Color: " + notebook.color);
            }
        
        } else {
            System.out.println("Please enter the minimum " + selectedCriterion + ":");
            int minValue = in.nextInt();
            ArrayList<NoteBook> filteredNotebooks = new ArrayList<NoteBook>();
            for (NoteBook notebook : notebooks) {
                if (selectedCriterion.equals("ram") && notebook.ram >= minValue ||
                selectedCriterion.equals("hdd") && notebook.hdd >= minValue) {
                filteredNotebooks.add(notebook);
                }
            }
            System.out.println("Here are the notebooks that match your criteria:");
            for (NoteBook notebook : filteredNotebooks) {
                System.out.println("RAM: " + notebook.ram + " | HDD: " + notebook.hdd + " | OS: " + notebook.os + " | Color: " + notebook.color);
            }
        }
    }
}
 



































// import java.util.ArrayList;
// import java.util.Scanner;
// import java.util.Map;
// import java.util.HashMap;

// class NoteBook {
//     int ram;
//     int hdd;
//     String os;
//     String color;
    
//     public NoteBook(int ram, int hdd, String os, String color) {
//         this.ram = ram;
//         this.hdd = hdd;
//         this.os = os;
//         this.color = color;
//     }
// }

// public class task {
//     // public static void main(String[] args) {

//     //     class NoteBook {
//     //         int ram;
//     //         int hdd;
//     //         String os;
//     //         String color;
            
//     //         public NoteBook(int ram, int hdd, String os, String color) {
//     //             this.ram = ram;
//     //             this.hdd = hdd;
//     //             this.os = os;
//     //             this.color = color;
//     //         }
//     //     }





       
        
//         ArrayList<NoteBook> notebooks = new ArrayList<NoteBook>();
//         notebooks.add(new NoteBook(4, 500, "Windows", "Black"));
//         notebooks.add(new NoteBook(8, 1000, "MacOS", "Silver"));
//         notebooks.add(new NoteBook(16, 2000, "Linux", "White"));
//         notebooks.add(new NoteBook(32, 4000, "Windows", "Black"));
//         notebooks.add(new NoteBook(8, 500, "MacOS", "Silver"));
        
//         Map<Integer, String> criteria = new HashMap<Integer, String>();
//         criteria.put(1, "ram");
//         criteria.put(2, "hdd");
//         criteria.put(3, "os");
//         criteria.put(4, "color");
        
//         System.out.println("Welcome to the Notebook Store!");
//         System.out.println("Please choose a filter criterion:");
//         System.out.println("1. RAM");
//         System.out.println("2. HDD");
//         System.out.println("3. Operating System");
//         System.out.println("4. Color");
        
//         Scanner in = new Scanner(System.in);
//         int choice = in.nextInt();
//         String selectedCriterion = criteria.get(choice);
        
//         System.out.println("Please enter the minimum " + selectedCriterion + ":");
//         String minValue = in.nextLine();     
        
//         if (selectedCriterion.equals("ram") || selectedCriterion.equals("hdd")) {
//             int sValue = Integer.parseInt(minValue);
//             ArrayList<NoteBook> filteredNotebooks = new ArrayList<NoteBook>();
//             for (NoteBook notebook : notebooks) {
//                 if (selectedCriterion.equals("ram") && notebook.ram >= sValue ||
//                 selectedCriterion.equals("hdd") && notebook.hdd >= sValue) {
//                 filteredNotebooks.add(notebook);
//                 }
//             }
//         } else {
//             ArrayList<NoteBook> filteredNotebooks = new ArrayList<NoteBook>();
//             if (selectedCriterion.equals("os") && notebook.os.equals(minValue) ||
//                 selectedCriterion.equals("color") && notebook.color.equals(minValue)) {
//                 filteredNotebooks.add(notebook);
//             }
//         }
        

//         System.out.println("Here are the notebooks that match your criteria:");
//         for (NoteBook notebook : filteredNotebooks) {
//             System.out.println("RAM: " + notebook.ram + " | HDD: " + notebook.hdd + " | OS: " + notebook.os + " | Color: " + notebook.color);
//         }
//     }
// }

           
        
        
        
        
//         }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//         //int minValue = in.nextInt(); 
        
        
//         if (selectedCriterion.equals("ram") || selectedCriterion.equals("hdd")) {
//             int sValue = Integer.parseInt(minValue);
//         }


//         //     selectedCriterion.equals("hdd") && notebook.hdd >= minValue ||
//         //     selectedCriterion.equals("os") && notebook.os.equals(minValue) ||
//         //     selectedCriterion.equals("color") && notebook.color.equals(minValue)) {
//         //     filteredNotebooks.add(notebook);



//         // try {
//         //     int svalue = Integer.parseInt(minValue);
//         // }
//         // catch (NumberFormatException nfe) {}
       
        
//         ArrayList<NoteBook> filteredNotebooks = new ArrayList<NoteBook>();        
//         for (NoteBook notebook : notebooks) {
//             // if (selectedCriterion.equals("ram") && notebook.ram >= minValue ||
//             //     selectedCriterion.equals("hdd") && notebook.hdd >= minValue ||
//             //     selectedCriterion.equals("os") && notebook.os.equals(minValue) ||
//             //     selectedCriterion.equals("color") && notebook.color.equals(minValue)) {
//             //     filteredNotebooks.add(notebook);
//             // }
//             if (selectedCriterion.equals("ram") && notebook.ram >= sValue ||
//                 selectedCriterion.equals("hdd") && notebook.hdd >= sValue) {
//                 filteredNotebooks.add(notebook);
//             }
//             if (selectedCriterion.equals("ram") && notebook.ram >= minValue ||
//                 selectedCriterion.equals("hdd") && notebook.hdd >= minValue ||
//                 selectedCriterion.equals("os") && notebook.os.equals(minValue) ||
//                 selectedCriterion.equals("color") && notebook.color.equals(minValue)) {
//                 filteredNotebooks.add(notebook);
//             }            


//         }

        
        


//         System.out.println("Here are the notebooks that match your criteria:");
//         for (NoteBook notebook : filteredNotebooks) {
//             System.out.println("RAM: " + notebook.ram + " | HDD: " + notebook.hdd + " | OS: " + notebook.os + " | Color: " + notebook.color);
//         }
        



//     }
// }
