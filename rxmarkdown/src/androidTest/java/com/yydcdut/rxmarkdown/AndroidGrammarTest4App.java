package com.yydcdut.rxmarkdown;

import android.support.annotation.NonNull;
import android.test.InstrumentationTestCase;

/**
 * Created by yuyidong on 16/5/14.
 */
public class AndroidGrammarTest4App extends InstrumentationTestCase {

    public void testHyperLink() {
//        String testString = "111](22[22](33333)";
//        IGrammar hyperLinkGrammar = AndroidInstanceFactory.getAndroidGrammar(AndroidInstanceFactory.GRAMMAR_HYPERLINK);
//        boolean b = hyperLinkGrammar.isMatch(testString);
//        if (b) {
//            CharSequence charSequence = hyperLinkGrammar.format(testString);
//            assertEquals("aa[bbbdddd", charSequence+"");
//        } else {
//            assertTrue(b);
//        }
//        SpannableStringBuilder ssb = new SpannableStringBuilder(testString);
//        ssb = complex(testString, ssb);
//        Log.i("yuyidong", "result--->" + ssb.toString());
//        assertEquals("111](2222", ssb.toString());
    }

//    private static final String KEY_0 = "[";
//    private static final String KEY_1 = "](";
//    private static final String KEY_2 = ")";
//
//    private static final String PLACE_HOLDER = " ";
//
//    private SpannableStringBuilder complex(String text, SpannableStringBuilder ssb) {
//        SpannableStringBuilder tmp = new SpannableStringBuilder();
//        String tmpTotal = text;
//        while (true) {
//            int position4Key0 = tmpTotal.indexOf(KEY_0);
//            int position4Key1 = tmpTotal.indexOf(KEY_1);
//            int position4Key2 = tmpTotal.indexOf(KEY_2);
//            if (position4Key0 == -1 || position4Key1 == -1 || position4Key2 == -1) {
//                break;
//            }
//            if (position4Key0 < position4Key1 && position4Key1 < position4Key2) {
//                //处理aa[bb[b](cccc)dddd
//                int tmpCenter = tmpTotal.indexOf(KEY_1);
//                String tmpLeft = tmpTotal.substring(0, tmpCenter);
//                //正常流程
//                int positionHeader = tmpLeft.lastIndexOf(KEY_0);
//                tmp.append(tmpTotal.substring(0, positionHeader));
//                int index = tmp.length();
//                tmpTotal = tmpTotal.substring(positionHeader + KEY_0.length(), tmpTotal.length());
//                int positionCenter = tmpTotal.indexOf(KEY_1);
//                ssb.delete(tmp.length(), tmp.length() + KEY_0.length());
//                tmp.append(tmpTotal.substring(0, positionCenter));
//                tmpTotal = tmpTotal.substring(positionCenter + KEY_1.length(), tmpTotal.length());
//                int positionFooter = tmpTotal.indexOf(KEY_2);
//                String link = tmpTotal.substring(0, positionFooter);
//                ssb.setSpan(new URLSpan(link), index, tmp.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//                ssb.delete(tmp.length(), tmp.length() + KEY_1.length() + link.length() + KEY_2.length());
//                tmpTotal = tmpTotal.substring(positionFooter + KEY_2.length(), tmpTotal.length());
//            } else if (position4Key0 < position4Key1 && position4Key0 < position4Key2 && position4Key2 < position4Key1) {
//                //111[22)22](33333)
//                tmpTotal = replaceFirstOne(tmpTotal, KEY_2, PLACE_HOLDER);
//            } else if (position4Key1 < position4Key0 && position4Key1 < position4Key2) {
//                //](在最前面的情况 111](2222[333)4444  1111](2222)3333[4444
//                tmp.append(tmpTotal.substring(0, position4Key1 + KEY_1.length()));
//                tmpTotal = tmpTotal.substring(position4Key1 + KEY_1.length(), tmpTotal.length());
//            } else if (position4Key2 < position4Key0 && position4Key2 < position4Key1) {
//                //)在最前面的情况 111)2222](333[4444  1111)2222[3333](4444
//                tmp.append(tmpTotal.substring(0, position4Key2 + KEY_2.length()));
//                tmpTotal = tmpTotal.substring(position4Key2 + KEY_2.length(), tmpTotal.length());
//            }
//        }
//        return ssb;
//    }
//
//    private String replaceFirstOne(@NonNull String content, @NonNull String target, @NonNull String replacement) {
//        if (target == null) {
//            throw new NullPointerException("target == null");
//        }
//        if (replacement == null) {
//            throw new NullPointerException("replacement == null");
//        }
//        int matchStart = content.indexOf(target, 0);
//        if (matchStart == -1) {
//            return content;
//        }
//        int targetLength = target.length();
//        if (targetLength == 0) {
//            int resultLength = content.length() + (content.length() + 1) * replacement.length();
//            StringBuilder result = new StringBuilder(resultLength);
//            result.append(replacement);
//            for (int i = 0; i != content.length(); ++i) {
//                result.append(content.charAt(i));
//                result.append(replacement);
//            }
//            return result.toString();
//        }
//        StringBuilder result = new StringBuilder(content.length());
//        for (int i = 0; i < matchStart; ++i) {
//            result.append(content.charAt(i));
//        }
//        result.append(replacement);
//        int over = matchStart + targetLength;
//        for (int i = over; i < content.length(); ++i) {
//            result.append(content.charAt(i));
//        }
//        return result.toString();
//    }

