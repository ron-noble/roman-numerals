package com.paltaie.romannumerals.benchmark;

import com.paltaie.romannumerals.RomanNumeralService;
import com.paltaie.romannumerals.RomanNumeralServiceImpl;
import org.openjdk.jmh.annotations.*;

@State(Scope.Thread)
public class DecimalToRomanBenchmark {
    @Param({"1987", "2888"})
    public int decimal;

    private RomanNumeralService romanNumeralService = new RomanNumeralServiceImpl();

    @Benchmark
    @BenchmarkMode({Mode.Throughput, Mode.AverageTime})
    public void benchmarkDecimalToRoman() {
        romanNumeralService.decimalToRoman(decimal);
    }
}
