if (help == 'y')
       //    if (dbgfile != NULL)
       {
         // output: time position velocity SpecialPolarNodal LP_SpecialPolarNodal  satnum error operationmode unit-vector
                  printf(
             "%15.9f  %15.9f  %15.9f  %15.9f  %15.9f  %15.9f  %15.9f  %15.9f  %15.9f  %15.9f  %15.9f  %15.9f %15.9f - LP %15.9f  %15.9f  %15.9f  %15.9f  %15.9f %15.9f - %6d %2d %c %15.9f %15.9f %15.9f \n",
             satrec.t, r[0], r[1], r[2], v[0], v[1], v[2], xinc, su, xnode, mrt, mvt, rvdot, xincp, sul, nodep, rl, rdotl, rvdotl, satrec.satnum, satrec.error, satrec.method, ux, uy, uz);
       }
