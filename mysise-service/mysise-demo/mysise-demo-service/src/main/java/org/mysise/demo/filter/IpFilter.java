package org.mysise.demo.filter;

import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.*;
import lombok.extern.slf4j.Slf4j;

@Activate
@Slf4j
public class IpFilter implements Filter {
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        log.info("调用");
        Result result =  invoker.invoke(invocation);
        return result;
    }
}
