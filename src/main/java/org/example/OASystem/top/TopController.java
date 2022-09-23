package org.example.OASystem.top;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/***
 * HTTPリクエストを受け付けるクラス＝コントローラー
 * Controllerアノテーションを付与されたクラスはコントローラーになる
 * @author asad
 *
 */
 
@Controller
public class TopController {
	
	/***
	 * GETメソッドのHTTPリクエストを受け付ける。GetMappingアノテーションの引き数に指定した文字列がURLに含まれていたら、ここへ処理が飛んでくるイメージ
	 * @return 遷移先htmlファイルのパス
	 */
	@GetMapping("/top")
	public String getTop() {
		// top.htmlに画面遷移
		return "top";
	}
	
	// PostMappingアノテーション＝受け付けるURLを引数に指定すると、POSTを受け取る。以下の場合、http://localhost:8080/topへのPOSTリクエストを受け取れる。
	@PostMapping("/top")
	// RequestParamアノテーション＝画面で入力された値を受け取るためのアノテーション。HTMLのname属性と一致するように引数を指定する。
	public String postRequest(@RequestParam("text1") String str, Model model) {
		
		// 画面から受け取った文字列をModelに登録
		model.addAttribute("sample", str);
		// ↑Modelクラス：別画面に値を渡すためのクラス。addAttributeメソッド＝(キー名, 値)と引数を指定すると、Modelクラスに値が登録される。
		// ModelクラスはControllerからViewへ変数を渡すためのもの。今回の場合、TopController→Model→response.htmlと、strが渡されている。
		
		// response.htmlに画面遷移
		return "top/response";
	}
}