package advancedconcepts.day33;

public class Gezgin {
    private int[] gittigiYol;


    public int[] getYolListesi() {
        return gittigiYol;
    }

    public int addYol(int km) {

        if (gittigiYol == null) {
            gittigiYol = new int[1];
            gittigiYol[0] = km;
        } else {
            int[] tmp = new int[gittigiYol.length];
            for (int i = 0; i < gittigiYol.length; i++) {
                tmp[i] = gittigiYol[i];
            }

            gittigiYol = new int[gittigiYol.length + 1];
            for (int i = 0; i < tmp.length; i++) {
                gittigiYol[i] = tmp[i];
            }
            gittigiYol[gittigiYol.length - 1] = km;

        }

        int sum = 0;
        for (int i = 0; i < gittigiYol.length; i++) {
            sum += gittigiYol[i];
        }
        return sum;

    }


    public static void main(String[] args) {

    }

}
