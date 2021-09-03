package Java2.lesson2.dz;

public class Array {
    public  int sum = 0;
    public void Arr(String[][] s){
        if(s.length > 3){
            throw new MyArraySizeException();
        }else{
            for (int i = 0; i < s.length ; i++) {
                if(s[i].length > 3){
                    throw new MyArraySizeException();
                }
            }
        }
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[j].length; j++) {
               sum += Integer.parseInt(s[i][j]);
            }
        }

        }
    }



