package com.hgz.test.tuipiantuozhuaiandsuofang.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/8/23.
 */

public class Info {

    /**
     * code : 200
     * data : {"topics":[{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/170707/6r2pzk9pu.webp-w320","cover_image_url":"http://f2.kkmh.com/image/170707/slcyrhmrg.webp-w640","description":"超级怕鬼却要当阎王是什么悲伤的感受？使徒子老师超火爆力作第二季正式回归，胆小的阎王丫头不光变帅了，打怪姿势还更加酷炫了~东西方神魔齐上阵，给你超搞逗的欢乐体验！每周五晚八点第一时间独家更新，周六热推一整天！可爱阎王和你不见不散~【独家/每周五晚8点更新 责编：大树】\r\n","created_at":1465703869,"is_favourite":false,"title":"阎王不高兴","likes_count":24930656,"updated_at":1465703869,"special_offer":{},"user_id":6,"comments_count":658932,"is_free":true,"id":848,"user":{"pub_feed":1,"avatar_url":"http://f2.kkmh.com/image/150421/i26y7dz2t.jpg-w180","grade":1,"nickname":"使徒子","reg_type":"weibo","id":6},"label_id":5,"order":400,"comics_count":55,"status":"published"},{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/170622/sa725m1y4.webp-w320","cover_image_url":"http://f2.kkmh.com/image/170622/866bjp30v.webp-w640","description":"上帝跑路了？世界混乱了？米迦勒跑来人间找老相好，顺便一起拯救格世界，但转世后的路西法却不记得他了\u2026\u2026而原因却是自己封印了他的记忆和力量！现在还要让他觉醒\u2026\u2026只能#%￥#\u2026\u2026算了，自己挖的坑，哭着跪着也要埋完！【独家/每周六更新  责编：M】","created_at":1498104597,"is_favourite":false,"title":"天神没节操","likes_count":1472172,"updated_at":1498104597,"special_offer":{},"user_id":81896370,"comments_count":31077,"is_free":true,"id":1157,"user":{"pub_feed":0,"avatar_url":"http://f2.kkmh.com/image/170624/2i6pm2ylo.webp-w180","grade":1,"nickname":"菲斯娜feisna+南梵（野生组）","reg_type":"author","id":81896370},"label_id":25,"order":0,"comics_count":9,"status":"published"},{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/170704/4qbllqtdv.webp-w320","cover_image_url":"http://f2.kkmh.com/image/170703/3c0w96gm4.webp-w640","description":"这是一个贩卖回忆的旧物杂货店，每一个物品都有其主人的独家记忆。圆滑大叔带领纯洁少女，给你讲述那些被人遗忘的回忆。【独家/每周五更新 责编：听雨】","created_at":1496642287,"is_favourite":false,"title":"肆拾杂货店","likes_count":1164996,"updated_at":1496642287,"special_offer":{},"user_id":82248124,"comments_count":27872,"is_free":true,"id":1121,"user":{"pub_feed":0,"avatar_url":"http://f2.kkmh.com/default_avatar_image.jpg-w180","grade":1,"nickname":"所长别开枪是我+wuli爸爸爸爸","reg_type":"author","id":82248124},"label_id":23,"order":0,"comics_count":11,"status":"published"}],"surface_image":"http://f2.kkmh.com/"}
     * message : ok
     */

