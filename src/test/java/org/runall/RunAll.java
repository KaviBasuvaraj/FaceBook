package org.runall;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",glue="org.stepdefinition",monochrome=true, dryRun=false,strict=true)


public class RunAll {

}
