package com.ysr.common.security;


 /** 加解密方法的封装类
  *  Created by ysr on 2017/2/3 上午10:24.
  *  邮箱 ysr200808@163.com
  */
public class CodeSecurity {

    public static final String desEncode(String str){
        return DESBase64Util.encodeInfo(str);
    }


    public static final String desDecodeInfo(String str){
        return DESBase64Util.decodeInfo(str);
    }

    /**
     * AES解码
     * @param str
     * @return
     */
    public static final String aesDecodeInfo(String str){
        String result = "";
        try {
            result = AESUtil.Decrypt(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * AES编码
     * @param str
     * @return
     */
    public static final String aesEncode(String str){
        String result = "";
        try {
            result = AESUtil.Encrypt(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static final String myEncode(String str){
        return aesEncode(str);
    }

    public static final String myDecode(String str){
        return aesDecodeInfo(str);
    }

}
