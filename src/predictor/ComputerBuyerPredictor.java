
package predictor;

public class ComputerBuyerPredictor {
     public boolean predict(int umur, int statusPelajar, int tingkatPelunasanKredit){
    
        boolean potensiMenjadiCustomer = true;
        
        if((umur == 1) || (umur == 0 && statusPelajar == 0) || (umur == 2 && tingkatPelunasanKredit == 0)){
              
        }else {
            potensiMenjadiCustomer = false;
        }
        
        return potensiMenjadiCustomer;
    } 
    
}
