/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodictable;

//import com.sun.corba.se.impl.naming.pcosnaming.NameServer;

/**
 *
 * @author ASHIKUL SHAKIL
 */
 public class Str {
      //String names[] = new String[3];
     // names[]={"a","b"};
    static String Name_of_txt[] = {"H.txt","He.txt","Li.txt","Be.txt","B.txt","C.txt","N.txt","O.txt",
    "F.txt","Ne.txt","Na.txt","Mg.txt","Al.txt","Si.txt","P.txt","S.txt","Cl.txt","Ar.txt","K.txt","Ca.txt",
    "Sc.txt","Ti.txt","V.txt","Cr.txt","Mn.txt","Fe.txt","Co.txt","Ni.txt","Cu.txt","Zn.txt","Ga.txt","Ge.txt",
    "As.txt","Se.txt","Br.txt","Kr.txt","Rb.txt","Sr.txt","Y.txt","Zr.txt","Nb.txt","Mo.txt","Tc.txt","Ru.txt",
    "Rh.txt","Pd.txt","Ag.txt","Cd.txt","In.txt","Sn.txt","Sb.txt","Te.txt","I.txt","Xe.txt","Cs.txt","Ba.txt","Lan.txt",
    "Hf.txt","Ta.txt","W.txt","Re.txt","Os.txt","Ir.txt","Pt.txt","Au.txt","Hg.txt",
    "Tl.txt","Pb.txt","Bi.txt","Po.txt","At.txt","Rn.txt","Fr.txt","Ra.txt","Act.txt","Rf.txt",
    "Db.txt","Sg.txt","Bh.txt","Hs.txt","Mt.txt","Ds.txt","Rg.txt","Cn.txt","Nh.txt","Fl.txt","Mc.txt","Lv.txt",
    "Ts.txt","Og.txt","La.txt","Ce.txt","Pr.txt","Nd.txt","Pm.txt","Sm.txt","Eu.txt","Gd.txt","Tb.txt","Dy.txt","Ho.txt","Er.txt",
    "Tm.txt","Yb.txt","Lu.txt","Ac.txt","Th.txt","Pa.txt","U.txt",
    "Np.txt","Pu.txt","Am.txt","Cm.txt","Bk.txt","Cf.txt","Es.txt","Fm.txt","Md.txt","No.txt","Lr.txt"};
     static String Name_of_txt2[] = {"H.txt","He.txt","Li.txt","Be.txt","B.txt","C.txt","N.txt","O.txt",
    "F.txt","Ne.txt","Na.txt","Mg.txt","Al.txt","Si.txt","P.txt","S.txt","Cl.txt","Ar.txt","K.txt","Ca.txt",
    "Sc.txt","Ti.txt","V.txt","Cr.txt","Mn.txt","Fe.txt","Co.txt","Ni.txt","Cu.txt","Zn.txt","Ga.txt","Ge.txt",
    "As.txt","Se.txt","Br.txt","Kr.txt","Rb.txt","Sr.txt","Y.txt","Zr.txt","Nb.txt","Mo.txt","Tc.txt","Ru.txt",
    "Rh.txt","Pd.txt","Ag.txt","Cd.txt","In.txt","Sn.txt","Sb.txt","Te.txt","I.txt","Xe.txt","Cs.txt","Ba.txt",
    "La.txt","Ce.txt","Pr.txt","Nd.txt","Pm.txt","Sm.txt","Eu.txt","Gd.txt","Tb.txt","Dy.txt","Ho.txt","Er.txt",
    "Tm.txt","Yb.txt","Lu.txt",
    "Hf.txt","Ta.txt","W.txt","Re.txt","Os.txt","Ir.txt","Pt.txt","Au.txt","Hg.txt",
    "Tl.txt","Pb.txt","Bi.txt","Po.txt","At.txt","Rn.txt","Fr.txt","Ra.txt","Ac.txt","Th.txt","Pa.txt","U.txt",
    "Np.txt","Pu.txt","Am.txt","Cm.txt","Bk.txt","Cf.txt","Es.txt","Fm.txt","Md.txt","No.txt","Lr.txt","Rf.txt",
    "Db.txt","Sg.txt","Bh.txt","Hs.txt","Mt.txt","Ds.txt","Rg.txt","Cn.txt","Nh.txt","Fl.txt","Mc.txt","Lv.txt",
    "Ts.txt","Og.txt"};
  
String Symbol_of_elements[] ={"H\n1","He\n2","Li\n3","Be\n4","B\n5","C\n6","N\n7","O\n8","F\n9","Ne\n10","Na\n11","Mg\n12","Al\n13","Si\n14","P\n15",
    "S\n16","Cl\n17","Ar\n18","K\n19","Ca\n20","Sc\n21","Ti\n22","V\n23","Cr\n24","Mn\n25","Fe\n26","Co\n27","Ni\n28","Cu\n29","Zn\n30","Ga\n31","Ge\n32",
    "As\n33","Se\n34","Br\n35","Kr\n36","Rb\n37","Sr\n38","Y\n39","Zr\n40","Nb\n41","Mo\n42","Tc\n43","Ru\n44","Rh\n45","Pd\n46","Ag\n47","Cd\n48","In\n49",
    "Sn\n50","Sb\n51","Te\n52","I\n53","Xe\n54","Cs\n55","Ba\n56","La-Lu\n57-71","Hf\n72","Ta\n73","W\n74","Re\n75","Os\n76","Ir\n77","Pt\n78","Au\n79","Hg\n80",
    "Tl\n81","Pb\n82","Bi\n83","Po\n84","At\n85","Rn\n86","Fr\n87","Ra\n88","Ac-Lr\n89-103","Rf\n104","Db\n105","Sg\n106","Bh\n107","Hs\n108","Mt\n109",
    "Ds\n110","Rg\n111","Cn\n112","Nh\n113","Fl\n114","Mc\n115","Lv\n116","Ts\n117","Og\n118","La\n57","Ce\n58","Pr\n59","Nd\n60","Pm\n61","Sm\n62","Eu\n63",
    "Gd\n64","Tb\n65","Dy\n66","Ho\n67","Er\n68","Tm\n69","Yb\n70","Lu\n71","Ac\n89","Th\n90","Pa\n91","U\n92","Np\n93","Pu\n94","Am\n95","Cm\n96","Bk\n97",
    "Cf\n98","Es\n99","Fm\n100","Md\n101","No\n102","Lr\n103"};
static String Symbol_of_elements2[] ={"H","He","Li","Be","B","C","N","O","F","Ne","Na","Mg","Al","Si","P","S","Cl","Ar","K",
"Ca","Sc","Ti","V","Cr","Mn","Fe","Co","Ni","Cu","Zn","Ga","Ge","As","Se","Br","Kr","Rb","Sr","Y","Zr","Nb","Mo","Tc","Ru","Rh","Pd","Ag",
"Cd","In","Sn","Sb","Te","I","Xe","Cs","Ba","*","Hf","Ta","W","Re",
"Os","Ir","Pt","Au","Hg","Tl","Pb","Bi","Po","At","Rn","Fr","Ra","#",
"Rf","Db","Sg","Bh","Hs","Mt","Ds","Rg","Cn","Nh","Fl","Mc","Lv","Ts","Og","La","Ce","Pr","Nd","Pm","Sm","Eu","Gd","Tb","Dy","Ho",
"Er","Tm","Yb","Lu","Ac","Th","Pa","U","Np","Pu","Am","Cm","Bk","Cf","Es","Fm","Md","No","Lr"};
public static String[] NAME(){
 String Name_of_elements[]={"Hydrogen","Helium","Lithium","Beryllium","Boron",
"Carbon","Nitrogen","Oxygen","Fluorine","Neon",
"Sodium","Magnesium","Aluminum","Silicon","Phosphorus",
"Sulfur","Chlorine","Argon","Potassium","Calcium",
"Scandium","Titanium","Vanadium","Chromium","Manganese",
"Iron","Cobalt","Nickel","Copper","Zinc",
"Gallium","Germanium","Arsenic","Selenium","Bromine",
"Krypton","Rubidium","Strontium","Yttrium","Zirconium",
"Niobium","Molybdenum","Technetium","Ruthenium","Rhodium",
"Palladium","Silver","Cadmium","Indium","Tin",
"Antimony","Tellurium","Iodine","Xenon","Cesium",
"Barium","Lanthanides","Hafnium","Tantalum","Tungsten","Rhenium",
"Osmium","Iridium","Platinum","Gold","	Mercury",
"Thallium","Lead","Bismuth","Polonium","Astatine",
"Radon","Francium","Radium","Actinides","Rutherfordium","Dubnium",
"Seaborgium","Bohrium","Hassium","Meitnerium","Darmstadtium",
"Roentgenium","Copernicium","Nihonium","Flerovium","Moscovium",
"Livermorium","Tennessine","Oganesson","Lanthanum","Cerium","Praseodymium","Neodymium",
"Promethium","Samarium","Europium","Gadolinium","Terbium",
"Dysprosium","Holmium","Erbium","Thulium","Ytterbium",
"Lutetium","Actinium","Thorium",
"Protactinium","Uranium","Neptunium","Plutonium","Americium",
"Curium","Berkelium","Californium","Einsteinium","Fermium",
"Mendelevium","Nobelium","Lawrencium"};
 return Name_of_elements;
}
 static String Name_of_elements1[]={"Hydrogen","Helium","Lithium","Beryllium","Boron",
"Carbon","Nitrogen","Oxygen","Fluorine","Neon",
"Sodium","Magnesium","Aluminum","Silicon","Phosphorus",
"Sulfur","Chlorine","Argon","Potassium","Calcium",
"Scandium","Titanium","Vanadium","Chromium","Manganese",
"Iron","Cobalt","Nickel","Copper","Zinc",
"Gallium","Germanium","Arsenic","Selenium","Bromine",
"Krypton","Rubidium","Strontium","Yttrium","Zirconium",
"Niobium","Molybdenum","Technetium","Ruthenium","Rhodium",
"Palladium","Silver","Cadmium","Indium","Tin",
"Antimony","Tellurium","Iodine","Xenon","Cesium",
"Barium","Lanthanum","Cerium","Praseodymium","Neodymium",
"Promethium","Samarium","Europium","Gadolinium","Terbium",
"Dysprosium","Holmium","Erbium","Thulium","Ytterbium",
"Lutetium","Hafnium","Tantalum","Tungsten","Rhenium",
"Osmium","Iridium","Platinum","Gold","	Mercury",
"Thallium","Lead","Bismuth","Polonium","Astatine",
"Radon","Francium","Radium","Actinium","Thorium",
"Protactinium","Uranium","Neptunium","Plutonium","Americium",
"Curium","Berkelium","Californium","Einsteinium","Fermium",
"Mendelevium","Nobelium","Lawrencium","Rutherfordium","Dubnium",
"Seaborgium","Bohrium","Hassium","Meitnerium","Darmstadtium",
"Roentgenium","Copernicium","Nihonium","Flerovium","Moscovium",
"Livermorium","Tennessine","Oganesson"};
 static String Name_of_pic[] = {"H.jpg","He.jpg","Li.jpg","Be.jpg","B.jpg","C.jpg","N.jpg","O.jpg",
    "F.jpg","Ne.jpg","Na.jpg","Mg.jpg","Al.jpg","Si.jpg","P.jpg","S.jpg","Cl.jpg","Ar.jpg","K.jpg","Ca.jpg",
    "Sc.jpg","Ti.jpg","V.jpg","Cr.jpg","Mn.jpg","Fe.jpg","Co.jpg","Ni.jpg","Cu.jpg","Zn.jpg","Ga.jpg","Ge.jpg",
    "As.jpg","Se.jpg","Br.jpg","Kr.jpg","Rb.jpg","Sr.jpg","Y.jpg","Zr.jpg","Nb.jpg","Mo.jpg","Tc.jpg","Ru.jpg",
    "Rh.jpg","Pd.jpg","Ag.jpg","Cd.jpg","In.jpg","Sn.jpg","Sb.jpg","Te.jpg","I.jpg","Xe.jpg","Cs.jpg","Ba.jpg","Lan.jpg",
    "Hf.jpg","Ta.jpg","W.jpg","Re.jpg","Os.jpg","Ir.jpg","Pt.jpg","Au.jpg","Hg.jpg",
    "Tl.jpg","Pb.jpg","Bi.jpg","Po.jpg","At.jpg","Rn.jpg","Fr.jpg","Ra.jpg","Act.jpg","Rf.jpg",
    "Db.jpg","Sg.jpg","Bh.jpg","Hs.jpg","Mt.jpg","Ds.jpg","Rg.jpg","Cn.jpg","Nh.jpg","Fl.jpg","Mc.jpg","Lv.jpg",
    "Ts.jpg","Og.jpg","La.jpg","Ce.jpg","Pr.jpg","Nd.jpg","Pm.jpg","Sm.jpg","Eu.jpg","Gd.jpg","Tb.jpg","Dy.jpg","Ho.jpg","Er.jpg",
    "Tm.jpg","Yb.jpg","Lu.jpg","Ac.jpg","Th.jpg","Pa.jpg","U.jpg",
    "Np.jpg","Pu.jpg","Am.jpg","Cm.jpg","Bk.jpg","Cf.jpg","Es.jpg","Fm.jpg","Md.jpg","No.jpg","Lr.jpg"};
 
 
 
 static String Name_of_pic2[] = {"H.jpg","He.jpg","Li.jpg","Be.jpg","B.jpg","C.jpg","N.jpg","O.jpg",
    "F.jpg","Ne.jpg","Na.jpg","Mg.jpg","Al.jpg","Si.jpg","P.jpg","S.jpg","Cl.jpg","Ar.jpg","K.jpg","Ca.jpg",
    "Sc.jpg","Ti.jpg","V.jpg","Cr.jpg","Mn.jpg","Fe.jpg","Co.jpg","Ni.jpg","Cu.jpg","Zn.jpg","Ga.jpg","Ge.jpg",
    "As.jpg","Se.jpg","Br.jpg","Kr.jpg","Rb.jpg","Sr.jpg","Y.jpg","Zr.jpg","Nb.jpg","Mo.jpg","Tc.jpg","Ru.jpg",
    "Rh.jpg","Pd.jpg","Ag.jpg","Cd.jpg","In.jpg","Sn.jpg","Sb.jpg","Te.jpg","I.jpg","Xe.jpg","Cs.jpg","Ba.jpg",
    "La.jpg","Ce.jpg","Pr.jpg","Nd.jpg","Pm.jpg","Sm.jpg","Eu.jpg","Gd.jpg","Tb.jpg","Dy.jpg","Ho.jpg","Er.jpg",
    "Tm.jpg","Yb.jpg","Lu.jpg","Hf.jpg","Ta.jpg","W.jpg","Re.jpg","Os.jpg","Ir.jpg","Pt.jpg","Au.jpg","Hg.jpg",
    "Tl.jpg","Pb.jpg","Bi.jpg","Po.jpg","At.jpg","Rn.jpg","Fr.jpg","Ra.jpg","Ac.jpg","Th.jpg","Pa.jpg","U.jpg",
    "Np.jpg","Pu.jpg","Am.jpg","Cm.jpg","Bk.jpg","Cf.jpg","Es.jpg","Fm.jpg","Md.jpg","No.jpg","Lr.jpg","Rf.jpg",
    "Db.jpg","Sg.jpg","Bh.jpg","Hs.jpg","Mt.jpg","Ds.jpg","Rg.jpg","Cn.jpg","Nh.jpg","Fl.jpg","Mc.jpg","Lv.jpg",
    "Ts.jpg","Og.jpg"};
 


String num[] ={"GP","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18",
    "P1","2","3","4","5","6","7"};

}

