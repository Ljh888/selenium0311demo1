package zuoye;

import java.util.Calendar;
import java.util.Scanner;

public class zuoye2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=0,month = 0,date=0;
		System.out.println("年份");
		year = Year();
		System.out.println("月份");
		month = Month();
		System.out.println("日份");
		date = Date();
		while(true){
			System.out.println("请输入1(查看星座)和2(运势推送)选择功能：");
			Scanner sc = new Scanner(System.in);
			int enternumber=sc.nextInt();
			if(enternumber == 0){
				System.out.println("您已成功退出系统");
				break;
			}
			switch(enternumber){
			case 1:
				xinzuo(year,month); //星座查询
			case 2:
				tuisong(); //今日推送
			}		
		}
	}
	public static void menu(){
		System.out.println(""); //标题
		System.out.println(""); //星座推送
		System.out.println(""); //今日推送
		System.out.println(""); //退出
	}
	public static void xinzuo(int yue,int ri){
		if(yue==1){
			if(ri<20){
				System.out.println("摩羯座");
			}
			else{
				System.out.println("水瓶座");
			}
		}
		else if(yue == 2){		
			if(ri<20){
				System.out.println("水瓶座");
			}
			else{
				System.out.println("双鱼座");
			}
		}
		else if(yue == 3){		
			if(ri<21){
				System.out.println("双鱼座");
			}
			else{
				System.out.println("白羊座");
			}
		}
		else if(yue == 4){		
			if(ri<20){
				System.out.println("白羊座");
			}
			else{
				System.out.println("金牛座");
			}
		}
		else if(yue == 5){		
			if(ri<21){
				System.out.println("金牛座");
			}
			else{
				System.out.println("双子座");
			}
		}
		else if(yue == 6){		
			if(ri<22){
				System.out.println("双子座");
			}
			else{
				System.out.println("巨蟹座");
			}
		}
		else if(yue == 7){		
			if(ri<23){
				System.out.println("巨蟹座");
			}
			else{
				System.out.println("狮子座");
			}
		}
		else if(yue == 8){		
			if(ri<23){
				System.out.println("狮子座");
			}
			else{
				System.out.println("处女座");
			}
		}
		else if(yue == 9){		
			if(ri<23){
				System.out.println("处女座");
			}
			else{
				System.out.println("天秤座");
			}
		}
		else if(yue == 10){		
			if(ri<24){
				System.out.println(" 天秤座");
			}
			else{
				System.out.println("天蝎座");
			}
		}
		else if(yue ==11){		
			if(ri<23){
				System.out.println("天蝎座");
			}
			else{
				System.out.println("射手座");
			}
		}
		else if(yue == 12){		
			if(ri<22){
				System.out.println("射手座");
			}
			else{
				System.out.println("摩羯座");
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
				System.out.println("职场上的竞争随时都在进行着，而今天你也很燃，充满斗志，好运气也会眷顾你，有好的机会来临。适合制定新计划，确定目标才能够走得更远。部分人会在自己喜欢的领域上努力，希望有好的结果。");
			}
			else{
				System.out.println("今天做事都会按照规划步伐去走，能够减少失误的同时还能加快办事速度。在工作、人际关系上都表现得非常积极，主动性强，能够得到很好的收获。而在财运方面，购物上会有冲动消费，花钱很厉害。");
			}
		}
		else if(yue == 2){		
			if(ri<19){
				System.out.println("今天做事都会按照规划步伐去走，能够减少失误的同时还能加快办事速度。在工作、人际关系上都表现得非常积极，主动性强，能够得到很好的收获。而在财运方面，购物上会有冲动消费，花钱很厉害。");
			}
			else{
				System.out.println("今天充满自信，专注力强，因此在做事上面的行动、执行能力都很好。但是在工作的同时，不要被周围的环境影响你的判断力。在说话沟通上，要注意言辞，别胡言乱语，做事要负责任。");
			}
		}
		else if(yue == 3){		
			if(ri<21){
				System.out.println("今天充满自信，专注力强，因此在做事上面的行动、执行能力都很好。但是在工作的同时，不要被周围的环境影响你的判断力。在说话沟通上，要注意言辞，别胡言乱语，做事要负责任。");
			}
			else{
				System.out.println("在工作上今天别只是坐着等机会的到来，再不行动就会被人抢占先机了，你的活动范围也会受到限制。手头上的问题会得到解决的好方法，但要顾及事情的进展。另外，效率需要提高一旦。");
			}
		}
		else if(yue == 4){		
			if(ri<22){
				System.out.println("在工作上今天别只是坐着等机会的到来，再不行动就会被人抢占先机了，你的活动范围也会受到限制。手头上的问题会得到解决的好方法，但要顾及事情的进展。另外，效率需要提高一旦。");
			}
			else{
				System.out.println("今天一整天的情绪都不太稳，整个人有点轻飘飘的感觉，工作学习都不能够集中注意力，效率也肯定是很差，大问题小差错都不断出现。建议最好是赶紧打起精神来，着手解决所有的问题");
			}
		}
		else if(yue == 5){		
			if(ri<21){
				System.out.println("今天一整天的情绪都不太稳，整个人有点轻飘飘的感觉，工作学习都不能够集中注意力，效率也肯定是很差，大问题小差错都不断出现。建议最好是赶紧打起精神来，着手解决所有的问题");
			}
			else{
				System.out.println("今天有些突发状况的出现让你难以应付，有些工作的效果并不如预期。可能会陷入困境当中，不过只要肯努力，做事果断一点，也许转弯遇到新转机呢！另外，一定要多听长辈的意见，能很好地化解疑惑。");
			}
		}
		else if(yue == 6){		
			if(ri<22){
				System.out.println("今天有些突发状况的出现让你难以应付，有些工作的效果并不如预期。可能会陷入困境当中，不过只要肯努力，做事果断一点，也许转弯遇到新转机呢！另外，一定要多听长辈的意见，能很好地化解疑惑。");
			}
			else{
				System.out.println("今天非常适合做点新的事情，或是开展新的计划，部分人对外面的世界非常好奇，想要尝尝新鲜事，可以参加一些活动、演讲。恋爱中的人，两人关系变得更加紧固，要是能的多说些甜言蜜语，那就更甜蜜。");
			}
		}
		else if(yue == 7){		
			if(ri<23){
				System.out.println("今天非常适合做点新的事情，或是开展新的计划，部分人对外面的世界非常好奇，想要尝尝新鲜事，可以参加一些活动、演讲。恋爱中的人，两人关系变得更加紧固，要是能的多说些甜言蜜语，那就更甜蜜。");
			}
			else{
				System.out.println("在面对他人的某些话某些举动都特别在意，会影响自己做出一些不好的决定。职场上、生活上一定要坚守自己的原则，别轻易被动摇。今天一天都挺忙碌的，可以忙里偷闲喝喝下午茶，能让头脑身心都放松。");
			}
		}
		else if(yue == 8){		
			if(ri<23){
				System.out.println("在面对他人的某些话某些举动都特别在意，会影响自己做出一些不好的决定。职场上、生活上一定要坚守自己的原则，别轻易被动摇。今天一天都挺忙碌的，可以忙里偷闲喝喝下午茶，能让头脑身心都放松。");
			}
			else{
				System.out.println("今天很多时候都要别人从旁提醒才能不出错，而且注意力并不集中。一定要时刻都谨慎认真地做事，要是感觉郁闷，可以出外面呼吸新鲜空气，看看绿色植物会舒心一些。可能会在外面遇到老朋友，会听到一些新的消息。");
			}
		}
		else if(yue == 9){		
			if(ri<23){
				System.out.println("今天很多时候都要别人从旁提醒才能不出错，而且注意力并不集中。一定要时刻都谨慎认真地做事，要是感觉郁闷，可以出外面呼吸新鲜空气，看看绿色植物会舒心一些。可能会在外面遇到老朋友，会听到一些新的消息。");
			}
			else{
				System.out.println("所有的烦恼都逐渐消除了，放松下来的感觉真的很好。但沟通时候很容易冲口而出说出让人不高兴的话，有可能会引发口舌之争。在工作上的一些坏习惯坏毛病今天要赶紧改正，要不然出错会更多。");
			}
		}
		else if(yue == 10){		
			if(ri<24){
				System.out.println("所有的烦恼都逐渐消除了，放松下来的感觉真的很好。但沟通时候很容易冲口而出说出让人不高兴的话，有可能会引发口舌之争。在工作上的一些坏习惯坏毛病今天要赶紧改正，要不然出错会更多。");
			}
			else{
				System.out.println("恋爱的运势很不错的一天，能够与喜欢的人在一起较长的时间，单身者一定要好好把握机会，使尽办法吸引对方的注意力了。工作上，做事冲劲要更强一点，做好规划，那么在接下来的过程会更加顺利。");
			}
		}
		else if(yue ==11){		
			if(ri<23){
				System.out.println("恋爱的运势很不错的一天，能够与喜欢的人在一起较长的时间，单身者一定要好好把握机会，使尽办法吸引对方的注意力了。工作上，做事冲劲要更强一点，做好规划，那么在接下来的过程会更加顺利。");
			}
			else{
				System.out.println("今天整体比较轻松的，工作都在你的预期中进行，没有太多要操心的事情了。但细节最容易忽略，完事后一定要检查，才能减少错误。另外，对家人、爱人要多一点点关心，不要忘记他们的存在了。");
			}
		}
		else if(yue == 12){		
			if(ri<22){
				System.out.println("今天整体比较轻松的，工作都在你的预期中进行，没有太多要操心的事情了。但细节最容易忽略，完事后一定要检查，才能减少错误。另外，对家人、爱人要多一点点关心，不要忘记他们的存在了。");
			}
			else{
				System.out.println("职场上的竞争随时都在进行着，而今天你也很燃，充满斗志，好运气也会眷顾你，有好的机会来临。适合制定新计划，确定目标才能够走得更远。部分人会在自己喜欢的领域上努力，希望有好的结果。");
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
