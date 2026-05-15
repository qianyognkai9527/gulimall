package com.joker.gulimall.common.utils;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.stream.IntStream;

public class DateUtil {


    public static List<List<Long>> getChild(long[] goodIds) {
        List<List<Long>> result = Lists.newArrayList();
        processChild(goodIds, 0, Lists.newArrayList(), result);
        return result;
    }

    private static void processChild(long[] goodIds, int i, List<Long> objects, List<List<Long>> result) {
        result.add(Lists.newArrayList(objects));

        IntStream.range(i, goodIds.length).forEach(index -> {
            objects.add(goodIds[index]);
            processChild(goodIds, index + 1, objects, result);
            objects.remove(objects.size() - 1);
        });


    }

    public static void main(String[] args) {
        long[] goodIds = {1, 2, 3};
        List<List<Long>> child = getChild(goodIds);
        child.forEach(System.out::println);
    }
}
