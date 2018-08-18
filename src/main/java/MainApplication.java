/**
 * Created by deepak on 07-08-2018.
 */
public class MainApplication {

    public static void main(String args[]) {
        int a[]={5, 7, 6, 2, 4, 3, 1} ;
        int temp = 0;
        int j = 0;

        for (int i = 0; i < a.length-1;i++) {
            int flag = 0;
            if (a[i] > a[i + 1]) {
                temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
                flag = 1;
            }
            if (i == a.length - 2 - j) {
                if (flag==0)
                    break;
                i = -1;
                j++;
            }
        }
    }
}
