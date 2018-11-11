package com.example.hp.hbd_shiva;

public class DataModel {


        String text1;
        String text2;
        int img;

        public DataModel(String text1, String text2,int img ) {
            this.text1=text1;
            this.text2=text2;

            this.img=img;

        }

        public String gettext1() {
            return text1;
        }

        public String gettext2() {
            return text2;
        }



        public int getimg() {
            return img;
        }


}
