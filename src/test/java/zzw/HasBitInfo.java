package zzw;

import static java.util.EnumSet.noneOf;
import static java.util.stream.Collectors.toCollection;

import java.util.EnumSet;
import java.util.Set;

/**
 * @author w.vela
 * Created on 16/3/23.
 */
public interface HasBitInfo {

    static <V extends Enum<V> & HasBitInfo> Set<V> toSet(long value, Class<V> type) {
        EnumSet<V> all = EnumSet.allOf(type);
        return all.stream() //
                .filter(item -> (value & item.bitValue()) != 0) //
                .collect(toCollection(() -> noneOf(type)));
    }

    static <V extends HasBitInfo> long toLong(Set<V> set) {
        return set.stream() //
                .mapToLong(HasBitInfo::bitValue) //
                .sum();
    }

    int bitIndex();

    default long bitValue() {
        return 1L << bitIndex();
    }
}
