import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,5,13,56,89,101,108,134,201,250,340,450};
//        String str = sc.nextLine();
//        System.out.println(str.charAt(2));
//        System.out.println(4/0);
//        System.out.println(arr[12]);
//        try{
//            System.out.println(str.charAt(2));
//            System.out.println(4/2);
//            System.out.println(arr[11]);
//        }catch (StringIndexOutOfBoundsException e){
//            System.out.println(e.getMessage());
//        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }finally {
//            System.out.println("finally");
//        }
//
//        try{
//            int x = sc.nextInt();
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//        }
//
//        System.out.println("Pls type your age");
//        int age = sc.nextInt();
//        if(age < 10){
//            throw new Exception("too young");
//        }else{
//            System.out.println("Welcome");
//        }
//
//        try{
//            exceptionThrower(9);
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//        exceptionThrower(9);


        System.out.println(hireEmployee("Tom","Fullstack"));
        System.out.println(hireEmployee("Marry","Frontend"));
        System.out.println(hireEmployee("Jack","Backend"));
        hireEmployee("Stacy","QA");

        System.out.println("after");
    }

    public static int hireEmployee(String name, String jobTitle){
//        switch(jobTitle.toLowerCase()){
//            case "fullstack":
//                return 22000;
//            case "frontend":
//                return 18000;
//            case "backend":
//                return 20000;
//            default:
//                throw new IllegalArgumentException("Sorry ," + name + ", The provided job title is unsupported");
//        }
        if(jobTitle.toLowerCase().equals("fullstack")){
            return 22000;
        }else if (jobTitle.toLowerCase().equals("frontend")){
            return 18000;
        }else if(jobTitle.toLowerCase().equals("backend")){
            return 20000;
        }else{
            throw new IllegalArgumentException("Sorry ," + name + ", The provided job title is unsupported");
        }
    }


    public static void exceptionThrower(int age) throws Exception{
        if(age < 10){
            throw new Exception("I'm a bad function");
        }else{
            System.out.println("Welcome");
        }
    }

    // stack overflow
    public static void recursion(long x){
        System.out.println(x++);
        recursion(x);
    }

    //4! = 4 * 3 * 2 * 1 = 24;

    public static int factorial(int n){
        if (n == 2){
            return n;
        }else {
            return n * factorial(n-1);
        }
    }

// n = 5 -> return 5 * 24 = 120
// n = 4 -> return 4 * 6
// n = 3 -> return 3 * 2
// n = 2 -> return 2
    public static int rangeMult(int start, int end){
        if(start > end){
            return 1;
        }else{
            return start * rangeMult(start + 1, end);
        }
    }

    public static boolean ifHasInt(int[] arr,int x){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x){
                return true;
            }
        }
        return false;
    }

    public static boolean ifHasIntBinary(int[] arr, int x){
        return binarySearch(arr,x,0,arr.length-1);
    }

    public static boolean binarySearch(int[] arr, int x, int start, int end){
        if(start > end){
            return false;
        }
        int middle = start + (end - start)/2;
        if (arr[middle] == x){
            return true;
        }else if (arr[middle] > x){
            return binarySearch(arr,x,start,middle - 1);
        }else{
            return binarySearch(arr,x,middle+1,end);
        }
    }





}