
package test;

import predictor.ComputerBuyerPredictor;

public class TestRunner {
    public static void main(String[] args) {
        ComputerBuyerPredictor predictor = new ComputerBuyerPredictor();
        
          //testcase 1
          System.out.println(predictor.predict(0, 0, 0));
          //testcase 2
          System.out.println(predictor.predict(0, 0, 1));
          //testcase 3          
          System.out.println(predictor.predict(0, 1, 0));
          //testcase 4
          System.out.println(predictor.predict(0, 1, 1));
          //testcase 5
          System.out.println(predictor.predict(1, 0, 0));
          //testcase 6
          System.out.println(predictor.predict(1, 0, 1));
          //testcase 7
          System.out.println(predictor.predict(1, 1, 0));
          //testcase 8
          System.out.println(predictor.predict(1, 1, 1));
          //testcase 9
          System.out.println(predictor.predict(2, 0, 0));
          //testcase 10
          System.out.println(predictor.predict(2, 0, 1));
          //testcase 11
          System.out.println(predictor.predict(2, 1, 0));
          //testcase 12
          System.out.println(predictor.predict(2, 1, 1));
        
    }
    
}
