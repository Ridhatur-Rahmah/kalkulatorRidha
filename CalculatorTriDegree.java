import java.lang.Math;
/**
 * class CalculatorTriDegree
 *
 * @author RidhaturRahmah
 * @version 0.1
 */
public class CalculatorTriDegree extends CalculatorTrigonometri
{
    // instance variables - replace the example below with your own
    
    /**
     * Constructor for objects of class CalculatorTriDegree
     */
    public CalculatorTriDegree()
    {
       
    }

    /**
     * konversi
     *
     * @param  double sudut
     * @return void
     */
    public void konversi(double sudut)
    {
        super.sudut = Math.toRadians(sudut);
    }
}