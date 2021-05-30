/**
 * class SimpanOperasiKeMemoryReverse here.
 *
 * @author RidhaturRahmah
 * @version 0.1
 */
public class SimpanOperasiKeMemoryReverse implements SimpanOperasiCalculator{
    private String[] dataMemori = new String[10];
    private int pointer = 0;
    private String tampilMemori;

    /**
     * Constructor for objects of class SimpanOperasiKeMemoryReverse
     */
    public SimpanOperasiKeMemoryReverse()
    {
        
    }

    /**
     * simpanOperasi
     *
     * @param String data
     * @return data
     */
    public void simpanOperasi(String data){
        this.dataMemori[pointer] = data;
        this.pointer = this.pointer + 1;
        if (this.pointer > 9) this.pointer = 0;
    }
     /**
     * bacaOperasi
     *
     * @param void
     * @return StringArray
     */
    public String bacaOperasi(){
        dataMemoriKeTampil();
        return this.tampilMemori;
       
    }
    
     /**
     * dataMemoriKeTampil
     *
     * @param void
     * @return void
     */
    public void dataMemoriKeTampil(){
        this.tampilMemori = "";
        for(int i = this.pointer - 1; i >=0; i--){
            this.tampilMemori = this.tampilMemori + " " + this.dataMemori[i] + "\n" ;
        }
    
    }
}
