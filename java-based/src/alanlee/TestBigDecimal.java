package alanlee;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TestBigDecimal {
    public static void main(String[] args) {
        BigDecimal number = new BigDecimal("123.456789");
        BigDecimal divisor = new BigDecimal("10000"); // 相当于直接舍去4位小数之后的小数
        BigDecimal result = number.divide(divisor);
        BigDecimal result2 = number.divide(divisor, 4, RoundingMode.DOWN);
        System.out.println(result); // 输出 0.000123456789
        System.out.println(result2);


        // 计算零售发货单明细条码实付金额
        BigDecimal actuallyPaidAmt = new BigDecimal("20.1000").multiply(new BigDecimal("2.0000"))
                .subtract(new BigDecimal("0.0000")).subtract(new BigDecimal("0.0000"))
                .add(new BigDecimal("0.0000"));
        System.out.println(actuallyPaidAmt);
        // 计算零售发货单明细条码实付单价
        BigDecimal actuallyPaidUnitPrice = actuallyPaidAmt.divide(new BigDecimal(2.0000), 4, RoundingMode.DOWN);
        System.out.println(actuallyPaidUnitPrice);
        if (actuallyPaidUnitPrice.compareTo(new BigDecimal("20.2000")) >= 0) {
            System.out.println("没匹配");
        }
        System.out.println("匹配");
    }
}
