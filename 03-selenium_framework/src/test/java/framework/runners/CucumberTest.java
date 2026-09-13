package framework.runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
                // [Cucumber] Lokasi file .feature
                features = "src/test/resources/features",

                // [Cucumber] Package Step Definition dan Hooks
                glue = {
                                "framework.steps",
                                "framework.hooks"
                },

                // [Cucumber] Format output console
                plugin = {
                                "pretty",
                                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
                },

                // [Cucumber] Tidak publish hasil ke Cucumber Cloud
                publish = false)
public class CucumberTest
                extends AbstractTestNGCucumberTests {

        // [TestNG] Menjalankan setiap Scenario sebagai TestNG test
        @Override
        @DataProvider(parallel = false)
        public Object[][] scenarios() {
                return super.scenarios();
        }
}