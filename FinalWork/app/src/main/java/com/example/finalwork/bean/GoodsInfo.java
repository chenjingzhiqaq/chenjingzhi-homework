package com.example.finalwork.bean;

import com.example.finalwork.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "iphone 12", "1+8", "Redmi K30", "vivo x50", "oppo Reno5", "华为Mate40","华为nova7","华为P40"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "iPhone 12是美国苹果公司研发的iPhone手机 采用了直面边框设计 支持5G 搭载A14 Bionic芯片 双镜头后置摄像头系统",
            "一加8T是一加科技旗下的智能手机 搭载了高通骁龙865处理器 采用LPDDR4X内存和UFS3.1闪存 最高支持12GB+256GB的存储组合",
            "Redmi K30正面采用6.67英寸双挖孔全面屏 屏幕刷新率最高120Hz 提供“深海微光” “紫玉幻境” “花影惊鸿”三色",
            "vivo X50是vivo于2020年6月发布的一款5G智能手机 X50系列以“雅致”为核心设计理念，让机身非常简洁",
            "Reno5系列聚焦人像视频拍摄 首次搭载OPPOFDF全维人像视频技术系统 AI焕采视频美颜实现更自然、更精细的人像美化",
            "华为Mate40是华为研发的智能手机 搭载麒麟9000E芯片 采用6.5英寸的68度曲面屏 分辨率为2376*1080",
            "华为nova7是华为公司研发的5G手机 采用OLED屏幕 搭载麒麟985 5G SoC芯片 加入前后双景录像功能",
            "华为P40搭载麒麟990 5G SoC芯片 将处理器和基带合二为一 创新设计CPU三档能效架构、16核GPU超级集群"

    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {5499, 3259, 2398, 4598, 3545, 4659,5598,4489};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.iphone_s, R.drawable.yijia_s, R.drawable.red_s, R.drawable.vivo_s,R.drawable.oppo_s ,
            R.drawable.mate_s, R.drawable.nova_s, R.drawable.p40_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.iphone, R.drawable.yijiia,R.drawable.red, R.drawable.vivo, R.drawable.oppo,
            R.drawable.mate, R.drawable.nova, R.drawable.p40

    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
