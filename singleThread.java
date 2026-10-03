// public class singleThread {
//     public static void main(String[] args){
//         System.out.println("Program started.");
//         // task 1
//         System.out.println("Downloading xyz file");

//         for(int i = 1; i <= 3; i++){
//             System.out.println("Downloading " + i + "th file");
//         }

//         // task 2
//         System.out.println("Processing file");

//         for(int i = 1; i <= 3; i++){
//             System.out.println("Processing " + i + "th file");
//         }

//         // task 3
//         System.out.println("Saving file");

//         for(int i = 1; i <= 3; i++){
//             System.out.println("Saving " + i + "th file");
//         }

//         System.out.println("Program finished.");
//     }
// }



public class singleThread {

    public static void main(String[] args) {

        System.out.println(
            "Current Thread: " +
            Thread.currentThread().getName()
        );

        System.out.println("Task 1");

        System.out.println("Task 2");

        System.out.println("Task 3");
    }
}