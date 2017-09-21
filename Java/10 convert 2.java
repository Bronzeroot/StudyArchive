class OperatorEx30 {
    // 10진 정수를 2진수로 변환하는 메서드
  static String toBinaryString(int x) {
      String zero = "00000000000000000000000000000000";
      String tmp = zero + Integer.toBinaryString(x);
      return tmp.substring(tmp.length()-32);
    }
  
    public static void main(String[]args) {
           int dec = 8;

         System.out.printf("%d >> %d = %4d \t%s%n",
                              dec, 0 ,dec >> 0 , toBinaryString(dec >> 0));
                // 8을 2진수로 바꾸어 표시

         System.out.printf("%d >> %d = %4d \t%s%n",
                              dec, 1 ,dec >> 1 , toBinaryString(dec >> 1));
                // 8을 2진수로 바꾸고 오른쪽으로 한칸 밀어서 표시

         System.out.printf("%d >> %d = %4d \t%s%n",
                              dec, 2 ,dec >> 2 , toBinaryString(dec >> 2));
                //8을 2진수로 바꾸고 오른쪽으로 2칸 밀어서 표시

         System.out.printf("%d << %d = %4d \t%s%n",
                              dec, 0 ,dec << 0 , toBinaryString(dec << 0));

                //8을 2진수로 바꾸고 왼쪽으로 0칸 밀어 표시
         System.out.printf("%d << %d = %4d \t%s%n",
                              dec, 1 ,dec << 1 , toBinaryString(dec << 1));
                //8을 2진수로 바꾸고 왼쪽으로 1칸 밀어 표시

         System.out.printf("%d << %d = %4d \t%s%n",

                              dec, 2 ,dec << 2 , toBinaryString(dec << 2));

                //8을 2진수로 바꾸고 왼쪽으로 2칸 밀어 표시
         System.out.println();

          

         dec = -8;



         System.out.printf("%d >> %d = %4d \t%s%n",
                              dec, 0 ,dec >> 0 , toBinaryString(dec >> 0));


         System.out.printf("%d >> %d = %4d \t%s%n",
                              dec, 1 ,dec >> 1 , toBinaryString(dec >> 1));


         System.out.printf("%d >> %d = %4d \t%s%n",
                              dec, 2 ,dec >> 2 , toBinaryString(dec >> 2));

         System.out.printf("%d << %d = %4d \t%s%n",
                              dec, 0 ,dec << 0 , toBinaryString(dec << 0));


         System.out.printf("%d << %d = %4d \t%s%n",
                              dec, 1 ,dec << 1 , toBinaryString(dec << 1));


         System.out.printf("%d << %d = %4d \t%s%n",

                              dec, 2 ,dec << 2 , toBinaryString(dec << 2));


         System.out.println();

 
         dec = 8;
         System.out.printf("%d >> %2d = %4d \t%s%n",
                                dec, 0, dec >> 0, toBinaryString(dec >> 0));

         System.out.printf("%d >> %2d = %4d \t%s%n",
                                dec,32, dec >> 32, toBinaryString(dec >> 32));
         }// main 끝
}


