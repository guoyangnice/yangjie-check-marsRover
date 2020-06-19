package com.twschool.practice;

public enum Directions {
    N {
        @Override
        public String turnLeft(String command) {
            return "W";
        }

        @Override
        public String turnRight(String command) {
            return "E";
        }
    },W {
        @Override
        public String turnLeft(String command) {
            return "S";
        }

        @Override
        public String turnRight(String command) {
            return "N";
        }
    },S {
        @Override
        public String turnLeft(String command) {
            return "W";
        }

        @Override
        public String turnRight(String command) {
            return "E";
        }
    },E {
        @Override
        public String turnLeft(String command) {
            return "S";
        }

        @Override
        public String turnRight(String command) {
            return "N";
        }
    };
    public abstract String turnLeft(String command);
    public abstract String turnRight(String command);
}
