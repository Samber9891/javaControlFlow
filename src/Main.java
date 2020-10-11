

// Part 1 
// E. 0 the loop would continue adding 1 each time until it reaches 0 because i < 5 is never false.


public class Main {

    public static void main(String[] args) {

        String[] newArr = {"*", "**", "***", "****", "*****"};
        
       
            for(int i = 0; i< newArr.length; i++){

                for (int j = 0; j < 1; j++) {
                    
                    System.out.println(newArr[i]);  
                }
        
            }  
        }
         
    }


