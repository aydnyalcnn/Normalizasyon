package max;
public class Max {

    public static void main(String[] args) {
        double[] a = {2, 5, 8,15,27,30,45,58,59,75,120};
        double c;
        int b = 5, d = 3;//isteninlen aralıkta normalize etmek için Aralık değerleri 
        int max = 120;
        int min = 2;
        for (int i = 0; i < a.length; i++) {

            double j = a[i];
            c = (double) d + (((a[i] - min) * (b - d)) / (max - min));
            System.out.println(a[i] + "Normazile hali : " + c);

        }

    }

}
