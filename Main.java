/**
 * class Main 
 *
 * @author RidhaturRahmah
 * @version 0.1
 */
public class Main
{
    public static void main(String args[])
    {
       System.out.println(Calculator.info);
       
    Calculator calculator1 = new Calculator();
    Calculator calculator4 = new Calculator();
    Calculator calculator2 = new Calculator(3,5);
    Calculator calculator3 = new Calculator(3);
       
       System.out.println("Nilai awal setelah konstruktor dipanggil");
       System.out.println("Nilai op2 Constructor tanpa parameter: "+calculator1.op2);
       System.out.println("Nilai op2 Constructor dengan 2 parameter: "+calculator2.op2);
       System.out.println("Nilai op2 Constructor dengan 3 parameter: "+calculator3.op2);
       
       System.out.println("Nilai op1 Constructor tanpa parameter: "+calculator1.getOp1());
       System.out.println("Nilai op1 Constructor dengan 2 parameter: "+calculator2.getOp1());
       System.out.println("Nilai op1 Constructor dengan 3 parameter: "+calculator3.getOp1());
        
       System.out.println("");
       System.out.println(Calculator.jumlahobject);
       
       System.out.println("");
       double hasil1 = calculator1.jumlah();
       double hasil2 = calculator1.jumlah(5, 4);
       System.out.println("Hasil penjumlahan method jumlah tanpa parameter: "+ hasil1);
       System.out.println("Hasil penjumlahan method jumlah dengan parameter: "+ hasil2);
       
       System.out.println("");
       double kurang1 = calculator1.kurang();
       double kurang2 = calculator1.kurang(5, 4);
       System.out.println("Hasil pengurangan method kurang tanpa parameter:  " + kurang1);
       System.out.println("Hasil pengurangan  method kurang dengan parameter:  "+ kurang2);
       
       System.out.println("");
       double perkalian1 = calculator1.perkalian();
       double perkalian2 = calculator1.perkalian(5, 4);
       System.out.println("Hasil perkalian method kali tanpa parameter:  " + perkalian1);
       System.out.println("Hasil perkalian  method kali dengan parameter:  "+ perkalian2);
       
       System.out.println("");
       double pembagian1 = calculator1.pembagian();
       double pembagian2 = calculator1.pembagian(5, 4);
       System.out.println("Hasil pembagian method bagi tanpa parameter:  " + pembagian1);
       System.out.println("Hasil pembagian  method bagi dengan parameter:  "+ pembagian2);
       
    
       CalculatorProgremmer clp = new CalculatorProgremmer();
       System.out.println(" \n CalculatorProgrammer");
       System.out.println("Bentuk Biner dari Desimal " + " :"+ Integer.toBinaryString(5));
       System.out.println("Bentuk Hex dari Desimal " + " :"+ Integer.toHexString(5));

    
      CalculatorScientific cs = new CalculatorScientific();
      System.out.println(" \n CalculatorScientific");
      System.out.println("Faktorial dari 5! adalah :" + cs. menghitungFaktorial(5));
      System.out.println("luas lingkarannya adalah :" + cs.luas());
      System.out.println("luas Bujur sangkar adalah :" + cs.bujurSangkar(10));
      
      CalculatorTrigonometri clr = new CalculatorTriRadian();
      CalculatorTrigonometri cld = new CalculatorTriDegree();
      
      System.out.println(" \n CalculatorTrigonometri");
      System.out.println("Nilai dari sin adalah :" + Math.sin(120));
      System.out.println("Nilai dari cos adalah :" + Math.cos(180));
      System.out.println("Nilai dari tan adalah :" + Math.tan(30));
      System.out.println("Nilai dari sudut derajat sudut untuk PI/3 adalah" + Math.toDegrees(Math.PI/3) + " derajat");
      System.out.println("Nilai dari sudut radian untuk sudut 120 derajat adalah " + Math.toRadians(120));
    
      
      Kalkulator cl = new Kalkulator();
      //SimpanOperasiCalculator  spr = new SimpanOperasikeMemoryReverse();
      SimpanOperasiCalculator  spr = new SimpanOperasikeMemoryForward();
      
      cl.setSimpanOperasi(spr);
      
      cl.op1 = 1;
      cl.op2 = 1;
      System.out.println("");
      System.out.println("1 + 1 = "+ cl.jumlah());
      //System.out.println("1 x 1 = "+ cl.kali());
      //System.out.println("1 - 1 = "+ cl.kurang());
      //System.out.println("1 / 1 = "+ cl.bagi());
      
      cl.op1 = 2;
      cl.op2 = 2;
      System.out.println("");
      System.out.println("2 + 2 = "+ cl.jumlah());
      //System.out.println("2 x 2 = "+ cl.kali());
      //System.out.println("2 - 2 = "+ cl.kurang());
      //System.out.println("2 / 2 = "+ cl.bagi());
      
      cl.op1 = 3;
      cl.op2 = 3;
      System.out.println("");
      System.out.println("3 + 3 = "+ cl.jumlah());
      //System.out.println("3 x 3 = "+ cl.kali());
      //System.out.println("3 - 3 = "+ cl.kurang());
      //System.out.println("3 / 3 = "+ cl.bagi());
      
      System.out.println("Data dari memori: ");
      
      System.out.println(cl.bacaOperasi());
       
       
    
    }
}
       
       
    
    


     
       
    