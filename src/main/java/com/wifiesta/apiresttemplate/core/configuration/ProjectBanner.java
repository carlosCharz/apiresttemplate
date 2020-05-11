package com.wifiesta.apiresttemplate.core.configuration;

import java.io.PrintStream;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.ansi.AnsiColor;
import org.springframework.boot.ansi.AnsiOutput;
import org.springframework.boot.ansi.AnsiStyle;
import org.springframework.core.env.Environment;

/**
 * Project Banner
 *
 * Get String from https://devops.datenkollektiv.de/banner.txt/index.html
 *
 * @author charz
 *
 */
public class ProjectBanner implements Banner {

    private static final String[] BANNER = {"",
            "   ###    ########  ####    ########  ########  ######  ######## \r\n"
                    + "  ## ##   ##     ##  ##     ##     ## ##       ##    ##    ##    \r\n"
                    + " ##   ##  ##     ##  ##     ##     ## ##       ##          ##    \r\n"
                    + "##     ## ########   ##     ########  ######    ######     ##    \r\n"
                    + "######### ##         ##     ##   ##   ##             ##    ##    \r\n"
                    + "##     ## ##         ##     ##    ##  ##       ##    ##    ##    \r\n"
                    + "##     ## ##        ####    ##     ## ########  ######     ##    " + ""};
    private static final String SPRING_BOOT = " :: Spring Boot :: ";

    private static final int STRAP_LINE_SIZE = 42;

    @Override
    public void printBanner(Environment environment, Class<?> sourceClass, PrintStream printStream) {
        for (String line : BANNER) {
            printStream.println(line);
        }
        String version = SpringBootVersion.getVersion();
        version = version == null ? "" : " (v" + version + ")";
        String padding = "";
        while (padding.length() < STRAP_LINE_SIZE - (version.length() + SPRING_BOOT.length())) {
            padding += " ";
        }
        printStream.println(AnsiOutput.toString(AnsiColor.GREEN, SPRING_BOOT, AnsiColor.DEFAULT, padding,
                AnsiStyle.FAINT, version));
        printStream.println();
    }
}
