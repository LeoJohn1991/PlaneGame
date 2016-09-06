package com.mingjalee.plane;

import com.mingjalee.util.GameUtil;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * 游戏飞机类
 * @author jerry
 * @create 16/9/6 00:53
 */
public class Plane {
    //属性:图片,坐标,移动速度,移动角度; 方法:构造,绘制,移动。后期需要图片宽高,方向

    Image img;
    double x;
    double y;
    double speed = 10;
    double degree;

    public Plane(){

    }

    public Plane(String imgPath, double x, double y) {
        this(GameUtil.getImage(imgPath), x, y);
    }

    public Plane(Image img, double x, double y) {
        this.img = img;

        this.x = x;
        this.y = y;
    }

    /**
     * 绘制飞机到画布
     */
    public void draw(Graphics g) {
        g.drawImage(img, (int)x, (int)y, null);


    }

    /**
     * 飞机移动位置
     */
    public void move(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                y -= speed;
                break;
            case KeyEvent.VK_DOWN:
                y += speed;
                break;
            case KeyEvent.VK_LEFT:
                x -= speed;
                break;
            case KeyEvent.VK_RIGHT:
                x += speed;
                break;
            default:
                break;
        }
    }
}









