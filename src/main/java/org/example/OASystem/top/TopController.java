package org.example.OASystem.top;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
	
}