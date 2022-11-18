public class PrimeDecomp {

    public static String factors(int lst) {
        int[] arr2 = new int[100]; // Найденные простые числа
        int[] arr1 = new int[100]; // Их количество

        for(int i=0; i < 100; i++) {
            arr1[i] = 0;
            arr2[i] = -1;
        }
        int cnt = 0; // Количество простых чисел в разложении

        int k=2;
        while(lst != 1) {
            while(lst % k == 0) {
                lst/=k;
                arr1[cnt]++;
                arr2[cnt] = k;
                if(lst % k != 0)
                    cnt++;
            }
            k++;
        }

        String rez = "";
        for(int i=0; i < 100; i++) {
            if(arr1[i] == 1) {
                rez += "(" + arr2[i] + ")";
            }
            else if(arr1[i] > 1) {
                rez += "(" + arr2[i] + "**" + arr1[i] + ")";
            }
        }

        return rez;
    }
}