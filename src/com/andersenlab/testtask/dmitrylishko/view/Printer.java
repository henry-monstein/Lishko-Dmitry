package com.andersenlab.testtask.dmitrylishko.view;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Printer {
    private final String LOGO = "                                         ``                                                                                                           \n" +
            "                               `..     `.-.       `                                                                                                   \n" +
            "                       ```    `.--`   `.--.    `.-.`                                                                                                  \n" +
            "                       .--`   `---.` `.---.   .---.                                                                                                   \n" +
            "                       .---`  `----.``----.``.---.`   `..-.`                                                                                          \n" +
            "                ..`    .----.``.----..-----..----.```----.`                                                                                           \n" +
            "                .---.` `.------------------------...----.`                                                                                            \n" +
            "                `.----....--------...````....----------.` ``.....`                                                                                    \n" +
            "          `.`    `.---------..``               `..-----..------.`                                                                                     \n" +
            "          `.--..````------.`                      ``.--------.`                                                                                       \n" +
            "           `.-----------`                            `.----.`                                                                                         \n" +
            "             `.-------`                                `.-.`                                                                                          \n" +
            "       `````  ``.----`              `/yhhh:`            ```                  /yhy.                                                                    \n" +
            "       `------------`              `+dMMMMs-                                .yNNh`                                                                    \n" +
            "        `.---------`              `smMNNMMm/`    `:/:.-/++/:.      `:+oo+/-`/dMmo  `.:+ssso/.`    .:/:.:+o/``:+oo+:`    `./osss+:.    `:/:-:/++/-`    \n" +
            "           ``..---.              `yNMms/mMMs.    /dMMNNNNNMMmo` `:ymMMNNNMMdmNMd- /hNMMNNNMMNh:  `oNMNmMMdo/dMMNNMNd. .+hNMMNNMMMNs- `+NMNNNNNNMMd/`  \n" +
            "      ```````..---`             -yMMd+`.yMMd/   `yNMNy:..:yMMm-.omMNs:.`.:sNMMNs.oNMds:..-+hNMm/ :hMMNs/-.:hMMs:/ydd/:yNNd+-..-+dMMh:-yMMmo:..:mMMy-  \n" +
            "     `.-----------`           `:yMMm+.`.+MMNs`  -dMNy.   `+NMm-omMmo      `yNMd+/NMNhsoooooymMMy`omMmo    .sNMNy+:.`.yNMNhooooooyMMNo+mMN/`   `hNMy-  \n" +
            "       `..--------`          `/hMMMNmdddmMMMh:  oNMd/    -yMMh-yNMd-       yNMy/oMMNmmmmmmmmmmdo-hNNh.     `/ymMMmy..dMMNmmmmmmmmmmdsyNMh.    .mMNo`  \n" +
            "              `.--.         `+dMMmdddddddmMMms``dNNs.    /dMN+`smMNs`    .+NMm+./NMm+`   `-/++/`/mMmo   `-///``+dMNy`yNMd/    `-/++-+hMN+`   `+MMd/   \n" +
            "          ``.-----.`       `omMNy-```````:mMMh-:NMd/    .sNMm. -sNMMdysshmMMMh: `oNMNhsoshmNNh/`yNMh:   `+mMNy+ymMNo -yNMNhsoshmNNy:sNMm.    .yMMs-   \n" +
            "       ..---------.`       +dmds.        `sdmh+omms-    -ymds   ./sdNNNmdhdmm+.   :shmNNNmds/. .yddo`    ./hmNNNmy/`  `:sdmNNmmhs:`-smds    `-hmd/`   \n" +
            "        ``.....```         ````           `````````      ````      `.--.`````       ``...``     ````        `.-.`        `....``    ````      ```     \n";
    public void printLogo() {
        printToConsole(LOGO);
    }

    public void printToConsole(String message) {
        System.out.println(message);
    }

    public void printToFile(String fileName, String... messages) {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(fileName))) {
            for (String m : messages) {
                writer.write(m + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public <T> void printToFile(String fileName, ArrayList<T> messages) {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(fileName))) {
            for (T m : messages) {
                writer.write(m.toString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
