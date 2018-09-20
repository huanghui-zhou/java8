package test;

/**
 * Created by huang on 2018/9/19.
 */
public class github {
    public static void main(String[] agrs)throws Exception{
        System.out.println("hello world  123123---a github~~~");
        String hexstr=str2HexStr("zhouhuanghui");
        System.out.println("hexstr:"+hexstr);
        String hexstr2="800169240101000001120521248212409000020404002102589056B382F8D790736E7279B7D8C381C4A87A74F970EDE8109B1AD7F2582FFFF8F0DD299E88CD734C4444E7F82A1723B16A3C1C4F2C78C0ABCECD7C3EC41098F319C2DE0B4E262CE3CC699CE50B7541B826ABFC8C4A227E3D47C5D3F80D50143138303830323636363533313138383703104798000000000946888888888100000100001388028E185B3EE91A332C650D746CAE3BB16C7400FD6D51CAB9339B43D18FD9FD183B5ba737480258200000000000000000000000000000000000000000000000000000000000000000154CB116740155FDCC3CBB00BEA26AE5861B03791415892AE354A7E0FA82F026852171B38631B57B4B984935D23D729EA7CB9FA55FEDB612BC79533F26A56D75C95ba342c91502336CFE278CF2072D3ABAF8FFB7C570433E6D5429F74CDEA27DE060C049B873602D88C6AD156FCF3EF74F689384C6C56015387B843AA994F274C772ED93F1B9";
        String strrr=hexStr2Str(hexstr2);
        //.getBytes("ISO-8859-1")
        String str=new String(strrr.getBytes("ISO-8859-1"),"utf-8");
        System.out.println(str);
    }


    /**
     * 字符串转换成为16进制(无需Unicode编码)
     * @param str
     * @return
     */
    public static String str2HexStr(String str) {
        char[] chars = "0123456789ABCDEF".toCharArray();
        StringBuilder sb = new StringBuilder("");
        byte[] bs = str.getBytes();
        int bit;
        for (int i = 0; i < bs.length; i++) {
            bit = (bs[i] & 0x0f0) >> 4;
            sb.append(chars[bit]);
            bit = bs[i] & 0x0f;
            sb.append(chars[bit]);
            // sb.append(' ');
        }
        return sb.toString().trim();
    }
        /*16进制转为字符串

    /**
     * 16进制直接转换成为字符串(无需Unicode解码)
     * @param hexStr
     * @return
     */
    public static String hexStr2Str(String hexStr) {
        String str = "0123456789ABCDEF";
        char[] hexs = hexStr.toCharArray();
        byte[] bytes = new byte[hexStr.length() / 2];
        int n;
        for (int i = 0; i < bytes.length; i++) {
            n = str.indexOf(hexs[2 * i]) * 16;
            n += str.indexOf(hexs[2 * i + 1]);
            bytes[i] = (byte) (n & 0xff);
        }
        return new String(bytes);
    }
}
