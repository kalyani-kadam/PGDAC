package com.app.storedetails;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.app.entity.Item;

public interface ItemStore {
	static void writeDetails(Map<String, Item> items, String fileName) throws IOException {
		// Java App --> OOS --> FOS (bin file)
		try (ObjectOutputStream out = 
				new ObjectOutputStream(new FileOutputStream(fileName))) {
			out.writeObject(items);// serialization
		} // JVM : out.close --fos.close --close the file handle
	}
}
