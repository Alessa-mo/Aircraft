package com.hit.sz.application;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.hit.sz.R;
import com.hit.sz.prop.PropImmune;
import com.hit.sz.aircraft.Boss;
import com.hit.sz.aircraft.EliteEnemy;
import com.hit.sz.aircraft.HeroAircraft;
import com.hit.sz.aircraft.MobEnemy;
import com.hit.sz.bullet.EnemyBullet;
import com.hit.sz.bullet.HeroBullet;
import com.hit.sz.prop.PropBlood;
import com.hit.sz.prop.PropBomb;
import com.hit.sz.prop.PropBullet;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 综合管理图片的加载，访问
 * 提供图片的静态访问方法
 *
 * @author hitsz
 */
public class ImageManager {

    /**
     * 类名-图片 映射，存储各基类的图片 <br>
     * 可使用 CLASSNAME_IMAGE_MAP.get( obj.getClass().getName() ) 获得 obj 所属基类对应的图片
     */
    private static final Map<String, Bitmap> CLASSNAME_IMAGE_MAP = new HashMap<>();

    public static Bitmap BACKGROUND_IMAGE = BitmapFactory.decodeFile("bg.jpg");
    public static Bitmap BACKGROUND_IMAGE_SIMPLE = BitmapFactory.decodeFile("bg2.jpg");
    public static Bitmap BACKGROUND_IMAGE_DIFFICULT = BitmapFactory.decodeFile("bg5.jpg");
    public static Bitmap BACKGROUND_IMAGE_NORMAL = BitmapFactory.decodeFile("bg4.jpg");
    public static Bitmap HERO_IMAGE = BitmapFactory.decodeFile("hero.jpg");
    public static Bitmap HERO_BULLET_IMAGE = BitmapFactory.decodeFile("bullet_hero.jpg");
    public static Bitmap ENEMY_BULLET_IMAGE = BitmapFactory.decodeFile("bullet_enemy.jpg");
    public static Bitmap MOB_ENEMY_IMAGE = BitmapFactory.decodeFile("mob.jpg");
    public static Bitmap ELITE_ENEMY_IMAGE = BitmapFactory.decodeFile("elite.jpg");
    public static Bitmap BOSS_IMAGE = BitmapFactory.decodeFile("boss.jpg");
    public static Bitmap PROP_BLOOD_IMAGE = BitmapFactory.decodeFile("prop_blood.jpg");
    public static Bitmap PROP_BOMB_IMAGE = BitmapFactory.decodeFile("prop_bomb.jpg");
    public static Bitmap PROP_BULLET_IMAGE = BitmapFactory.decodeFile("prop_bullet.jpg");
    public static Bitmap PROP_IMMUNE_IMAGE = BitmapFactory.decodeFile("prop_immune.jpg");

    public static Context context = null;
    public void setImageManager(Context context){
        ImageManager.context = context;
    }

    static {
        try {

            BACKGROUND_IMAGE = BitmapFactory.decodeResource(context.getResources(), R.drawable.bg);
            BACKGROUND_IMAGE_SIMPLE = BitmapFactory.decodeResource(context.getResources(), R.drawable.bg2);
            BACKGROUND_IMAGE_DIFFICULT = BitmapFactory.decodeResource(context.getResources(), R.drawable.bg5);
            BACKGROUND_IMAGE_NORMAL = BitmapFactory.decodeResource(context.getResources(), R.drawable.bg4);
            HERO_IMAGE = BitmapFactory.decodeResource(context.getResources(), R.drawable.hero);
            MOB_ENEMY_IMAGE = BitmapFactory.decodeResource(context.getResources(), R.drawable.mob);
            HERO_BULLET_IMAGE = BitmapFactory.decodeResource(context.getResources(), R.drawable.bullet_hero);
            ENEMY_BULLET_IMAGE = BitmapFactory.decodeResource(context.getResources(), R.drawable.bullet_enemy);
            ELITE_ENEMY_IMAGE = BitmapFactory.decodeResource(context.getResources(), R.drawable.elite);
            BOSS_IMAGE = BitmapFactory.decodeResource(context.getResources(), R.drawable.boss);
            PROP_BLOOD_IMAGE = BitmapFactory.decodeResource(context.getResources(), R.drawable.prop_blood);
            PROP_BOMB_IMAGE = BitmapFactory.decodeResource(context.getResources(), R.drawable.prop_bomb);
            PROP_BULLET_IMAGE = BitmapFactory.decodeResource(context.getResources(), R.drawable.prop_bullet));
            PROP_IMMUNE_IMAGE = BitmapFactory.decodeResource(context.getResources(), R.drawable.prop_immune);

            CLASSNAME_IMAGE_MAP.put(HeroAircraft.class.getName(), HERO_IMAGE);
            CLASSNAME_IMAGE_MAP.put(MobEnemy.class.getName(), MOB_ENEMY_IMAGE);
            CLASSNAME_IMAGE_MAP.put(HeroBullet.class.getName(), HERO_BULLET_IMAGE);
            CLASSNAME_IMAGE_MAP.put(EnemyBullet.class.getName(), ENEMY_BULLET_IMAGE);
            CLASSNAME_IMAGE_MAP.put(EliteEnemy.class.getName(), ELITE_ENEMY_IMAGE);
            CLASSNAME_IMAGE_MAP.put(Boss.class.getName(), BOSS_IMAGE);
            CLASSNAME_IMAGE_MAP.put(PropBlood.class.getName(), PROP_BLOOD_IMAGE);
            CLASSNAME_IMAGE_MAP.put(PropBomb.class.getName(), PROP_BOMB_IMAGE);
            CLASSNAME_IMAGE_MAP.put(PropBullet.class.getName(), PROP_BULLET_IMAGE);
            CLASSNAME_IMAGE_MAP.put(PropImmune.class.getName(), PROP_IMMUNE_IMAGE);

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }

    public static Bitmap get(String className){
        return CLASSNAME_IMAGE_MAP.get(className);
    }

    public static Bitmap get(Object obj){
        if (obj == null){
            return null;
        }
        return get(obj.getClass().getName());
    }
}