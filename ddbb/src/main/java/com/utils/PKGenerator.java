package com.utils;

import java.util.UUID;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 主键生成器
 */
public class PKGenerator {

    public static Lock lock = new ReentrantLock();

    public static String nextID(){
        try {
            lock.lock();
            long time = System.currentTimeMillis();
            return String.valueOf(time)+UUID.randomUUID();
        } finally {
            lock.unlock();
        }
    }
}
