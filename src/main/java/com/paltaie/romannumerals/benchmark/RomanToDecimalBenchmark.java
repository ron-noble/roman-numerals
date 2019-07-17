package com.paltaie.romannumerals.benchmark;

import com.paltaie.romannumerals.RomanNumeralService;
import com.paltaie.romannumerals.RomanNumeralServiceImpl;
import org.openjdk.jmh.annotations.*;

@State(Scope.Thread)
public class RomanToDecimalBenchmark {

    @Param({"MCMLXXXVII", "MMDCCCLXXXVIII"})
    public String roman;

    private RomanNumeralService romanNumeralService = new RomanNumeralServiceImpl();

    @Benchmark
    @BenchmarkMode({Mode.Throughput, Mode.AverageTime})
    public void benchmarkRomanToDecimal() {
        romanNumeralService.romanToDecimal(roman);
    }
}
