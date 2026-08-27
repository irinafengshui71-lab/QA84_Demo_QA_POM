
package com.demoqa.utils;

import com.demoqa.core.BasePage;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerWriter extends BasePage implements TestWatcher {
    private static final Logger logger = LoggerFactory.getLogger(LoggerWriter.class);

    public LoggerWriter(WebDriver driver) {
        super(driver);
    }

    @Override
    public void testSuccessful(ExtensionContext context) {
        logger.info("==================================================");
        logger.info("PASSED: TEST [{}] Successful", context.getDisplayName());
        logger.info("==================================================");
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        logger.error("==================================================");
        logger.error("FAILED: TEST [{}] Failed!", context.getDisplayName());
        logger.error("ERROR: {}", cause.getMessage());
        logger.error("==================================================");
    }
}
