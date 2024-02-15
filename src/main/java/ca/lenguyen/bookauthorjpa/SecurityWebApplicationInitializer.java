package ca.lenguyen.bookauthorjpa;

import ca.lenguyen.bookauthorjpa.security.SecurityConfig;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {
    Logger logger = Logger.getLogger(SecurityWebApplicationInitializer.class.getName());
    public SecurityWebApplicationInitializer() {
        super(SecurityConfig.class);
        logger.log(Level.INFO, "Register Security Config class **************");
    }
}