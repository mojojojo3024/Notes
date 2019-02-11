

public class LoopTester{
     public static void main(String[] args){
          long startTime = System.nanoTime();
          int cnt = 0;
          int end = 1;
          for(int a = 0; a <=end; a++){
               for(int b = 0; b <=end; b++){
                    for(int c = 0; c <=end; c++){
                         for(int d = 0; d <=end; d++){
                              for(int e = 0; e <=end; e++){
                                   for(int f = 0; f <=end; f++){
                                        for(int g = 0; g <=end; g++){
                                             for(int h = 0; h <=end; h++){  
                                                  for(int i = 0; i <=end; i++){ 
                                                       for(int j = 0; j <=end; j++){
                                                            for(int k = 0; k <=end; k++){
                                                                 for(int l = 0; l <=end; l++){
                                                                      for(int m = 0; m <=end; m++){
                                                                           for(int n = 0; n <=end; n++){
                                                                                for(int o = 0; o <=end; o++){
                                                                                     for(int p = 0; p <=end; p++){
                                                                                          for(int q = 0; q <=end; q++){
                                                                                               for(int r = 0; r <=end; r++){
                                                                                                    for(int s = 0; s <=end; s++){
                                                                                                         for(int t = 0; t <=end; t++){
                                                                                                              for(int u = 0; u <=end; u++){
                                                                                                                   for(int v = 0; v <=end; v++){
                                                                                                                        for(int w = 0; w <=end; w++){
                                                                                                                             for(int x = 0; x<= 0; x++){
                                                                                                                                  System.out.println(a+""+b+""+c+""+d+""+e+""+f+""+g+""+h+""+i+""+j+""+k+""+l+""+m+""+n+""+o+""+p+""+q+""+r+""+s+""+t+""+u+""+v+""+w);
                                                                                                                             }
                                                                                                                        }
                                                                                                                   }
                                                                                                              }
                                                                                                         }
                                                                                                    }
                                                                                               }
                                                                                          }
                                                                                     }
                                                                                }
                                                                           }
                                                                      }
                                                                 }
                                                            }
                                                       }
                                                  }
                                                  
                                             }
                                        }
                                   }
                              }
                         }
                    }
               }
          }
          System.out.println(cnt);
          long endTime = System.nanoTime();
          System.out.println("Run time = "+ (endTime - startTime)/1E9 + " seconds");
     }
     
}
