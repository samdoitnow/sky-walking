package com.a.eye.skywalking.routing.config;

public class Config {
    public static class Server {
        public static int PORT = 23000;
    }


    public static class Search {
        public static long CHECK_CYCLE = 100L;
        public static long TIMEOUT     = 3 * 1000L;
    }


    public static class RegistryCenter {
        public static String TYPE        = "zookeeper";

        public static String CONNECT_URL = "127.0.0.1:2181";

        public static String AUTH_SCHEMA = "";

        public static String AUTH_INFO   = "";

        public static String PATH_PREFIX = "/skywalking/routing_list/";
    }


    public static class StorageNode {
        public static String SUBSCRIBE_PATH = "/skywalking/storage_list";
    }


    public static class Disruptor {
        public static int BUFFER_SIZE = 1024 * 128 * 4;

        public static int FLUSH_SIZE = 100;
    }
}
