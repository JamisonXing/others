package cn.jamison.enumerations;

import com.sun.org.apache.xpath.internal.operations.Or;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@Slf4j
public class OrderStatusEnumTest {

    @Test
    public void testGetStatus() {
        assertEquals(0, OrderStatusEnum.WAIT_PAY.getStatus());
        assertEquals(1, OrderStatusEnum.PAY_SUCCESS.getStatus());
        assertEquals(2, OrderStatusEnum.COMPLETED.getStatus());
        assertEquals(3, OrderStatusEnum.CANCEL.getStatus());
    }

    @Test
    public void compareEnum() {
        OrderStatusEnum paySuccess = OrderStatusEnum.PAY_SUCCESS;
        OrderStatusEnum cancel = OrderStatusEnum.CANCEL;
        if(paySuccess == cancel) {
            log.info("值相等");
        }else {
            log.info("值不相等");
        }
    }

    @Test
    public void abstractTips() {
        assertEquals(OrderStatusEnum.PAY_SUCCESS.getTips(), "支付成功");
    }

    @Test
    public void defaultMethod() {
        log.info(Arrays.toString(OrderStatusEnum.values()));
        log.info(String.valueOf(OrderStatusEnum.valueOf("PAY_SUCCESS")));
    }
}
