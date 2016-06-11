package huawei;

public final class Demo {

	/*根据重量排序后，输出帽子颜色
	 * 举例：	5只小白鼠，重量分别为15 30 5 9 30，帽子颜色依次为CL_RED, CL_BLUE, CL_BLUE, CL_YELLOW, CL_GRAY，
	 * 则排序后的输出的帽子颜色序列应该为CL_BLUE, CL_YELLOW, CL_RED, CL_BLUE, CL_GRAY。
		如果没有小白鼠，输出null。
	输入参数：小白鼠数组	
		
	*/
	public static MOUSE_COLOR[] sortMouse(Mouse[] mouse )
	{
		try{
			if(mouse.length == 0){
				return null;
			}
			
			int subscript[] = new int[mouse.length];
			int weight[] = new int[mouse.length];
			int i;
			for(i = 0; i < mouse.length; i += 1){
				subscript[i] = i;
				weight[i] = mouse[i].weight;
			}
			int j;
			int temp;
			for(i = 0; i < mouse.length - 1; i += 1){
				for(j = 0; j < mouse.length - 1 - i; j += 1){
					if(weight[j] > weight[j + 1]){
						temp = subscript[j];
						subscript[j] = subscript[j + 1];
						subscript[j + 1] = temp;
						temp = weight[j];
						weight[j] = weight[j + 1];
						weight[j + 1] = temp;
					}
				}
			}
			MOUSE_COLOR result[] = new MOUSE_COLOR[mouse.length]; 
			for(i = 0; i < mouse.length; i += 1){
				result[i] = mouse[subscript[i]].color;
			}
			return result;
		}catch(Exception e){
			return null;
		}
		
	}
	
	
}


