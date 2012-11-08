public class Const implements IEvaluation {
    private Double constanta;

    public Const(Double constanta) {
        this.constanta = constanta;
    }
    
    
    @Override
    public Double evaluate(Double num) {
        return constanta;
    }
    
}