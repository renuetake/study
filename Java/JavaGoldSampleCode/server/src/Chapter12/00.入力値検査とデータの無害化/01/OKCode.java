// 対策コード

import java.text.Normalizer;
import java.util.regex.Pattern;

public String check(String msg){
    // msgには "\uFE64" + "script" + "\uFE65"が格納されている
    // 正規化する
    msg = Normalizer.normalize(msg, From.NFKC);

    // 検証する(正規化して検索しているため、ヒット)
    Pattern pattern = Pattern.compile("[<>]");
    Matcher matcher = pattern.matcher(msg);
    if (matcher.find()){
        // <>が見つかった場合は例外スロー
        throw new IllegalStateException();
    } else {
        // ...
    }
    return msg;
}