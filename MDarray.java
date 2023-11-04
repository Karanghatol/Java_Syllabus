public class MDarray{
    public static void main(String[] args){
        int[][] k = {{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20},{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}};
      for(int i = 0 ; i < 20;i ++){
            for(int j = 0;j < 20;j++){
                System.out.println("[" + j +"]" + k [i][j]);
            }
      }
    }
}