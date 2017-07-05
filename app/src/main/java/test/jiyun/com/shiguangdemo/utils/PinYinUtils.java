package test.jiyun.com.shiguangdemo.utils;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;
import android.text.TextUtils;

/**
 * 将汉字转换为拼音
 *
 * @author Administrator
 *
 */
public class PinYinUtils {

	public static String getPinYin(String text) {
		if (TextUtils.isEmpty(text))
			return null;

		HanyuPinyinOutputFormat format = new HanyuPinyinOutputFormat();
		format.setCaseType(HanyuPinyinCaseType.UPPERCASE);
		format.setToneType(HanyuPinyinToneType.WITHOUT_TONE);

		String pinyin = "";
		// 1.因为同一时刻PinYin4j只能将一个汉字转换为拼音
		char[] textArr = text.toCharArray();

		for (int i = 0; i < textArr.length; i++) {
			// 2.如果名字之间不包含空格
			if (!Character.isWhitespace(textArr[i])) {

				if (textArr[i] > 127) {
					//有可能是汉字

					try {
						String[] strArr = PinyinHelper
								.toHanyuPinyinStringArray(textArr[i], format);

						pinyin += strArr[0];
					} catch (BadHanyuPinyinOutputFormatCombination e) {
						e.printStackTrace();
					}
				} else {
					// 肯定不是汉字，一定是键盘里面某一个字符
					pinyin += textArr[i];
				}

			} else {
				pinyin += textArr[i];
			}

		}
		return pinyin;

	}
}
