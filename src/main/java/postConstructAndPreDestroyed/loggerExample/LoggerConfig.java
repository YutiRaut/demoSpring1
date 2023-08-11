package postConstructAndPreDestroyed.loggerExample;

import org.springframework.context.annotation.*;
import postConstructAndPreDestroyed.loggerExample.Logger;

@Configuration
public class LoggerConfig {

      @Bean
//    @Description("this is bean")
//    @Bean(initMethod = "init")
//    @Scope(value="singleton")
    @Scope(value="prototype", proxyMode = ScopedProxyMode.DEFAULT)
   // @Bean("log")
     // @Bean({"log","loggers"})
    public Logger logger(){
      return new Logger();
    }


}

//OUTPUT OF PROTOTYPE
//    Logger initialized.
//        Logging: log-in
//        158453976
//        Logger closed.
//        =================================================
//        Logger initialized.
//        Logging: log-in
//        1368594774
//        Logger closed.
//=============================================================

//    OUTPUT OF SINGLETON
//        Logger initialized.
//        Logging: log-in
//        1335505684
//        Logger closed.
//        =================================================
//        Logging: log-in
//        1335505684
//        Logger closed.

