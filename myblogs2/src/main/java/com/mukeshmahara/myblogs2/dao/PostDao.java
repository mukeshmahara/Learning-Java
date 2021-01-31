package com.mukeshmahara.myblogs2.dao;

import com.mukeshmahara.myblogs2.entities.Category;
import com.mukeshmahara.myblogs2.entities.Post;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PostDao {

    Connection con;

    public PostDao(Connection con) {
        this.con = con;
    }

    public ArrayList<Category> getAllCategories() {

        ArrayList<Category> list = new ArrayList<>();
        try {
            String sql = "select * from categories";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int cid = rs.getInt("cid");
                String name = rs.getString("name");
                String description = rs.getString("description");
                Category c = new Category(cid, name, description);
                list.add(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }


    public boolean savePost(Post post) {
        boolean f = false;
        try {

            String sql = "insert into post(ptitle,pcontent,pic,created_at,cid,uid) value (?,?,?,current_timestamp,?,?)";

            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setString(1, post.getPtitle());
            psmt.setString(2, post.getPcontent());
            psmt.setString(3, post.getPic());
            psmt.setInt(4, post.getCid());
            psmt.setInt(5, post.getUid());
            psmt.executeUpdate();
            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }


        return f;

    }

    //Getting all the post
    public List<Post> getAllPosts() {

//        fetch all the post

        List<Post> all_Post_list = new ArrayList<>();

        try{

            String sql = "select * from post order by pid desc ";
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while(rs.next()){
                int pid = rs.getInt("pid");
                String ptitle = rs.getString("ptitle");
                String pcontent = rs.getString("pcontent");
                String pPic = rs.getString("pic");
                Timestamp created_at = rs.getTimestamp("created_at");
                int cid = rs.getInt("cid");
                int uid = rs.getInt("uid");
                Post post = new Post(pid,ptitle,pcontent,pPic,created_at,cid,uid);

                all_Post_list.add(post);


            }

        }catch (Exception e){
            e.printStackTrace();
        }


        return all_Post_list;

    }
//    Get Post by Post Id
    public List<Post> getPostByPostId(int pid){
        String sql =" Select * from post where pid = ?";
        List<Post> list = new ArrayList<>();
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1,pid);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()){
                String pContent = rs.getString("pcontent");
                String pPic  =rs.getString("pic");
                String pTitle = rs.getString("ptitle");
                int cid = rs.getInt("cid");
                int uid =rs.getInt("uid");

                Post post = new Post(pTitle,pContent,pPic,null,cid,uid);
                list.add(post);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return list;
    }

    //Get all post by category Id
    public List<Post> getPostById(int cid) {
        //fetching all post by id
        List<Post> post_By_Id_List = new ArrayList<>();

        try{

            String sql = "select * from post where cid= ?";

            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1,cid);
            ResultSet rs = pstmt.executeQuery();

            while(rs.next()){
                int post_id = rs.getInt("pid");
                String ptitle = rs.getString("ptitle");
                String pcontent = rs.getString("pcontent");
                String pPic = rs.getString("pic");
                Timestamp created_at = rs.getTimestamp("created_at");
//                int cid = rs.getInt("cid");
                int uid = rs.getInt("uid");
                Post post = new Post(post_id,ptitle,pcontent,pPic,created_at,cid,uid);

                post_By_Id_List.add(post);


            }

        }catch (Exception e){
            e.printStackTrace();
        }


        return post_By_Id_List;

    }

}
