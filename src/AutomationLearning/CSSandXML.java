/**
 * 
 */
package AutomationLearning;

//CSS: #recordlist li:nth-of-type(4) select the fourth li element
//CSS: #recordlist li:nth-child(4)    get the fourth li element only 
//CSS: #recordlist *:nth-child(4)   don’t specify a child type for nth-child
     //#<ID name> li: nth-of-type()

//......................................................................

//      ^= Match a prefix

//      CSS: a[id^='id_prefix_']

//                                 $= Match a suffix

//                                 CSS: a[id$='_id_sufix']

//                                                                      *= Match a contain substring

//                                                                      CSS: a[id*='id_pattern']

// a: contains('example')


public class CSSandXML {
	
	//.....................................A direct child.......................................... 
	
	//XPATH = a “/"
	//CSS =  “>”
	
	//eg: 	XPath: //div/a

    //css: div > a
	
	//...................If an element could be inside another or one it’s childs...............................
	
	
	// 
	//XPATH = “//”
    // css = whitespace
	
	//eg: XPath: //div//a

    //css: div a

	//.....................ID................................
	
	//Xpath = //a[@id='example']
	//css: #example
	
	//.......................Class............................
	
	//XPath: //a[@class='example']
	//css: .example
	
	//..........................NEXT SIBLING...................................
	
	//XPATH: //input[@id='username']/following-sibling::input[1]
	//CSS: #username + input
	
	
	//........................Random.........................................
	
	//XPATH: //input[@name='username']
	//CSS: input[name='username']
	
	//.......................................
	
	//XPATH: //input[@name='login'and @type='submit']
	//CSS: input[name='login'][type='submit']
	
	//............................................................
}
