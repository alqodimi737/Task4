/**
 * Created by hp on 21/02/2021.
 */
public class Quation2 {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 7};
        int b[] = {2, 6, 5, 0};
        int x[] = new int[a.length + b.length];
        merg(a,b,x);
        for (int j :x)
            System.out.println(j+"");
    }

    public static void merg(int[] a, int[] b, int[] x) {
        int aindex = 0, bindex=0, xindex=0;
        while (aindex < a.length && bindex < b.length) {
            if (a[aindex] > b[bindex])
                x[xindex++] =b[bindex++];
            else
                x[xindex++]=a[aindex++];
        }
        while (aindex<a.length)
            x[xindex++]=a[aindex++];
        while (bindex<b.length)
            x[xindex++]=b[bindex++];
    }
}
