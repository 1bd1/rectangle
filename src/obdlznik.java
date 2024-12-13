public class obdlznik {


    public static void main(String[] args) {

// pouzite jednotky - cm


        double stranaA = 100.50;
        double stranaB = 200.30;


        double obvodObdlzniku = vypocetObvoduObdlzniku(stranaA, stranaB);
        double obsahObdlzniku = vypocetObsahuObdlzniku(stranaA, stranaB);

        long obvodObdlzniku2 = vypocetObvoduObdlzniku(50, 70);
        long obsahObdlzniku2 = vypocetObsahuObdlzniku(50, 70);


        System.out.print("obvod obdlznika so stranami (cm): ");
        System.out.print(stranaA);
        System.out.print(" x ");
        System.out.print(stranaB);
        System.out.print(" je (cm, zaokruhlene): ");
        System.out.println(Math.round(obvodObdlzniku));
        System.out.print("obvod obdlznika 50 cm x 70 cm v pretazenej metode je (cm): ");
        System.out.println(Math.round(obvodObdlzniku2));


        System.out.print("obsah obdlznika so stranami (cm): ");
        System.out.print(stranaA);
        System.out.print(" x ");
        System.out.print(stranaB);
        System.out.print(" je (cm2, zaokruhlene): ");
        System.out.println(Math.round(obsahObdlzniku));
        System.out.print("obsah obdlznika 50 cm x 70 cm v pretazenej metode je (cm2): ");
        System.out.println(Math.round(obsahObdlzniku2));
    }


    // prve volanie metody

    public static double vypocetObvoduObdlzniku(double stranaA, double stranaB) {
        return (2 * (stranaA + stranaB));
    }


    public static double vypocetObsahuObdlzniku(double stranaA, double stranaB) {
        return (stranaA * stranaB);
    }


    //pretazenie metody

    public static long vypocetObvoduObdlzniku(long stranaA, long stranaB) {
        return (2 * (stranaA + stranaB));
    }


    public static long vypocetObsahuObdlzniku(long stranaA, long stranaB) {
        return (stranaA * stranaB);
    }


}

//https://github.com/1bd1/rectangle