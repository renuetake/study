// 不適切コード

import java.text.Normalizer;

public class NGCode {
    public String check(String msg){
        // msgには "\uFE64" + "script" + "\uFE65"が格納されている
        // そのため、検証では<>はヒットしない
        // 検証する
        Pattern pattern = Pattern.compile("[<>]");
        Matcher matcher = pattern.matcher(msg);
        if (matcher.find()){
            // <>が見つかった場合は例外スロー
            throw new IllegalStateException();
        } else {
            // ...
        }
        // 正規化する
        msg = Normalizer.normalize(msg, From.NFKC);
        return msg;
    }
}
