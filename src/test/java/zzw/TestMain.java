package zzw;

import java.util.Set;

import org.junit.Test;

/**
 * @author zhangzhewei
 * Created on 2019-07-15
 */
public class TestMain {

    @Test
    public void tt() {

        long maxValue = Long.MAX_VALUE;
        System.out.println(maxValue);
        System.out.println(1L << 100);
        Set<CommentBitType> commentBitTypes = HasBitInfo.toSet(14, CommentBitType.class);
        System.out.println(commentBitTypes);

    }

}
