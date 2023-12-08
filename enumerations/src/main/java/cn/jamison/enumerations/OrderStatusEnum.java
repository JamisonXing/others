package cn.jamison.enumerations;

public enum OrderStatusEnum {
    WAIT_PAY(0) {
        @Override
        String getTips() {
            return "请您尽快支付o";
        }
    },
    PAY_SUCCESS(1) {
        @Override
        String getTips() {
            return "支付成功";
        }
    },
    COMPLETED(2) {
        @Override
        String getTips() {
            return "订单完成";
        }
    },
    CANCEL(3) {
        @Override
        String getTips() {
            return "订单已取消";
        }
    };
    private final int status;
    OrderStatusEnum(int status) {
        this.status = status;
    }
    public int getStatus() {
        return status;
    }
    abstract String getTips();
}
