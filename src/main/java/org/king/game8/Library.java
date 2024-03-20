package org.king.game8;

import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Library {
    private final Logger logger = LogManager.getLogger(this);

    public void print(ArrayList<String> result) {
        for (int i = 0; i < result.size(); i++) {
            logger.info(result.get(i));
        }
    }
    public ArrayList<String> func1() {
        org.king.plataforma.Library plataforma = new org.king.plataforma.Library();
        org.king.plataformaConsumer1.Library plataformaConsumer1 = new org.king.plataformaConsumer1.Library();
        org.king.libdep1.Library libDep1 = new org.king.libdep1.Library();
        ArrayList<String> result = new ArrayList<>();
        result.add(plataforma.greet("game8"));
        result.add(plataformaConsumer1.greet("game8"));
        result.add(libDep1.greet("game8"));
        return result;
    }
    public ArrayList<String> func2() {
        org.king.plataforma.Library plataforma = new org.king.plataforma.Library();
        org.king.plataformaConsumer1.Library plataformaConsumer1 = new org.king.plataformaConsumer1.Library();
        org.king.libdep1.Library libDep1 = new org.king.libdep1.Library();
        ArrayList<String> result = new ArrayList<>();
        result.add(plataforma.greet("game8"));
        result.add(plataforma.greet1("game8"));
        result.add(plataforma.greet2("game8"));
        result.add(plataformaConsumer1.greet("game8"));
        result.add(libDep1.greet("game8"));
        return result;
    }
    public String unused1(String name) {
        return "unused1 from game8, " + name;
    }
    public String unused2(String name) {
        return "unused2 from game8, " + name;
    }
    public String unused3(String name) {
        return "unused3 from game8, " + name;
    }
    public String unused4(String name) {
        return "unused5 from game8, " + name;
    }
    public String unused5(String name) {
        return "unused5 from game8, " + name;
    }
    public String unused6(String name) {
        return "unused6 from game8, " + name;
    }
    public String unused7(String name) {
        return "unused7 from game8, " + name;
    }
    public String unused8(String name) {
        return "unused8 from game8, " + name;
    }    
    public String unused9(String name) {
        return "unused9 from game8, " + name;
    }
}