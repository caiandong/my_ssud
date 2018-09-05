package mybatis;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class sdka {
	@Test
	public void filelist(){		
		File ff=new File("F:\\迅雷下载");
		File[] list = ff.listFiles();
		List<String> ll=new ArrayList<>();
		for(File f:list)
			ll.add(f.getName());
		for(String f:ll)
			System.out.println(f);
		
			
	}
	@Test
	public void test() {
		System.out.println("sdsdad");
	}

}
