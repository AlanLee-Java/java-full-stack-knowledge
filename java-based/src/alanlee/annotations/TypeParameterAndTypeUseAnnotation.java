package alanlee.annotations;

import java.util.ArrayList;

public class TypeParameterAndTypeUseAnnotation<@MyNotEmpty T> {

    // 使用TYPE_PARAMETER类型，会编译不通过
    /*public @MyNotEmpty T test(@MyNotEmpty T a) {
        new ArrayList<@MyNotEmpty String>();
        return a;
    }*/

    //使用TYPE_USE类型，编译通过
    public @MyNotNull T test2(@MyNotNull T a) {
        new ArrayList<@MyNotNull String>();
        return a;
    }

}