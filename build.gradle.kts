plugins {
    id("jacoco-report-aggregation")
}

reporting {
    reports {
        val testCodeCoverageReport by creating(JacocoCoverageReport::class) {
            testType = TestSuiteType.UNIT_TEST
        }
    }
}

dependencies {
    jacocoAggregation(project(":some-gradle-plugin"))
}
