public class Variable implements IEvaluation {

    private String variable;

    public Variable(String str) {
        this.variable = str;
    }
    
    @Override
    public Double evaluate(Double num) {
        return num;
    }
    
}