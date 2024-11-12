public class RepeatingEvenInList {
    static boolean isFind(int [] arr, int value){
            for(int i : arr){
                if(i == value){
                    return true;
                }
            }
            return false;
        }
        public static void main(String[] args) {
            int[] list = {3, 7, 0, 0, 0, 3, 3, 2, 2, 2, 9, 10, 10,  21, 1, 33, 9, 1};
            int[] duplicate = new int[list.length];
            int startindex = 0;
            int zeroCounter = 0;
            for(int i = 0; i < list.length; i++ ){
                for(int j = 0; j < list.length; j++){
                    if ((i != j) && (list[i] == list[j]) && (list[i] == 0)) {
                        zeroCounter++;
                    }else if((i != j) && (list[i] == list[j]) && (list[i] % 2 == 0)){
                        if(!isFind(duplicate, list[i])){
                            duplicate[startindex++] = list[i];
                        }
                        break;
                    }
                }
            }

            if(zeroCounter > 1){
                System.out.println(0);
            }

            for(int value : duplicate){
                if(value != 0){
                    System.out.println(value);
                }
            }
        }
    }

