public class C02_Actions {

    static double addition (double x , double y){

        double addResult = (x + y);
        System.out.println("Result= " + addResult);

        return addResult;

    }
    static double extraction (double x , double y){
        double extResult = (x - y);
        System.out.println("Result= " + extResult);

        return extResult;

    }
    static double multiplication (double x, double y){

        double mltResult = (x * y);
        System.out.println("Result= " + mltResult);

        return mltResult;

    }
    static double division (double x, double y){

        double dvsResult = (x / y);
        System.out.println("Result= " + dvsResult);

        return dvsResult;

    }
    static double exponential (double x, double y){

        if (y == 0){
            System.out.println("Result= 1");
            return 1;

        }
        double expResult = 1;

        for (int i = 1; i <= y ; i++) {
                expResult *= x;

        }
        System.out.println("Result= " + expResult);
        return expResult;
    }
    static double modulus (double x, double y){

        double modResult = (x % y);
        System.out.println("Result= " + modResult);

        return modResult;

    }
    static double area (double x, double y){

        double areaResult = (x * y);
        System.out.println("Result= " + areaResult);

        return areaResult;

    }
    static double perimeter (double x, double y){

        double perimResult = (2*x + 2*y);
        System.out.println("Result= " + perimResult);

        return perimResult;

    }

}
