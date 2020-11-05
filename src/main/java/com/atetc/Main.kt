package com.atetc

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val a1 = -256464896
        val a2 = -16
        println(Integer.toBinaryString(a1))
        val b = a1 shr 29
        println(Integer.toBinaryString(b))
        println(b)
    }
}
