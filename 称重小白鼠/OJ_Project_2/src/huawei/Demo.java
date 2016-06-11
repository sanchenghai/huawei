package huawei;

public final class Demo {

	/*����������������ñ����ɫ
	 * ������	5ֻС���������ֱ�Ϊ15 30 5 9 30��ñ����ɫ����ΪCL_RED, CL_BLUE, CL_BLUE, CL_YELLOW, CL_GRAY��
	 * �������������ñ����ɫ����Ӧ��ΪCL_BLUE, CL_YELLOW, CL_RED, CL_BLUE, CL_GRAY��
		���û��С�������null��
	���������С��������	
		
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


