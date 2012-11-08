public class Division implements IEvaluation {

    private IEvaluation operand1;
    private IEvaluation operand2;

    public Division(IEvaluation e1, IEvaluation e2) {
        this.operand1 = e1;
        this.operand2 = e2;

    }

    @Override
    public Double evaluate(Double num) {
        Double res = 0.0;
        try {
            res = operand1.evaluate(num) / operand2.evaluate(num);
        } catch (Exception ex) {
            System.out.println("Division by zero!!!");
            return null;
        }
        return res;
    }
}
