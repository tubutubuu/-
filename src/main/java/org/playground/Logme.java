package org.playground;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class Logme {
  //  private static final Logger logger = LogManager.getLogger(LogExample.class);

    public static void echo(){
        Logger log = LoggerFactory.getLogger(Logme.class);
        log.info("start");
        log.debug("end");
    }

}
