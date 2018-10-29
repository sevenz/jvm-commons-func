package com.bob.source.collection;

public class ListClass {

    /**
     * 基于数组实现的有界队列，一旦创建后容量不可更改
     */
    class ArrayBlockingQueue {

    }

    /**
     * 基于链表的有界阻塞队列，添加跟获取是两个不同的锁，队列默认长度是 Integer.MAX_VALUE
     */
    class LinkedBlockingQueue {

    }

    /**
     * 基于数组，支持优先级使用二叉堆数据结构实现的无界阻塞队列
     */
    class PriorityBlockingQueue {

    }

    /**
     * 支持延时获取元素的无界阻塞队列
     */
    class DelayQueue {

    }

    /**
     * 容量为 0 ，一个添加操作后必须等待一个获取操作才可以继续添加，CPU 自旋等待消费者取走元素
     */
    class SynchronousQueue {

    }

    /**
     * 双向链表组成的双向阻队列，无界
     */
    class LinkedBlockingDeque {

    }

    /**
     * 一个由链表组成的无界阻塞队列
     */
    class LinkedTransferQueue {

        /**
         * 如果当前有消费线程正在获取元素则把该元素直接传递给消费线程否则加入到队列中直到该元素被消费才返回
         */
        void transfer() {

        }
    }
}