package org.zky;

public class Base64UtilsTest {

    @org.junit.Test
    public void decodeWithMix() {
        String res = Base64Utils.decodeWithMix("b5e1MDA0MDEFMCQTny4MDUxOHwwOFTY2Mzg=");
        System.out.println(res);
    }
}