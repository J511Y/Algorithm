package programmers;

import java.util.Arrays;

// https://programmers.co.kr/learn/courses/30/lessons/12904
// 가장 긴 팰린드롬
public class prgmers_12904 {
	static byte[] arr;
	static boolean isPalindrom(int s, int e) {
		int mid = (e - s + 1) / 2;
		for(int i = 0; i < mid; i++) {
			if(arr[s + i] != arr[e - i]) return false;
		}
		return true;
	}
	static public int solution(String s){
        int n = s.length();
        arr = s.getBytes();
        for(int i = n; i > 0; i--) {
        	for(int j = 0; j + i <= n; j++) {
        		if(isPalindrom(j, j + i - 1)) return i;
        	}
        }
        return 1;
    }
	public static void main(String[] args) {
		System.out.println(solution("abcdcba"));
		System.out.println(solution("abacde"));
		String s = "";
		for(int i = 0; i < 2500; i++) s += (char)('a' + (int)(Math.random() * 26));
//		System.out.println(s);
		System.out.println(solution("ayzbqboxyduozmcmrbogmnaojxeacmtdqtkmqwispdhxbrmodwodsxuyldqoafsjnreegfmcodzabwbtrqjphszuedcxflpuvsxzdjanfzcypaunnfmgnmhaacbwljamxmvpjzpysjtzrbczgeywoesxnpkzeiesrauwjsqujfjgnwkgerybewyqjteupamcyrborbfsddhopqrdwpiddrdvkbgfwbouilfpkhvfigrjaloxdztifxyrfjlijpczzmzbptqzsiuiagkjvmvzcistnxsgogfoyuzwampssafpruvlolqmeddzjyvjvmefpfzldxlgzmuyezjoxwlxomurafzvqyaoiuywivgugdfnyrjnnwqhozjbobcezgtuoeaymwulevmogfhudhbxgvuwjptkfwrcvjbxqwuduzdocudqvpjdlstjfbcbrlubmuycasqmvizmdraysztbpmpkboitegxmcluahigguoylcthysrdukmbacyaufwmisnsmabeuqpknemphrrbxgwtwnecftdywubljlbyvjrlwdykosplweisihosbekkizasckfvrfcovafrtsvedyywpqmspjclmlmixrcrjvwovqwuhhtdgmhkexkyfhfcugdcylgyfxaubfwtwwolckzsmudijnmfkfcevzsdrsoolzusbxauuxhettzprepaypvwmswpjmlqdhzmvnrlgyyrhotzlilaaqngblkdkhzjcdesllcwsnjtximfkbdaetkkguqhxbguuinxmzsiuidwkmuvpovikmrtxbaurrfxjqlxgimbgrnvtjcwpqvoiciqmawzosiozrcrmhbeaonpduplzghgdkqdmlpykfighhafaahoczwihwxxbtubklkgjismwmigkavpbduecqpnjhlbtqjzoxyfisplbqfayznrmzrkwuossqvvvjrabpucwwdqoxzcgwnpllxxkjmzdcowlrmzmziqwgwiyovqciqtgkmpxhzgffyurbkndiykzccscxyxlmodlhftedagcifiqexlqxabziqcbncnorgpfzmqlaohhrexpckhdgtaphkqesxeipbpyslbzrpvzdrkmhvhgbokneodgmznwrkgdrjnluboifpimclewfnwskuhijqjhjtjligjfulshdfxdkntnuagvmtxdunbufladotgzmiligiumrwgvoyzcwaslrxeavffqhgwsikssogslzckfxvbhixefaumscvvimgytsofbwoqpmmgxohzxkxngbryiztruybngrgsssjbfevrewzjwadjvnchjykfdzmhtsflzwrihtstthigcrfcxdasnkkcosglcwkyaydvcuywtezfqqfwikuphuhadacrpdccnjcoxfknkoggyhwumreuweedesoelbggejnwvzwsnlxjhbkgwgnbgbahitumgrhyrrppeyeqvkzwqixmmfotklvwhusxbmylatnfwbzktaknrrrotwbozektsfjolaixqadpzxebjdanxikmkaxxclaigbosugoniallyeabtwttibqpcdmemnscyjuefpdccmwvoxgribkqgysdjudnsakkvuebbadwhixwphsxrexqbwpggrdrvbsftodqlhcibmgyhkypnbxuuuizljncctompgtukvrtauuwpseqximpjqnskuroienmmnsingbjeuekdeoptrbbqeayhpqqxianoiqrzwckbcjdseqpprufckevfcdrnmwzsbcbpsizhisncecgmsailxvstdlzysikslnngjllakdbyhrcgezkxschzlwefqzzqyzmktwqbumyxhkeczumzdbdhdfzvqegkihmfftayffwgqduegvvsfryrorzkzqzsnldozcjlnkwkbdorgctpahgmdtynnfocrfjiteebyyyagfubpbdknbdaxtbrledfoywgncgfixherucmvpyuoprstgttgiqrcuyqtxfdxggrtmdoyfeiaiyilwophrmqecfrqoundvhalupkorvtjjapmlgsykweuzdqxkuaxnjbtzvswqiqnllxlfhlwvfjjcjqmvyiwqjmukbmjrgxojylnnmjrrwdiblovfhheracwakolqwbgibnfmwsmxbazlucczpehfsnayyrgxojixpzmfygikyhnubdvdeqedcgnnzqekbhlvscyzbmbbjhkcjnxvukqbktapqzzmxnxrvqixztifgabihvofdodahbnwrnteoqewgdkqzdadqclnpqtvzymjuibroktripfaojxoxwozaullsswtltdzxucyuitdtigjrguzouztplypawmjjqnutdqkmdgrgeurwxxtkmwubyqhqsoifsriptleeimnxivgitncowqiottwjwvpbzgtwpfgxhdrqrjcmkqsuddfwyaqcihxufobkaqqmjtomqgpiezzcqletmhjabempnzkybapekaaiv"));
	}
}
