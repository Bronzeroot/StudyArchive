class OperatorEx30 {
    // 10�� ������ 2������ ��ȯ�ϴ� �޼���
  static String toBinaryString(int x) {
      String zero = "00000000000000000000000000000000";
      String tmp = zero + Integer.toBinaryString(x);
      return tmp.substring(tmp.length()-32);
    }
  
    public static void main(String[]args) {
           int dec = 8;

         System.out.printf("%d >> %d = %4d \t%s%n",
                              dec, 0 ,dec >> 0 , toBinaryString(dec >> 0));
                // 8�� 2������ �ٲپ� ǥ��

         System.out.printf("%d >> %d = %4d \t%s%n",
                              dec, 1 ,dec >> 1 , toBinaryString(dec >> 1));
                // 8�� 2������ �ٲٰ� ���������� ��ĭ �о ǥ��

         System.out.printf("%d >> %d = %4d \t%s%n",
                              dec, 2 ,dec >> 2 , toBinaryString(dec >> 2));
                //8�� 2������ �ٲٰ� ���������� 2ĭ �о ǥ��

         System.out.printf("%d << %d = %4d \t%s%n",
                              dec, 0 ,dec << 0 , toBinaryString(dec << 0));

                //8�� 2������ �ٲٰ� �������� 0ĭ �о� ǥ��
         System.out.printf("%d << %d = %4d \t%s%n",
                              dec, 1 ,dec << 1 , toBinaryString(dec << 1));
                //8�� 2������ �ٲٰ� �������� 1ĭ �о� ǥ��

         System.out.printf("%d << %d = %4d \t%s%n",

                              dec, 2 ,dec << 2 , toBinaryString(dec << 2));

                //8�� 2������ �ٲٰ� �������� 2ĭ �о� ǥ��
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
         }// main ��
}


