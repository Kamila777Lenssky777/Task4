public class Evaluation{
    public static void main(String[] args) {
        if (args.length > 0) {
            Double num = Double.parseDouble(args[0]);
            IEvaluation xx = new Times(new Variable("x"), new Variable("x"));
            IEvaluation x2 = new Times(new Const(2.0), new Variable("x"));
            Double res = new Plus(new Minus(xx, x2), new Const(1.0)).evaluate(num);
            System.out.println("f(x) = x*x -2*x + 1 ; f( "+args[0] +" ) =  " + res);

        }
    }
}
