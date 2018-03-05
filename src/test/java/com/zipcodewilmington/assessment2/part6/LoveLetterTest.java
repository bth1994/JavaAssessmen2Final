package com.zipcodewilmington.assessment2.part6;

import org.junit.Assert;
import org.junit.Test;

public class LoveLetterTest {

    @Test
    public void mysteryTest1(){
        LoveLetter loveLetter = new LoveLetter();
        String[] input = {"abc", "abcba", "abcd"};
        Integer[] expected = {2,0,4};
        Integer[] actual = loveLetter.mystery(input);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void mysteryTest2(){
        LoveLetter loveLetter = new LoveLetter();
        String[] input = {"vpllamwr","kfa","hffv","zycfjuvrhxf","fdjsqlgmcux"};
        Integer[] expected = {23,10,14,50,58};
        Integer[] actual = loveLetter.mystery(input);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void mysteryTest3(){
        LoveLetter loveLetter = new LoveLetter();
        String[] input = {
            "dbyjtjudxvtyfwj",
            "xxgtmycoggtgwrhbuhkpqeuqboojkxnhwtcktebbkwjgnqhkxrzqxugbkwkuvzdtvffolgsvdbdsukcrdejcapdknngkpldksjadrsawwdpqptjuxtwzkclyrrkgeoqwztbqndnjgebxxltxeqwqukonbbuirmgqfiitnxeubgtbrnaxfynbieomfiuwxaoekyzyweuzmnafcachbrijxzvehpcgqqlcpmansumekpjmrnwshgcefxjpplvheijtvkgneuuqjddbtbtahvgnvremfztjkcefmmutgolquotprmpzkxohpstutmfdojkdxfydvjvpaoerdvspviwmapiwdnztykyvrwaoiwekmkdriwgfgcrhtzfymeskqqhjphyzfejsqmlyksfrwwasvfqjjkvcbclskjrppcjgovgzpmslisdgxwrignkjryddjuvzyehnbnoqzgekajsxfjho",
            "uzosdrdzmeytlluzbnajrmjaeiiopwklxafaujainybblyconcxepggtqqjfoutmwymqjobzocabccppgm",
            "vuerkuasjwlxvlllvaouorwqvaflguieomxzjxrswerrpcekctgtmelhequlmfrbroaantujxncmqhzucfnokyxqrubdzugqiit",
            "bpfadknvropttdjfdgwuazazugsepnaseithsielwugrzpzcvvzywzzsftxwgzplhiubqzmotsfsjewhbvfauescyragrptazocrpqfklneutabxwixsprwpjxvcoreofifwzngmckgvmkskupfjjbasaywppafujmskzywbke",
            "wqrjljowspxmsvkjkkogvcyheydhikggaypnjdkbvhnpcxyojowhquouuuceeimgicurheuenjtritfshbbyxpsrlwxpfjwpnsjxwdbjnxaxqhryisyhkqavnxnuillwdutzywkntkkmtckbuikga",
            "cpjplraxnfrierfqeycrkvtwypgiwjuaydrmwrjkycscuxuaywrirkhpcnzawtaxyrjukugiwzmqygtwckhvxomzdlzagbzgsiacchmaiytigmhkwoftetuhetjmuisosuswbexlequk",
            "bwarbwvuqeamomiygzrbrneymqecmripnjgrhdnzhonxcwwlxpmocqopittukcjxnrouucvesjdwhzheqtutmjkuefrohcnwuesqiouaxyygzgkqbglnrvkvadlkfzgbfzunpopoonuqtgixmtmeqwbsbncholktmegbvxplklbgrjddepjwolppytyogjhsppvkmmwyxzeoljsrbdorodgoyhcfslzhavuohqnfrttcfnugrkxhpfwnmysekuompibwaqdrjzwqmswfcvnrbleplzuxtikksnisfmjqlfhzxdfzbuscfxrsynqtxcdprlhwxrmkytkyzrzalscspvmplciienaxyhtyagibzuzylyayqeshcfwnhgvotxlsfhshnaioxhpigpjwubewgclqjigcgtwlaounrdeoktyqkhpgjverxpjiypnejjrlalbrqfhbaftknkryfvrflbplscrdokpoxqhoxopxtkhiva",
            "cyahjdxwvbnzpxqdugmifazcuklehonjmprxsqtntiojheobmbmrbnvxzhcgvrqhgjeybznuhcfoiurvxfoatkastebovrxbcdbdeqzlufbdbsayyqataanteojzhicjnforwocqvdtwyvwymwtoxgkbxtdeefqrngjjwnzrtvptslreiktfsfipylwetoyguhprwqkpnakglbmtnfaikjxluvrpjpvgymzvfjmslxyxalsqsvyfexsavlsebnkzcjwhvlbgkcfmpachvcobcibxutbxjoynxvwuixbsbieqijafnogpxkmtfqqqeoddlbytbbncjstudtzqjggisubxkroqitutvunwxayiurcxmcqwkwecsizdzpvhjpbelqaisarnuvmgzcejajnttpysgtcplftwxvhp",
            "acqvpyvtdguowphnnbtidjtkeshcbxabbsyqqtmvcijaxsnmugwz"
        };
        Integer[] expected = {76,2018,350,385,773,760,586,2067,1916,197};
        Integer[] actual = loveLetter.mystery(input);
        Assert.assertArrayEquals(expected, actual);
    }


}
