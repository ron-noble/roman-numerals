package com.paltaie.romannumerals.benchmark;

import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;

public class BenchmarkHarness {
    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(DecimalToRomanBenchmark.class.getSimpleName())
                .include(RomanToDecimalBenchmark.class.getSimpleName())
                .timeUnit(TimeUnit.MICROSECONDS)
                .warmupIterations(5)
                .measurementIterations(1)
                .build();
        new Runner(opt).run();
    }
}
