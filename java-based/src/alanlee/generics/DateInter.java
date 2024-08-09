package alanlee.generics;

import java.util.Date;

public class DateInter extends Pair<Date> {

    @Override
    public void setValue(Date value) {
        super.setValue(value);
    }

    @Override
    public Date getValue() {
        return super.getValue();
    }

    public static void main(String[] args) {
        DateInter dateInter = new DateInter();
        dateInter.setValue(new Date());
        //dateInter.setValue(new Object()); //编译错误
    }

}