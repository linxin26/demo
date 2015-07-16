package co.solinx.demo.serialize.data;

import java.io.Serializable;

/**
 * Created by linx on 2015/7/16.
 */
public class TestData implements Serializable {
    int sn;
    private static final long serialVersionUID = 5699113544108250452L;
//    String msg="aa";


    public void setSn(int sn) {
        this.sn = sn;
    }

    @Override
    public String toString() {
        return "TestData{" +
                "sn=" + sn +
                '}';
    }
}
