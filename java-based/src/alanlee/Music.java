package alanlee;

import java.util.ArrayList;
import java.util.List;

/**
 * 多态：运行时多态指程序中定义的对象引用所指向的具体类型在运行期间才确定
 *
 * @author AlanLee
 * @date 2022-11-03
 */
public class Music {

    public static void main(String[] args) {
        List<Instrument> instruments = new ArrayList<>();
        instruments.add(new Wind());
        instruments.add(new Percussion());
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }

}