    public void testImageGrammar() {
//        String testString = "aa![bb![b](cccc)dddd";
//        boolean b = isMatch(testString);
//        if (b) {
//            SpannableStringBuilder ssb = new SpannableStringBuilder(testString);
//            ssb = complex(testString, ssb);
//            assertEquals("aa![bbbdddd",ssb.toString());
//        } else {
//            assertTrue(b);
//        }
    }

//    private static final String KEY_0 = "![";
//    private static final String KEY_1 = "](";
//    private static final String KEY_2 = ")";
//
//    private static final String PLACE_HOLDER_0 = "  ";
//    private static final String PLACE_HOLDER_2 = " ";
//
//    boolean isMatch(@NonNull String text) {
//        if (TextUtils.isEmpty(text)) {
//            return false;
//        }
//        if (!(text.contains(KEY_0) && text.contains(KEY_1) && text.contains(KEY_2))) {
//            return false;
//        }
//        Pattern pattern = Pattern.compile(".*[!\\[]{1}.*[\\](]{1}.*[)]{1}.*");
//        return pattern.matcher(text).matches();
//    }
//
//    private SpannableStringBuilder complex(String text, SpannableStringBuilder ssb) {
//        SpannableStringBuilder tmp = new SpannableStringBuilder();
//        String tmpTotal = text;
//        while (true) {
//            int position4Key0 = tmpTotal.indexOf(KEY_0);
//            int position4Key1 = tmpTotal.indexOf(KEY_1);
//            int position4Key2 = tmpTotal.indexOf(KEY_2);
//            if (position4Key0 == -1 || position4Key1 == -1 || position4Key2 == -1) {
//                break;
//            }
//            if (position4Key0 < position4Key1 && position4Key1 < position4Key2) {
//                //处理aa![bb![b](cccc)dddd
//                int tmpCenter = tmpTotal.indexOf(KEY_1);
//                String tmpLeft = tmpTotal.substring(0, tmpCenter);
//                //正常流程
//                int positionHeader = tmpLeft.lastIndexOf(KEY_0);
//                tmp.append(tmpTotal.substring(0, positionHeader));
//                int index = tmp.length();
//                tmpTotal = tmpTotal.substring(positionHeader + KEY_0.length(), tmpTotal.length());
//                int positionCenter = tmpTotal.indexOf(KEY_1);
//                ssb.delete(tmp.length(), tmp.length() + KEY_0.length());
//                tmp.append(tmpTotal.substring(0, positionCenter));
//                tmpTotal = tmpTotal.substring(positionCenter + KEY_1.length(), tmpTotal.length());
//                int positionFooter = tmpTotal.indexOf(KEY_2);
//                String link = tmpTotal.substring(0, positionFooter);
//                ssb.setSpan(new URLSpan(link), index, tmp.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//                ssb.delete(tmp.length(), tmp.length() + KEY_1.length() + link.length() + KEY_2.length());
//                tmpTotal = tmpTotal.substring(positionFooter + KEY_2.length(), tmpTotal.length());
//            } else if (position4Key0 < position4Key1 && position4Key0 < position4Key2 && position4Key2 < position4Key1) {
//                //111![22)22](33333)
//                tmpTotal = replaceFirstOne(tmpTotal, KEY_2, PLACE_HOLDER_2);
//            } else if (position4Key1 < position4Key0 && position4Key1 < position4Key2) {
//                //](在最前面的情况 111](2222![333)4444  1111](2222)3333![4444
//                tmp.append(tmpTotal.substring(0, position4Key1 + KEY_1.length()));
//                tmpTotal = tmpTotal.substring(position4Key1 + KEY_1.length(), tmpTotal.length());
//            } else if (position4Key2 < position4Key0 && position4Key2 < position4Key1) {
//                //)在最前面的情况 111)2222](333![4444  1111)2222![3333](4444
//                tmp.append(tmpTotal.substring(0, position4Key2 + KEY_2.length()));
//                tmpTotal = tmpTotal.substring(position4Key2 + KEY_2.length(), tmpTotal.length());
//            }
//        }
//        return ssb;
//    }
//
//    private String replaceFirstOne(@NonNull String content, @NonNull String target, @NonNull String replacement) {
//        if (target == null) {
//            throw new NullPointerException("target == null");
//        }
//        if (replacement == null) {
//            throw new NullPointerException("replacement == null");
//        }
//        int matchStart = content.indexOf(target, 0);
//        if (matchStart == -1) {
//            return content;
//        }
//        int targetLength = target.length();
//        if (targetLength == 0) {
//            int resultLength = content.length() + (content.length() + 1) * replacement.length();
//            StringBuilder result = new StringBuilder(resultLength);
//            result.append(replacement);
//            for (int i = 0; i != content.length(); ++i) {
//                result.append(content.charAt(i));
//                result.append(replacement);
//            }
//            return result.toString();
//        }
//        StringBuilder result = new StringBuilder(content.length());
//        for (int i = 0; i < matchStart; ++i) {
//            result.append(content.charAt(i));
//        }
//        result.append(replacement);
//        int over = matchStart + targetLength;
//        for (int i = over; i < content.length(); ++i) {
//            result.append(content.charAt(i));
//        }
//        return result.toString();
//    }

    public void testCodeGrammar() {

    }

    boolean isMatch(@NonNull String text) {
        return false;
    }
}
