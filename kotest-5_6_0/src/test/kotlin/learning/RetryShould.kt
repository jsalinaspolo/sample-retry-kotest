package learning.kotlin

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class RetryShould : StringSpec({
    "retry with kotest 5.6.0" {
        true shouldBe false
    }
})
