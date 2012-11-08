public class Minus implements IEvaluation {
    private IEvaluation operand1;
    private IEvaluation operand2;

    public Minus(IEvaluation e1, IEvaluation e2) {
        this.operand1 = e1;
        this.operand2 = e2;
    }
    @Override
    public Double evaluate(Double num) {
        return operand1.evaluate(num)-operand2.evaluate(num);
    }
}