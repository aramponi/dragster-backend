package io.dragster.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import io.dragster.IntegrationTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@IntegrationTest
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
