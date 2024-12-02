// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package masterdata.proxies;

public enum ENUM_Colors
{
	Black(new java.lang.String[][] { new java.lang.String[] { "en_US", "Black" }, new java.lang.String[] { "pt_BR", "Preto" } }),
	White(new java.lang.String[][] { new java.lang.String[] { "en_US", "White" } }),
	Red(new java.lang.String[][] { new java.lang.String[] { "en_US", "Red" } }),
	Blue(new java.lang.String[][] { new java.lang.String[] { "en_US", "Blue" }, new java.lang.String[] { "pt_BR", "Azul" } }),
	Yellow(new java.lang.String[][] { new java.lang.String[] { "en_US", "Yellow" } }),
	Green(new java.lang.String[][] { new java.lang.String[] { "en_US", "Green" } }),
	Silver(new java.lang.String[][] { new java.lang.String[] { "en_US", "Silver" } }),
	Gray(new java.lang.String[][] { new java.lang.String[] { "en_US", "Gray" } });

	private final java.util.Map<java.lang.String, java.lang.String> captions;

	private ENUM_Colors(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<>();
		for (java.lang.String[] captionString : captionStrings) {
			captions.put(captionString[0], captionString[1]);
		}
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		return captions.getOrDefault(languageCode, "en_US");
	}

	public java.lang.String getCaption()
	{
		return captions.get("en_US");
	}
}