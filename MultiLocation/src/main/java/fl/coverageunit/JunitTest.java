package fl.coverageunit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
//import fl.tcas.*;
public class JunitTest {
	demo1 tmp = new demo1();

	@Test
	public void t0() {
		String[] input= { "958","1","1","2597","574","4253","0","399","400","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1() {
		String[] input= { "627","0","0","621","216","382","1","400","641","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t2() {
		String[] input= { "549","1","1","4398","133","1445","1","641","639","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t3() {
		String[] input= { "576","0","1","3469","183","381","2","641","501","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t4() {
		String[] input= { "992","1","0","3342","23","4657","1","640","741","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t5() {
		String[] input= { "548","0","1","34","542","3514","2","499","401","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t6() {
		String[] input= { "710","0","0","127","403","4616","3","500","400","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t7() {
		String[] input= { "638","0","1","698","499","2465","3","500","501","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t8() {
		String[] input= { "893","1","0","205","283","5056","3","400","641","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t9() {
		String[] input= { "976","1","1","5378","390","1000","2","641","741","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t10() {
		String[] input= { "763","0","0","136","576","2305","0","401","741","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t11() {
		String[] input= { "570","0","1","1945","376","2064","0","739","740","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t12() {
		String[] input= { "967","1","0","659","204","3825","3","500","399","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t13() {
		String[] input= { "892","0","1","2009","40","1011","1","641","740","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t14() {
		String[] input= { "911","1","1","4194","242","4667","1","401","399","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t15() {
		String[] input= { "929","0","1","1072","134","1036","1","741","639","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t16() {
		String[] input= { "588","1","0","4341","336","2774","2","740","400","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t17() {
		String[] input= { "963","0","0","5985","377","994","3","400","499","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t18() {
		String[] input= { "699","1","1","619","432","912","2","740","639","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t19() {
		String[] input= { "818","0","1","1876","318","793","1","499","501","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t20() {
		String[] input= { "926","1","0","1694","263","651","2","501","499","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t21() {
		String[] input= { "579","0","1","882","101","5381","0","639","499","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t22() {
		String[] input= { "878","0","0","1063","86","4714","1","499","400","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t23() {
		String[] input= { "822","0","1","1469","234","4419","1","399","399","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t24() {
		String[] input= { "653","1","0","432","67","203","0","401","401","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t25() {
		String[] input= { "601","1","1","777","424","309","1","641","401","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t26() {
		String[] input= { "764","0","1","2969","491","2466","0","639","501","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t27() {
		String[] input= { "594","1","1","2484","121","1193","2","500","740","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t28() {
		String[] input= { "992","1","0","1793","517","254","0","739","500","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t29() {
		String[] input= { "832","1","1","4454","148","4683","3","501","640","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t30() {
		String[] input= { "882","0","1","674","444","191","3","741","740","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t31() {
		String[] input= { "753","1","0","3203","448","1667","0","501","641","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t32() {
		String[] input= { "953","1","1","682","24","2477","2","739","399","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t33() {
		String[] input= { "588","1","0","3362","93","1315","3","741","639","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t34() {
		String[] input= { "965","0","0","2078","76","303","1","401","640","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t35() {
		String[] input= { "612","0","0","5073","510","1151","1","501","500","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t36() {
		String[] input= { "783","1","0","4006","586","1219","0","501","740","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t37() {
		String[] input= { "903","0","1","4075","608","5049","1","399","741","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t38() {
		String[] input= { "888","0","0","2521","241","647","1","741","639","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t39() {
		String[] input= { "971","0","1","183","524","747","2","400","401","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t40() {
		String[] input= { "668","0","0","4507","418","4267","2","740","640","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t41() {
		String[] input= { "731","0","0","2686","128","674","2","499","740","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t42() {
		String[] input= { "935","0","0","121","179","2414","0","501","639","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t43() {
		String[] input= { "952","1","1","802","26","3803","1","400","740","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t44() {
		String[] input= { "673","1","0","2913","18","2294","3","400","641","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t45() {
		String[] input= { "832","0","1","934","9","1145","2","399","401","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t46() {
		String[] input= { "547","1","1","1723","236","2963","0","739","501","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t47() {
		String[] input= { "799","0","1","5588","485","211","0","399","499","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t48() {
		String[] input= { "711","0","0","201","181","2943","1","739","741","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t49() {
		String[] input= { "987","0","0","813","318","888","3","641","400","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t50() {
		String[] input= { "821","0","1","138","79","356","2","399","640","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t51() {
		String[] input= { "528","1","0","5170","22","500","1","740","639","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t52() {
		String[] input= { "896","1","1","5784","557","585","2","739","641","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t53() {
		String[] input= { "546","0","1","1900","507","4846","1","501","641","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t54() {
		String[] input= { "822","0","0","447","353","1740","2","399","639","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t55() {
		String[] input= { "796","0","1","108","59","134","3","640","740","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t56() {
		String[] input= { "775","1","1","2961","373","5279","3","640","499","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t57() {
		String[] input= { "763","1","1","2635","387","4709","3","641","741","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t58() {
		String[] input= { "568","1","1","3423","52","3011","3","499","640","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t59() {
		String[] input= { "972","0","1","4644","495","4090","1","640","500","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t60() {
		String[] input= { "562","0","0","1642","19","895","2","400","739","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t61() {
		String[] input= { "804","0","1","3945","71","376","2","501","739","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t62() {
		String[] input= { "610","0","1","282","158","14","3","500","499","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t63() {
		String[] input= { "743","1","0","773","436","860","2","501","740","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t64() {
		String[] input= { "947","1","0","1660","606","2279","3","739","500","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t65() {
		String[] input= { "919","0","1","904","185","2680","0","641","401","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t66() {
		String[] input= { "529","0","1","2376","616","4702","3","501","739","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t67() {
		String[] input= { "632","0","1","1479","544","2213","1","499","641","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t68() {
		String[] input= { "871","0","1","4564","133","362","1","499","400","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t69() {
		String[] input= { "562","1","1","2836","195","5909","2","499","741","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t70() {
		String[] input= { "610","0","1","135","539","5537","1","739","639","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t71() {
		String[] input= { "867","1","1","1874","201","4704","0","499","499","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t72() {
		String[] input= { "845","1","0","647","226","4212","2","501","499","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t73() {
		String[] input= { "822","1","0","5034","541","2582","2","740","740","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t74() {
		String[] input= { "769","0","1","903","91","233","3","399","740","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t75() {
		String[] input= { "667","0","0","4200","562","645","3","640","739","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t76() {
		String[] input= { "597","0","0","5459","555","2985","3","741","401","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t77() {
		String[] input= { "959","1","1","1600","566","3684","1","641","740","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t78() {
		String[] input= { "557","0","1","1365","369","241","0","500","401","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t79() {
		String[] input= { "877","0","1","3749","566","3439","1","641","739","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t80() {
		String[] input= { "637","1","1","486","588","3732","2","399","641","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t81() {
		String[] input= { "950","1","1","1309","2","5510","3","740","639","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t82() {
		String[] input= { "925","0","1","508","500","1124","3","740","740","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t83() {
		String[] input= { "691","0","0","1625","534","5258","0","400","639","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t84() {
		String[] input= { "833","1","1","927","145","2642","2","641","501","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t85() {
		String[] input= { "804","0","1","1933","194","1176","0","640","639","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t86() {
		String[] input= { "937","0","1","2358","298","524","1","740","741","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t87() {
		String[] input= { "542","0","0","96","231","2100","2","400","741","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t88() {
		String[] input= { "975","0","0","1371","238","1272","1","400","640","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t89() {
		String[] input= { "690","0","0","173","231","681","1","499","741","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t90() {
		String[] input= { "866","1","1","5987","18","2595","1","639","639","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t91() {
		String[] input= { "915","0","0","1855","99","3443","2","401","740","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t92() {
		String[] input= { "630","1","0","3335","578","2359","3","401","740","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t93() {
		String[] input= { "843","1","1","1806","481","1209","3","640","500","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t94() {
		String[] input= { "564","1","0","389","179","377","3","741","501","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t95() {
		String[] input= { "685","1","1","4828","116","410","2","501","500","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t96() {
		String[] input= { "716","0","0","1318","76","54","2","400","640","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t97() {
		String[] input= { "624","1","0","3575","185","2668","2","501","639","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t98() {
		String[] input= { "922","0","0","5533","587","5628","1","640","499","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t99() {
		String[] input= { "651","1","0","270","517","5308","0","739","740","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t100() {
		String[] input= { "931","0","0","472","619","702","3","639","740","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t101() {
		String[] input= { "827","0","1","1691","437","776","1","641","399","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t102() {
		String[] input= { "636","0","0","4210","340","4046","0","741","401","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t103() {
		String[] input= { "838","1","0","5179","451","3128","2","399","740","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t104() {
		String[] input= { "807","1","1","3747","344","2226","1","641","401","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t105() {
		String[] input= { "953","1","1","5194","356","2325","3","501","401","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t106() {
		String[] input= { "779","1","1","5328","619","4294","0","501","399","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t107() {
		String[] input= { "932","0","1","2219","415","189","0","641","500","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t108() {
		String[] input= { "969","1","0","691","510","603","1","740","399","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t109() {
		String[] input= { "530","0","0","515","36","368","2","740","400","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t110() {
		String[] input= { "940","1","1","203","198","885","0","499","500","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t111() {
		String[] input= { "877","0","0","996","157","2459","1","501","740","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t112() {
		String[] input= { "779","1","0","4175","94","5280","1","739","499","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t113() {
		String[] input= { "753","1","0","5017","27","1162","3","740","640","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t114() {
		String[] input= { "890","0","1","4178","598","5835","2","741","401","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t115() {
		String[] input= { "969","1","1","375","228","986","0","499","499","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t116() {
		String[] input= { "705","0","0","3770","607","499","1","401","399","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t117() {
		String[] input= { "886","1","1","1380","305","2806","0","641","739","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t118() {
		String[] input= { "833","0","0","981","545","739","0","499","399","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t119() {
		String[] input= { "656","0","0","892","409","4552","1","399","639","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t120() {
		String[] input= { "913","0","0","58","84","1982","1","739","500","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t121() {
		String[] input= { "675","1","0","300","395","2397","2","501","639","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t122() {
		String[] input= { "625","1","1","3344","560","3343","1","501","499","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t123() {
		String[] input= { "750","0","0","5769","41","906","1","401","741","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t124() {
		String[] input= { "817","1","0","973","245","3280","3","740","640","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t125() {
		String[] input= { "651","0","1","982","211","394","3","500","741","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t126() {
		String[] input= { "646","0","1","1598","269","5991","0","400","739","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t127() {
		String[] input= { "670","1","1","1329","428","5569","1","399","740","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t128() {
		String[] input= { "622","1","0","4421","180","1996","2","639","640","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t129() {
		String[] input= { "548","1","1","4416","322","1952","0","739","500","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t130() {
		String[] input= { "654","1","1","2133","113","442","3","641","741","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t131() {
		String[] input= { "543","0","1","2857","188","2979","3","401","741","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t132() {
		String[] input= { "845","1","0","2624","419","4353","1","400","641","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t133() {
		String[] input= { "837","1","1","3649","52","3911","3","640","499","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t134() {
		String[] input= { "812","1","0","2155","530","1846","2","640","739","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t135() {
		String[] input= { "554","1","0","4534","6","1975","3","399","499","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t136() {
		String[] input= { "888","1","0","3648","302","215","1","501","399","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t137() {
		String[] input= { "702","1","1","3653","250","423","1","401","501","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t138() {
		String[] input= { "774","1","1","551","433","2572","1","740","639","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t139() {
		String[] input= { "594","1","1","5449","318","4116","1","400","501","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t140() {
		String[] input= { "961","0","1","902","126","3531","1","740","500","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t141() {
		String[] input= { "934","1","1","2743","366","5463","2","739","399","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t142() {
		String[] input= { "533","0","0","5750","407","4328","2","641","400","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t143() {
		String[] input= { "712","1","1","2545","341","4146","0","641","740","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t144() {
		String[] input= { "780","0","0","702","12","4837","3","740","739","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t145() {
		String[] input= { "861","1","1","2982","567","3850","3","400","401","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t146() {
		String[] input= { "829","1","0","4012","389","818","1","401","400","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t147() {
		String[] input= { "660","0","1","3874","28","726","1","400","401","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t148() {
		String[] input= { "716","1","1","2749","240","993","3","401","739","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t149() {
		String[] input= { "739","1","1","609","48","1187","1","741","639","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t150() {
		String[] input= { "592","1","0","1045","226","4721","2","640","401","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t151() {
		String[] input= { "833","0","0","678","405","963","2","400","739","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t152() {
		String[] input= { "940","0","0","651","469","3461","2","639","400","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t153() {
		String[] input= { "690","0","0","404","384","908","0","500","740","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t154() {
		String[] input= { "757","1","1","3234","187","2853","3","401","500","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t155() {
		String[] input= { "879","0","1","553","347","2553","1","639","400","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t156() {
		String[] input= { "719","1","1","5010","438","4880","0","741","640","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t157() {
		String[] input= { "690","1","1","380","577","239","0","641","640","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t158() {
		String[] input= { "793","0","1","176","89","4431","0","740","399","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t159() {
		String[] input= { "771","0","0","1054","289","282","3","400","641","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t160() {
		String[] input= { "979","0","1","931","141","79","1","639","399","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t161() {
		String[] input= { "858","0","1","3222","405","349","1","740","500","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t162() {
		String[] input= { "918","1","0","818","542","1868","2","639","639","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t163() {
		String[] input= { "741","1","1","966","413","2508","3","741","641","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t164() {
		String[] input= { "990","1","1","3490","323","281","2","640","741","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t165() {
		String[] input= { "536","0","1","927","423","2757","3","399","501","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t166() {
		String[] input= { "927","1","0","4902","351","2093","0","739","740","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t167() {
		String[] input= { "749","0","1","1037","384","703","3","400","740","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t168() {
		String[] input= { "946","1","0","2345","180","170","2","399","400","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t169() {
		String[] input= { "631","1","0","1569","330","1984","0","740","500","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t170() {
		String[] input= { "550","1","1","489","113","1317","1","640","399","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t171() {
		String[] input= { "641","0","1","41","422","4244","3","740","401","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t172() {
		String[] input= { "700","0","1","1300","580","3798","2","639","741","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t173() {
		String[] input= { "666","1","0","201","119","3080","2","399","640","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t174() {
		String[] input= { "661","0","1","3235","287","2268","1","640","399","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t175() {
		String[] input= { "826","0","0","3619","369","2109","1","741","639","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t176() {
		String[] input= { "874","0","1","771","9","4043","1","500","639","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t177() {
		String[] input= { "911","1","1","3373","346","1773","2","400","501","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t178() {
		String[] input= { "749","0","1","2307","230","1594","1","741","740","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t179() {
		String[] input= { "567","1","0","5621","399","3514","1","500","400","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t180() {
		String[] input= { "635","1","0","5854","219","617","3","399","401","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t181() {
		String[] input= { "897","1","1","1701","109","3438","1","641","401","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t182() {
		String[] input= { "598","0","1","2589","130","629","3","399","500","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t183() {
		String[] input= { "893","0","1","5001","301","711","2","400","739","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t184() {
		String[] input= { "530","0","0","1564","583","4042","1","400","500","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t185() {
		String[] input= { "854","0","0","5295","258","895","3","639","500","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t186() {
		String[] input= { "550","1","0","968","10","5679","0","500","740","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t187() {
		String[] input= { "828","1","0","4580","568","2638","0","740","639","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t188() {
		String[] input= { "944","1","1","4283","251","3431","2","639","641","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t189() {
		String[] input= { "768","0","0","889","193","4424","3","740","740","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t190() {
		String[] input= { "857","0","1","574","409","3712","2","501","501","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t191() {
		String[] input= { "659","1","0","781","18","271","3","399","499","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t192() {
		String[] input= { "827","1","1","1935","339","968","0","399","740","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t193() {
		String[] input= { "768","1","1","2197","496","5257","1","639","399","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t194() {
		String[] input= { "684","1","1","5744","499","870","3","741","739","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t195() {
		String[] input= { "722","1","0","201","343","665","1","639","499","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t196() {
		String[] input= { "571","1","0","397","173","2247","2","641","499","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t197() {
		String[] input= { "956","0","1","3698","70","717","3","399","499","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t198() {
		String[] input= { "850","1","1","4146","473","899","1","740","500","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t199() {
		String[] input= { "642","1","1","3494","125","2158","0","500","400","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t200() {
		String[] input= { "628","1","0","2784","4","3034","3","399","399","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t201() {
		String[] input= { "838","0","0","5849","266","1016","2","401","500","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t202() {
		String[] input= { "824","1","1","1917","99","850","3","739","739","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t203() {
		String[] input= { "686","0","0","1705","525","5369","1","641","401","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t204() {
		String[] input= { "934","0","1","372","159","1322","1","401","639","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t205() {
		String[] input= { "999","0","0","3577","27","4795","0","641","500","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t206() {
		String[] input= { "738","0","1","573","548","268","3","499","741","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t207() {
		String[] input= { "988","1","0","5692","580","4270","0","639","639","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t208() {
		String[] input= { "762","0","0","1874","205","4933","3","399","641","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t209() {
		String[] input= { "540","1","1","122","460","5776","2","640","740","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t210() {
		String[] input= { "745","1","1","5728","191","2829","1","401","640","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t211() {
		String[] input= { "1000","1","0","177","288","5884","3","401","640","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t212() {
		String[] input= { "638","1","0","2578","156","3757","0","500","399","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t213() {
		String[] input= { "919","0","1","131","300","3506","0","641","501","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t214() {
		String[] input= { "874","0","0","5644","103","4207","3","399","740","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t215() {
		String[] input= { "848","1","1","2141","138","2142","1","500","399","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t216() {
		String[] input= { "910","1","0","427","162","2489","2","740","741","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t217() {
		String[] input= { "838","1","0","2922","557","983","1","740","640","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t218() {
		String[] input= { "913","0","1","452","437","263","1","741","741","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t219() {
		String[] input= { "776","0","1","798","308","3693","0","400","741","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t220() {
		String[] input= { "556","0","0","5915","151","482","2","400","739","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t221() {
		String[] input= { "974","0","1","420","156","5924","0","741","400","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t222() {
		String[] input= { "781","1","0","930","207","4163","1","639","399","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t223() {
		String[] input= { "916","0","1","1828","43","3898","3","499","640","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t224() {
		String[] input= { "813","0","0","1259","55","662","1","399","501","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t225() {
		String[] input= { "822","0","0","1474","38","1377","3","641","640","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t226() {
		String[] input= { "538","0","0","186","548","2387","0","739","639","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t227() {
		String[] input= { "983","1","1","4732","69","1731","2","640","739","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t228() {
		String[] input= { "685","1","0","117","74","5136","0","640","639","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t229() {
		String[] input= { "660","1","1","4014","407","561","3","501","400","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t230() {
		String[] input= { "535","0","0","1871","69","5220","2","500","641","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t231() {
		String[] input= { "651","0","1","703","399","62","3","741","641","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t232() {
		String[] input= { "868","0","0","2014","577","1420","1","740","401","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t233() {
		String[] input= { "760","0","0","104","113","1610","3","741","401","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t234() {
		String[] input= { "856","0","1","4927","182","3316","0","741","740","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t235() {
		String[] input= { "874","0","0","3373","525","1643","2","399","641","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t236() {
		String[] input= { "844","1","1","3839","76","2610","1","740","640","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t237() {
		String[] input= { "782","1","1","263","499","1160","0","641","740","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t238() {
		String[] input= { "679","0","0","279","453","454","1","641","499","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t239() {
		String[] input= { "898","1","0","2193","11","2865","2","741","641","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t240() {
		String[] input= { "878","1","0","2425","103","556","1","740","739","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t241() {
		String[] input= { "743","1","0","1305","269","942","1","740","501","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t242() {
		String[] input= { "953","0","1","2935","224","2070","3","499","641","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t243() {
		String[] input= { "897","1","1","2226","306","3860","3","740","641","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t244() {
		String[] input= { "733","0","1","367","18","1266","1","499","399","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t245() {
		String[] input= { "643","1","1","5514","362","2288","1","400","741","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t246() {
		String[] input= { "541","0","1","5231","502","1059","1","399","639","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t247() {
		String[] input= { "598","0","0","3491","413","5933","3","741","401","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t248() {
		String[] input= { "750","1","1","682","313","4253","2","499","740","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t249() {
		String[] input= { "563","1","1","4688","587","773","3","640","639","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t250() {
		String[] input= { "544","0","0","4467","603","5942","1","501","640","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t251() {
		String[] input= { "661","1","1","1802","117","1355","3","400","499","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t252() {
		String[] input= { "880","0","1","412","407","936","1","401","739","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t253() {
		String[] input= { "832","0","0","375","147","2068","0","739","741","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t254() {
		String[] input= { "751","1","1","1924","408","2617","0","639","640","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t255() {
		String[] input= { "698","0","0","990","464","5856","3","640","501","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t256() {
		String[] input= { "858","0","1","1894","242","772","3","400","639","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t257() {
		String[] input= { "798","0","1","5229","263","1740","0","740","401","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t258() {
		String[] input= { "710","1","1","5993","315","239","1","641","401","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t259() {
		String[] input= { "743","1","1","3478","260","1672","1","400","499","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t260() {
		String[] input= { "745","0","0","2069","495","3141","3","501","501","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t261() {
		String[] input= { "865","0","1","796","147","444","0","499","400","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t262() {
		String[] input= { "554","1","1","2815","476","1600","3","641","401","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t263() {
		String[] input= { "536","0","0","3139","164","5669","1","399","501","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t264() {
		String[] input= { "849","0","1","4435","344","969","3","399","401","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t265() {
		String[] input= { "715","1","1","1085","409","1577","3","640","740","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t266() {
		String[] input= { "726","1","0","1021","340","5644","2","641","399","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t267() {
		String[] input= { "974","0","0","1091","325","69","3","501","741","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t268() {
		String[] input= { "584","1","0","679","53","117","1","739","401","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t269() {
		String[] input= { "998","1","0","2921","563","904","1","499","641","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t270() {
		String[] input= { "786","1","0","383","548","5870","0","639","399","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t271() {
		String[] input= { "809","0","0","108","413","343","3","401","399","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t272() {
		String[] input= { "873","1","0","2763","4","208","3","741","401","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t273() {
		String[] input= { "523","1","0","5002","473","909","3","499","501","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t274() {
		String[] input= { "982","1","1","927","524","5556","2","500","501","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t275() {
		String[] input= { "921","1","0","2049","162","1259","3","401","641","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t276() {
		String[] input= { "679","1","1","3180","297","5750","3","739","400","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t277() {
		String[] input= { "755","0","0","2949","565","2031","0","399","741","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t278() {
		String[] input= { "643","0","1","1976","129","124","1","499","641","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t279() {
		String[] input= { "815","0","0","836","295","1267","3","739","499","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t280() {
		String[] input= { "677","1","0","4864","257","5470","1","501","399","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t281() {
		String[] input= { "986","1","1","1534","145","2736","3","641","401","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t282() {
		String[] input= { "841","1","1","670","226","4140","1","640","740","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t283() {
		String[] input= { "960","0","1","5487","575","2958","0","400","500","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t284() {
		String[] input= { "945","1","1","1426","406","555","2","401","739","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t285() {
		String[] input= { "587","0","0","3575","5","815","0","639","739","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t286() {
		String[] input= { "816","1","1","5118","231","4376","1","500","499","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t287() {
		String[] input= { "772","1","1","2007","377","416","1","401","639","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t288() {
		String[] input= { "802","0","1","3169","150","4244","2","739","400","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t289() {
		String[] input= { "745","1","0","85","144","5206","3","401","499","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t290() {
		String[] input= { "944","0","0","2065","348","818","2","640","739","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t291() {
		String[] input= { "937","1","1","5273","326","878","1","640","641","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t292() {
		String[] input= { "594","0","1","574","103","969","2","499","399","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t293() {
		String[] input= { "725","1","1","2766","354","4811","3","641","501","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t294() {
		String[] input= { "523","1","1","877","601","5608","1","639","400","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t295() {
		String[] input= { "931","1","0","5113","72","3242","3","400","639","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t296() {
		String[] input= { "716","1","0","5046","323","3839","1","639","500","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t297() {
		String[] input= { "893","1","0","5078","256","3944","1","500","641","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t298() {
		String[] input= { "819","0","0","3878","331","5704","3","740","499","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t299() {
		String[] input= { "611","0","0","1509","98","667","3","739","399","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t300() {
		String[] input= { "574","0","1","2060","111","2572","3","500","641","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t301() {
		String[] input= { "989","1","0","1208","55","4201","2","499","400","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t302() {
		String[] input= { "895","1","1","985","483","3388","2","501","400","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t303() {
		String[] input= { "724","0","1","1495","597","5243","0","640","500","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t304() {
		String[] input= { "932","1","1","3456","557","571","2","640","400","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t305() {
		String[] input= { "521","1","0","1907","348","2633","0","499","501","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t306() {
		String[] input= { "608","1","1","674","216","442","0","741","400","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t307() {
		String[] input= { "589","0","1","3817","593","223","3","400","641","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t308() {
		String[] input= { "841","0","1","3618","311","1559","1","400","739","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t309() {
		String[] input= { "746","1","0","121","246","362","1","401","640","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t310() {
		String[] input= { "628","1","0","5645","573","1477","2","501","399","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t311() {
		String[] input= { "845","1","0","805","521","374","3","499","740","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t312() {
		String[] input= { "690","0","1","4135","106","3520","1","499","639","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t313() {
		String[] input= { "548","1","1","2625","249","1679","0","641","501","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t314() {
		String[] input= { "763","0","0","907","444","1881","0","741","399","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t315() {
		String[] input= { "750","1","1","1730","298","60","0","640","500","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t316() {
		String[] input= { "653","1","0","1707","280","3904","3","501","740","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t317() {
		String[] input= { "697","0","0","539","241","2597","3","640","741","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t318() {
		String[] input= { "556","1","1","351","9","281","3","741","639","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t319() {
		String[] input= { "789","0","0","3283","354","1116","2","640","400","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t320() {
		String[] input= { "717","0","0","3436","374","1439","2","640","740","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t321() {
		String[] input= { "596","0","0","5238","574","857","3","739","501","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t322() {
		String[] input= { "767","0","1","2316","399","3575","0","499","501","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t323() {
		String[] input= { "806","1","0","2197","495","5711","0","401","739","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t324() {
		String[] input= { "593","0","1","765","481","3711","0","500","641","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t325() {
		String[] input= { "955","0","1","1836","542","3698","3","500","401","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t326() {
		String[] input= { "622","1","1","3661","13","223","1","499","739","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t327() {
		String[] input= { "719","0","0","5273","196","3585","1","740","740","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t328() {
		String[] input= { "772","0","1","3773","87","4375","1","639","400","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t329() {
		String[] input= { "612","1","0","4829","4","200","1","399","500","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t330() {
		String[] input= { "694","1","1","3238","81","1642","1","500","739","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t331() {
		String[] input= { "564","0","0","417","556","3138","0","741","639","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t332() {
		String[] input= { "994","0","0","3682","579","39","0","400","740","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t333() {
		String[] input= { "689","1","0","5258","331","1464","2","640","501","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t334() {
		String[] input= { "971","1","0","383","189","4986","3","739","501","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t335() {
		String[] input= { "775","0","1","865","102","2303","3","401","401","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t336() {
		String[] input= { "612","0","1","3691","242","485","1","401","500","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t337() {
		String[] input= { "980","1","1","904","214","2419","1","400","641","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t338() {
		String[] input= { "785","1","0","2740","421","162","3","741","741","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t339() {
		String[] input= { "546","0","0","2569","544","2947","0","399","640","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t340() {
		String[] input= { "886","0","0","2059","459","274","1","401","641","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t341() {
		String[] input= { "889","0","0","3799","100","4302","1","499","640","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t342() {
		String[] input= { "698","1","1","4165","477","5526","2","641","500","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t343() {
		String[] input= { "644","0","1","2518","298","896","2","401","500","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t344() {
		String[] input= { "843","0","1","1935","2","4489","0","499","401","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t345() {
		String[] input= { "577","1","1","2046","389","495","0","740","501","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t346() {
		String[] input= { "856","1","1","2716","320","1742","2","641","401","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t347() {
		String[] input= { "900","1","0","3346","507","663","2","640","639","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t348() {
		String[] input= { "995","0","1","3499","70","1262","1","640","399","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t349() {
		String[] input= { "656","0","1","4956","595","2307","2","501","741","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t350() {
		String[] input= { "878","0","1","4939","250","1842","2","640","400","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t351() {
		String[] input= { "591","1","1","1124","287","2790","2","640","501","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t352() {
		String[] input= { "785","0","1","2802","447","2187","1","400","740","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t353() {
		String[] input= { "904","1","1","2361","527","419","2","401","400","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t354() {
		String[] input= { "619","1","0","197","287","4568","2","500","499","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t355() {
		String[] input= { "928","1","1","380","232","5117","1","740","499","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t356() {
		String[] input= { "860","1","1","602","331","5657","3","639","740","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t357() {
		String[] input= { "661","0","0","767","26","5316","3","640","399","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t358() {
		String[] input= { "534","1","0","5360","149","1528","3","740","499","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t359() {
		String[] input= { "774","1","1","1231","234","61","2","400","500","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t360() {
		String[] input= { "804","0","1","3514","152","1152","1","740","501","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t361() {
		String[] input= { "887","0","0","1725","477","2346","2","741","739","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t362() {
		String[] input= { "808","1","1","946","546","661","1","400","640","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t363() {
		String[] input= { "800","1","0","2067","586","284","3","740","499","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t364() {
		String[] input= { "811","0","0","2117","222","3074","3","501","399","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t365() {
		String[] input= { "661","0","0","963","177","5207","3","499","400","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t366() {
		String[] input= { "995","0","0","2133","218","905","1","501","501","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t367() {
		String[] input= { "788","0","0","113","177","2105","2","501","741","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t368() {
		String[] input= { "906","0","0","4284","439","111","2","740","740","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t369() {
		String[] input= { "537","0","1","1397","427","1241","1","739","740","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t370() {
		String[] input= { "876","1","1","508","401","271","0","401","400","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t371() {
		String[] input= { "548","1","0","2001","399","523","0","741","739","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t372() {
		String[] input= { "801","0","1","5536","450","504","2","741","740","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t373() {
		String[] input= { "921","0","1","2166","315","3826","0","739","500","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t374() {
		String[] input= { "958","0","0","1971","138","4932","2","400","640","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t375() {
		String[] input= { "661","1","1","23","469","2852","1","400","500","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t376() {
		String[] input= { "878","0","1","5906","588","3803","2","499","399","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t377() {
		String[] input= { "664","1","0","3757","24","2579","1","499","739","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t378() {
		String[] input= { "564","1","0","463","166","199","2","500","640","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t379() {
		String[] input= { "787","0","1","3296","306","326","3","741","639","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t380() {
		String[] input= { "843","0","1","154","327","2365","0","640","499","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t381() {
		String[] input= { "669","1","0","287","436","2803","3","740","400","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t382() {
		String[] input= { "734","0","0","2049","280","5472","0","399","499","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t383() {
		String[] input= { "578","1","0","1170","526","4785","1","399","741","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t384() {
		String[] input= { "541","1","0","3553","365","687","0","400","741","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t385() {
		String[] input= { "530","0","1","129","519","1555","1","501","640","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t386() {
		String[] input= { "847","0","1","2379","193","4481","0","641","741","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t387() {
		String[] input= { "867","1","1","1211","581","153","2","640","641","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t388() {
		String[] input= { "607","1","1","4250","14","4883","2","399","641","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t389() {
		String[] input= { "558","0","1","84","275","4457","1","501","401","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t390() {
		String[] input= { "526","0","1","751","595","2071","3","400","641","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t391() {
		String[] input= { "745","0","1","730","516","245","1","641","399","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t392() {
		String[] input= { "812","1","0","4165","80","690","0","741","401","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t393() {
		String[] input= { "785","0","1","4931","240","554","2","499","400","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t394() {
		String[] input= { "540","1","0","672","233","7","0","641","399","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t395() {
		String[] input= { "756","0","1","562","415","3339","2","640","640","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t396() {
		String[] input= { "695","0","1","55","100","2038","1","499","401","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t397() {
		String[] input= { "559","1","1","1883","613","4507","2","640","500","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t398() {
		String[] input= { "676","1","0","566","287","5295","2","399","500","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t399() {
		String[] input= { "571","0","0","3403","576","850","1","741","500","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t400() {
		String[] input= { "831","0","1","468","108","3882","1","500","399","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t401() {
		String[] input= { "794","1","1","562","577","2901","2","499","401","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t402() {
		String[] input= { "680","0","0","505","44","186","1","739","741","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t403() {
		String[] input= { "924","0","0","1568","86","533","0","739","499","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t404() {
		String[] input= { "833","1","0","4117","424","2255","1","501","401","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t405() {
		String[] input= { "759","0","0","1552","265","4793","0","641","640","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t406() {
		String[] input= { "973","0","0","1209","444","4409","2","399","641","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t407() {
		String[] input= { "739","1","1","5287","252","632","1","740","639","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t408() {
		String[] input= { "912","0","0","2658","192","3449","3","399","401","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t409() {
		String[] input= { "750","0","0","5376","523","2611","2","500","639","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t410() {
		String[] input= { "953","0","1","1508","132","672","3","499","499","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t411() {
		String[] input= { "782","1","1","513","224","5295","0","641","639","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t412() {
		String[] input= { "722","1","1","1415","245","316","0","401","739","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t413() {
		String[] input= { "836","1","0","4086","407","308","2","499","400","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t414() {
		String[] input= { "994","0","1","3194","242","687","1","501","741","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t415() {
		String[] input= { "644","1","1","1986","596","2448","0","741","400","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t416() {
		String[] input= { "935","1","1","792","272","3451","3","401","740","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t417() {
		String[] input= { "690","1","1","4560","148","43","2","741","500","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t418() {
		String[] input= { "596","1","0","4634","393","376","1","640","501","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t419() {
		String[] input= { "538","0","1","404","384","4237","2","640","499","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t420() {
		String[] input= { "799","0","1","386","380","351","1","639","639","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t421() {
		String[] input= { "640","0","1","2175","485","1271","3","639","499","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t422() {
		String[] input= { "884","0","1","754","323","2052","3","399","640","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t423() {
		String[] input= { "635","1","0","1142","511","4704","1","740","500","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t424() {
		String[] input= { "781","1","0","1855","408","3758","3","741","741","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t425() {
		String[] input= { "757","1","1","319","51","300","1","401","741","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t426() {
		String[] input= { "526","1","1","5505","562","2174","2","639","399","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t427() {
		String[] input= { "867","0","0","4266","161","5389","1","640","741","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t428() {
		String[] input= { "693","1","1","4557","254","482","3","740","739","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t429() {
		String[] input= { "671","0","1","5327","132","902","2","400","500","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t430() {
		String[] input= { "818","0","1","100","562","4914","0","739","401","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t431() {
		String[] input= { "780","1","0","5331","10","1209","3","399","640","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t432() {
		String[] input= { "706","1","0","4170","207","133","3","499","400","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t433() {
		String[] input= { "714","1","1","1027","537","387","3","739","400","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t434() {
		String[] input= { "946","0","0","693","550","4173","2","399","400","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t435() {
		String[] input= { "630","1","0","2188","209","2525","0","639","739","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t436() {
		String[] input= { "914","1","1","4924","384","5869","3","740","741","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t437() {
		String[] input= { "721","1","0","4129","379","2370","3","500","741","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t438() {
		String[] input= { "831","1","0","4955","8","4715","0","500","399","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t439() {
		String[] input= { "905","1","0","1171","158","385","0","739","499","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t440() {
		String[] input= { "899","0","1","4998","2","4230","0","500","501","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t441() {
		String[] input= { "924","0","1","1780","437","998","2","501","639","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t442() {
		String[] input= { "574","1","0","317","311","2079","1","400","400","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t443() {
		String[] input= { "623","0","1","4856","546","420","3","500","501","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t444() {
		String[] input= { "699","0","0","4483","280","358","1","499","639","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t445() {
		String[] input= { "942","1","1","2938","179","534","0","740","641","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t446() {
		String[] input= { "571","0","1","379","114","2328","2","400","401","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t447() {
		String[] input= { "965","0","0","5560","431","1871","0","741","399","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t448() {
		String[] input= { "974","0","1","1279","110","1990","3","400","501","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t449() {
		String[] input= { "559","1","1","2851","413","4323","2","501","740","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t450() {
		String[] input= { "655","1","1","4095","265","3490","2","739","499","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t451() {
		String[] input= { "860","1","1","2944","139","5412","0","399","641","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t452() {
		String[] input= { "924","1","0","1981","336","3860","2","500","501","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t453() {
		String[] input= { "848","1","0","2408","180","525","0","740","401","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t454() {
		String[] input= { "921","0","1","1788","125","516","3","399","739","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t455() {
		String[] input= { "852","1","1","1399","347","1245","1","400","641","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t456() {
		String[] input= { "897","0","0","2622","326","3725","2","401","400","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t457() {
		String[] input= { "933","0","1","567","407","1839","0","641","640","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t458() {
		String[] input= { "776","1","0","954","72","2987","3","399","741","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t459() {
		String[] input= { "748","1","0","508","81","1372","0","740","739","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t460() {
		String[] input= { "624","0","1","3277","264","5028","3","640","400","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t461() {
		String[] input= { "570","1","1","5125","85","4371","0","400","499","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t462() {
		String[] input= { "546","0","1","4364","90","4988","3","739","640","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t463() {
		String[] input= { "732","0","0","2558","599","3531","0","399","739","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t464() {
		String[] input= { "795","0","0","3378","59","440","0","399","740","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t465() {
		String[] input= { "574","0","0","321","131","1814","0","639","641","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t466() {
		String[] input= { "997","1","0","4466","100","4610","1","639","400","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t467() {
		String[] input= { "740","1","1","972","312","3512","3","501","740","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t468() {
		String[] input= { "869","0","0","5624","18","702","2","500","641","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t469() {
		String[] input= { "955","0","1","1567","366","363","0","401","639","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t470() {
		String[] input= { "735","1","0","2792","119","224","3","739","739","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t471() {
		String[] input= { "912","1","0","4251","133","545","1","739","399","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t472() {
		String[] input= { "607","1","0","5014","531","310","1","739","501","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t473() {
		String[] input= { "733","1","0","1785","585","343","3","741","499","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t474() {
		String[] input= { "811","1","1","4100","193","5500","3","641","500","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t475() {
		String[] input= { "715","0","0","1768","391","1782","2","740","399","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t476() {
		String[] input= { "797","0","0","4454","508","288","2","741","401","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t477() {
		String[] input= { "578","0","0","4590","303","220","0","499","501","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t478() {
		String[] input= { "621","0","1","675","520","3199","3","641","400","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t479() {
		String[] input= { "841","0","1","427","9","4967","2","740","501","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t480() {
		String[] input= { "524","0","0","2495","396","506","3","740","640","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t481() {
		String[] input= { "848","0","0","2494","271","2583","1","501","641","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t482() {
		String[] input= { "966","0","0","5272","252","451","3","499","740","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t483() {
		String[] input= { "820","0","0","1557","524","1163","0","499","499","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t484() {
		String[] input= { "679","1","1","541","338","5123","0","641","641","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t485() {
		String[] input= { "565","0","0","4233","97","5531","1","739","641","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t486() {
		String[] input= { "793","0","0","5989","606","3063","3","500","641","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t487() {
		String[] input= { "609","0","0","259","8","3583","0","641","741","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t488() {
		String[] input= { "962","0","0","3810","528","1326","2","641","400","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t489() {
		String[] input= { "587","1","0","4426","303","1022","0","499","741","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t490() {
		String[] input= { "607","0","0","3707","320","5543","0","639","639","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t491() {
		String[] input= { "584","1","1","1289","401","4395","1","501","639","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t492() {
		String[] input= { "564","1","1","4996","391","1494","3","640","500","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t493() {
		String[] input= { "952","0","1","2813","121","3907","0","501","401","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t494() {
		String[] input= { "817","0","1","4129","65","3077","0","739","401","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t495() {
		String[] input= { "726","0","0","3176","519","2689","1","400","641","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t496() {
		String[] input= { "895","0","1","5104","338","372","3","500","639","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t497() {
		String[] input= { "928","1","1","3716","536","1907","2","501","639","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t498() {
		String[] input= { "608","1","1","3093","528","5892","1","400","400","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t499() {
		String[] input= { "627","1","0","151","446","1983","3","401","500","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t500() {
		String[] input= { "597","-1","0","-1","577","0","0","605","931","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t501() {
		String[] input= { "653","1","-1","740","-1","702","-1","0","-1","2","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t502() {
		String[] input= { "0","0","0","0","609","-1","1","582","89","4","0","-1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t503() {
		String[] input= { "-1","1","0","9343","0","127","3","-100","0","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t504() {
		String[] input= { "640","0","0","569","400","586","1","1012","1037","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t505() {
		String[] input= { "1174","1","0","586","373","559","2","259","351","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t506() {
		String[] input= { "684","1","1","522","426","478","0","848","496","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t507() {
		String[] input= { "1016","1","1","628","0","614","0","0","746","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t508() {
		String[] input= { "913","0","1","722","520","657","2","714","822","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t509() {
		String[] input= { "4","1","1","0","409","648","2","601","657","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t510() {
		String[] input= { "595","0","1","647","357","695","1","536","593","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t511() {
		String[] input= { "925","1","1","557","349","608","3","994","880","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t512() {
		String[] input= { "1108","1","1","583","449","601","1","712","725","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t513() {
		String[] input= { "681","1","0","614","482","0","0","707","757","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t514() {
		String[] input= { "1081","1","0","675","428","638","0","917","920","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t515() {
		String[] input= { "652","1","1","638","609","620","1","726","0","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t516() {
		String[] input= { "1093","1","1","0","580","750","1","678","447","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t517() {
		String[] input= { "859","1","0","632","355","662","2","379","97","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t518() {
		String[] input= { "709","1","1","4523","547","657","3","743","743","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t519() {
		String[] input= { "694","1","0","631","485","642","9","442","418","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t520() {
		String[] input= { "647","1","1","570","505","615","1","341","392","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t521() {
		String[] input= { "810","1","0","686","458","122","3","1017","980","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t522() {
		String[] input= { "766","1","1","0","380","744","0","370","369","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t523() {
		String[] input= { "860","1","1","618","329","574","4","893","914","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t524() {
		String[] input= { "654","1","1","912","496","465","0","587","495","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t525() {
		String[] input= { "760","1","1","753","595","619","0","679","630","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t526() {
		String[] input= { "1149","1","0","562","485","272","1","670","633","2","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t527() {
		String[] input= { "987","1","0","550","587","819","2","929","955","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t528() {
		String[] input= { "907","1","0","560","342","601","3","961","399","2","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t529() {
		String[] input= { "1207","1","1","591","996","658","1","556","0","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t530() {
		String[] input= { "-1","1","0","631","370","661","2","820","825","1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t531() {
		String[] input= { "775","1","1","0","506","596","0","906","685","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t532() {
		String[] input= { "1018","1","1","3177","325","624","3","1026","1017","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t533() {
		String[] input= { "868","1","1","731","361","699","1","672","690","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t534() {
		String[] input= { "895","1","1","-1","403","718","2","694","708","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t535() {
		String[] input= { "837","1","1","711","452","726","2","593","506","2","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t536() {
		String[] input= { "887","1","1","591","589","-100","2","424","457","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t537() {
		String[] input= { "1027","1","1","-100","369","599","1","737","708","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t538() {
		String[] input= { "589","1","0","657","557","644","3","0","999","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t539() {
		String[] input= { "1144","1","1","590","490","646","3","457","0","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t540() {
		String[] input= { "646","1","1","630","310","615","2","318","314","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t541() {
		String[] input= { "1168","1","1","0","590","673","0","387","377","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t542() {
		String[] input= { "248","1","0","0","584","616","3","566","523","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t543() {
		String[] input= { "837","1","0","691","396","0","0","949","942","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t544() {
		String[] input= { "854","1","1","703","502","730","1","0","617","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t545() {
		String[] input= { "1172","1","1","0","590","732","3","745","765","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t546() {
		String[] input= { "746","1","0","0","391","601","3","837","957","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t547() {
		String[] input= { "897","1","1","3257","470","707","2","744","693","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t548() {
		String[] input= { "589","0","1","584","798","567","2","957","925","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t549() {
		String[] input= { "697","0","0","726","322","725","3","638","650","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t550() {
		String[] input= { "787","1","1","0","293","597","0","726","686","1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t551() {
		String[] input= { "866","0","1","657","464","43","2","403","424","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t552() {
		String[] input= { "854","1","0","687","426","684","1","623","744","3","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t553() {
		String[] input= { "1016","1","0","658","359","644","1","391","442","1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t554() {
		String[] input= { "905","0","1","699","436","742","1","372","331","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t555() {
		String[] input= { "892","0","1","762","445","157","2","442","440","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t556() {
		String[] input= { "1005","1","1","601","394","601","1","717","0","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t557() {
		String[] input= { "934","1","0","5216","458","972","1","539","464","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t558() {
		String[] input= { "1184","1","1","4983","523","689","0","653","938","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t559() {
		String[] input= { "1146","1","0","656","392","691","0","860","0","1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t560() {
		String[] input= { "666","1","1","577","342","558","2","193","1016","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t561() {
		String[] input= { "1059","0","0","640","380","580","0","748","692","2","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t562() {
		String[] input= { "934","1","0","603","333","552","0","410","439","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t563() {
		String[] input= { "947","1","1","677","237","681","2","594","352","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t564() {
		String[] input= { "655","1","1","628","348","861","2","455","0","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t565() {
		String[] input= { "1137","1","1","687","292","572","2","0","372","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t566() {
		String[] input= { "812","1","0","663","336","587","0","518","20","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t567() {
		String[] input= { "1022","1","1","554","320","598","2","914","494","2","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t568() {
		String[] input= { "761","1","0","608","527","596","0","663","632","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t569() {
		String[] input= { "0","0","1","60","432","738","3","863","852","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t570() {
		String[] input= { "808","1","0","581","492","448","2","452","0","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t571() {
		String[] input= { "845","1","1","667","661","683","1","446","404","2","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t572() {
		String[] input= { "815","1","0","625","419","657","0","0","887","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t573() {
		String[] input= { "756","1","1","586","341","824","3","417","361","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t574() {
		String[] input= { "640","1","0","654","438","0","1","0","415","2","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t575() {
		String[] input= { "1118","1","1","712","261","735","1","423","450","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t576() {
		String[] input= { "1073","1","1","2223","379","752","0","435","438","2","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t577() {
		String[] input= { "763","1","1","6514","0","643","3","816","756","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t578() {
		String[] input= { "1064","1","1","674","401","663","9","560","900","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t579() {
		String[] input= { "592","1","1","701","532","688","3","396","372","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t580() {
		String[] input= { "1037","1","0","610","504","623","3","0","877","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t581() {
		String[] input= { "795","1","-1","538","325","601","2","702","634","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t582() {
		String[] input= { "709","1","1","686","483","672","1","465","475","1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t583() {
		String[] input= { "847","1","1","1325","360","668","2","817","803","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t584() {
		String[] input= { "782","1","0","729","462","0","1","449","818","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t585() {
		String[] input= { "964","1","1","2672","326","714","2","18","609","2","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t586() {
		String[] input= { "796","1","1","0","535","627","1","329","0","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t587() {
		String[] input= { "1058","1","0","707","0","703","0","901","906","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t588() {
		String[] input= { "732","1","1","654","413","710","2","306","375","-1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t589() {
		String[] input= { "1122","1","1","705","374","716","1","0","547","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t590() {
		String[] input= { "1022","1","0","716","503","-1","1","629","815","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t591() {
		String[] input= { "1109","1","1","557","344","639","0","370","-100","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t592() {
		String[] input= { "764","-1","0","561","530","592","1","593","619","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t593() {
		String[] input= { "756","1","1","546","603","603","0","0","796","2","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t594() {
		String[] input= { "811","1","0","691","350","0","0","619","0","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t595() {
		String[] input= { "1149","1","1","606","399","602","1","441","369","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t596() {
		String[] input= { "1096","1","0","714","496","682","1","944","908","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t597() {
		String[] input= { "1039","0","1","1310","948","653","0","0","922","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t598() {
		String[] input= { "806","1","0","744","0","349","2","839","-100","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t599() {
		String[] input= { "1032","1","0","707","389","727","1","297","0","2","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t600() {
		String[] input= { "854","1","1","4049","773","654","2","595","625","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t601() {
		String[] input= { "1159","0","1","672","298","178","2","468","0","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t602() {
		String[] input= { "752","1","1","733","398","746","3","328","0","0","2","9"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t603() {
		String[] input= { "1143","0","0","604","365","0","1","451","458","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t604() {
		String[] input= { "-1","1","1","604","607","622","0","0","0","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t605() {
		String[] input= { "943","1","1","668","833","956","2","588","556","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t606() {
		String[] input= { "1175","1","0","619","491","684","1","693","60","2","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t607() {
		String[] input= { "784","1","1","566","870","578","2","969","694","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t608() {
		String[] input= { "708","1","1","871","369","712","3","427","478","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t609() {
		String[] input= { "162","1","0","587","577","110","0","647","962","1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t610() {
		String[] input= { "1074","1","0","0","305","666","3","306","356","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t611() {
		String[] input= { "800","1","0","735","323","724","2","233","584","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t612() {
		String[] input= { "1078","1","0","673","311","692","2","551","490","2","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t613() {
		String[] input= { "613","1","1","711","538","0","1","363","398","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t614() {
		String[] input= { "860","1","0","-1","485","422","0","330","273","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t615() {
		String[] input= { "615","1","1","767","616","0","1","751","673","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t616() {
		String[] input= { "0","1","0","692","465","646","3","872","825","2","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t617() {
		String[] input= { "792","0","0","625","409","541","2","381","403","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t618() {
		String[] input= { "-1","0","1","593","447","655","1","366","314","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t619() {
		String[] input= { "1113","1","0","7965","430","596","1","820","876","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t620() {
		String[] input= { "999","1","0","0","447","610","1","511","464","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t621() {
		String[] input= { "865","1","1","634","344","699","1","-100","600","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t622() {
		String[] input= { "974","0","1","651","539","671","1","955","997","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t623() {
		String[] input= { "1016","1","0","712","426","0","0","361","745","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t624() {
		String[] input= { "1051","1","0","618","294","236","1","230","872","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t625() {
		String[] input= { "232","1","1","583","513","601","0","0","928","1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t626() {
		String[] input= { "661","0","0","544","598","0","1","573","566","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t627() {
		String[] input= { "784","1","0","0","365","732","0","611","624","2","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t628() {
		String[] input= { "695","0","0","593","451","568","2","981","0","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t629() {
		String[] input= { "1112","1","1","601","400","663","1","298","0","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t630() {
		String[] input= { "876","-1","1","745","375","892","1","930","930","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t631() {
		String[] input= { "1063","1","0","662","0","592","3","416","346","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t632() {
		String[] input= { "271","1","1","697","633","691","3","890","868","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t633() {
		String[] input= { "1208","1","0","544","-1","605","1","797","801","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t634() {
		String[] input= { "1185","1","-1","710","378","674","3","604","554","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t635() {
		String[] input= { "1206","1","0","5140","355","730","2","980","693","2","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t636() {
		String[] input= { "1155","1","0","603","349","514","3","816","863","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t637() {
		String[] input= { "6","0","0","648","427","687","0","961","947","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t638() {
		String[] input= { "601","1","0","672","0","660","3","577","545","0","2","3"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t639() {
		String[] input= { "648","1","0","680","511","428","3","0","314","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t640() {
		String[] input= { "774","1","1","0","433","239","0","-1","390","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t641() {
		String[] input= { "909","1","0","575","444","-100","1","523","981","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t642() {
		String[] input= { "780","0","1","669","562","387","1","0","951","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t643() {
		String[] input= { "697","1","0","728","614","725","1","173","131","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t644() {
		String[] input= { "0","1","1","752","563","695","1","602","656","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t645() {
		String[] input= { "1004","1","0","0","393","597","1","450","743","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t646() {
		String[] input= { "849","1","1","734","651","0","2","571","565","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t647() {
		String[] input= { "777","1","0","6281","379","700","0","594","0","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t648() {
		String[] input= { "1169","1","0","616","922","690","3","0","784","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t649() {
		String[] input= { "1090","1","0","762","308","713","1","774","759","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t650() {
		String[] input= { "1170","1","1","605","569","629","2","662","665","0","2","9"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t651() {
		String[] input= { "981","1","1","459","317","590","2","533","544","2","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t652() {
		String[] input= { "1158","0","0","608","441","601","0","671","812","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t653() {
		String[] input= { "0","1","0","1049","563","594","3","401","372","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t654() {
		String[] input= { "1105","1","1","-100","430","529","3","842","74","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t655() {
		String[] input= { "680","1","1","3803","981","581","3","769","812","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t656() {
		String[] input= { "1165","1","0","690","19","871","0","293","346","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t657() {
		String[] input= { "0","1","0","570","620","611","0","992","1023","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t658() {
		String[] input= { "1105","0","0","584","450","293","1","755","638","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t659() {
		String[] input= { "966","-1","1","3658","196","660","1","0","452","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t660() {
		String[] input= { "639","1","0","8459","370","678","1","737","810","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t661() {
		String[] input= { "836","1","0","637","-1","0","0","984","1003","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t662() {
		String[] input= { "903","1","1","684","368","661","0","725","0","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t663() {
		String[] input= { "908","0","0","613","38","564","1","775","835","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t664() {
		String[] input= { "1196","0","-1","688","398","663","0","485","434","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t665() {
		String[] input= { "1055","1","0","9520","512","686","3","0","368","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t666() {
		String[] input= { "618","-1","1","737","0","708","1","907","371","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t667() {
		String[] input= { "825","1","1","783","329","499","3","931","914","1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t668() {
		String[] input= { "969","1","0","719","330","690","1","932","-1","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t669() {
		String[] input= { "1072","1","1","0","457","603","0","481","759","1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t670() {
		String[] input= { "1101","1","1","713","422","0","3","785","778","1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t671() {
		String[] input= { "1119","1","1","586","386","221","2","830","979","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t672() {
		String[] input= { "832","1","-1","82","314","0","2","0","806","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t673() {
		String[] input= { "767","1","1","726","767","714","2","0","798","2","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t674() {
		String[] input= { "1188","1","1","590","758","610","1","691","669","2","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t675() {
		String[] input= { "1030","1","1","743","536","737","3","597","754","1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t676() {
		String[] input= { "-1","1","0","5409","534","551","0","175","764","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t677() {
		String[] input= { "880","1","1","651","496","696","2","716","283","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t678() {
		String[] input= { "656","1","1","612","513","543","1","0","285","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t679() {
		String[] input= { "990","1","1","9671","622","173","2","0","766","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t680() {
		String[] input= { "-100","1","1","650","497","655","3","806","764","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t681() {
		String[] input= { "759","1","0","5966","544","494","2","965","955","-1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t682() {
		String[] input= { "636","1","0","637","352","716","1","335","-100","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t683() {
		String[] input= { "922","1","0","583","576","558","1","435","474","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t684() {
		String[] input= { "967","1","0","2215","354","582","0","999","0","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t685() {
		String[] input= { "937","1","0","605","0","554","0","633","622","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t686() {
		String[] input= { "594","1","1","770","455","751","0","610","-1","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t687() {
		String[] input= { "1057","1","0","0","379","614","0","812","799","0","2","-1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t688() {
		String[] input= { "736","0","1","7870","571","700","3","469","438","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t689() {
		String[] input= { "690","1","0","626","252","676","3","366","611","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t690() {
		String[] input= { "458","1","0","4251","551","721","1","617","588","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t691() {
		String[] input= { "795","1","1","1372","334","686","3","559","381","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t692() {
		String[] input= { "842","0","0","631","599","623","3","910","875","1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t693() {
		String[] input= { "702","1","0","695","889","0","0","412","469","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t694() {
		String[] input= { "681","1","0","1904","340","904","3","344","360","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t695() {
		String[] input= { "945","1","0","720","292","692","1","890","888","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t696() {
		String[] input= { "896","1","0","592","405","882","1","466","549","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t697() {
		String[] input= { "832","1","0","9715","387","665","1","899","800","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t698() {
		String[] input= { "651","1","0","-1","571","599","2","41","514","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t699() {
		String[] input= { "1098","1","1","664","607","0","-1","580","162","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t700() {
		String[] input= { "0","1","0","713","334","670","2","353","328","1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t701() {
		String[] input= { "603","-1","0","654","507","11","3","611","600","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t702() {
		String[] input= { "848","1","0","645","519","579","9","512","970","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t703() {
		String[] input= { "19","0","0","4907","421","657","1","665","0","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t704() {
		String[] input= { "772","1","0","0","311","599","2","978","891","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t705() {
		String[] input= { "613","1","0","0","413","696","3","794","743","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t706() {
		String[] input= { "1092","1","1","2461","931","0","2","647","715","2","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t707() {
		String[] input= { "-1","1","0","655","565","658","0","858","870","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t708() {
		String[] input= { "1106","0","0","521","0","592","2","220","0","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t709() {
		String[] input= { "746","1","0","653","345","667","3","386","153","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t710() {
		String[] input= { "683","1","1","8310","300","0","1","0","0","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t711() {
		String[] input= { "-100","0","0","636","630","0","0","467","507","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t712() {
		String[] input= { "469","1","1","579","703","109","3","432","500","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t713() {
		String[] input= { "717","1","-1","641","433","500","2","145","0","2","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t714() {
		String[] input= { "699","1","0","-1","311","0","1","705","854","2","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t715() {
		String[] input= { "-1","1","1","685","442","-1","2","338","364","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t716() {
		String[] input= { "844","1","0","683","0","663","2","361","725","2","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t717() {
		String[] input= { "733","1","0","696","228","704","3","693","638","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t718() {
		String[] input= { "733","0","0","730","717","747","1","767","288","2","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t719() {
		String[] input= { "653","1","0","605","619","554","3","913","601","2","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t720() {
		String[] input= { "1115","1","1","739","422","739","2","528","534","3","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t721() {
		String[] input= { "926","1","0","590","50","532","3","957","922","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t722() {
		String[] input= { "675","-1","0","656","506","655","0","564","590","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t723() {
		String[] input= { "1179","1","0","697","805","691","0","594","213","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t724() {
		String[] input= { "1166","1","1","0","352","748","3","297","318","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t725() {
		String[] input= { "232","1","1","564","333","0","1","862","601","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t726() {
		String[] input= { "0","1","0","743","318","747","2","694","726","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t727() {
		String[] input= { "829","1","0","0","464","314","3","784","809","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t728() {
		String[] input= { "1195","1","0","0","460","666","3","509","492","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t729() {
		String[] input= { "790","1","1","719","436","697","1","681","417","2","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t730() {
		String[] input= { "878","1","0","681","131","650","1","855","816","2","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t731() {
		String[] input= { "0","1","0","634","577","673","2","527","635","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t732() {
		String[] input= { "-1","1","1","513","194","552","0","0","331","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t733() {
		String[] input= { "616","0","1","752","604","702","0","459","857","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t734() {
		String[] input= { "1129","1","0","665","586","225","2","785","973","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t735() {
		String[] input= { "1017","1","0","666","369","646","3","-1","772","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t736() {
		String[] input= { "1124","1","0","605","233","507","1","0","409","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t737() {
		String[] input= { "608","1","1","685","588","718","3","17","883","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t738() {
		String[] input= { "983","1","1","0","636","741","2","460","275","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t739() {
		String[] input= { "334","1","0","728","533","660","2","481","496","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t740() {
		String[] input= { "611","1","0","660","667","0","1","936","924","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t741() {
		String[] input= { "1036","0","0","586","585","304","0","505","578","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t742() {
		String[] input= { "881","1","-1","740","521","722","3","311","958","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t743() {
		String[] input= { "1173","1","0","5952","576","657","0","292","741","2","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t744() {
		String[] input= { "930","1","0","642","311","0","3","0","699","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t745() {
		String[] input= { "1108","1","0","772","879","723","0","286","340","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t746() {
		String[] input= { "0","1","0","592","607","626","1","586","642","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t747() {
		String[] input= { "0","1","1","771","401","503","2","513","822","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t748() {
		String[] input= { "1019","0","1","6630","400","631","0","416","384","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t749() {
		String[] input= { "-1","1","0","-100","606","721","3","927","947","2","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t750() {
		String[] input= { "915","0","0","721","613","784","2","330","356","2","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t751() {
		String[] input= { "816","1","0","706","496","737","1","917","908","-1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t752() {
		String[] input= { "1150","1","1","594","-100","533","2","494","548","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t753() {
		String[] input= { "0","1","0","767","593","798","2","657","678","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t754() {
		String[] input= { "833","0","1","648","385","621","0","446","0","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t755() {
		String[] input= { "991","0","0","6052","411","45","0","1028","977","2","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t756() {
		String[] input= { "1058","-1","0","643","495","661","0","1001","978","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t757() {
		String[] input= { "693","0","1","639","352","609","1","470","793","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t758() {
		String[] input= { "925","1","1","625","491","584","0","421","592","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t759() {
		String[] input= { "810","1","0","0","296","50","1","446","-1","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t760() {
		String[] input= { "855","1","0","4592","49","290","0","627","617","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t761() {
		String[] input= { "834","1","0","638","378","0","2","0","842","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t762() {
		String[] input= { "573","1","0","667","0","623","0","651","671","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t763() {
		String[] input= { "1134","0","0","559","587","0","0","1003","0","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t764() {
		String[] input= { "817","1","0","566","402","603","2","348","760","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t765() {
		String[] input= { "610","0","0","0","587","665","3","673","722","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t766() {
		String[] input= { "-1","1","0","631","461","0","0","645","604","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t767() {
		String[] input= { "1046","1","-1","565","505","553","1","-100","975","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t768() {
		String[] input= { "832","1","0","562","347","788","0","0","785","2","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t769() {
		String[] input= { "621","1","1","6021","353","718","1","320","561","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t770() {
		String[] input= { "789","-1","0","707","518","636","3","137","0","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t771() {
		String[] input= { "649","0","0","645","347","702","1","502","76","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t772() {
		String[] input= { "657","1","0","666","0","613","0","840","976","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t773() {
		String[] input= { "688","0","0","0","561","594","0","713","675","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t774() {
		String[] input= { "612","1","0","555","479","560","4","0","651","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t775() {
		String[] input= { "1046","0","0","8338","578","663","3","936","892","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t776() {
		String[] input= { "1153","1","1","745","861","0","1","748","566","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t777() {
		String[] input= { "824","1","0","0","519","426","1","357","694","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t778() {
		String[] input= { "815","1","0","582","0","543","0","906","897","2","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t779() {
		String[] input= { "1188","1","0","592","426","979","1","911","-1","2","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t780() {
		String[] input= { "0","0","1","6241","380","757","3","0","890","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t781() {
		String[] input= { "1132","1","0","0","607","565","1","351","593","2","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t782() {
		String[] input= { "813","1","1","694","381","722","0","357","0","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t783() {
		String[] input= { "1075","1","1","515","0","611","1","830","0","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t784() {
		String[] input= { "1140","1","1","9266","412","763","0","344","384","2","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t785() {
		String[] input= { "633","0","0","636","533","661","0","573","553","2","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t786() {
		String[] input= { "1000","0","0","-100","566","687","1","477","241","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t787() {
		String[] input= { "1022","1","0","647","988","694","1","0","0","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t788() {
		String[] input= { "607","1","0","603","447","688","-1","787","829","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t789() {
		String[] input= { "-1","1","0","538","409","0","2","474","479","2","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t790() {
		String[] input= { "627","0","0","697","398","828","-1","915","919","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t791() {
		String[] input= { "892","1","1","1424","630","0","3","550","586","0","2","3"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t792() {
		String[] input= { "764","1","0","9447","619","0","3","747","769","1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t793() {
		String[] input= { "664","0","1","693","536","655","1","-100","0","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t794() {
		String[] input= { "1101","0","1","4426","372","625","1","518","566","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t795() {
		String[] input= { "890","1","0","3344","502","537","1","417","578","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t796() {
		String[] input= { "154","1","0","642","514","661","2","999","0","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t797() {
		String[] input= { "774","0","0","0","623","664","0","817","807","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t798() {
		String[] input= { "741","1","0","5872","449","649","2","0","-1","2","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t799() {
		String[] input= { "739","1","0","7","609","597","3","0","343","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t800() {
		String[] input= { "681","-1","1","9974","308","564","2","391","396","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t801() {
		String[] input= { "789","1","1","635","557","720","4","694","0","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t802() {
		String[] input= { "1009","1","1","606","320","530","2","0","0","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t803() {
		String[] input= { "608","1","0","531","628","547","3","-1","482","1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t804() {
		String[] input= { "1200","0","1","626","534","642","0","758","744","1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t805() {
		String[] input= { "1181","0","0","714","351","781","0","419","0","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t806() {
		String[] input= { "0","1","0","734","330","755","3","831","892","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t807() {
		String[] input= { "994","0","1","7341","364","742","0","606","659","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t808() {
		String[] input= { "586","0","1","790","79","0","0","689","677","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t809() {
		String[] input= { "-1","1","0","1231","543","671","2","545","545","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t810() {
		String[] input= { "890","1","0","0","577","622","0","0","284","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t811() {
		String[] input= { "695","1","0","560","0","578","3","807","988","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t812() {
		String[] input= { "47","1","1","685","497","668","3","812","817","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t813() {
		String[] input= { "1157","0","0","766","480","432","3","0","0","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t814() {
		String[] input= { "659","1","0","0","865","578","3","452","538","1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t815() {
		String[] input= { "1046","1","0","531","505","557","2","261","0","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t816() {
		String[] input= { "724","0","1","662","0","0","0","762","728","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t817() {
		String[] input= { "989","1","1","714","693","746","2","960","903","0","2","9"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t818() {
		String[] input= { "377","0","0","5169","412","572","3","801","797","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t819() {
		String[] input= { "619","1","0","0","480","0","0","928","0","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t820() {
		String[] input= { "879","1","1","793","310","-1","2","622","593","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t821() {
		String[] input= { "635","1","0","585","-1","0","1","0","971","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t822() {
		String[] input= { "0","0","0","621","413","714","2","416","360","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t823() {
		String[] input= { "-1","1","0","770","600","0","0","401","359","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t824() {
		String[] input= { "674","1","0","679","472","655","3","523","-1","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t825() {
		String[] input= { "1041","1","-1","0","494","660","3","68","546","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t826() {
		String[] input= { "1136","1","0","600","151","0","2","699","867","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t827() {
		String[] input= { "-1","1","1","679","532","628","3","0","360","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t828() {
		String[] input= { "890","1","1","0","523","931","1","880","866","2","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t829() {
		String[] input= { "970","1","1","620","469","126","0","0","0","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t830() {
		String[] input= { "1195","1","1","622","378","621","2","520","0","2","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t831() {
		String[] input= { "834","0","0","573","887","599","1","0","874","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t832() {
		String[] input= { "629","0","1","615","603","663","0","897","874","-1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t833() {
		String[] input= { "1145","1","0","718","520","628","0","639","0","3","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t834() {
		String[] input= { "623","-1","0","683","461","732","3","634","671","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t835() {
		String[] input= { "774","0","0","654","427","636","1","0","0","1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t836() {
		String[] input= { "653","1","1","688","592","709","3","883","849","0","1","-1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t837() {
		String[] input= { "987","0","1","740","67","735","3","330","326","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t838() {
		String[] input= { "852","1","0","694","586","708","1","-100","621","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t839() {
		String[] input= { "847","1","0","626","888","580","1","0","172","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t840() {
		String[] input= { "1099","1","1","670","349","680","3","729","789","2","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t841() {
		String[] input= { "841","1","0","0","351","719","3","485","0","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t842() {
		String[] input= { "929","0","0","0","408","754","0","211","941","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t843() {
		String[] input= { "691","0","0","0","548","737","1","410","364","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t844() {
		String[] input= { "0","0","1","604","473","650","3","536","0","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t845() {
		String[] input= { "1002","1","0","706","306","668","2","0","-100","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t846() {
		String[] input= { "819","1","1","9386","518","775","1","707","726","2","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t847() {
		String[] input= { "1077","1","-1","593","324","636","2","0","448","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t848() {
		String[] input= { "822","1","1","701","453","872","2","851","849","0","2","9"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t849() {
		String[] input= { "925","1","-1","650","432","655","0","859","891","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t850() {
		String[] input= { "1162","1","1","1025","344","631","3","453","466","0","2","4"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t851() {
		String[] input= { "1078","1","0","581","567","655","3","637","906","2","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t852() {
		String[] input= { "777","1","0","646","616","628","2","904","0","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t853() {
		String[] input= { "782","1","0","0","418","610","1","0","618","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t854() {
		String[] input= { "1084","1","1","995","501","604","2","0","482","-1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t855() {
		String[] input= { "1013","1","0","643","373","706","3","0","808","2","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t856() {
		String[] input= { "-1","1","0","706","291","643","1","644","564","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t857() {
		String[] input= { "0","1","0","552","382","612","1","0","754","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t858() {
		String[] input= { "733","1","1","590","341","589","3","534","620","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t859() {
		String[] input= { "706","1","1","4649","316","935","3","605","850","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t860() {
		String[] input= { "0","1","1","2311","594","715","3","906","926","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t861() {
		String[] input= { "995","1","1","756","419","339","0","0","540","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t862() {
		String[] input= { "850","1","0","187","443","542","0","410","407","4","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t863() {
		String[] input= { "878","1","1","0","321","0","2","550","596","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t864() {
		String[] input= { "1146","0","0","0","550","530","2","899","857","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t865() {
		String[] input= { "862","1","0","0","383","0","2","474","721","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t866() {
		String[] input= { "757","1","1","692","581","640","1","840","841","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t867() {
		String[] input= { "692","0","0","0","439","655","3","852","539","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t868() {
		String[] input= { "1165","1","0","592","-1","605","0","0","596","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t869() {
		String[] input= { "760","1","-1","0","314","0","3","452","423","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t870() {
		String[] input= { "948","0","1","584","415","574","3","665","642","2","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t871() {
		String[] input= { "-100","0","0","1879","547","626","0","854","875","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t872() {
		String[] input= { "615","0","0","2299","456","549","0","748","0","2","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t873() {
		String[] input= { "1117","0","1","0","569","0","2","716","741","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t874() {
		String[] input= { "818","1","1","563","554","999","1","0","615","1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t875() {
		String[] input= { "780","1","0","6500","579","-1","1","730","683","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t876() {
		String[] input= { "463","1","1","0","387","590","1","907","867","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t877() {
		String[] input= { "990","1","1","0","325","0","0","727","665","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t878() {
		String[] input= { "952","1","0","588","0","774","0","593","639","-1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t879() {
		String[] input= { "1019","1","0","4248","0","551","2","544","550","1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t880() {
		String[] input= { "974","1","0","611","978","521","3","0","962","2","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t881() {
		String[] input= { "-1","1","1","576","500","0","0","641","883","4","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t882() {
		String[] input= { "868","1","1","729","501","740","3","1017","0","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t883() {
		String[] input= { "1084","1","1","704","538","707","2","0","-1","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t884() {
		String[] input= { "935","1","0","4528","388","0","0","853","956","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t885() {
		String[] input= { "1058","1","1","365","560","652","1","0","682","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t886() {
		String[] input= { "1032","1","1","7944","330","0","1","361","0","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t887() {
		String[] input= { "987","1","0","642","606","0","0","413","0","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t888() {
		String[] input= { "994","1","0","647","755","410","0","564","548","1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t889() {
		String[] input= { "911","1","0","527","516","541","0","0","465","2","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t890() {
		String[] input= { "754","1","0","0","335","604","3","531","453","3","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t891() {
		String[] input= { "856","0","1","5631","380","590","0","961","695","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t892() {
		String[] input= { "36","0","0","622","340","620","1","0","423","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t893() {
		String[] input= { "716","1","1","618","341","767","1","0","0","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t894() {
		String[] input= { "753","1","1","620","583","650","1","826","779","2","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t895() {
		String[] input= { "872","1","1","0","669","561","1","955","931","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t896() {
		String[] input= { "1119","0","0","749","332","696","1","533","526","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t897() {
		String[] input= { "1032","1","0","5936","652","0","2","893","920","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t898() {
		String[] input= { "903","1","1","577","396","-100","2","314","515","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t899() {
		String[] input= { "1130","1","1","8164","493","665","2","421","424","0","2","-1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t900() {
		String[] input= { "-1","1","1","9836","458","698","2","530","552","2","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t901() {
		String[] input= { "1141","0","1","687","434","690","0","0","438","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t902() {
		String[] input= { "692","0","1","650","353","2","3","408","435","1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t903() {
		String[] input= { "814","-1","1","652","309","705","2","716","687","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t904() {
		String[] input= { "722","1","0","693","573","674","1","862","822","0","2","3"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t905() {
		String[] input= { "1089","1","0","0","587","0","0","449","-100","1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t906() {
		String[] input= { "986","1","1","535","478","521","2","934","874","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t907() {
		String[] input= { "609","1","1","8407","595","583","2","560","485","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t908() {
		String[] input= { "898","1","0","688","0","741","1","703","44","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t909() {
		String[] input= { "1154","1","1","552","433","593","4","727","829","0","2","9"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t910() {
		String[] input= { "856","1","1","574","-100","515","3","941","674","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t911() {
		String[] input= { "1034","1","0","642","397","581","1","445","-1","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t912() {
		String[] input= { "840","1","1","0","515","573","0","0","54","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t913() {
		String[] input= { "757","1","0","0","527","205","3","698","750","2","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t914() {
		String[] input= { "397","1","1","685","603","656","2","501","991","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t915() {
		String[] input= { "793","1","1","8753","425","622","1","744","0","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t916() {
		String[] input= { "1084","1","0","58","197","731","2","547","984","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t917() {
		String[] input= { "1156","1","1","9408","599","0","0","904","902","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t918() {
		String[] input= { "721","1","0","690","438","613","2","0","991","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t919() {
		String[] input= { "0","1","0","709","851","776","3","214","588","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t920() {
		String[] input= { "-100","1","1","753","474","747","1","920","420","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t921() {
		String[] input= { "133","1","1","611","507","0","2","801","860","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t922() {
		String[] input= { "988","1","1","-1","312","655","2","749","734","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t923() {
		String[] input= { "1171","0","1","718","630","688","3","252","769","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t924() {
		String[] input= { "1065","1","0","-1","597","582","3","840","881","2","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t925() {
		String[] input= { "619","1","-1","746","349","961","0","0","868","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t926() {
		String[] input= { "911","1","0","-1","549","-100","3","396","383","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t927() {
		String[] input= { "1001","1","1","737","-100","741","1","828","0","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t928() {
		String[] input= { "590","1","0","610","325","417","1","578","287","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t929() {
		String[] input= { "1062","1","1","1941","575","682","3","872","880","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t930() {
		String[] input= { "604","1","0","652","354","0","2","371","323","2","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t931() {
		String[] input= { "1130","0","0","581","426","657","0","848","0","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t932() {
		String[] input= { "924","0","0","770","424","756","2","0","0","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t933() {
		String[] input= { "1129","1","1","2950","208","669","1","724","512","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t934() {
		String[] input= { "599","1","1","654","522","0","0","659","399","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t935() {
		String[] input= { "954","1","0","672","625","744","2","732","810","2","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t936() {
		String[] input= { "972","1","1","460","299","688","1","440","0","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t937() {
		String[] input= { "0","1","1","522","555","530","1","933","914","2","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t938() {
		String[] input= { "801","1","0","782","524","0","3","381","435","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t939() {
		String[] input= { "0","0","0","598","440","637","2","437","455","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t940() {
		String[] input= { "817","0","1","0","364","15","0","886","851","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t941() {
		String[] input= { "1157","1","1","0","563","797","2","459","58","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t942() {
		String[] input= { "1151","1","0","578","611","0","0","331","378","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t943() {
		String[] input= { "1149","1","1","0","527","607","3","818","860","2","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t944() {
		String[] input= { "1079","1","0","613","397","0","3","524","477","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t945() {
		String[] input= { "949","1","0","648","515","619","2","0","825","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t946() {
		String[] input= { "1078","1","0","589","605","584","1","-1","323","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t947() {
		String[] input= { "903","0","1","660","612","703","1","867","883","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t948() {
		String[] input= { "1159","1","0","730","910","738","0","740","747","1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t949() {
		String[] input= { "1156","1","0","693","104","674","2","499","883","2","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t950() {
		String[] input= { "886","0","0","5515","447","700","3","478","597","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t951() {
		String[] input= { "1107","1","1","665","853","701","0","653","892","1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t952() {
		String[] input= { "655","1","0","749","487","139","2","477","850","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t953() {
		String[] input= { "1184","-1","0","0","391","534","3","491","476","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t954() {
		String[] input= { "879","0","0","0","-100","728","0","517","507","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t955() {
		String[] input= { "826","1","0","655","326","577","0","0","425","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t956() {
		String[] input= { "323","1","0","4964","498","697","3","780","810","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t957() {
		String[] input= { "1084","1","1","703","387","726","3","384","0","1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t958() {
		String[] input= { "988","1","0","622","496","613","1","379","404","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t959() {
		String[] input= { "1039","-1","1","630","618","0","3","0","801","1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t960() {
		String[] input= { "1185","1","1","595","0","534","1","560","0","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t961() {
		String[] input= { "700","1","0","575","415","-1","0","795","796","2","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t962() {
		String[] input= { "665","1","1","585","445","533","0","209","848","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t963() {
		String[] input= { "820","1","1","561","0","599","2","993","817","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t964() {
		String[] input= { "1189","1","1","753","620","761","2","0","185","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t965() {
		String[] input= { "910","1","1","722","601","707","3","0","0","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t966() {
		String[] input= { "986","1","1","618","321","595","1","0","418","0","1","4"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t967() {
		String[] input= { "1079","1","1","631","547","663","2","401","314","4","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t968() {
		String[] input= { "204","1","0","707","601","741","1","695","652","2","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t969() {
		String[] input= { "797","0","0","8545","149","589","3","278","280","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t970() {
		String[] input= { "-100","1","0","1362","527","922","2","437","358","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t971() {
		String[] input= { "965","1","1","7468","524","693","1","830","0","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t972() {
		String[] input= { "0","1","0","7119","153","556","2","836","841","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t973() {
		String[] input= { "1006","0","-1","8234","374","598","1","811","514","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t974() {
		String[] input= { "830","1","0","-1","473","631","3","22","0","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t975() {
		String[] input= { "904","1","0","530","438","0","2","951","0","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t976() {
		String[] input= { "638","0","1","545","325","589","1","900","798","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t977() {
		String[] input= { "0","1","-1","0","388","737","3","0","470","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t978() {
		String[] input= { "1053","1","0","6178","547","127","0","518","489","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t979() {
		String[] input= { "610","1","1","611","0","616","1","541","578","9","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t980() {
		String[] input= { "899","1","1","-100","601","571","3","618","595","4","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t981() {
		String[] input= { "1085","1","1","1017","510","614","0","595","614","2","2","4"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t982() {
		String[] input= { "650","1","1","0","197","701","0","682","711","0","2","-1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t983() {
		String[] input= { "1015","0","1","600","526","629","1","569","0","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t984() {
		String[] input= { "-100","0","1","3803","419","630","3","-1","437","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t985() {
		String[] input= { "598","0","0","639","0","327","1","411","374","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t986() {
		String[] input= { "1118","0","1","725","0","756","2","860","846","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t987() {
		String[] input= { "652","1","0","-100","478","779","0","356","371","-1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t988() {
		String[] input= { "698","1","0","3071","59","307","0","849","904","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t989() {
		String[] input= { "734","1","1","615","-100","591","2","889","-1","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t990() {
		String[] input= { "628","1","0","706","1","976","0","417","652","2","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t991() {
		String[] input= { "913","1","1","661","-100","255","3","0","668","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t992() {
		String[] input= { "618","0","1","754","390","215","0","250","830","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t993() {
		String[] input= { "617","0","1","640","441","662","1","677","528","4","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t994() {
		String[] input= { "766","1","0","719","300","700","3","406","378","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t995() {
		String[] input= { "119","1","0","715","292","212","0","322","341","0","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t996() {
		String[] input= { "939","1","1","532","534","-100","2","335","971","1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t997() {
		String[] input= { "190","1","1","724","567","715","1","1011","1021","1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t998() {
		String[] input= { "-100","1","1","680","602","702","0","831","860","2","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t999() {
		String[] input= { "685","1","0","586","0","601","1","646","701","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1000() {
		String[] input= { "679","1","1","541","338","5123","0","641","641","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1001() {
		String[] input= { "644","1","1","1886","596","2348","0","741","400","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1002() {
		String[] input= { "722","1","1","1415","245","316","0","401","739","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1003() {
		String[] input= { "722","1","1","1415","275","316","0","401","799","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1004() {
		String[] input= { "782","1","1","513","224","5295","0","641","639","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1005() {
		String[] input= { "782","1","1","413","224","4295","0","641","639","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1006() {
		String[] input= { "786","1","1","383","548","5870","0","639","399","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1007() {
		String[] input= { "786","1","1","383","448","4870","0","639","399","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1008() {
		String[] input= { "638","1","0","2578","156","3757","0","400","399","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1009() {
		String[] input= { "638","1","0","2278","156","3757","0","650","399","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1010() {
		String[] input= { "727","1","1","1935","339","968","0","399","740","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1011() {
		String[] input= { "927","1","1","4902","351","2093","0","739","740","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1012() {
		String[] input= { "927","1","1","4702","251","1093","0","739","740","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1013() {
		String[] input= { "867","1","1","1774","101","2204","0","499","499","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1014() {
		String[] input= { "867","1","1","1674","101","2104","0","499","499","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1015() {
		String[] input= { "653","1","0","3203","448","1267","0","541","641","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1016() {
		String[] input= { "653","1","0","3203","448","1267","0","541","641","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1017() {
		String[] input= { "653","1","0","632","167","203","0","401","401","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1018() {
		String[] input= { "958","1","1","2297","574","4253","0","399","400","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1019() {
		String[] input= { "958","1","1","2297","574","4253","0","399","300","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1020() {
		String[] input= { "958","1","1","2297","574","4253","0","399","300","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1021() {
		String[] input= { "635","1","0","1142","411","4704","1","740","500","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1022() {
		String[] input= { "635","1","0","1142","511","2704","1","740","500","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1023() {
		String[] input= { "635","1","0","1142","511","2704","1","740","500","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1024() {
		String[] input= { "635","1","0","1142","511","1704","1","740","500","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1025() {
		String[] input= { "635","1","0","1142","411","1704","1","740","500","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1026() {
		String[] input= { "675","1","0","1142","411","1704","1","740","500","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1027() {
		String[] input= { "675","1","0","1142","411","1704","1","640","500","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1028() {
		String[] input= { "675","1","1","1142","411","1704","1","640","500","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1029() {
		String[] input= { "775","1","1","1142","411","1704","1","640","500","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1030() {
		String[] input= { "775","1","1","1142","411","1704","1","540","500","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1031() {
		String[] input= { "775","1","1","1142","411","1504","1","540","500","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1032() {
		String[] input= { "775","1","1","1042","411","1504","1","540","500","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1033() {
		String[] input= { "775","1","1","942","411","1504","1","540","500","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1034() {
		String[] input= { "775","1","1","942","311","1504","1","540","500","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1035() {
		String[] input= { "775","1","1","942","211","1504","1","540","500","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1036() {
		String[] input= { "775","1","1","942","211","1204","1","540","500","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1037() {
		String[] input= { "644","1","1","1986","596","2448","0","741","400","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1038() {
		String[] input= { "644","1","0","1986","596","2448","0","741","400","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1039() {
		String[] input= { "644","1","0","1786","596","2448","0","741","400","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1040() {
		String[] input= { "644","1","0","1786","596","2248","0","741","400","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1041() {
		String[] input= { "644","1","0","1786","596","2248","0","721","400","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1042() {
		String[] input= { "624","1","0","1786","596","2248","0","721","400","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1043() {
		String[] input= { "624","1","0","1786","496","2248","0","721","400","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1044() {
		String[] input= { "624","1","0","1286","496","2248","0","721","400","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1045() {
		String[] input= { "624","1","0","1086","496","2248","0","721","400","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1046() {
		String[] input= { "604","1","0","1086","496","2248","0","721","400","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1047() {
		String[] input= { "604","1","0","1086","496","1248","0","721","400","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1048() {
		String[] input= { "604","1","0","1086","396","1248","0","721","400","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1049() {
		String[] input= { "958","1","0","2597","574","4253","0","399","400","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1050() {
		String[] input= { "958","1","0","2597","574","4253","0","379","400","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1051() {
		String[] input= { "958","1","0","2597","574","4253","0","379","400","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1052() {
		String[] input= { "958","1","0","2597","574","3253","0","379","400","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1053() {
		String[] input= { "958","1","0","2597","474","3253","0","379","400","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1054() {
		String[] input= { "958","1","0","2597","474","3253","0","379","400","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1055() {
		String[] input= { "958","1","1","2597","574","4253","0","399","400","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1056() {
		String[] input= { "939","1","1","532","434","-100","2","335","971","1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1057() {
		String[] input= { "939","1","1","532","434","0","2","335","971","1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1058() {
		String[] input= { "939","1","0","532","434","0","2","335","971","1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1059() {
		String[] input= { "839","1","0","532","434","0","2","335","971","1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1060() {
		String[] input= { "839","1","0","532","234","0","2","335","971","1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1061() {
		String[] input= { "839","1","0","532","234","0","2","325","971","1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1062() {
		String[] input= { "820","1","1","561","0","599","2","993","817","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1063() {
		String[] input= { "820","1","0","561","0","599","2","993","817","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1064() {
		String[] input= { "820","1","0","561","0","599","2","893","817","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1065() {
		String[] input= { "720","1","0","561","0","599","2","893","817","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1066() {
		String[] input= { "720","1","0","461","0","599","2","893","817","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1067() {
		String[] input= { "655","1","0","749","487","139","2","477","850","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1068() {
		String[] input= { "655","1","0","749","487","139","2","477","850","1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1069() {
		String[] input= { "655","1","1","749","487","139","2","477","850","1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1070() {
		String[] input= { "655","1","0","749","387","139","2","477","850","1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1071() {
		String[] input= { "755","1","0","749","387","139","2","477","850","1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1072() {
		String[] input= { "755","1","0","649","387","139","2","477","850","1","2","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1073() {
		String[] input= { "698","1","0","3071","59","307","0","849","904","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1074() {
		String[] input= { "698","1","0","2071","59","307","0","849","904","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1075() {
		String[] input= { "698","1","0","2071","49","307","0","849","904","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1076() {
		String[] input= { "798","1","0","2071","49","307","0","849","904","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1077() {
		String[] input= { "798","1","1","2071","49","307","0","849","904","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1078() {
		String[] input= { "700","1","0","575","415","1","0","795","796","2","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1079() {
		String[] input= { "700","1","1","575","415","1","0","795","796","2","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1080() {
		String[] input= { "700","1","1","575","415","1","0","795","796","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1081() {
		String[] input= { "700","1","1","275","415","1","0","795","796","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1082() {
		String[] input= { "700","1","1","275","415","1","0","695","796","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1083() {
		String[] input= { "800","1","1","275","415","1","0","695","796","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1084() {
		String[] input= { "1062","1","0","1941","575","682","3","872","880","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1085() {
		String[] input= { "1062","1","0","1941","545","582","3","872","880","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1086() {
		String[] input= { "1062","1","0","1941","545","582","2","872","880","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1087() {
		String[] input= { "1062","1","0","1941","545","582","2","772","880","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1088() {
		String[] input= { "1062","1","0","1941","545","582","2","772","780","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1089() {
		String[] input= { "1062","1","1","1941","545","582","2","772","780","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1090() {
		String[] input= { "1062","1","0","1941","445","582","2","772","780","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1091() {
		String[] input= { "1062","1","0","1241","445","582","2","772","780","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1092() {
		String[] input= { "1062","1","0","1241","445","582","2","712","780","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1093() {
		String[] input= { "935","1","0","3528","388","0","0","853","956","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1094() {
		String[] input= { "935","1","0","3528","288","0","0","853","956","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1095() {
		String[] input= { "935","1","1","3528","288","0","0","853","956","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1096() {
		String[] input= { "935","1","1","3528","288","0","0","853","956","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1097() {
		String[] input= { "935","1","1","2528","288","0","0","853","956","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1098() {
		String[] input= { "757","1","0","692","581","640","1","840","841","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1099() {
		String[] input= { "757","1","0","692","581","640","1","840","841","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1100() {
		String[] input= { "757","1","1","692","481","640","1","840","841","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1101() {
		String[] input= { "757","1","1","692","481","640","2","840","841","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1102() {
		String[] input= { "757","1","1","692","481","640","2","840","891","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1103() {
		String[] input= { "913","1","0","661","-100","255","3","0","668","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1104() {
		String[] input= { "913","1","0","661","0","255","3","0","668","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1105() {
		String[] input= { "913","1","0","661","0","255","3","0","368","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1106() {
		String[] input= { "913","1","0","661","0","255","3","1","368","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1107() {
		String[] input= { "913","1","0","661","0","255","3","100","368","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1108() {
		String[] input= { "713","1","0","661","0","255","3","100","368","0","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1109() {
		String[] input= { "713","1","0","661","0","255","3","100","368","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1110() {
		String[] input= { "713","1","0","661","0","255","3","100","228","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1111() {
		String[] input= { "613","1","0","661","0","255","3","100","228","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1112() {
		String[] input= { "613","1","0","661","0","155","3","100","228","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1113() {
		String[] input= { "613","1","0","561","0","155","3","100","228","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1114() {
		String[] input= { "613","1","0","461","0","155","3","100","228","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1115() {
		String[] input= { "613","1","0","461","0","55","3","100","228","1","2","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1116() {
		String[] input= { "758","1","1","2597","574","4253","0","399","400","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1117() {
		String[] input= { "1058","1","1","2597","574","4253","0","399","400","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1118() {
		String[] input= { "1058","1","1","2597","574","3253","0","399","400","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1119() {
		String[] input= { "1058","1","1","2597","274","3253","0","399","400","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1120() {
		String[] input= { "1058","1","0","2597","274","3253","0","399","400","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1121() {
		String[] input= { "1058","1","0","2597","174","3253","0","399","400","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1122() {
		String[] input= { "1058","1","0","1597","174","3253","0","399","400","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1123() {
		String[] input= { "1058","1","0","1597","174","4253","0","399","400","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1124() {
		String[] input= { "1058","1","0","1597","174","7253","0","399","400","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1125() {
		String[] input= { "775","1","1","942","211","5204","1","540","500","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1126() {
		String[] input= { "775","1","1","642","211","5204","1","540","500","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1127() {
		String[] input= { "775","1","0","642","211","5204","1","540","500","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1128() {
		String[] input= { "605","1","0","1142","511","4704","1","740","500","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1129() {
		String[] input= { "611","1","1","1142","511","4704","1","740","500","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1130() {
		String[] input= { "611","1","1","1142","511","4704","1","740","500","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1131() {
		String[] input= { "604","1","0","1086","496","8248","0","721","400","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1132() {
		String[] input= { "604","1","0","1086","196","8248","0","721","400","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1133() {
		String[] input= { "604","1","0","1111","196","8248","0","721","400","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1134() {
		String[] input= { "604","1","0","1111","196","8248","0","721","400","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1135() {
		String[] input= { "604","1","0","911","196","8248","0","721","400","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1136() {
		String[] input= { "604","1","0","911","96","8248","0","721","400","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1137() {
		String[] input= { "604","1","1","911","96","8248","0","721","400","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1138() {
		String[] input= { "1058","1","0","1597","174","3253","0","399","400","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1139() {
		String[] input= { "1058","1","0","597","174","3253","0","399","400","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1140() {
		String[] input= { "958","1","0","597","174","3253","0","399","400","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1141() {
		String[] input= { "958","1","0","597","64","3253","0","399","400","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1142() {
		String[] input= { "958","1","0","497","64","3253","0","399","400","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1143() {
		String[] input= { "958","1","0","497","64","3253","0","399","200","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1144() {
		String[] input= { "958","1","0","797","64","3253","0","399","200","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1145() {
		String[] input= { "958","1","0","797","64","3253","0","399","100","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1146() {
		String[] input= { "958","1","0","997","64","3253","0","399","120","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1147() {
		String[] input= { "918","1","0","917","64","2253","0","399","120","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1148() {
		String[] input= { "918","1","0","917","64","2153","0","299","126","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1149() {
		String[] input= { "918","1","0","917","64","1153","0","299","126","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1150() {
		String[] input= { "718","1","0","917","64","1153","0","299","126","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1151() {
		String[] input= { "718","1","0","717","64","1153","0","299","126","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1152() {
		String[] input= { "718","1","0","717","34","1153","0","299","126","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1153() {
		String[] input= { "718","1","0","717","34","1153","0","229","126","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1154() {
		String[] input= { "718","1","0","717","334","1153","0","229","126","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1155() {
		String[] input= { "1058","1","0","997","174","7253","0","399","400","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1156() {
		String[] input= { "1058","1","0","997","174","7253","0","329","400","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1157() {
		String[] input= { "1258","1","0","897","174","7253","1","629","500","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1158() {
		String[] input= { "1558","1","0","897","174","7253","2","729","640","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1159() {
		String[] input= { "1558","1","0","697","174","7253","2","729","640","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1160() {
		String[] input= { "1558","1","0","697","174","7253","2","729","640","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1161() {
		String[] input= { "1558","1","1","697","174","7253","2","729","640","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1162() {
		String[] input= { "1558","1","1","697","174","7253","2","929","640","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1163() {
		String[] input= { "1558","1","1","697","174","7253","3","929","740","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1164() {
		String[] input= { "1558","1","1","697","174","7253","3","741","740","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1165() {
		String[] input= { "701","1","1","697","174","7253","3","741","740","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1166() {
		String[] input= { "701","1","1","697","174","753","3","741","740","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1167() {
		String[] input= { "701","1","1","697","174","753","3","749","740","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1168() {
		String[] input= { "734","1","0","343","30","545","0","565","321","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1169() {
		String[] input= { "934","1","0","343","30","545","0","565","21","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1170() {
		String[] input= { "934","1","0","533","30","545","0","565","21","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1171() {
		String[] input= { "934","1","0","533","30","545","1","565","21","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1172() {
		String[] input= { "934","1","0","533","30","545","2","565","21","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1173() {
		String[] input= { "934","1","0","533","30","545","3","565","21","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1174() {
		String[] input= { "934","1","0","533","30","545","3","565","421","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1175() {
		String[] input= { "934","1","0","533","30","545","3","765","621","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1176() {
		String[] input= { "934","0","0","533","30","545","3","765","621","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1177() {
		String[] input= { "934","1","0","533","730","545","3","765","621","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1178() {
		String[] input= { "34","1","0","533","30","545","3","765","621","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1179() {
		String[] input= { "734","1","1","533","30","545","3","765","621","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1180() {
		String[] input= { "734","1","0","533","30","545","3","765","621","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1181() {
		String[] input= { "734","1","0","343","30","545","0","265","321","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1182() {
		String[] input= { "934","1","0","343","30","545","0","5","121","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1183() {
		String[] input= { "934","1","0","533","30","545","0","65","421","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1184() {
		String[] input= { "934","1","0","533","30","545","1","65","165","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1185() {
		String[] input= { "934","1","0","533","30","545","2","565","721","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1186() {
		String[] input= { "934","1","0","533","30","545","3","565","621","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1187() {
		String[] input= { "934","1","0","533","30","545","3","365","421","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1188() {
		String[] input= { "934","1","0","533","30","545","3","365","365","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1189() {
		String[] input= { "1058","1","0","997","174","7253","0","399","200","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1190() {
		String[] input= { "1058","1","0","997","174","7253","0","329","100","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1191() {
		String[] input= { "1258","1","0","897","174","7253","1","629","650","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1192() {
		String[] input= { "1558","1","0","897","174","7253","2","729","840","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1193() {
		String[] input= { "934","1","0","533","30","545","1","65","165","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1194() {
		String[] input= { "934","1","0","533","30","545","1","65","165","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1195() {
		String[] input= { "634","1","0","533","30","545","1","65","165","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1196() {
		String[] input= { "634","1","0","533","30","545","2","65","165","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1197() {
		String[] input= { "634","1","0","533","30","545","3","65","165","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1198() {
		String[] input= { "634","1","0","533","300","545","3","65","465","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1199() {
		String[] input= { "634","1","0","533","400","645","3","265","465","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1200() {
		String[] input= { "1034","1","0","533","400","645","3","265","465","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1201() {
		String[] input= { "1034","1","0","533","400","645","3","265","465","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1202() {
		String[] input= { "1034","1","0","533","400","645","0","265","465","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1203() {
		String[] input= { "1034","1","0","433","400","645","0","265","465","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1204() {
		String[] input= { "634","1","0","533","30","545","2","65","165","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1205() {
		String[] input= { "634","1","0","533","300","545","2","65","465","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1206() {
		String[] input= { "634","1","0","533","400","645","2","265","465","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1207() {
		String[] input= { "1034","1","0","533","400","645","2","265","465","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1208() {
		String[] input= { "1034","1","0","533","400","645","2","265","465","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1209() {
		String[] input= { "1034","1","0","533","400","645","2","265","465","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1210() {
		String[] input= { "958","1","0","497","64","3253","2","399","400","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1211() {
		String[] input= { "958","1","0","497","64","3253","2","399","200","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1212() {
		String[] input= { "958","1","0","797","64","3253","2","399","200","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1213() {
		String[] input= { "958","1","0","797","64","3253","2","399","100","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1214() {
		String[] input= { "958","1","0","997","64","3253","2","399","120","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1215() {
		String[] input= { "918","1","0","917","64","2253","2","399","120","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1216() {
		String[] input= { "918","1","0","917","64","2153","2","299","126","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1217() {
		String[] input= { "918","1","0","917","64","1153","2","299","126","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1218() {
		String[] input= { "718","1","0","917","64","1153","2","299","126","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1219() {
		String[] input= { "718","1","0","717","64","1153","2","299","126","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1220() {
		String[] input= { "718","1","0","717","34","1153","2","299","126","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1221() {
		String[] input= { "718","1","0","717","34","1153","2","229","126","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1222() {
		String[] input= { "718","1","0","717","334","1153","2","229","126","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1223() {
		String[] input= { "1034","1","0","433","200","245","0","565","765","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1224() {
		String[] input= { "1034","1","0","433","200","245","0","565","665","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1225() {
		String[] input= { "1034","1","0","433","200","245","0","565","665","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1226() {
		String[] input= { "1034","1","0","433","200","245","1","565","665","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1227() {
		String[] input= { "634","1","0","433","200","245","1","565","795","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1228() {
		String[] input= { "634","1","0","433","200","245","1","565","795","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1229() {
		String[] input= { "634","1","1","433","200","245","1","565","795","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1230() {
		String[] input= { "634","1","0","633","200","535","1","565","795","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1231() {
		String[] input= { "634","1","0","633","200","535","2","665","795","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1232() {
		String[] input= { "634","1","0","633","200","535","2","665","795","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1233() {
		String[] input= { "634","1","1","633","200","535","1","565","795","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1234() {
		String[] input= { "634","1","1","633","200","535","0","565","795","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1235() {
		String[] input= { "634","1","1","633","200","535","2","665","795","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1236() {
		String[] input= { "634","1","1","633","200","535","3","765","795","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1237() {
		String[] input= { "634","1","1","633","200","535","3","765","995","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1238() {
		String[] input= { "634","1","0","533","30","545","3","65","165","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1239() {
		String[] input= { "634","1","0","533","300","545","3","65","465","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1240() {
		String[] input= { "634","1","0","533","400","645","3","265","465","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1241() {
		String[] input= { "1034","1","0","533","400","645","3","265","465","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1242() {
		String[] input= { "1034","1","0","533","400","645","3","265","465","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1243() {
		String[] input= { "1034","1","0","533","400","645","3","265","465","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1244() {
		String[] input= { "958","1","0","497","64","3253","3","399","400","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1245() {
		String[] input= { "958","1","0","497","64","3253","3","399","200","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1246() {
		String[] input= { "958","1","0","797","64","3253","3","399","200","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1247() {
		String[] input= { "958","1","0","797","64","3253","3","399","100","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1248() {
		String[] input= { "958","1","0","997","64","3253","3","399","120","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1249() {
		String[] input= { "918","1","0","917","64","2253","3","399","120","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1250() {
		String[] input= { "918","1","0","917","64","2153","3","299","126","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1251() {
		String[] input= { "918","1","0","917","64","1153","3","299","126","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1252() {
		String[] input= { "718","1","0","917","64","1153","3","299","126","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1253() {
		String[] input= { "718","1","0","717","64","1153","3","299","126","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1254() {
		String[] input= { "718","1","0","717","34","1153","3","299","126","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1255() {
		String[] input= { "718","1","0","717","34","1153","3","229","126","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1256() {
		String[] input= { "718","1","0","717","334","1153","3","229","126","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1257() {
		String[] input= { "634","1","0","633","200","535","0","565","795","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1258() {
		String[] input= { "634","1","0","633","200","535","0","265","795","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1259() {
		String[] input= { "634","1","0","633","300","535","0","265","795","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1260() {
		String[] input= { "634","1","0","633","300","535","0","665","795","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1261() {
		String[] input= { "634","1","1","633","300","535","0","665","795","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1262() {
		String[] input= { "634","1","1","633","100","535","0","665","795","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1263() {
		String[] input= { "634","1","1","633","100","535","0","665","795","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1264() {
		String[] input= { "634","1","0","633","100","535","0","665","795","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1265() {
		String[] input= { "634","1","0","633","500","535","0","665","795","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1266() {
		String[] input= { "634","1","0","633","500","335","0","665","795","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1267() {
		String[] input= { "634","1","0","233","500","335","3","845","740","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1268() {
		String[] input= { "634","1","0","233","500","335","3","845","740","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1269() {
		String[] input= { "634","1","1","233","500","335","3","845","740","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1270() {
		String[] input= { "934","1","1","233","500","335","2","845","640","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1271() {
		String[] input= { "934","1","1","233","500","335","1","845","500","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1272() {
		String[] input= { "934","1","1","233","500","335","0","845","400","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1273() {
		String[] input= { "934","1","1","233","100","335","0","845","400","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1274() {
		String[] input= { "634","1","1","233","100","335","0","845","400","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1275() {
		String[] input= { "634","1","1","233","100","335","0","445","400","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1276() {
		String[] input= { "634","1","1","233","400","335","0","445","400","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1277() {
		String[] input= { "634","1","1","233","400","235","0","445","400","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1278() {
		String[] input= { "634","1","1","233","400","234","0","445","400","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1279() {
		String[] input= { "934","1","0","233","500","335","0","845","400","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1280() {
		String[] input= { "934","1","0","233","100","335","0","845","400","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1281() {
		String[] input= { "634","1","0","233","100","335","0","845","400","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1282() {
		String[] input= { "634","1","0","233","100","335","0","445","400","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1283() {
		String[] input= { "634","1","0","233","400","335","0","445","400","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1284() {
		String[] input= { "634","1","0","233","400","235","0","445","400","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1285() {
		String[] input= { "634","1","0","233","400","234","0","445","400","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1286() {
		String[] input= { "634","1","0","433","400","634","0","345","500","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1287() {
		String[] input= { "634","1","1","433","400","634","0","345","500","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1288() {
		String[] input= { "634","1","1","433","200","634","0","345","500","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1289() {
		String[] input= { "634","1","0","433","200","634","0","345","500","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1290() {
		String[] input= { "634","1","0","433","200","634","0","345","500","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1291() {
		String[] input= { "634","1","0","433","300","634","0","345","450","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1292() {
		String[] input= { "1934","1","0","433","300","634","0","345","450","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1293() {
		String[] input= { "634","1","0","633","200","535","2","565","795","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1294() {
		String[] input= { "634","1","0","633","200","535","2","265","795","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1295() {
		String[] input= { "634","1","0","633","300","535","2","265","795","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1296() {
		String[] input= { "634","1","0","633","300","535","2","665","795","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1297() {
		String[] input= { "634","1","1","633","300","535","2","665","795","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1298() {
		String[] input= { "634","1","1","633","100","535","2","665","795","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1299() {
		String[] input= { "634","1","1","633","100","535","2","665","795","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1300() {
		String[] input= { "634","1","0","633","100","535","2","665","795","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1301() {
		String[] input= { "634","1","0","633","500","535","2","665","795","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1302() {
		String[] input= { "634","1","0","633","500","335","2","665","795","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1303() {
		String[] input= { "934","1","0","433","400","234","0","445","550","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1304() {
		String[] input= { "934","1","1","433","400","234","0","445","550","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1305() {
		String[] input= { "934","1","1","433","400","234","0","445","550","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1306() {
		String[] input= { "634","1","1","433","500","234","0","445","550","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1307() {
		String[] input= { "634","1","0","433","500","234","0","445","550","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1308() {
		String[] input= { "634","1","0","433","500","334","0","445","550","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1309() {
		String[] input= { "634","1","0","633","200","535","3","565","795","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1310() {
		String[] input= { "634","1","0","633","200","535","3","265","795","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1311() {
		String[] input= { "634","1","0","633","300","535","3","265","795","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1312() {
		String[] input= { "634","1","0","633","300","535","3","665","795","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1313() {
		String[] input= { "634","1","1","633","300","535","3","665","795","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1314() {
		String[] input= { "634","1","1","633","100","535","3","665","795","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1315() {
		String[] input= { "634","1","1","633","100","535","3","665","795","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1316() {
		String[] input= { "634","1","0","633","100","535","3","665","795","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1317() {
		String[] input= { "634","1","0","633","500","535","3","665","795","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1318() {
		String[] input= { "634","1","0","633","500","335","3","665","795","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1319() {
		String[] input= { "634","1","0","433","500","334","0","445","350","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1320() {
		String[] input= { "634","1","1","433","500","334","0","445","350","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1321() {
		String[] input= { "634","1","1","433","500","334","0","445","350","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1322() {
		String[] input= { "634","1","0","433","300","433","0","445","350","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1323() {
		String[] input= { "934","1","0","433","400","433","0","445","350","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1324() {
		String[] input= { "934","1","0","433","400","433","1","445","350","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1325() {
		String[] input= { "934","1","0","433","400","433","2","445","350","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1326() {
		String[] input= { "934","1","0","433","400","433","3","445","350","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1327() {
		String[] input= { "934","1","0","433","400","433","3","445","350","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1328() {
		String[] input= { "934","1","1","433","400","433","3","445","350","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1329() {
		String[] input= { "934","1","1","433","500","433","3","445","350","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1330() {
		String[] input= { "734","1","1","433","100","433","3","445","350","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1331() {
		String[] input= { "634","1","0","633","200","535","1","565","795","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1332() {
		String[] input= { "634","1","0","633","200","535","1","265","795","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1333() {
		String[] input= { "634","1","0","633","300","535","1","265","795","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1334() {
		String[] input= { "634","1","0","633","300","535","1","665","795","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1335() {
		String[] input= { "634","1","1","633","300","535","1","665","795","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1336() {
		String[] input= { "634","1","1","633","100","535","1","665","795","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1337() {
		String[] input= { "634","1","1","633","100","535","1","665","795","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1338() {
		String[] input= { "634","1","0","633","100","535","1","665","795","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1339() {
		String[] input= { "634","1","0","633","500","535","1","665","795","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1340() {
		String[] input= { "634","1","0","633","500","335","1","665","795","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1341() {
		String[] input= { "934","1","0","433","400","234","0","445","550","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1342() {
		String[] input= { "934","1","0","433","200","234","0","445","550","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1343() {
		String[] input= { "934","1","0","433","200","234","0","445","550","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1344() {
		String[] input= { "601","1","0","502","100","602","0","500","400","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1345() {
		String[] input= { "601","1","0","502","200","602","0","599","400","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1346() {
		String[] input= { "601","1","0","502","200","602","0","599","400","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1347() {
		String[] input= { "901","1","0","502","200","602","0","599","400","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1348() {
		String[] input= { "901","1","1","502","200","602","0","599","400","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1349() {
		String[] input= { "901","1","1","502","200","503","0","401","400","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1350() {
		String[] input= { "901","1","1","502","200","503","0","401","400","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1351() {
		String[] input= { "901","1","1","502","200","503","1","401","500","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1352() {
		String[] input= { "901","1","1","502","200","503","1","401","500","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1353() {
		String[] input= { "901","1","1","502","200","650","2","701","640","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1354() {
		String[] input= { "901","1","1","502","200","650","2","701","640","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1355() {
		String[] input= { "901","1","1","502","200","650","3","801","740","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1356() {
		String[] input= { "901","1","1","502","200","650","3","801","740","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1357() {
		String[] input= { "901","1","0","502","200","503","1","401","500","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1358() {
		String[] input= { "901","1","0","502","200","503","1","401","500","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1359() {
		String[] input= { "901","1","0","502","200","650","2","701","640","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1360() {
		String[] input= { "901","1","0","502","200","650","2","701","640","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1361() {
		String[] input= { "901","1","0","502","200","650","3","801","740","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1362() {
		String[] input= { "901","1","0","502","200","650","3","801","740","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1363() {
		String[] input= { "599","0","0","400","100","300","0","800","400","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1364() {
		String[] input= { "601","0","0","400","100","300","0","800","400","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1365() {
		String[] input= { "599","1","0","400","601","300","0","800","400","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1366() {
		String[] input= { "602","1","0","400","601","300","0","800","400","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1367() {
		String[] input= { "602","1","0","400","601","300","0","800","400","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1368() {
		String[] input= { "602","1","0","400","601","300","0","800","400","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1369() {
		String[] input= { "602","1","0","400","601","300","0","800","400","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1370() {
		String[] input= { "602","1","1","400","601","300","0","800","400","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1371() {
		String[] input= { "602","1","1","400","601","300","3","800","400","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1372() {
		String[] input= { "602","1","1","400","601","300","3","800","400","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1373() {
		String[] input= { "602","1","1","400","601","300","3","800","400","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1374() {
		String[] input= { "602","0","1","400","601","300","3","800","400","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1375() {
		String[] input= { "602","0","1","400","601","300","3","800","400","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1376() {
		String[] input= { "602","0","1","400","601","300","3","800","400","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1377() {
		String[] input= { "602","0","1","400","601","300","3","800","400","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1378() {
		String[] input= { "601","1","0","502","100","602","0","300","400","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1379() {
		String[] input= { "601","1","0","502","200","602","0","299","400","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1380() {
		String[] input= { "601","1","0","502","200","602","0","299","400","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1381() {
		String[] input= { "901","1","0","502","200","602","0","299","400","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1382() {
		String[] input= { "901","1","1","502","200","602","0","299","400","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1383() {
		String[] input= { "901","1","1","502","200","503","0","301","400","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1384() {
		String[] input= { "901","1","1","502","200","503","0","301","400","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1385() {
		String[] input= { "901","1","1","502","200","503","1","201","500","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1386() {
		String[] input= { "901","1","1","502","200","503","1","201","500","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1387() {
		String[] input= { "901","1","1","502","200","650","2","501","640","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1388() {
		String[] input= { "901","1","1","502","200","650","2","301","640","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1389() {
		String[] input= { "901","1","1","502","200","650","3","401","740","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1390() {
		String[] input= { "901","1","1","502","200","650","3","201","740","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1391() {
		String[] input= { "901","1","0","502","200","503","1","101","500","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1392() {
		String[] input= { "901","1","0","502","200","503","1","401","500","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1393() {
		String[] input= { "901","1","0","502","200","650","2","301","640","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1394() {
		String[] input= { "901","1","0","502","200","650","2","201","640","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1395() {
		String[] input= { "901","1","0","502","200","650","3","401","740","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1396() {
		String[] input= { "901","1","0","502","200","650","3","601","740","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1397() {
		String[] input= { "601","1","0","502","100","402","0","500","400","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1398() {
		String[] input= { "601","1","0","502","200","402","0","599","400","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1399() {
		String[] input= { "601","1","0","502","200","502","0","599","400","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1400() {
		String[] input= { "901","1","0","502","200","402","0","599","400","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1401() {
		String[] input= { "901","1","1","502","200","302","0","599","400","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1402() {
		String[] input= { "901","1","1","502","200","403","0","401","400","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1403() {
		String[] input= { "901","1","1","502","200","403","0","401","400","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1404() {
		String[] input= { "901","1","1","502","200","303","1","401","500","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1405() {
		String[] input= { "901","1","1","502","200","203","1","401","500","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1406() {
		String[] input= { "901","1","1","502","200","450","2","701","640","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1407() {
		String[] input= { "901","1","1","502","200","450","2","701","640","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1408() {
		String[] input= { "901","1","1","502","200","450","3","801","740","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1409() {
		String[] input= { "901","1","1","502","200","350","3","801","740","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1410() {
		String[] input= { "901","1","0","502","200","403","1","401","500","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1411() {
		String[] input= { "901","1","0","502","200","303","1","401","500","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1412() {
		String[] input= { "901","1","0","502","200","450","2","701","640","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1413() {
		String[] input= { "901","1","0","502","200","350","2","701","640","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1414() {
		String[] input= { "901","1","0","502","200","450","3","801","740","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1415() {
		String[] input= { "901","1","0","502","200","350","3","801","740","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1416() {
		String[] input= { "675","1","0","300","599","424","0","500","400","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1417() {
		String[] input= { "675","1","0","300","599","424","0","400","400","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1418() {
		String[] input= { "675","1","0","300","599","424","1","500","500","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1419() {
		String[] input= { "675","1","1","300","0","424","1","500","500","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1420() {
		String[] input= { "675","1","1","300","0","424","1","600","500","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1421() {
		String[] input= { "675","1","1","300","0","424","1","600","500","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1422() {
		String[] input= { "675","1","0","300","599","424","2","700","640","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1423() {
		String[] input= { "675","1","0","300","599","424","2","800","640","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1424() {
		String[] input= { "675","1","0","300","599","424","3","900","740","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1425() {
		String[] input= { "675","1","1","300","0","424","3","900","740","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1426() {
		String[] input= { "675","1","1","300","0","424","3","900","740","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1427() {
		String[] input= { "675","1","1","300","0","424","3","900","740","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1428() {
		String[] input= { "675","0","0","300","0","424","5","600","500","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1429() {
		String[] input= { "675","1","0","300","0","424","1","600","500","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1430() {
		String[] input= { "675","1","0","300","0","424","5","600","500","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1431() {
		String[] input= { "675","1","0","300","0","424","5","600","500","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1432() {
		String[] input= { "675","1","0","300","0","424","5","600","500","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1433() {
		String[] input= { "675","0","0","300","0","424","5","600","500","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1434() {
		String[] input= { "65","0","0","300","0","424","5","600","500","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1435() {
		String[] input= { "65","0","1","300","0","424","5","600","500","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1436() {
		String[] input= { "65","0","1","300","0","424","5","600","500","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1437() {
		String[] input= { "65","0","1","300","700","424","5","600","500","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1438() {
		String[] input= { "65","0","1","300","700","424","5","600","500","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1439() {
		String[] input= { "765","1","0","300","400","424","5","400","500","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1440() {
		String[] input= { "765","1","0","300","400","424","5","400","500","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1441() {
		String[] input= { "765","1","0","300","400","424","5","400","500","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1442() {
		String[] input= { "765","1","0","300","400","424","2","400","500","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1443() {
		String[] input= { "765","1","0","300","400","424","3","400","500","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1444() {
		String[] input= { "765","1","0","300","400","424","4","400","500","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1445() {
		String[] input= { "765","1","0","300","400","424","4","400","500","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1446() {
		String[] input= { "765","1","0","300","400","424","4","400","500","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1447() {
		String[] input= { "765","1","0","300","500","424","3","400","500","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1448() {
		String[] input= { "765","1","0","300","600","424","3","400","500","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1449() {
		String[] input= { "718","1","0","717","34","1153","0","229","126","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1450() {
		String[] input= { "718","1","0","717","34","1153","0","229","126","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1451() {
		String[] input= { "718","1","1","717","34","1153","0","229","126","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1452() {
		String[] input= { "718","1","1","717","34","1153","1","229","126","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1453() {
		String[] input= { "718","1","1","717","34","1153","2","229","126","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1454() {
		String[] input= { "718","1","1","717","34","1153","3","229","126","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1455() {
		String[] input= { "718","1","1","717","34","1153","1","229","226","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1456() {
		String[] input= { "718","1","0","717","34","1153","1","429","326","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1457() {
		String[] input= { "718","1","0","717","34","1153","2","429","326","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1458() {
		String[] input= { "601","1","0","717","534","1153","2","429","326","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1459() {
		String[] input= { "765","1","0","500","400","424","5","400","500","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1460() {
		String[] input= { "765","1","0","500","400","424","5","400","500","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1461() {
		String[] input= { "765","1","0","500","400","424","5","400","500","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1462() {
		String[] input= { "765","1","0","500","400","424","2","400","500","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1463() {
		String[] input= { "765","1","0","500","400","424","3","400","500","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1464() {
		String[] input= { "675","1","0","300","0","424","1","600","500","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1465() {
		String[] input= { "675","1","0","300","0","424","3","600","500","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1466() {
		String[] input= { "675","1","0","300","599","424","2","600","500","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1467() {
		String[] input= { "675","1","0","300","0","424","0","600","500","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1468() {
		String[] input= { "675","0","0","300","0","424","1","600","500","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1469() {
		String[] input= { "65","0","0","300","0","424","2","600","500","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1470() {
		String[] input= { "65","0","1","300","0","424","3","600","500","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1471() {
		String[] input= { "5","0","1","300","0","424","2","600","500","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1472() {
		String[] input= { "65","0","1","300","700","424","1","600","500","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1473() {
		String[] input= { "65","0","1","300","700","424","2","600","500","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1474() {
		String[] input= { "765","1","0","300","300","424","0","400","500","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1475() {
		String[] input= { "765","1","0","300","100","424","2","400","500","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1476() {
		String[] input= { "765","1","0","300","0","424","1","400","500","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1477() {
		String[] input= { "765","1","0","300","40","424","2","400","500","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1478() {
		String[] input= { "765","1","0","300","400","424","3","400","500","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1479() {
		String[] input= { "765","1","0","500","400","424","3","600","800","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1480() {
		String[] input= { "765","1","0","500","400","424","3","600","800","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1481() {
		String[] input= { "765","1","0","500","400","424","3","600","800","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1482() {
		String[] input= { "765","1","0","500","400","424","3","600","800","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1483() {
		String[] input= { "665","1","0","500","500","624","3","600","800","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1484() {
		String[] input= { "665","1","0","600","500","524","3","600","800","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1485() {
		String[] input= { "765","1","0","500","400","424","5","600","500","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1486() {
		String[] input= { "765","1","0","500","400","424","5","600","500","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1487() {
		String[] input= { "765","1","0","500","400","424","5","600","500","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1488() {
		String[] input= { "765","1","0","500","400","424","2","600","500","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1489() {
		String[] input= { "765","1","0","500","400","424","3","600","500","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1490() {
		String[] input= { "700","1","1","400","200","500","1","100","200","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1491() {
		String[] input= { "700","1","1","400","200","600","1","100","500","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1492() {
		String[] input= { "700","1","1","400","300","600","3","100","500","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1493() {
		String[] input= { "700","1","0","400","300","600","3","100","500","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1494() {
		String[] input= { "700","1","0","400","300","600","3","100","500","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1495() {
		String[] input= { "700","1","0","400","300","600","3","100","500","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1496() {
		String[] input= { "700","1","0","400","400","600","2","100","500","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1497() {
		String[] input= { "700","1","0","400","400","600","2","100","500","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1498() {
		String[] input= { "700","1","0","400","400","600","2","100","500","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1499() {
		String[] input= { "700","1","0","400","200","600","0","100","500","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1500() {
		String[] input= { "700","1","1","400","200","600","0","100","500","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1501() {
		String[] input= { "700","1","1","400","300","600","2","100","500","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1502() {
		String[] input= { "700","1","1","400","300","600","2","100","300","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1503() {
		String[] input= { "700","1","1","400","300","600","2","100","300","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1504() {
		String[] input= { "800","1","1","400","300","600","3","100","300","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1505() {
		String[] input= { "700","1","0","400","300","600","3","100","800","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1506() {
		String[] input= { "700","1","0","400","200","600","0","100","300","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1507() {
		String[] input= { "700","1","1","400","200","600","1","100","500","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1508() {
		String[] input= { "700","1","0","400","400","600","2","100","500","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1509() {
		String[] input= { "700","1","0","400","400","600","2","100","600","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1510() {
		String[] input= { "700","1","1","400","300","600","2","100","500","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1511() {
		String[] input= { "610","1","0","400","400","200","2","300","400","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1512() {
		String[] input= { "610","1","0","400","400","200","3","300","400","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1513() {
		String[] input= { "610","1","0","400","400","200","3","300","400","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1514() {
		String[] input= { "610","1","0","400","400","200","3","300","400","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1515() {
		String[] input= { "610","1","0","400","0","200","0","300","400","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1516() {
		String[] input= { "610","1","0","400","0","200","1","300","400","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1517() {
		String[] input= { "610","1","0","400","0","200","1","300","400","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1518() {
		String[] input= { "610","1","0","400","0","200","1","300","800","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1519() {
		String[] input= { "665","1","0","500","500","624","2","600","800","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1520() {
		String[] input= { "665","1","0","500","500","624","2","600","800","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1521() {
		String[] input= { "665","1","0","500","500","624","3","600","800","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1522() {
		String[] input= { "665","1","0","500","500","624","3","600","600","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1523() {
		String[] input= { "665","1","0","500","500","624","2","600","600","1","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1524() {
		String[] input= { "665","1","1","500","500","624","2","600","600","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1525() {
		String[] input= { "665","1","1","500","500","624","3","600","600","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1526() {
		String[] input= { "665","1","1","500","200","624","3","600","600","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1527() {
		String[] input= { "665","1","1","300","200","624","3","600","600","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1528() {
		String[] input= { "765","1","0","500","400","424","2","600","500","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1529() {
		String[] input= { "765","1","0","500","400","424","2","600","500","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1530() {
		String[] input= { "765","1","0","500","400","424","3","600","500","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1531() {
		String[] input= { "765","1","1","500","400","424","3","600","500","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1532() {
		String[] input= { "765","1","1","500","400","424","0","600","500","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1533() {
		String[] input= { "765","1","1","600","400","524","0","600","500","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1534() {
		String[] input= { "765","1","1","600","400","524","2","600","500","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1535() {
		String[] input= { "901","1","0","502","200","450","3","801","740","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1536() {
		String[] input= { "901","1","0","502","200","450","2","801","740","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1537() {
		String[] input= { "901","1","1","502","200","450","1","801","740","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1538() {
		String[] input= { "901","1","1","502","200","450","1","801","740","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1539() {
		String[] input= { "901","1","1","502","200","450","1","801","740","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1540() {
		String[] input= { "901","1","1","502","200","450","0","801","740","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1541() {
		String[] input= { "675","1","0","300","0","424","1","600","500","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1542() {
		String[] input= { "675","1","0","300","0","424","2","600","500","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1543() {
		String[] input= { "675","1","1","300","0","424","2","600","500","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1544() {
		String[] input= { "675","1","1","300","0","424","3","600","500","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1545() {
		String[] input= { "675","1","1","300","0","424","0","600","500","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1546() {
		String[] input= { "675","1","1","300","0","424","0","600","300","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1547() {
		String[] input= { "675","1","1","300","0","424","0","600","300","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1548() {
		String[] input= { "611","1","1","1142","511","4704","1","740","500","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1549() {
		String[] input= { "611","1","1","1142","511","4704","1","740","500","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1550() {
		String[] input= { "611","1","0","1142","511","4704","1","740","500","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1551() {
		String[] input= { "611","1","0","1142","511","4704","2","740","500","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1552() {
		String[] input= { "611","1","0","1142","511","4704","3","740","500","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1553() {
		String[] input= { "611","1","0","1142","511","4704","0","740","500","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1554() {
		String[] input= { "611","1","0","1142","511","4704","0","740","500","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1555() {
		String[] input= { "611","1","0","1142","511","4704","0","740","500","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1556() {
		String[] input= { "611","1","0","1142","511","4704","2","740","500","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1557() {
		String[] input= { "718","1","0","717","34","1153","2","429","326","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1558() {
		String[] input= { "718","1","0","717","34","1153","3","429","326","0","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),1);
	}
	@Test
	public void t1559() {
		String[] input= { "634","1","0","633","500","335","1","665","795","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1560() {
		String[] input= { "634","1","0","633","500","335","2","665","795","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1561() {
		String[] input= { "634","1","1","633","500","335","2","665","795","1","0","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1562() {
		String[] input= { "634","1","1","633","500","335","2","665","795","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1563() {
		String[] input= { "634","1","1","633","500","335","3","665","795","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1564() {
		String[] input= { "634","1","1","633","500","335","0","665","795","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1565() {
		String[] input= { "634","1","1","733","500","335","0","665","795","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),2);
	}
	@Test
	public void t1566() {
		String[] input= { "500","0","1","300","0","424","2","600","500","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1567() {
		String[] input= { "500","0","1","300","0","424","2","600","500","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1568() {
		String[] input= { "500","0","0","300","0","424","2","600","500","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1569() {
		String[] input= { "400","0","1","300","80","424","2","600","500","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1570() {
		String[] input= { "700","0","1","300","80","424","2","600","500","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1571() {
		String[] input= { "700","0","1","300","0","424","2","600","500","0","0","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1572() {
		String[] input= { "700","0","1","300","0","424","2","600","500","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1573() {
		String[] input= { "700","0","0","300","0","424","2","600","500","1","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1574() {
		String[] input= { "1078","1","0","581","567","655","3","637","906","1","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1575() {
		String[] input= { "1078","1","1","581","567","655","3","637","906","0","1","0"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1576() {
		String[] input= { "1078","1","1","581","567","655","3","637","906","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
	@Test
	public void t1577() {
		String[] input= { "1078","1","1","581","567","655","0","637","906","0","1","1"};
		tmp.main(input);
		assertEquals(tmp.alt_sep_test(),0);
	}
}
