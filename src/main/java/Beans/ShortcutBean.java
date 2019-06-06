package Beans;

/*
  Author: Jarcem
  Date: 2019/5/25
  Time: 17:55
  Purpose: 快捷方式
*/

public class ShortcutBean {
    private int shortcut_id;
    private String shortcut_name;
    private String shortcut_image;
    private int shortcut_target_mode;
    private int shortcut_target;

    public ShortcutBean() {
    }

    public int getShortcut_id() {
        return shortcut_id;
    }

    public void setShortcut_id(int shortcut_id) {
        this.shortcut_id = shortcut_id;
    }

    public String getShortcut_name() {
        return shortcut_name;
    }

    public void setShortcut_name(String shortcut_name) {
        this.shortcut_name = shortcut_name;
    }

    public String getShortcut_image() {
        return shortcut_image;
    }

    public void setShortcut_image(String shortcut_image) {
        this.shortcut_image = shortcut_image;
    }

    public int getShortcut_target_mode() {
        return shortcut_target_mode;
    }

    public void setShortcut_target_mode(int shortcut_target_mode) {
        this.shortcut_target_mode = shortcut_target_mode;
    }

    public int getShortcut_target() {
        return shortcut_target;
    }

    public void setShortcut_target(int shortcut_target) {
        this.shortcut_target = shortcut_target;
    }
}
