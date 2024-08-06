package alanlee.access;

/**
 * 可以使用公有的 getter 和 setter 方法来替换公有字段，这样的话就可以控制对字段的修改行为
 */
public class AccessExample2 {

    private int id;

    public String getId() {
        return id + "";
    }

    public void setId(String id) {
        this.id = Integer.valueOf(id);
    }

}