package stepdefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/resources/features",glue= {"stepdefinations"},

//features="src\\test\\resources\\features",glue= {"stepDefinations"},
monochrome = true,
//plugin= {"pretty","html:target/JunitReport/HtmlReports"} 		
//plugin= {"pretty","json:target/JsonReports/report.json"} 
plugin= {"pretty","junit:target/JunitReports/report.xml"}) 		




public class Testrunner {

}
