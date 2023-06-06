package top.janweehsia;

public final class Property {
    /**
     * Direct交换机名称
     */
    public final static String DIRECT_EXCHANGE_NAME = "EXCHANGE_HELLO";
    /**
     * 备用交换机名称
     */
    public final static String ALTERNATE_EXCHANGE_NAME = "EXCHANGE_ALTERNATE";
    /**
     * Topic交换器名称
     */
    public final static String TOPIC_EXCHANGE_NAME="EXCHANGE_TOPIC";
    /**
     * 队列名称
     */
    public final static String QUEUE_HELLO = "QUEUE_HELLO";

    public final static String QUEUE_HAY = "QUEUE_HAY";
    /**
     * 死信队列名称
     */
    public final static String UNROUTABLE_QUEUE_NAME = "QUEUE_UNROUTABLE";
    /**
     * 存储Text的队列名称
     */
    public static final String QUEUE_TEXT = "QUEUE.TEXT";
    /**
     * 可路由键
     */
    public final static String ROUTABLE_KEY_1 = "HELLO";
    /**
     * 不可路由键
     */
    public final static String UNROUTABLE_KEY = "HALLO";
    /**
     * 主机地址
     */
    public static final String HOST_NAME = "192.168.136.130";

    public static final int PORT = 32769;
    /**
     * 用户名
     */
    public static final String USER_NAME = "janwee";
    /**
     * 密码
     */
    public static final String PASSWORD = "janwee";

    /**
     * 构造方法
     */
    private Property() {
    }
}
