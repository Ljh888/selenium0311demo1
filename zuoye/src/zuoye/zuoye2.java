package zuoye;

import java.util.Calendar;
import java.util.Scanner;

public class zuoye2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=0,month = 0,date=0;
		System.out.println("���");
		year = Year();
		System.out.println("�·�");
		month = Month();
		System.out.println("�շ�");
		date = Date();
		while(true){
			System.out.println("������1(�鿴����)��2(��������)ѡ���ܣ�");
			Scanner sc = new Scanner(System.in);
			int enternumber=sc.nextInt();
			if(enternumber == 0){
				System.out.println("���ѳɹ��˳�ϵͳ");
				break;
			}
			switch(enternumber){
			case 1:
				xinzuo(year,month); //������ѯ
			case 2:
				tuisong(); //��������
			}		
		}
	}
	public static void menu(){
		System.out.println(""); //����
		System.out.println(""); //��������
		System.out.println(""); //��������
		System.out.println(""); //�˳�
	}
	public static void xinzuo(int yue,int ri){
		if(yue==1){
			if(ri<20){
				System.out.println("Ħ����");
			}
			else{
				System.out.println("ˮƿ��");
			}
		}
		else if(yue == 2){		
			if(ri<20){
				System.out.println("ˮƿ��");
			}
			else{
				System.out.println("˫����");
			}
		}
		else if(yue == 3){		
			if(ri<21){
				System.out.println("˫����");
			}
			else{
				System.out.println("������");
			}
		}
		else if(yue == 4){		
			if(ri<20){
				System.out.println("������");
			}
			else{
				System.out.println("��ţ��");
			}
		}
		else if(yue == 5){		
			if(ri<21){
				System.out.println("��ţ��");
			}
			else{
				System.out.println("˫����");
			}
		}
		else if(yue == 6){		
			if(ri<22){
				System.out.println("˫����");
			}
			else{
				System.out.println("��з��");
			}
		}
		else if(yue == 7){		
			if(ri<23){
				System.out.println("��з��");
			}
			else{
				System.out.println("ʨ����");
			}
		}
		else if(yue == 8){		
			if(ri<23){
				System.out.println("ʨ����");
			}
			else{
				System.out.println("��Ů��");
			}
		}
		else if(yue == 9){		
			if(ri<23){
				System.out.println("��Ů��");
			}
			else{
				System.out.println("�����");
			}
		}
		else if(yue == 10){		
			if(ri<24){
				System.out.println(" �����");
			}
			else{
				System.out.println("��Ы��");
			}
		}
		else if(yue ==11){		
			if(ri<23){
				System.out.println("��Ы��");
			}
			else{
				System.out.println("������");
			}
		}
		else if(yue == 12){		
			if(ri<22){
				System.out.println("������");
			}
			else{
				System.out.println("Ħ����");
			}
		}
	}
	public static void tuisong(){
		Calendar c = Calendar.getInstance();
		int nian = c.get(Calendar.YEAR);
		int yue = c.get(Calendar.MONTH);
		yue = yue +1;
		int ri = c.get(Calendar.DATE);
		if(yue==1){
			if(ri<20){
				System.out.println("ְ���ϵľ�����ʱ���ڽ����ţ���������Ҳ��ȼ��������־��������Ҳ�����㣬�кõĻ������١��ʺ��ƶ��¼ƻ���ȷ��Ŀ����ܹ��ߵø�Զ�������˻����Լ�ϲ����������Ŭ����ϣ���кõĽ����");
			}
			else{
				System.out.println("�������¶��ᰴ�չ滮����ȥ�ߣ��ܹ�����ʧ���ͬʱ���ܼӿ�����ٶȡ��ڹ������˼ʹ�ϵ�϶����ֵ÷ǳ�������������ǿ���ܹ��õ��ܺõ��ջ񡣶��ڲ��˷��棬�����ϻ��г嶯���ѣ���Ǯ��������");
			}
		}
		else if(yue == 2){		
			if(ri<19){
				System.out.println("�������¶��ᰴ�չ滮����ȥ�ߣ��ܹ�����ʧ���ͬʱ���ܼӿ�����ٶȡ��ڹ������˼ʹ�ϵ�϶����ֵ÷ǳ�������������ǿ���ܹ��õ��ܺõ��ջ񡣶��ڲ��˷��棬�����ϻ��г嶯���ѣ���Ǯ��������");
			}
			else{
				System.out.println("����������ţ�רע��ǿ�����������������ж���ִ���������ܺá������ڹ�����ͬʱ����Ҫ����Χ�Ļ���Ӱ������ж�������˵����ͨ�ϣ�Ҫע���Դǣ�������������Ҫ�����Ρ�");
			}
		}
		else if(yue == 3){		
			if(ri<21){
				System.out.println("����������ţ�רע��ǿ�����������������ж���ִ���������ܺá������ڹ�����ͬʱ����Ҫ����Χ�Ļ���Ӱ������ж�������˵����ͨ�ϣ�Ҫע���Դǣ�������������Ҫ�����Ρ�");
			}
			else{
				System.out.println("�ڹ����Ͻ����ֻ�����ŵȻ���ĵ������ٲ��ж��ͻᱻ����ռ�Ȼ��ˣ���Ļ��ΧҲ���ܵ����ơ���ͷ�ϵ������õ�����ĺ÷�������Ҫ�˼�����Ľ�չ�����⣬Ч����Ҫ���һ����");
			}
		}
		else if(yue == 4){		
			if(ri<22){
				System.out.println("�ڹ����Ͻ����ֻ�����ŵȻ���ĵ������ٲ��ж��ͻᱻ����ռ�Ȼ��ˣ���Ļ��ΧҲ���ܵ����ơ���ͷ�ϵ������õ�����ĺ÷�������Ҫ�˼�����Ľ�չ�����⣬Ч����Ҫ���һ����");
			}
			else{
				System.out.println("����һ�������������̫�ȣ��������е���ƮƮ�ĸо�������ѧϰ�����ܹ�����ע������Ч��Ҳ�϶��Ǻܲ������С������ϳ��֡���������ǸϽ��������������ֽ�����е�����");
			}
		}
		else if(yue == 5){		
			if(ri<21){
				System.out.println("����һ�������������̫�ȣ��������е���ƮƮ�ĸо�������ѧϰ�����ܹ�����ע������Ч��Ҳ�϶��Ǻܲ������С������ϳ��֡���������ǸϽ��������������ֽ�����е�����");
			}
			else{
				System.out.println("������Щͻ��״���ĳ�����������Ӧ������Щ������Ч��������Ԥ�ڡ����ܻ������������У�����ֻҪ��Ŭ�������¹���һ�㣬Ҳ��ת��������ת���أ����⣬һ��Ҫ����������������ܺܺõػ����ɻ�");
			}
		}
		else if(yue == 6){		
			if(ri<22){
				System.out.println("������Щͻ��״���ĳ�����������Ӧ������Щ������Ч��������Ԥ�ڡ����ܻ������������У�����ֻҪ��Ŭ�������¹���һ�㣬Ҳ��ת��������ת���أ����⣬һ��Ҫ����������������ܺܺõػ����ɻ�");
			}
			else{
				System.out.println("����ǳ��ʺ������µ����飬���ǿ�չ�µļƻ��������˶����������ǳ����棬��Ҫ���������£����Բμ�һЩ����ݽ��������е��ˣ����˹�ϵ��ø��ӽ��̣�Ҫ���ܵĶ�˵Щ��������Ǿ͸����ۡ�");
			}
		}
		else if(yue == 7){		
			if(ri<23){
				System.out.println("����ǳ��ʺ������µ����飬���ǿ�չ�µļƻ��������˶����������ǳ����棬��Ҫ���������£����Բμ�һЩ����ݽ��������е��ˣ����˹�ϵ��ø��ӽ��̣�Ҫ���ܵĶ�˵Щ��������Ǿ͸����ۡ�");
			}
			else{
				System.out.println("��������˵�ĳЩ��ĳЩ�ٶ����ر����⣬��Ӱ���Լ�����һЩ���õľ�����ְ���ϡ�������һ��Ҫ�����Լ���ԭ�򣬱����ױ���ҡ������һ�춼ͦæµ�ģ�����æ��͵�кȺ�����裬����ͷ�����Ķ����ɡ�");
			}
		}
		else if(yue == 8){		
			if(ri<23){
				System.out.println("��������˵�ĳЩ��ĳЩ�ٶ����ر����⣬��Ӱ���Լ�����һЩ���õľ�����ְ���ϡ�������һ��Ҫ�����Լ���ԭ�򣬱����ױ���ҡ������һ�춼ͦæµ�ģ�����æ��͵�кȺ�����裬����ͷ�����Ķ����ɡ�");
			}
			else{
				System.out.println("����ܶ�ʱ��Ҫ���˴������Ѳ��ܲ���������ע�����������С�һ��Ҫʱ�̶�������������£�Ҫ�Ǹо����ƣ����Գ�����������ʿ�����������ɫֲ�������һЩ�����ܻ����������������ѣ�������һЩ�µ���Ϣ��");
			}
		}
		else if(yue == 9){		
			if(ri<23){
				System.out.println("����ܶ�ʱ��Ҫ���˴������Ѳ��ܲ���������ע�����������С�һ��Ҫʱ�̶�������������£�Ҫ�Ǹо����ƣ����Գ�����������ʿ�����������ɫֲ�������һЩ�����ܻ����������������ѣ�������һЩ�µ���Ϣ��");
			}
			else{
				System.out.println("���еķ��ն��������ˣ����������ĸо���ĺܺá�����ͨʱ������׳�ڶ���˵�����˲����˵Ļ����п��ܻ���������֮�����ڹ����ϵ�һЩ��ϰ�߻�ë������Ҫ�Ͻ�������Ҫ��Ȼ�������ࡣ");
			}
		}
		else if(yue == 10){		
			if(ri<24){
				System.out.println("���еķ��ն��������ˣ����������ĸо���ĺܺá�����ͨʱ������׳�ڶ���˵�����˲����˵Ļ����п��ܻ���������֮�����ڹ����ϵ�һЩ��ϰ�߻�ë������Ҫ�Ͻ�������Ҫ��Ȼ�������ࡣ");
			}
			else{
				System.out.println("���������ƺܲ����һ�죬�ܹ���ϲ��������һ��ϳ���ʱ�䣬������һ��Ҫ�úð��ջ��ᣬʹ���취�����Է���ע�����ˡ������ϣ����³徢Ҫ��ǿһ�㣬���ù滮����ô�ڽ������Ĺ��̻����˳����");
			}
		}
		else if(yue ==11){		
			if(ri<23){
				System.out.println("���������ƺܲ����һ�죬�ܹ���ϲ��������һ��ϳ���ʱ�䣬������һ��Ҫ�úð��ջ��ᣬʹ���취�����Է���ע�����ˡ������ϣ����³徢Ҫ��ǿһ�㣬���ù滮����ô�ڽ������Ĺ��̻����˳����");
			}
			else{
				System.out.println("��������Ƚ����ɵģ������������Ԥ���н��У�û��̫��Ҫ���ĵ������ˡ���ϸ�������׺��ԣ����º�һ��Ҫ��飬���ܼ��ٴ������⣬�Լ��ˡ�����Ҫ��һ�����ģ���Ҫ�������ǵĴ����ˡ�");
			}
		}
		else if(yue == 12){		
			if(ri<22){
				System.out.println("��������Ƚ����ɵģ������������Ԥ���н��У�û��̫��Ҫ���ĵ������ˡ���ϸ�������׺��ԣ����º�һ��Ҫ��飬���ܼ��ٴ������⣬�Լ��ˡ�����Ҫ��һ�����ģ���Ҫ�������ǵĴ����ˡ�");
			}
			else{
				System.out.println("ְ���ϵľ�����ʱ���ڽ����ţ���������Ҳ��ȼ��������־��������Ҳ�����㣬�кõĻ������١��ʺ��ƶ��¼ƻ���ȷ��Ŀ����ܹ��ߵø�Զ�������˻����Լ�ϲ����������Ŭ����ϣ���кõĽ����");
			}
		}
	}
	public static int Year(){
		Scanner sc = new Scanner(System.in);
		int nian = sc.nextInt();
		return nian;
	}
	public static int Month(){
		Scanner sc = new Scanner(System.in);
		int yue = sc.nextInt();
		return yue;
	}
	public static int Date(){
		Scanner sc = new Scanner(System.in);
		int ri = sc.nextInt();
		return ri;
	}
}
