package org.runall;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
<<<<<<< HEAD
@CucumberOptions(features="src\\test\\resources\\Features",glue="org.stepdefinition",monochrome=true, dryRun=false,strict=true)
=======
@CucumberOptions(features="src\\test\\resources\\Features",glue="org.stepdefinition",dryRun=false,strict=true)
>>>>>>> 6da9da124b3c939a5f89838bc9c20a6e54ee9813
public class RunAll {

}
