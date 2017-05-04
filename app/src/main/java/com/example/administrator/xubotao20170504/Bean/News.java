package com.example.administrator.xubotao20170504.Bean;

import java.util.List;

/**
 * 用途：
 * 作者：xuBoTao
 * 时间：2017/5/4 09:43
 */

public class News {

    /**
     * date : 20170504
     * stories : [{"images":["https://pic4.zhimg.com/v2-28a1f0995db906b38f2b8fda0f066bc3.jpg"],"type":0,"id":9397552,"ga_prefix":"050409","title":"「一滴血验癌症」不靠谱，但肿瘤标志物可不能不当回事"},{"images":["https://pic2.zhimg.com/v2-630ae9633f831522bfb1bf212baf43f1.jpg"],"type":0,"id":9397241,"ga_prefix":"050408","title":"学校的卫生让学生无偿负责，这「合法」吗？"},{"images":["https://pic1.zhimg.com/v2-1b620e561af3feb96b95390823f40594.jpg"],"type":0,"id":9397808,"ga_prefix":"050407","title":"转折发生在 1902 年，爱因斯坦通过找关系，做了公务员"},{"images":["https://pic1.zhimg.com/v2-f058eeb1dfd94f518105f2c802e4905c.jpg"],"type":0,"id":9397947,"ga_prefix":"050407","title":"那些看不懂的商店和品牌忽然火了，消费者到底想要什么？"},{"images":["https://pic3.zhimg.com/v2-871fe9bd77ddcc0bf7b534a660bfe432.jpg"],"type":0,"id":9397829,"ga_prefix":"050407","title":"背负巨债、网吧终日、没有身份证、断绝家人往来：「三和大神」们的游戏与人生"},{"images":["https://pic2.zhimg.com/v2-dd2099aff566b37503e6e0aff3e7afad.jpg"],"type":0,"id":9395948,"ga_prefix":"050406","title":"瞎扯 · 如何正确地吐槽"}]
     * top_stories : [{"image":"https://pic1.zhimg.com/v2-20a52d17e71f83b8b4ea4103ab300b54.jpg","type":0,"id":9397808,"ga_prefix":"050407","title":"转折发生在 1902 年，爱因斯坦通过找关系，做了公务员"},{"image":"https://pic1.zhimg.com/v2-12259f67d1a800e4c88c48d7141b6a98.jpg","type":0,"id":9397829,"ga_prefix":"050407","title":"背负巨债、网吧终日、没有身份证、断绝家人往来：「三和大神」们的游戏与人生"},{"image":"https://pic3.zhimg.com/v2-004d5a8e661f21a840056ee8844538da.jpg","type":0,"id":9397225,"ga_prefix":"050314","title":"微软的 Surface 系列，终于有了一款不能拆开的传统笔记本"},{"image":"https://pic2.zhimg.com/v2-52fb0c14562378702acc02840810d3dd.jpg","type":0,"id":9396136,"ga_prefix":"050307","title":"我要是巴菲特，也会偏爱这个行业"},{"image":"https://pic3.zhimg.com/v2-430ce94c5a87e98a7ed7a2d20f0ca85e.jpg","type":0,"id":9383848,"ga_prefix":"042706","title":"这里是广告 · 从电影的世界里看 AI"}]
     */

    private String date;
    private List<StoriesBean> stories;
    private List<TopStoriesBean> top_stories;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<StoriesBean> getStories() {
        return stories;
    }

    public void setStories(List<StoriesBean> stories) {
        this.stories = stories;
    }

    public List<TopStoriesBean> getTop_stories() {
        return top_stories;
    }

    public void setTop_stories(List<TopStoriesBean> top_stories) {
        this.top_stories = top_stories;
    }

    public static class StoriesBean {
        /**
         * images : ["https://pic4.zhimg.com/v2-28a1f0995db906b38f2b8fda0f066bc3.jpg"]
         * type : 0
         * id : 9397552
         * ga_prefix : 050409
         * title : 「一滴血验癌症」不靠谱，但肿瘤标志物可不能不当回事
         */

        private int type;
        private int id;
        private String ga_prefix;
        private String title;
        private List<String> images;

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }

    public static class TopStoriesBean {
        /**
         * image : https://pic1.zhimg.com/v2-20a52d17e71f83b8b4ea4103ab300b54.jpg
         * type : 0
         * id : 9397808
         * ga_prefix : 050407
         * title : 转折发生在 1902 年，爱因斯坦通过找关系，做了公务员
         */

        private String image;
        private int type;
        private int id;
        private String ga_prefix;
        private String title;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
