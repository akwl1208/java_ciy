package day16;

public class Ex9_String6_EndWith {

	public static void main(String[] args) {
		// <String_EndWith>
		//예제)다음과 같이 파일 이름이 주어졌을 때 파일 이미지인지 아닌지 구별하는 코드 작성
		//파일 확장자가 jpg, png, bmp인 경우 이미지로 구별
		//<내가 푼거>
		String fileName = "testjpg.jpg.txt";
		if(fileName.endsWith(".jpg") || fileName.endsWith(".png") || fileName.endsWith(".bmp")) {		
			System.out.println("이미지 파일입니다");
		}else {
			System.out.println("이미지 파일이 아닙니다");
		}
		
		//<힌트보고 푼거>
		//끝에서부터 .을 찾아서 번지를 가져옴
		int index = fileName.lastIndexOf(".");	
		if(index != -1) {
			//. 뒤에 있는 문자열을 가져옴
			String fileExtension = fileName.substring(index+1);
			//가져온 문자열이 jpg, png, bmp를 체크
			//셋 중에 같은게 있으면 이미지, 없으면 이미지 아님
			switch(fileExtension) {
			case "jpg" , "png" , "bmp" :
				System.out.println("이미지 파일입니다");
				break;
			default: 
				System.out.println("이미지 파일이 아닙니다");
			}
		}else {
			System.out.println("이미지 파일이 아닙니다");
		}
		
		
		//<선생님 풀이> 확장자를 배열로 선언한 경우
		String img[] = {"jpg" , "png" , "bmp"};
		if(index != -1) {
			//. 뒤에 있는 문자열을 가져옴
			String fileExtension = fileName.substring(index+1);
			//가져온 문자열이 jpg, png, bmp를 체크
			//셋 중에 같은게 있으면 이미지, 없으면 이미지 아님
			int i;
			for(i = 0; i < img.length; i++) {
				if(img[i].equals(fileExtension)){
					break;
				}
			}
			if(i < img.length) {
				System.out.println("이미지 파일입니다");
			}else {
				System.out.println("이미지 파일이 아닙니다");
			}
		}else {
			System.out.println("이미지 파일이 아닙니다");
		}
		
		
		//<선생님 풀이2> endWith 활용
		//문자열1이 문자열2로 끝나는지 알려줌(참/거짓)
		String img2[] = {".jpg" , ".png" , ".bmp"};
		int i;
		for(i = 0; i < img2.length; i++) {
			if(fileName.endsWith(img2[i])) {
				break;
			}		
		}	
		if(i < img.length) {
			System.out.println("이미지 파일입니다");
		}else {
			System.out.println("이미지 파일이 아닙니다");
		}
		
		
		//<선생님 풀이3>subString을 이용하지 않고
		int length = fileName.length();

		for(i = 0; i < img2.length; i++) {
			index = fileName.lastIndexOf(img2[i]);
			if(index == length - img2[i].length()) {
				break;
			}
		}
		if(i < img.length) {
			System.out.println("이미지 파일입니다");
		}else {
			System.out.println("이미지 파일이 아닙니다");
		}
	}

}
