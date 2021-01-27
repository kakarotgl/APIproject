package parse;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/**
 * ����ֻ�ʺ϶�ȡһ��json
 */
public class JsonConvert {

	public static void main(String[] args) {
        // ��ȡnameID.txt�ļ��е�NAMEID�ֶΣ�key����Ӧֵ��value�����洢  
        ArrayList<String> list = new ArrayList<String>();  
        BufferedReader brname;  
        try {  
            brname = new BufferedReader(new FileReader("E:/Workspaces/MyEclipse 2016 CI/testFile/nameID.txt"));// ��ȡNAMEID��Ӧֵ  
            String sname = null;  
            while ((sname = brname.readLine()) != null) {  
                // System.out.println(sname);  
                list.add(sname);// ����Ӧvalue��ӵ�����洢  
            }
            brname.close();  
        } catch (IOException e1) {  
            // TODO Auto-generated catch block  
            e1.printStackTrace();  
        }  
        // ��ȡԭʼjson�ļ������в��������  
        try {  
            BufferedReader br = new BufferedReader(new FileReader("E:/Workspaces/MyEclipse 2016 CI/testFile/HK_geo.json"));// ��ȡԭʼjson�ļ�  
            BufferedWriter bw = new BufferedWriter(new FileWriter("E:/Workspaces/MyEclipse 2016 CI/testFile/HK_new.json"));// ����µ�json�ļ�  
            String s = null, ws = null;  
            while ((s = br.readLine()) != null) {  
                 System.out.println(s);  
                try {  
                    JSONObject dataJson = new JSONObject(s);// ����һ������ԭʼjson����json����  
                    JSONArray features = dataJson.getJSONArray("features");// �ҵ�features��json����  
                    for (int i = 0; i < features.length(); i++) {  
                        JSONObject info = features.getJSONObject(i);// ��ȡfeatures����ĵ�i��json����  
                        JSONObject properties = info.getJSONObject("properties");// �ҵ�properties��json����  
                        String name = properties.getString("name");// ��ȡproperties�������name�ֶ�ֵ  
                        System.out.println(name);  
                        properties.put("NAMEID", list.get(i));// ���NAMEID�ֶ�  
                        // properties.append("name", list.get(i));  
                        System.out.println(properties.getString("NAMEID"));  
                        properties.remove("ISO");// ɾ��ISO�ֶ�  
                    }  
                    ws = dataJson.toString();  
                    System.out.println(ws);  
                } catch (JSONException e) {  
                    // TODO Auto-generated catch block  
                    e.printStackTrace();  
                }  
            }  
  
            bw.write(ws);  
            // bw.newLine();  
  
            bw.flush();  
            br.close();  
            bw.close();  
  
        } catch (IOException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        } 

	}

}
