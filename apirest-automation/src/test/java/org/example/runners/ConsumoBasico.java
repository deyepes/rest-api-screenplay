package org.example.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/consumo_basico.feature",
                glue = "org.example.stepsdefinitions")
public class ConsumoBasico {
}
