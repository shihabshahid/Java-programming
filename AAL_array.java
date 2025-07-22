import java.util.Scanner;
public class AAL_array {

    public static void main(String[] args) {
       Scanner inputData = new Scanner(System.in);
       System.out.println("----------Array declare with value assign: new int[]{10,11,12}----------");
       int arrInt[] = new int[]{10,11,12};
       System.out.println("Array display without loop");
       System.out.println(arrInt[0]);
       System.out.println(arrInt[1]);
       System.out.println(arrInt[2]);
       System.out.println("Array display with loop");
       for(int i=0;i<3;i++){
           System.out.println(arrInt[i]);
       }
       System.out.println("----------Array declare with value assign: new int[3]; arrInt[0] = 10;----------");
       int arrInt1[] = new int[3];
       arrInt1[0] = 10;
       arrInt1[1] = 20;
       arrInt1[2] = 30;
       System.out.println("Array display without loop");
       System.out.println(arrInt1[0]);
       System.out.println(arrInt1[1]);
       System.out.println(arrInt1[2]);
       System.out.println("Array display with loop");
       for(int i=0;i<3;i++){
           System.out.println(arrInt1[i]);
       }
        System.out.println("----------Array declare with value assign and display: int i:arrInt2----------");
        int arrInt2[] = new int[]{10,11,12};
        for(int i:arrInt2){
            System.out.println(i);
        }
       System.out.println("----------Array declare after value assign----------");
       System.out.println("----------Array byte----------");
       byte arrByte[] = new byte[3];
       arrByte[0] = inputData.nextByte();
       arrByte[1] = inputData.nextByte();
       arrByte[2] = inputData.nextByte();
       for(int i=0;i<3;i++){
           System.out.println(arrByte[i]);
       }
       System.out.println("----------Array short----------");
       short arrShort[] = new short[3];
       arrShort[0] = inputData.nextShort();
       arrShort[1] = inputData.nextShort();
       arrShort[2] = inputData.nextShort();
       for(int i=0;i<3;i++){
           System.out.println(arrShort[i]);
       }
       System.out.println("----------Array int----------");
       int arrInt3[] = new int[3];
       arrInt3[0] = inputData.nextInt();
       arrInt3[1] = inputData.nextInt();
       arrInt3[2] = inputData.nextInt();
       for(int i=0;i<3;i++){
           System.out.println(arrInt3[i]);
       }
       System.out.println("----------Array long----------");
       long arrLong[] = new long[3];
       arrLong[0] = inputData.nextLong();
       arrLong[1] = inputData.nextLong();
       arrLong[2] = inputData.nextLong();
       for(int i=0;i<3;i++){
           System.out.println(arrLong[i]);
       }
       System.out.println("----------Array float----------");  
       float arrFloat[] = new float[3];
       arrFloat[0] = inputData.nextFloat();
       arrFloat[1] = inputData.nextFloat();
       arrFloat[2] = inputData.nextFloat();
       for(int i=0;i<3;i++){
           System.out.println(arrFloat[i]);
       }
       System.out.println("----------Array double----------");       
       double arrDouble[] = new double[3];
       arrDouble[0] = inputData.nextDouble();
       arrDouble[1] = inputData.nextDouble();
       arrDouble[2] = inputData.nextDouble();
       for(int i=0;i<3;i++){
           System.out.println(arrDouble[i]);
       }
       System.out.println("----------Array String----------");  
       String arrString[] = new String[4];
       arrString[0] = inputData.nextLine();
       arrString[1] = inputData.nextLine();
       arrString[2] = inputData.nextLine();
       arrString[3] = inputData.nextLine();
       for(int i=0;i<4;i++){
           System.out.println(arrString[i]);
       }
       System.out.println("----------Array char----------");       
       char arrChar[] = new char[3];
       arrChar[0] = inputData.next().charAt(0);
       arrChar[1] = inputData.next().charAt(0);
       arrChar[2] = inputData.next().charAt(0);
       for(int i=0;i<3;i++){
           System.out.println(arrChar[i]);
       }
       System.out.println("----------Array boolean----------");         
       boolean arrBoolean[] = new boolean[3];
       arrBoolean[0] = inputData.nextBoolean();
       arrBoolean[1] = inputData.nextBoolean();
       arrBoolean[2] = inputData.nextBoolean();
       for(int i=0;i<3;i++){
           System.out.println(arrBoolean[i]);
       }
       System.out.println("----------Tow dimention Array/ Nested Loop----------");
 
       int arrInt4[][] = new int[3][3];
       arrInt4[0][0] = 10;
       arrInt4[0][1] = 20;
       arrInt4[0][2] = 30;
       arrInt4[1][0] = 40;
       arrInt4[1][1] = 50;
       arrInt4[1][2] = 60;
       arrInt4[2][0] = 70;
       arrInt4[2][1] = 80;
       arrInt4[2][2] = 90;
       System.out.println("Array display without loop");
       System.out.println(arrInt4[0][0]);
       System.out.println("Array display with nested loop");
       for(int i=0;i<3;i++){
           for(int j=0;j<3;j++){
               System.out.print(arrInt4[i][j]+" ");
               
           }
           System.out.println();
       }

       System.out.println("----------Three dimention Array  with display 2d----------");
       int arrInt5[][][] = new int[2][2][2];
       arrInt5[0][0][0] = 10;
       arrInt5[0][0][1] = 20;
       arrInt5[0][1][0] = 30;
       arrInt5[0][1][1] = 40;
       arrInt5[1][0][0] = 50;
       arrInt5[1][0][1] = 60;
       arrInt5[1][1][0] = 70;
       arrInt5[1][1][1] = 80;
       System.out.println("Array display without loop");
       System.out.println(arrInt5[0][0][0]);
       System.out.println("Array display with loop");
       for(int i=0;i<2;i++){
           for(int j=0;j<2;j++){
               for(int k=0;k<2;k++){
                   System.out.print(arrInt5[i][j][k]+" ");               
               }
               System.out.println(); 
           }           
       }
       System.out.println("----------Three dimention Array with display 3d----------");
       int arrInt6[][][] = new int[2][2][2];
       arrInt6[0][0][0] = 10;
       arrInt6[0][0][1] = 20;
       arrInt6[0][1][0] = 30;
       arrInt6[0][1][1] = 40;
       arrInt6[1][0][0] = 50;
       arrInt6[1][0][1] = 60;
       arrInt6[1][1][0] = 70;
       arrInt6[1][1][1] = 80;
       System.out.println("Array display without loop");
       System.out.println(arrInt6[0][0][0]);
       System.out.println("Array display with loop");
       int count = 0;
       for(int i=0;i<2;i++){
           for(int j=0;j<2;j++){
               count++;
               if(count>2)
               {
                   System.out.print("\t");
                   for(int k=0;k<2;k++){
                       System.out.print(arrInt6[i][j][k]+" ");               
                   }
                   System.out.println(); 
               }
               else{
                   for(int k=0;k<2;k++){
                       System.out.print(arrInt6[i][j][k]+" ");               
                   }
                   System.out.println(); 
               }
           }         
       }
    }   
}
