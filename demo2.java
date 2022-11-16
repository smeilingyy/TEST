package base;

public class demo2 {
    public static void main(String[] args) {
        //整数拓展：     进制  二进制0b  十进制   八进制0   十六进制0x

        int i = 10;
        int i2 = 010;//八进制
        int i3 = 0x10;//十六进制0x          0~9 A~F 16

        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);

        //=======================================================
        //浮点数拓展?    银行业务怎么表示钱?钱
        //BigDecimal    数学工具类
        //=======================================================
        //float     有限  离散  含入误差    大约  接近但不等于
        //double
        //最好完全使用浮点数进行比较
        //最好完全使用浮点数进行比较
        //最好完全使用浮点数进行比较


        float f = 0.1f;//0.1
        double d = 1.0 / 10;//0.1

        System.out.print(f == d);//false
//有疑问悬疑
        float d1 = 231313123312312313f;
        float d2 = d1 + 1;

        System.out.println(d1 == d2);//true

        //============================================
        //字符拓展
        //=============================================
        char c1 = 'a';
        char c2 = '中';

        System.out.println(c1);
        System.out.println(c2);
    }
}