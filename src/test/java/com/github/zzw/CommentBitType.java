package com.github.zzw;

/**
 * 添加新的 type 需要更新的服务：commentBitSaveService, commentBitCacheRefresher, comment-bit-cache-refresh7d,
 * commentBitCacheInitTask, idBitSaveService, idBit的binlog
 * @author w.vela
 * Created on 16/3/23.
 */
public enum CommentBitType implements HasBitInfo {
    PHOTO_OWNER_VISIBLE(0), // 仅照片作者可见
    AUTHOR_AND_FANS_VISIBLE(1), // 评论作者和他的粉丝可见
    AUTHOR_VISIBLE(2), // 仅评论作者可见
    LIKED(3), // 评论被点赞过
    SENT_FOR_AUDIT(4), // 评论点赞已送ADMIN审核
    ;

    private int bitIndex;

    CommentBitType(int bitIndex) {
        this.bitIndex = bitIndex;
    }

    @Override
    public int bitIndex() {
        return bitIndex;
    }
}
