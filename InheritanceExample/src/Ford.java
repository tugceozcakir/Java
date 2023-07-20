public class Ford extends Car{
    public Ford(Engine engine) {
        super(engine);
    }

    public Ford(String model, boolean isAutomatic, CaseType caseType, ColorType color, int fromZeroToHundredSec, Engine engine) {
        super(model, isAutomatic, caseType, color, fromZeroToHundredSec, engine);
    }
}
