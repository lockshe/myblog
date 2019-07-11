package ynu.myblog.entity;


import java.util.List;

public class Category {
    private int id;
    private String name;
    private int pid;


    private List<Category> categoryList;

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
