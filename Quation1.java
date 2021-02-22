/**
 * Created by hp on 21/02/2021.
 */
public class Quation1 {
    public static void main(String[]args){
        String[]starray={"mohammed","ALI","hsan","ahmed","malik"};
        Integer[]inarray={1,2,3,4,5,6};
        System.out.println("old array");
        for (int i=0; i<inarray.length;i++)
            System.out.println(inarray[i]+" ");
        for (int j=0; j<starray.length;j++)
            System.out.println(starray[j]+" ");
        System.out.println( );
        System.out.println("new array:");
        for (int i=inarray.length-1;i>=0;i--)
            System.out.println(inarray[i]+" ");
        for (int j=starray.length-1;j>=0;j--)
            System.out.println(starray[j]+" ");
    }
}
