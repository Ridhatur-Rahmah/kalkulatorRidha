/**
 * class CalculatorScientific
 *
 * @author RidhaturRahmah
 * @version 0.1
 */
public class CalculatorScientific extends Calculator
{
     // op1
    public double op1=0;
    public double op2=0;
    public static final String info = "Kalkulatorku";
    public static int jumlahobject = 0;

    /**
     * Constructor for objects of class Calculator
     */
    public CalculatorScientific()
    {
        // initialise instance variables
        this.jumlahobject += 1;
    }

    /**
     * Constructor for objects of class Calculator
     * @param  double, double inisialisasi nilai dari op1 dan op2
    */

    public CalculatorScientific(double op1, double op2)
    {
        this.op1 = op1;
        this.op2 = op2;
        this.jumlahobject += 1;

    }

    /**
     * Constructor for objects of class Calculator
     * @param  double, double inisialisasi nilai dari op1 dan op2
    */

    public CalculatorScientific(double op2)
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

     /*
     * public static void Desimal toBiner(int n){
     if(n>1){
         Biner(n/2);
     }
     System.out.print(n%2);
 }
     */
    
    /*public static void Hexadesimal(int n){
     if (n > 1) {
            DesimalToHexa(n/16);
        }
        System.out.print(n%16);
    }
     
     }
     
     /** 
     * menghitung Faktorial
     *
     * @param  int op1
     *         
     * @return int 4! = 4x3x2x1 (example)
     */
    public int menghitungFaktorial(int op1){
        if (op1 == 1 || op1 == 0)
        return 1;
        else
            return op1 * menghitungFaktorial(op1 - 1);
    }
     public double luas(){
        double luas, phi=3.14;
        double r= 7;
        luas= phi*r*r;
        return luas;
    }
    
     public double bujurSangkar(int sisi){
        double luas;
        luas=sisi*sisi;
        return luas;
        
    }
}

