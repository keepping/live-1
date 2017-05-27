package com.angelatech.yeyelive;

import org.junit.Test;

/**
 * User: cbl
 * Date: 2016/7/20
 * Time: 14:25
 */
public class ConstantTest {


    private GooglePayHelper mGooglePayHelper;

    private String client_id = "344051845338-3tplbak7ietkifbvdnan94u891eod77s.apps.googleusercontent.com";
    private String client_secret = "ddrqpDF3C7ao0jMjC4E7Q-kb";
    private String redirect_uri = "http://liveapi.iamyeye.com/oauth2callback";
    private String authorizationCode = "4/v6xFJaKMfQPKEsSGDDtIJC52vdlb4sR6VciMQZh7MGA#";//授权code
    private String refresh_token = "1/RkXZq7WbCSvAbLImHmy9ET0B2ehfP2nyM-bnufe_usU";

    @Test
    public void test1() {
        //System.out.println(Base64.encodeToString(md.digest(), Base64.DEFAULT));
    }

    public void testGetToken() {
        mGooglePayHelper.getRefreshToken(authorizationCode);
    }
}