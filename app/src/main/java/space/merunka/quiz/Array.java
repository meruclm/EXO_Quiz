package space.merunka.quiz;

public class Array {

    //Массив для первого уровня - начало
    final int[] images1 = {
            R.drawable.name_sehun,
            R.drawable.name_kai,
            R.drawable.name_do,
            R.drawable.name_chanyeol,
            R.drawable.name_chen,
            R.drawable.name_baekhyun,
            R.drawable.name_lay,
            R.drawable.name_suho,
            R.drawable.name_xiumin
    };

    final int[] texts1 = {
            R.string.lvl1text0,
            R.string.lvl1text1,
            R.string.lvl1text2,
            R.string.lvl1text3,
            R.string.lvl1text4,
            R.string.lvl1text5,
            R.string.lvl1text6,
            R.string.lvl1text7,
            R.string.lvl1text8,
    };
    //Массив для первого уровня - конец

    final int[] images2 = {
            R.drawable.power_sehun_,
            R.drawable.power_kai_,
            R.drawable.power_do_,
            R.drawable.power_chan_,
            R.drawable.power_chen_,
            R.drawable.power_baek_,
            R.drawable.power_lay_,
            R.drawable.power_suho_,
            R.drawable.power_xiumin_,
    };

    final int[] images3 = {
            R.drawable.eye_sehun,
            R.drawable.eye_kai,
            R.drawable.eye_do,
            R.drawable.eye_chan,
            R.drawable.eye_chen,
            R.drawable.eye_baek,
            R.drawable.eye_lay,
            R.drawable.eye_suho,
            R.drawable.eye_xiu,
    };

    final int[] strong = {
        1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0
    };

    final int[] images_se = {
            R.drawable.se_1_,
            R.drawable.kai_8_,
            R.drawable.se_2_,
            R.drawable.do_8_,
            R.drawable.se_3_,
            R.drawable.chan_8_,
            R.drawable.se_4_,
            R.drawable.chen_8_,
            R.drawable.se_5_,
            R.drawable.baek_8_,
            R.drawable.se_6_,
            R.drawable.lay_8_,
            R.drawable.se_7_,
            R.drawable.suho_8_,
            R.drawable.se_8_,
            R.drawable.xiu_8_
    };

    final int[] images_chen = {
            R.drawable.chen_1_,
            R.drawable.kai_4_,
            R.drawable.chen_2_,
            R.drawable.do_7_,
            R.drawable.chen_3_,
            R.drawable.chan_7_,
            R.drawable.chen_4_,
            R.drawable.se_7_,
            R.drawable.chen_5_,
            R.drawable.baek_7_,
            R.drawable.chen_6_,
            R.drawable.lay_7_,
            R.drawable.chen_7_,
            R.drawable.suho_7_,
            R.drawable.chen_8_,
            R.drawable.xiu_7_
    };

    final int[] images_lay = {
            R.drawable.lay_1_,
            R.drawable.kai_6_,
            R.drawable.lay_2_,
            R.drawable.do_6_,
            R.drawable.lay_3_,
            R.drawable.chan_6_,
            R.drawable.lay_4_,
            R.drawable.se_6_,
            R.drawable.lay_5_,
            R.drawable.baek_6_,
            R.drawable.lay_6_,
            R.drawable.chen_6_,
            R.drawable.lay_7_,
            R.drawable.suho_6_,
            R.drawable.lay_8_,
            R.drawable.xiu_6_
    };

    final int[] images_do = {
            R.drawable.do_1_,
            R.drawable.kai_5_,
            R.drawable.do_2_,
            R.drawable.lay_5_,
            R.drawable.do_3_,
            R.drawable.chan_5_,
            R.drawable.do_4_,
            R.drawable.se_5_,
            R.drawable.do_5_,
            R.drawable.baek_5_,
            R.drawable.do_6_,
            R.drawable.chen_5_,
            R.drawable.do_7_,
            R.drawable.suho_5_,
            R.drawable.do_8_,
            R.drawable.xiu_5_,
    };

    final int[] images_xiu = {
            R.drawable.xiu_1_,
            R.drawable.kai_4_,
            R.drawable.xiu_2_,
            R.drawable.lay_4_,
            R.drawable.xiu_3_,
            R.drawable.chan_4_,
            R.drawable.xiu_4_,
            R.drawable.se_4_,
            R.drawable.xiu_5_,
            R.drawable.baek_4_,
            R.drawable.xiu_6_,
            R.drawable.chen_4_,
            R.drawable.xiu_7_,
            R.drawable.suho_4_,
            R.drawable.xiu_8_,
            R.drawable.do_4_,
    };

    final int[] images_baek = {
            R.drawable.baek_1_,
            R.drawable.kai_3_,
            R.drawable.baek_2_,
            R.drawable.lay_3_,
            R.drawable.baek_3_,
            R.drawable.chan_3_,
            R.drawable.baek_4_,
            R.drawable.se_3_,
            R.drawable.baek_5_,
            R.drawable.xiu_3_,
            R.drawable.baek_6_,
            R.drawable.chen_3_,
            R.drawable.baek_7_,
            R.drawable.suho_3_,
            R.drawable.baek_8_,
            R.drawable.do_3_,
    };

    final int[] images_suho = {
            R.drawable.suho_1_,
            R.drawable.kai_2_,
            R.drawable.suho_2_,
            R.drawable.lay_2_,
            R.drawable.suho_3_,
            R.drawable.chan_2_,
            R.drawable.suho_4_,
            R.drawable.se_2_,
            R.drawable.suho_5_,
            R.drawable.xiu_2_,
            R.drawable.suho_6_,
            R.drawable.chen_2_,
            R.drawable.suho_7_,
            R.drawable.baek_2_,
            R.drawable.suho_8_,
            R.drawable.do_2_,
    };
    final int[] images_kai = {
            R.drawable.kai_1_,
            R.drawable.suho_1_,
            R.drawable.kai_2_,
            R.drawable.lay_1_,
            R.drawable.kai_3_,
            R.drawable.chan_1_,
            R.drawable.kai_4_,
            R.drawable.se_1_,
            R.drawable.kai_5_,
            R.drawable.xiu_1_,
            R.drawable.kai_6_,
            R.drawable.chen_1_,
            R.drawable.kai_7_,
            R.drawable.baek_1_,
            R.drawable.kai_8_,
            R.drawable.do_1_,
    };

    final int[] images_chan = {
            R.drawable.chan_1_,
            R.drawable.suho_8_,
            R.drawable.chan_2_,
            R.drawable.lay_5_,
            R.drawable.chan_3_,
            R.drawable.kai_8_,
            R.drawable.chan_4_,
            R.drawable.se_7_,
            R.drawable.chan_5_,
            R.drawable.xiu_2_,
            R.drawable.chan_6_,
            R.drawable.chen_8_,
            R.drawable.chan_7_,
            R.drawable.baek_4_,
            R.drawable.chan_8_,
            R.drawable.do_7_,
    };
}
