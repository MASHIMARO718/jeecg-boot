package org.jeecg.modules.system.rule;

import com.alibaba.fastjson.JSONObject;
import org.apache.shiro.SecurityUtils;
import org.jeecg.common.handler.IFillRuleHandler;
import org.jeecg.common.system.vo.LoginUser;

/**
 * @ClassName SysUserCode
 * @Description TODO
 * @Author mhJiang
 * @Date 2020/10/22 13:33
 * @Version 1.0
 */
public class SysUserName implements IFillRuleHandler {
    @Override
    public Object execute(JSONObject params, JSONObject formData) {
        // 获取登录用户信息
        LoginUser sysUser = (LoginUser) SecurityUtils.getSubject().getPrincipal();
        return sysUser.getRealname();
    }
}
