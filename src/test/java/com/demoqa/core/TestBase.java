package com.demoqa.core;
import com.demoqa.utils.LoggerWriter;
import com.demoqa.utils.LoggerWriter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class TestBase {
   protected WebDriver driver;
    protected ApplicationManager app = new ApplicationManager
            (System.getProperty("browser","chrome"));
    public static final Logger logger = LoggerFactory.getLogger(TestBase.class);

    @BeforeEach
    public void init(){
       driver = app.start();

    }
    @ExtendWith(LoggerWriter.class)

//    @AfterEach
//    public void tearDown(){
//        if (driver!=null){
//           driver.quit();}
//    }
    @AfterEach
    public void tearDown(){
        app.stop();
    }
}

