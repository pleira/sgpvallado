
     if (help == 'y')
       //    if (dbgfile != NULL)
       {
         printf( "//%84s\n",
                         "------------------after sgp4   :---------------");
        printf( "checkSgp4_%d_%d(res: Sgp4Result) = {\n import res._\n", satrec.satnum, static_cast<int>(satrec.t));
         printf( " //   inputs : \n");
         printf( " assert( %7s === %15d ); assert( %7s === %15d ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); \n",
           "isimp ", satrec.isimp, "method ", satrec.method,
           "aycof ", satrec.aycof, "bstar ",  satrec.bstar,
           "con41 ", satrec.con41, "cc1 ",    satrec.cc1);
         printf(
             " assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); \n",
             "cc4 ", satrec.cc4, "cc5 ",   satrec.cc5,
             "d2 ",  satrec.d2,  "d3 ",    satrec.d3,
             "d4 ",  satrec.d4,  "delmo ", satrec.delmo);
         printf(
             " assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); \n",
             "ecco ",   satrec.ecco,            "eta ",     satrec.eta,
             "argpo ",  satrec.argpo,           "argpdot", satrec.argpdot,
             "omgcof", satrec.omgcof, "sinmao",  satrec.sinmao);
         printf(
             " assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); \n",
             "t ",     satrec.t,     "t2cof ",  satrec.t2cof,
             "t3cof ", satrec.t3cof, "t4cof ",  satrec.t4cof,
             "t5cof ", satrec.t5cof, "x1mth2", satrec.x1mth2);
         printf(
             " assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); \n",
             "x7thm1", satrec.x7thm1, "inclo ",  satrec.inclo,
             "mo ",     satrec.mo,              "mdot ",   satrec.mdot,
             "xno ",    satrec.no,              "nodeo ", satrec.nodeo);
         printf( " assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); \n",
             "nodedt ", satrec.nodedot, "xlcof ", satrec.xlcof,
             "xmcof ",    satrec.xmcof,
             "nodecf",  satrec.nodecf);
         printf( "//    outputs : \n");
         printf(
             "assert( %7s === %15d ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); \n",
             "error ", satrec.error, "x ", r[0], "y ", r[1], "z ", r[2],
             "xdot ", v[0], "ydot ", v[1], "zdot ", v[2]);
         printf( "//    extra inputs for ds : \n");
         printf( "// assert( %7s === %15d ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); \n",
             "irez ",  satrec.irez,  "d2201 ", satrec.d2201,
             "d2211 ", satrec.d2211, "d3210 ", satrec.d3210,
             "d3222 ", satrec.d3222);
         printf(
             "// assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); \n",
             "d4410 ", satrec.d4410, "d4422 ", satrec.d4422,
             "d5220 ", satrec.d5220, "d5232 ", satrec.d5232,
             "d5421 ", satrec.d5421, "d5433 ", satrec.d5433);
         printf(
             "// assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); \n",
             "dedt ", satrec.dedt, "del1 ", satrec.del1,
             "del2 ", satrec.del2, "del3 ", satrec.del3,
             "didt ", satrec.didt, "dmdt ", satrec.dmdt);
         printf(
             "// assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); \n",
             "dnodt ", satrec.dnodt, "domdt ", satrec.domdt,
             "e3 ",    satrec.e3,    "ee2 ",   satrec.ee2,
             "peo ",   satrec.peo,   "pgho ",  satrec.pgho);
         printf(
             "// assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); \n",
             "pho ", satrec.pho, "pinco ", satrec.pinco,
             "plo ", satrec.plo, "se2 ",   satrec.se2,
             "se3 ", satrec.se3, "sgh2 ",  satrec.sgh2);
         printf(
             "// assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); \n",
             "sgh3 ", satrec.sgh3, "sgh4 ", satrec.sgh4,
             "sh2 ",  satrec.sh2,  "sh3 ",  satrec.sh3,
             "si2 ",  satrec.si2,  "si3 ",  satrec.si3);
         printf(
             "// assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); \n",
             "sl2 ",   satrec.sl2,   "sl3 ",  satrec.sl3,
             "sl4 ",   satrec.sl4,   "gsto ", satrec.gsto,
             "xfact ", satrec.xfact, "xgh2 ", satrec.xgh2);
         printf(
             "// assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); \n",
             "xgh3 ", satrec.xgh3, "xgh4 ", satrec.xgh4,
             "xh2 ",  satrec.xh2,  "xh3 ",  satrec.xh3,
             "xi2 ",  satrec.xi2, "xi3 ",   satrec.xi3);
         printf(
             "// assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); \n",
             "xl2 ",  satrec.xl2,  "xl3 ",   satrec.xl3,
             "xl4 ",  satrec.xl4,  "xlamo ", satrec.xlamo,
             "zmol ", satrec.zmol, "zmos ",  satrec.zmos);
         printf( "assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); \n",
             "atime ", satrec.atime, "xli ", satrec.xli,
             "xni ",   satrec.xni);
       printf("} \n");
       }
