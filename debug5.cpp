     if (help == 'y')
       //    if (dbgfile != NULL)
       {
       printf( "%85s\n",
                         "// ------------------after initl  :---------------");
       printf( "checkIntl%d(ini : Initl) {\n import ini._\n", satn);
       printf( "  assert( %7s === %15d ); assert( %15s === %9s ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); \n",
         "satn ", satn, "yr ", " ", "ecco ", ecco, "epoch ", epoch, "inclo ", inclo);
       printf( " //   in/out : \n");
       printf( "  assert( %7s === %15.9f ); \n", "no ", no);
       printf( " //   outputs : \n");
       printf(
              "  assert( %7s === %15c ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); \n",
               "method ", method, "ainv ", ainv, "ao ", ao, "con41 ", con41,
               "con42 ", con42, "cosio ", cosio);
       printf( "  assert( %7s === %15.9f ); \n", "cosio2 ", cosio2);
       printf( "  assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); assert( %7s === %15.9f ); \n",
                         "einx  ", eccsq, "eccsq ", eccsq, "omeosq", omeosq,
                         "posq ", posq, "rp ", rp, "rteosq", rteosq);
       printf( "  assert( %7s === %15.9f ); assert( %7s === %15.9f ); \n", "sinio ", sinio, "gsto ", gsto);
       printf( "} \n");
      }
