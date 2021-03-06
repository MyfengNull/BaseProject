package com.ysr.photopicker.bean;

import java.util.List;

 /**
  *  Created by ysr on 2017/2/3 下午12:28.
  *  邮箱 ysr200808@163.com
  */
public class Folder {

    public String name;
    public String path;
    public Image cover;
    public List<Image> images;

    public boolean isAll = false;

    public Folder(){

    }

    public Folder(boolean isAll){
        this.isAll = isAll;
    }

    @Override
    public boolean equals(Object o) {
        try {
            Folder other = (Folder) o;
            return this.path.equalsIgnoreCase(other.path);
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
        return super.equals(o);
    }
}