    private int code;
    private DataBean data;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static class DataBean {
        /**
         * topics : [{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/170707/6r2pzk9pu.webp-w320","cover_image_url":"http://f2.kkmh.com/image/170707/slcyrhmrg.webp-w640","description":"超级怕鬼却要当阎王是什么悲伤的感受？使徒子老师超火爆力作第二季正式回归，胆小的阎王丫头不光变帅了，打怪姿势还更加酷炫了~东西方神魔齐上阵，给你超搞逗的欢乐体验！每周五晚八点第一时间独家更新，周六热推一整天！可爱阎王和你不见不散~【独家/每周五晚8点更新 责编：大树】\r\n","created_at":1465703869,"is_favourite":false,"title":"阎王不高兴","likes_count":24930656,"updated_at":1465703869,"special_offer":{},"user_id":6,"comments_count":658932,"is_free":true,"id":848,"user":{"pub_feed":1,"avatar_url":"http://f2.kkmh.com/image/150421/i26y7dz2t.jpg-w180","grade":1,"nickname":"使徒子","reg_type":"weibo","id":6},"label_id":5,"order":400,"comics_count":55,"status":"published"},{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/170622/sa725m1y4.webp-w320","cover_image_url":"http://f2.kkmh.com/image/170622/866bjp30v.webp-w640","description":"上帝跑路了？世界混乱了？米迦勒跑来人间找老相好，顺便一起拯救格世界，但转世后的路西法却不记得他了\u2026\u2026而原因却是自己封印了他的记忆和力量！现在还要让他觉醒\u2026\u2026只能#%￥#\u2026\u2026算了，自己挖的坑，哭着跪着也要埋完！【独家/每周六更新  责编：M】","created_at":1498104597,"is_favourite":false,"title":"天神没节操","likes_count":1472172,"updated_at":1498104597,"special_offer":{},"user_id":81896370,"comments_count":31077,"is_free":true,"id":1157,"user":{"pub_feed":0,"avatar_url":"http://f2.kkmh.com/image/170624/2i6pm2ylo.webp-w180","grade":1,"nickname":"菲斯娜feisna+南梵（野生组）","reg_type":"author","id":81896370},"label_id":25,"order":0,"comics_count":9,"status":"published"},{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/170704/4qbllqtdv.webp-w320","cover_image_url":"http://f2.kkmh.com/image/170703/3c0w96gm4.webp-w640","description":"这是一个贩卖回忆的旧物杂货店，每一个物品都有其主人的独家记忆。圆滑大叔带领纯洁少女，给你讲述那些被人遗忘的回忆。【独家/每周五更新 责编：听雨】","created_at":1496642287,"is_favourite":false,"title":"肆拾杂货店","likes_count":1164996,"updated_at":1496642287,"special_offer":{},"user_id":82248124,"comments_count":27872,"is_free":true,"id":1121,"user":{"pub_feed":0,"avatar_url":"http://f2.kkmh.com/default_avatar_image.jpg-w180","grade":1,"nickname":"所长别开枪是我+wuli爸爸爸爸","reg_type":"author","id":82248124},"label_id":23,"order":0,"comics_count":11,"status":"published"}]
         * surface_image : http://f2.kkmh.com/
         */

        private String surface_image;
        private List<TopicsBean> topics;

        public String getSurface_image() {
            return surface_image;
        }

        public void setSurface_image(String surface_image) {
            this.surface_image = surface_image;
        }

        public List<TopicsBean> getTopics() {
            return topics;
        }

        public void setTopics(List<TopicsBean> topics) {
            this.topics = topics;
        }

        public static class TopicsBean {
            /**
             * discover_image_url :
             * vertical_image_url : http://f2.kkmh.com/image/170707/6r2pzk9pu.webp-w320
             * cover_image_url : http://f2.kkmh.com/image/170707/slcyrhmrg.webp-w640
             * description : 超级怕鬼却要当阎王是什么悲伤的感受？使徒子老师超火爆力作第二季正式回归，胆小的阎王丫头不光变帅了，打怪姿势还更加酷炫了~东西方神魔齐上阵，给你超搞逗的欢乐体验！每周五晚八点第一时间独家更新，周六热推一整天！可爱阎王和你不见不散~【独家/每周五晚8点更新 责编：大树】

             * created_at : 1465703869
             * is_favourite : false
             * title : 阎王不高兴
             * likes_count : 24930656
             * updated_at : 1465703869
             * special_offer : {}
             * user_id : 6
             * comments_count : 658932
             * is_free : true
             * id : 848
             * user : {"pub_feed":1,"avatar_url":"http://f2.kkmh.com/image/150421/i26y7dz2t.jpg-w180","grade":1,"nickname":"使徒子","reg_type":"weibo","id":6}
             * label_id : 5
             * order : 400
             * comics_count : 55
             * status : published
             */

            private String discover_image_url;
            private String vertical_image_url;
            private String cover_image_url;
            private String description;
            private int created_at;
            private boolean is_favourite;
            private String title;
            private int likes_count;
            private int updated_at;
            private SpecialOfferBean special_offer;
            private int user_id;
            private int comments_count;
            private boolean is_free;
            private int id;
            private UserBean user;
            private int label_id;
            private int order;
            private int comics_count;
            private String status;

            public String getDiscover_image_url() {
                return discover_image_url;
            }

            public void setDiscover_image_url(String discover_image_url) {
                this.discover_image_url = discover_image_url;
            }

            public String getVertical_image_url() {
                return vertical_image_url;
            }

            public void setVertical_image_url(String vertical_image_url) {
                this.vertical_image_url = vertical_image_url;
            }

            public String getCover_image_url() {
                return cover_image_url;
            }

            public void setCover_image_url(String cover_image_url) {
                this.cover_image_url = cover_image_url;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public int getCreated_at() {
                return created_at;
            }

            public void setCreated_at(int created_at) {
                this.created_at = created_at;
            }

            public boolean isIs_favourite() {
                return is_favourite;
            }

            public void setIs_favourite(boolean is_favourite) {
                this.is_favourite = is_favourite;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getLikes_count() {
                return likes_count;
            }

            public void setLikes_count(int likes_count) {
                this.likes_count = likes_count;
            }

            public int getUpdated_at() {
                return updated_at;
            }

            public void setUpdated_at(int updated_at) {
                this.updated_at = updated_at;
            }

            public SpecialOfferBean getSpecial_offer() {
                return special_offer;
            }

            public void setSpecial_offer(SpecialOfferBean special_offer) {
                this.special_offer = special_offer;
            }

            public int getUser_id() {
                return user_id;
            }

            public void setUser_id(int user_id) {
                this.user_id = user_id;
            }

            public int getComments_count() {
                return comments_count;
            }

            public void setComments_count(int comments_count) {
                this.comments_count = comments_count;
            }

            public boolean isIs_free() {
                return is_free;
            }

            public void setIs_free(boolean is_free) {
                this.is_free = is_free;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public UserBean getUser() {
                return user;
            }

            public void setUser(UserBean user) {
                this.user = user;
            }

            public int getLabel_id() {
                return label_id;
            }

            public void setLabel_id(int label_id) {
                this.label_id = label_id;
            }

            public int getOrder() {
                return order;
            }

            public void setOrder(int order) {
                this.order = order;
            }

            public int getComics_count() {
                return comics_count;
            }

            public void setComics_count(int comics_count) {
                this.comics_count = comics_count;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public static class SpecialOfferBean {
            }

            public static class UserBean {
                /**
                 * pub_feed : 1
                 * avatar_url : http://f2.kkmh.com/image/150421/i26y7dz2t.jpg-w180
                 * grade : 1
                 * nickname : 使徒子
                 * reg_type : weibo
                 * id : 6
                 */

                private int pub_feed;
                private String avatar_url;
                private int grade;
                private String nickname;
                private String reg_type;
                private int id;

                public int getPub_feed() {
                    return pub_feed;
                }

                public void setPub_feed(int pub_feed) {
                    this.pub_feed = pub_feed;
                }

                public String getAvatar_url() {
                    return avatar_url;
                }

                public void setAvatar_url(String avatar_url) {
                    this.avatar_url = avatar_url;
                }

                public int getGrade() {
                    return grade;
                }

                public void setGrade(int grade) {
                    this.grade = grade;
                }

                public String getNickname() {
                    return nickname;
                }

                public void setNickname(String nickname) {
                    this.nickname = nickname;
                }

                public String getReg_type() {
                    return reg_type;
                }

                public void setReg_type(String reg_type) {
                    this.reg_type = reg_type;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }
            }
        }
    }
}
