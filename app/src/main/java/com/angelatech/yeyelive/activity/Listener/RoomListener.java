package com.angelatech.yeyelive.activity.Listener;

/**
 * User: cbl
 * Date: 2016/8/19
 * Time: 10:11
 * 房间操作
 */
public interface RoomListener {
    void onBeginLive();//开始直播
    void endBeginLive();//结束直播
    void onSendGift(); //发送礼物
    void onSendMessage();//发送聊天
    void onSwitchCamera();//切换摄像头
    void onShowUser(); //显示用户信息
    void onRunLove();//点赞
    void onShowInput();//显示输入框
    void onShowGiftList();//展示礼物列表
}
