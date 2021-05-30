
/**
 * class Calculator
 *
 * @author RidhaturRahmah
 * @version 0.1
 */
public class CalculatorProgremmer extends Calculator
{
     // op1
    public double op1=0;
    public double op2=0;
    public static final String info = "Kalkulatorku";
    public static int jumlahobject = 0;

    /**
     * Constructor for objects of class Calculator
     */
    public CalculatorProgremmer()
    {
        // initialise instance variables
        this.jumlahobject += 1;
    }

    /**
     * Constructor for objects of class Calculator
     * @param  double, double inisialisasi nilai dari op1 dan op2
    */

    public CalculatorProgremmer(double op1, double op2)
    {
        this.op1 = op1;
        this.op2 = op2;
        this.jumlahobject += 1;

    }

    /**
     * Constructor for objects of class Calculator
     * @param  double, double inisialisasi nilai dari op1 dan op2
    */

    public CalculatorProgremmer(double op2)
    {
        this.op2 = op2;
        this.jumlahobject += 1;

    }




    /**
     * set op1
     *
     * @param  double op1  
     * @return  void
     */
    public void setOp1(double op1)
    {
        this.op1 = op1;
    }


    /**
     * get op1
     *
     * @param  double op1  
     * @return  void
     */
    public double  getOp1()
    {
        return this.op1;
    }


    /**
     * jumlah tanpa parameter
     *
     * @param  
     * @return  double hasil penjumlahan op1 + op2
     */
    public double jumlah() 
    {
        return this.op1 + this.op2;
    }

     /**
     * jumlah dengan parameter
     *
     * @param  double op1
     *         double op2
     * @return double hasil penjumlahan op1 + op2
     */
    public double jumlah(double op1, double op2) 
    {
        this.op1 = op1;
        this.op2 = op2;
        return jumlah();
    }
    public double kurang()
    {
        return this.op1- this.op2;
    }
     /**
     * kurang dengan parameter
     *
     * @param  double op1
     *         double op2
     * @return double hasil pengurangan op1 - op2
     */

     public double kurang(double op1, double op2) 
    {
        this.op1 = op1;
        this.op2 = op2;
        return this.op1- this.op2;
    }
    public double perkalian()
    {
        return this.op1* this.op2;
    }
     /**
     * perkalian dengan parameter
     *
     * @param  double op1
     *         double op2
     * @return double hasil perkalian op1 * op2
     */

     public double perkalian(double op1, double op2) 
    {
        this.op1 = op1;
        this.op2 = op2;
        return this.op1* this.op2;
    }
    public double pembagian()
    {
        return this.op1/ this.op2;
    }
     /**
     * pembagian dengan parameter
     *
     * @param  double op1
     *         double op2
     * @return double hasil pembagian op1 / op2
     */

     public double pembagian(double op1, double op2) 
    {
        this.op1 = op1;
        this.op2 = op2;
        return this.op1/ this.op2;
    }

 public static void Biner(int n){
     if(n>1){
         Biner(n/2);
     }
     System.out.print(n%2);
 }
    
 public static void Hexadesimal(int n){
     if (n > 1) {
            Hexadesimal(n/16);
        }
        System.out.print(n%16);
    }
}
