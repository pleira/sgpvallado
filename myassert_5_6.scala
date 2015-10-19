SGP4 Version 2008-11-03
input operation mode a, i 
you entered: i
input type of run c, v, m 
you entered: v
input which constants 721 72 84 
input elset filename: 
                                   // ------------------after initl  :---------------
checkIntl5(ini : Initl) {
 import ini._
  assert(   satn  ===               5 ); assert(             yr  ===           ); assert(   ecco  ===     0.185966700 ); assert(  epoch  === 18441.784950620 ); assert(  inclo  ===     0.598092919 ); 
 //   in/out : 
  assert(     no  ===     0.047206302 ); 
 //   outputs : 
  assert( method  ===               n ); assert(   ainv  ===     0.738607085 ); assert(     ao  ===     1.353899821 ); assert(  con41  ===     1.048865088 ); assert(  con42  ===    -2.414775147 ); assert(  cosio  ===     0.826410932 ); 
  assert( cosio2  ===     0.682955029 ); 
  assert(  einx   ===     0.034583614 ); assert(  eccsq  ===     0.034583614 ); assert(  omeosq ===     0.965416386 ); assert(   posq  ===     1.708450473 ); assert(     rp  ===     1.102119539 ); assert(  rteosq ===     0.982556048 ); 
  assert(  sinio  ===     0.563067465 ); assert(   gsto  ===     3.469172342 ); 
} 
       // ------------------after sgp4init :-------------
checkSgp4Init5(ini: Sgp4Init) = {
 import ini._
assert(   satn  ===               5); assert(     yr  ===               0); assert(  bstar  ===     0.000028098); assert(   ecco  ===     0.185966700); assert(  epoch  === 18441.784950620); assert(  argpo  ===     5.790416027 ); 
assert(  inclo  ===     0.598092919); assert(     mo  ===     0.337309313 ); 
// in and out variables 
assert(     no  ===     0.047206302 ); 
//    outputs  :
assert(   init  ===               n); assert(  isimp  ===               0); assert( method  ===               n); assert(  aycof  ===     0.000660216 ); 
assert(  con41  ===     1.048865088); assert(    cc1  ===     0.000000000); assert(    cc4  ===     0.000000526 ); 
assert(    cc5  ===     0.000016465); assert(     d2  ===     0.000000000); assert(     d3  ===     0.000000000); assert(     d4  ===     0.000000000); assert(  delmo  ===     4.873084659 ); 
assert(    eta  ===     0.736909543); assert( argpdot ===     0.000054293); assert(  omgcof ===     0.000000000 ); 
assert( sinmao  ===     0.330949230); assert(  t2cof  ===     0.000000000); assert(  t3cof  ===     0.000000000 ); 
assert(  t4cof  ===     0.000000000); assert(  t5cof  ===     0.000000000); assert(   gsto  ===     3.469172342); assert( x1mth2  ===     0.317044971); assert( x7thm1  ===     3.780685205); assert(  xlcof  ===     0.001289058 ); 
assert(  xmcof  ===    -0.000000000); assert(   mdot  ===     0.047229443); assert(  nodecf ===    -0.000000000); assert(  nodedt ===    -0.000037171 ); 
//   in and outputs from deep space satellites :
assert(      t  ===     0.000000000); assert(  nodeo  ===     6.086385471 ); 
//             irez               0); assert(  atime  ===     0.000000000); assert(  d2201  ===     0.000000000); assert(  d2211  ===     0.000000000); assert(  d3210  ===     0.000000000 ); 
//            d3222     0.000000000); assert(  d4410  ===     0.000000000); assert(  d4422  ===     0.000000000); assert(  d5220  ===     0.000000000); assert(  d5232  ===     0.000000000); assert(  d5421  ===     0.000000000 ); 
//            d5433     0.000000000); assert(   dedt  ===     0.000000000); assert(   del1  ===     0.000000000); assert(   del2  ===     0.000000000); assert(   del3  ===     0.000000000 ); 
//             didt     0.000000000); assert(   dmdt  ===     0.000000000); assert(  dnodt  ===     0.000000000); assert(  domdt  ===     0.000000000); assert(     e3  ===     0.000000000 ); 
//              ee2     0.000000000); assert(    peo  ===     0.000000000); assert(   pgho  ===     0.000000000); assert(    pho  ===     0.000000000); assert(  pinco  ===     0.000000000); assert(    plo  ===     0.000000000 ); 
//              se2     0.000000000); assert(    se3  ===     0.000000000); assert(   sgh2  ===     0.000000000); assert(   sgh3  ===     0.000000000); assert(   sgh4  ===     0.000000000); assert(    sh2  ===     0.000000000 ); 
//              sh3     0.000000000); assert(    si2  ===     0.000000000); assert(    si3  ===     0.000000000); assert(    sl2  ===     0.000000000); assert(    sl3  ===     0.000000000); assert(    sl4  ===     0.000000000 ); 
//            xfact     0.000000000); assert(   xgh2  ===     0.000000000); assert(   xgh3  ===     0.000000000); assert(   xgh4  ===     0.000000000); assert(    xh2  ===     0.000000000 ); 
//              xh3     0.000000000); assert(    xi2  ===     0.000000000); assert(    xi3  ===     0.000000000); assert(    xl2  ===     0.000000000); assert(    xl3  ===     0.000000000 ); 
//              xl4     0.000000000); assert(    xli  ===     0.000000000); assert(  xlamo  ===     0.000000000); assert(    xni  ===     0.000000000); assert(   zmol  ===     0.000000000); assert(   zmos  ===     0.000000000 ); 
} 
// 5
                                   // ------------------after initl  :---------------
checkIntl4632(ini : Initl) {
 import ini._
  assert(   satn  ===            4632 ); assert(             yr  ===           ); assert(   ecco  ===     0.145050600 ); assert(  epoch  === 19754.910709590 ); assert(  inclo  ===     0.200063601 ); 
 //   in/out : 
  assert(     no  ===     0.005245869 ); 
 //   outputs : 
  assert( method  ===               n ); assert(   ainv  ===     0.170722893 ); assert(     ao  ===     5.857445274 ); assert(  con41  ===     1.881517177 ); assert(  con42  ===    -3.802528628 ); assert(  cosio  ===     0.980053940 ); 
  assert( cosio2  ===     0.960505726 ); 
  assert(  einx   ===     0.021039677 ); assert(  eccsq  ===     0.021039677 ); assert(  omeosq ===     0.978960323 ); assert(   posq  ===    32.881124410 ); assert(     rp  ===     5.007819322 ); assert(  rteosq ===     0.989424238 ); 
  assert(  sinio  ===     0.198731664 ); assert(   gsto  ===     1.716027084 ); 
} 
       // ------------------after sgp4init :-------------
checkSgp4Init4632(ini: Sgp4Init) = {
 import ini._
assert(   satn  ===            4632); assert(     yr  ===               4); assert(  bstar  ===     0.000100000); assert(   ecco  ===     0.145050600); assert(  epoch  === 19754.910709590); assert(  argpo  ===     3.623303527 ); 
assert(  inclo  ===     0.200063601); assert(     mo  ===     2.512139659 ); 
// in and out variables 
assert(     no  ===     0.005245869 ); 
//    outputs  :
assert(   init  ===               n); assert(  isimp  ===               1); assert( method  ===               d); assert(  aycof  ===     0.000232797 ); 
assert(  con41  ===     1.881743507); assert(    cc1  ===     0.000000000); assert(    cc4  ===     0.000000000 ); 
assert(    cc5  ===     0.000000000); assert(     d2  ===     0.000000000); assert(     d3  ===     0.000000000); assert(     d4  ===     0.000000000); assert(  delmo  ===     0.632187620 ); 
assert(    eta  ===     0.175353576); assert( argpdot ===     0.000000493); assert(  omgcof ===    -0.000000000 ); 
assert( sinmao  ===     0.588702675); assert(  t2cof  ===     0.000000000); assert(  t3cof  ===     0.000000000 ); 
assert(  t4cof  ===     0.000000000); assert(  t5cof  ===     0.000000000); assert(   gsto  ===     1.716027084); assert( x1mth2  ===     0.039418831); assert( x7thm1  ===     5.724068183); assert(  xlcof  ===     0.000464424 ); 
assert(  xmcof  ===    -0.000000000); assert(   mdot  ===     0.005246110); assert(  nodecf ===    -0.000000000); assert(  nodedt ===    -0.000000254 ); 
//   in and outputs from deep space satellites :
assert(      t  ===     0.000000000); assert(  nodeo  ===     4.766670465 ); 
//             irez               0); assert(  atime  ===     0.000000000); assert(  d2201  ===     0.000000000); assert(  d2211  ===     0.000000000); assert(  d3210  ===     0.000000000 ); 
//            d3222     0.000000000); assert(  d4410  ===     0.000000000); assert(  d4422  ===     0.000000000); assert(  d5220  ===     0.000000000); assert(  d5232  ===     0.000000000); assert(  d5421  ===     0.000000000 ); 
//            d5433     0.000000000); assert(   dedt  ===    -0.000000001); assert(   del1  ===     0.000000000); assert(   del2  ===     0.000000000); assert(   del3  ===     0.000000000 ); 
//             didt    -0.000000027); assert(   dmdt  ===    -0.000000060); assert(  dnodt  ===    -0.000000062); assert(  domdt  ===     0.000000065); assert(     e3  ===    -0.000325981 ); 
//              ee2     0.000096317); assert(    peo  ===     0.000000000); assert(   pgho  ===     0.000000000); assert(    pho  ===     0.000000000); assert(  pinco  ===     0.000000000); assert(    plo  ===     0.000000000 ); 
//              se2    -0.001598764); assert(    se3  ===    -0.001532829); assert(   sgh2  ===     0.010093217); assert(   sgh3  ===    -0.010311258); assert(   sgh4  ===    -0.000169829); assert(    sh2  ===    -0.001436572 ); 
//              sh3    -0.000260467); assert(    si2  ===    -0.000275202); assert(    si3  ===     0.001412254); assert(    sl2  ===    -0.009737328); assert(    sl3  ===     0.009584140); assert(    sl4  ===     0.000404115 ); 
//            xfact     0.000000000); assert(   xgh2  ===     0.002069564); assert(   xgh3  ===     0.000624687); assert(   xgh4  ===    -0.000089405); assert(    xh2  ===    -0.000059567 ); 
//              xh3    -0.000266054); assert(    xi2  ===    -0.000255081); assert(    xi3  ===     0.000065138); assert(    xl2  ===    -0.001862213); assert(    xl3  ===    -0.000587320 ); 
//              xl4     0.000212743); assert(    xli  ===     0.000000000); assert(  xlamo  ===     0.000000000); assert(    xni  ===     0.000000000); assert(   zmol  ===     3.145380241); assert(   zmos  ===     0.479549095 ); 
} 
// 4632
                                   // ------------------after initl  :---------------
checkIntl6251(ini : Initl) {
 import ini._
  assert(   satn  ===            6251 ); assert(             yr  ===           ); assert(   ecco  ===     0.003003500 ); assert(  epoch  === 20630.824120140 ); assert(  inclo  ===     1.013301512 ); 
 //   in/out : 
  assert(     no  ===     0.067918037 ); 
 //   outputs : 
  assert( method  ===               n ); assert(   ainv  ===     0.941319167 ); assert(     ao  ===     1.062338933 ); assert(  con41  ===    -0.160280193 ); assert(  con42  ===    -0.399533012 ); assert(  cosio  ===     0.529062002 ); 
  assert( cosio2  ===     0.279906602 ); 
  assert(  einx   ===     0.000009021 ); assert(  eccsq  ===     0.000009021 ); assert(  omeosq ===     0.999990979 ); assert(   posq  ===     1.128543648 ); assert(     rp  ===     1.059148199 ); assert(  rteosq ===     0.999995489 ); 
  assert(  sinio  ===     0.848583171 ); assert(   gsto  ===     3.673754968 ); 
} 
       // ------------------after sgp4init :-------------
checkSgp4Init6251(ini: Sgp4Init) = {
 import ini._
assert(   satn  ===            6251); assert(     yr  ===               6); assert(  bstar  ===     0.000128080); assert(   ecco  ===     0.003003500); assert(  epoch  === 20630.824120140); assert(  argpo  ===     2.428744337 ); 
assert(  inclo  ===     1.013301512); assert(     mo  ===     3.860413487 ); 
// in and out variables 
assert(     no  ===     0.067918037 ); 
//    outputs  :
assert(   init  ===               n); assert(  isimp  ===               0); assert( method  ===               n); assert(  aycof  ===     0.000994993 ); 
assert(  con41  ===    -0.160280193); assert(    cc1  ===     0.000000003); assert(    cc4  ===     0.000005200 ); 
assert(    cc5  ===     0.000650194); assert(     d2  ===     0.000000000); assert(     d3  ===     0.000000000); assert(     d4  ===     0.000000000); assert(  delmo  ===     0.863016906 ); 
assert(    eta  ===     0.063675056); assert( argpdot ===     0.000019407); assert(  omgcof ===    -0.000000052 ); 
assert( sinmao  ===    -0.658497710); assert(  t2cof  ===     0.000000004); assert(  t3cof  ===     0.000000000 ); 
assert(  t4cof  ===     0.000000000); assert(  t5cof  ===     0.000000000); assert(   gsto  ===     3.673754968); assert( x1mth2  ===     0.720093398); assert( x7thm1  ===     0.959346217); assert(  xlcof  ===     0.001836762 ); 
assert(  xmcof  ===    -0.000133147); assert(   mdot  ===     0.067910210); assert(  nodecf ===    -0.000000000); assert(  nodedt ===    -0.000051677 ); 
//   in and outputs from deep space satellites :
assert(      t  ===     0.000000000); assert(  nodeo  ===     0.943219561 ); 
//             irez               0); assert(  atime  ===     0.000000000); assert(  d2201  ===     0.000000000); assert(  d2211  ===     0.000000000); assert(  d3210  ===     0.000000000 ); 
//            d3222     0.000000000); assert(  d4410  ===     0.000000000); assert(  d4422  ===     0.000000000); assert(  d5220  ===     0.000000000); assert(  d5232  ===     0.000000000); assert(  d5421  ===     0.000000000 ); 
//            d5433     0.000000000); assert(   dedt  ===     0.000000000); assert(   del1  ===     0.000000000); assert(   del2  ===     0.000000000); assert(   del3  ===     0.000000000 ); 
//             didt     0.000000000); assert(   dmdt  ===     0.000000000); assert(  dnodt  ===     0.000000000); assert(  domdt  ===     0.000000000); assert(     e3  ===     0.000000000 ); 
//              ee2     0.000000000); assert(    peo  ===     0.000000000); assert(   pgho  ===     0.000000000); assert(    pho  ===     0.000000000); assert(  pinco  ===     0.000000000); assert(    plo  ===     0.000000000 ); 
//              se2     0.000000000); assert(    se3  ===     0.000000000); assert(   sgh2  ===     0.000000000); assert(   sgh3  ===     0.000000000); assert(   sgh4  ===     0.000000000); assert(    sh2  ===     0.000000000 ); 
//              sh3     0.000000000); assert(    si2  ===     0.000000000); assert(    si3  ===     0.000000000); assert(    sl2  ===     0.000000000); assert(    sl3  ===     0.000000000); assert(    sl4  ===     0.000000000 ); 
//            xfact     0.000000000); assert(   xgh2  ===     0.000000000); assert(   xgh3  ===     0.000000000); assert(   xgh4  ===     0.000000000); assert(    xh2  ===     0.000000000 ); 
//              xh3     0.000000000); assert(    xi2  ===     0.000000000); assert(    xi3  ===     0.000000000); assert(    xl2  ===     0.000000000); assert(    xl3  ===     0.000000000 ); 
//              xl4     0.000000000); assert(    xli  ===     0.000000000); assert(  xlamo  ===     0.000000000); assert(    xni  ===     0.000000000); assert(   zmol  ===     0.000000000); assert(   zmos  ===     0.000000000 ); 
} 
// 6251
                                   // ------------------after initl  :---------------
checkIntl8195(ini : Initl) {
 import ini._
  assert(   satn  ===            8195 ); assert(             yr  ===           ); assert(   ecco  ===     0.687714600 ); assert(  epoch  === 20630.332154440 ); assert(  inclo  ===     1.119778813 ); 
 //   in/out : 
  assert(     no  ===     0.008748547 ); 
 //   outputs : 
  assert( method  ===               n ); assert(   ainv  ===     0.240088176 ); assert(     ao  ===     4.165136398 ); assert(  con41  ===    -0.430021887 ); assert(  con42  ===     0.050036478 ); assert(  cosio  ===     0.435881526 ); 
  assert( cosio2  ===     0.189992704 ); 
  assert(  einx   ===     0.472951371 ); assert(  eccsq  ===     0.472951371 ); assert(  omeosq ===     0.527048629 ); assert(   posq  ===     4.819032242 ); assert(     rp  ===     1.300711286 ); assert(  rteosq ===     0.725981149 ); 
  assert(  sinio  ===     0.900004053 ); assert(   gsto  ===     0.574180127 ); 
} 
       // ------------------after sgp4init :-------------
checkSgp4Init8195(ini: Sgp4Init) = {
 import ini._
assert(   satn  ===            8195); assert(     yr  ===               6); assert(  bstar  ===     0.000118730); assert(   ecco  ===     0.687714600); assert(  epoch  === 20630.332154440); assert(  argpo  ===     4.621022739 ); 
assert(  inclo  ===     1.119778813); assert(     mo  ===     0.353005059 ); 
// in and out variables 
assert(     no  ===     0.008748547 ); 
//    outputs  :
assert(   init  ===               n); assert(  isimp  ===               1); assert( method  ===               d); assert(  aycof  ===     0.001055442 ); 
assert(  con41  ===    -0.430737973); assert(    cc1  ===     0.000000000); assert(    cc4  ===     0.000000001 ); 
assert(    cc5  ===     0.000000207); assert(     d2  ===     0.000000000); assert(     d3  ===     0.000000000); assert(     d4  ===     0.000000000); assert(  delmo  ===     6.357151283 ); 
assert(    eta  ===     0.908502853); assert( argpdot ===    -0.000000074); assert(  omgcof ===    -0.000000000 ); 
assert( sinmao  ===     0.345719125); assert(  t2cof  ===     0.000000000); assert(  t3cof  ===     0.000000000 ); 
assert(  t4cof  ===     0.000000000); assert(  t5cof  ===     0.000000000); assert(   gsto  ===     0.574180127); assert( x1mth2  ===     0.810245991); assert( x7thm1  ===     0.328278063); assert(  xlcof  ===     0.001903416 ); 
assert(  xmcof  ===    -0.000000000); assert(   mdot  ===     0.008748087); assert(  nodecf ===    -0.000000000); assert(  nodedt ===    -0.000001285 ); 
//   in and outputs from deep space satellites :
assert(      t  ===     0.000000000); assert(  nodeo  ===     4.870720014 ); 
//             irez               2); assert(  atime  ===     0.000000000); assert(  d2201  ===    -0.000000000); assert(  d2211  ===     0.000000000); assert(  d3210  ===    -0.000000000 ); 
//            d3222    -0.000000000); assert(  d4410  ===     0.000000000); assert(  d4422  ===     0.000000000); assert(  d5220  ===    -0.000000000); assert(  d5232  ===     0.000000000); assert(  d5421  ===    -0.000000000 ); 
//            d5433    -0.000000000); assert(   dedt  ===    -0.000000029); assert(   del1  ===     0.000000000); assert(   del2  ===     0.000000000); assert(   del3  ===     0.000000000 ); 
//             didt    -0.000000010); assert(   dmdt  ===     0.000000093); assert(  dnodt  ===    -0.000000061); assert(  domdt  ===    -0.000000014); assert(     e3  ===    -0.000440805 ); 
//              ee2    -0.000109343); assert(    peo  ===     0.000000000); assert(   pgho  ===     0.000000000); assert(    pho  ===     0.000000000); assert(  pinco  ===     0.000000000); assert(    plo  ===     0.000000000 ); 
//              se2     0.002501942); assert(    se3  ===     0.001007242); assert(   sgh2  ===    -0.001261916); assert(   sgh3  ===     0.002455746); assert(   sgh4  ===    -0.000074720); assert(    sh2  ===     0.000945804 ); 
//              sh3    -0.003970224); assert(    si2  ===    -0.001110570); assert(    si3  ===     0.000027357); assert(    sl2  ===     0.004083493); assert(    sl3  ===    -0.002119116); assert(    sl4  ===     0.000288830 ); 
//            xfact    -0.008753597); assert(   xgh2  ===     0.000454920); assert(   xgh3  ===    -0.000024648); assert(   xgh4  ===    -0.000039336); assert(    xh2  ===    -0.000643834 ); 
//              xh3     0.000307943); assert(    xi2  ===     0.000114241); assert(    xi3  ===     0.000120009); assert(    xl2  ===    -0.000786264); assert(    xl3  ===    -0.000455942 ); 
//              xl4     0.000152052); assert(    xli  ===     2.662899526); assert(  xlamo  ===     2.662899526); assert(    xni  ===     0.008748547); assert(   zmol  ===     1.703291772); assert(   zmos  ===     2.972158040 ); 
} 
// 8195
                                   // ------------------after initl  :---------------
checkIntl9880(ini : Initl) {
 import ini._
  assert(   satn  ===            9880 ); assert(             yr  ===           ); assert(   ecco  ===     0.706905100 ); assert(  epoch  === 20630.561574750 ); assert(  inclo  ===     1.127426846 ); 
 //   in/out : 
  assert(     no  ===     0.008762667 ); 
 //   outputs : 
  assert( method  ===               n ); assert(   ainv  ===     0.240346439 ); assert(     ao  ===     4.160660767 ); assert(  con41  ===    -0.447914105 ); assert(  con42  ===     0.079856841 ); assert(  cosio  ===     0.428985584 ); 
  assert( cosio2  ===     0.184028632 ); 
  assert(  einx   ===     0.499714820 ); assert(  eccsq  ===     0.499714820 ); assert(  omeosq ===     0.500285180 ); assert(   posq  ===     4.332712684 ); assert(     rp  ===     1.219468451 ); assert(  rteosq ===     0.707308405 ); 
  assert(  sinio  ===     0.903311335 ); assert(   gsto  ===     2.019617117 ); 
} 
       // ------------------after sgp4init :-------------
checkSgp4Init9880(ini: Sgp4Init) = {
 import ini._
assert(   satn  ===            9880); assert(     yr  ===               6); assert(  bstar  ===     0.000100000); assert(   ecco  ===     0.706905100); assert(  epoch  === 20630.561574750); assert(  argpo  ===     4.712788661 ); 
assert(  inclo  ===     1.127426846); assert(     mo  ===     0.285047173 ); 
// in and out variables 
assert(     no  ===     0.008762667 ); 
//    outputs  :
assert(   init  ===               n); assert(  isimp  ===               1); assert( method  ===               d); assert(  aycof  ===     0.001059043 ); 
assert(  con41  ===    -0.447356444); assert(    cc1  ===     0.000000000); assert(    cc4  ===     0.000000004 ); 
assert(    cc5  ===     0.000000627); assert(     d2  ===     0.000000000); assert(     d3  ===     0.000000000); assert(     d4  ===     0.000000000); assert(  delmo  ===     6.820964768 ); 
assert(    eta  ===     0.934177011); assert( argpdot ===    -0.000000132); assert(  omgcof ===     0.000000000 ); 
assert( sinmao  ===     0.281202722); assert(  t2cof  ===     0.000000000); assert(  t3cof  ===     0.000000000 ); 
assert(  t4cof  ===     0.000000000); assert(  t5cof  ===     0.000000000); assert(   gsto  ===     2.019617117); assert( x1mth2  ===     0.815785481); assert( x7thm1  ===     0.289501630); assert(  xlcof  ===     0.001906605 ); 
assert(  xmcof  ===    -0.000000000); assert(   mdot  ===     0.008762147); assert(  nodecf ===    -0.000000000); assert(  nodedt ===    -0.000001408 ); 
//   in and outputs from deep space satellites :
assert(      t  ===     0.000000000); assert(  nodeo  ===     6.097806906 ); 
//             irez               2); assert(  atime  ===     0.000000000); assert(  d2201  ===    -0.000000000); assert(  d2211  ===     0.000000000); assert(  d3210  ===    -0.000000000 ); 
//            d3222    -0.000000000); assert(  d4410  ===     0.000000000); assert(  d4422  ===     0.000000000); assert(  d5220  ===    -0.000000000); assert(  d5232  ===     0.000000000); assert(  d5421  ===    -0.000000000 ); 
//            d5433    -0.000000000); assert(   dedt  ===    -0.000000005); assert(   del1  ===     0.000000000); assert(   del2  ===     0.000000000); assert(   del3  ===     0.000000000 ); 
//             didt    -0.000000002); assert(   dmdt  ===     0.000000007); assert(  dnodt  ===    -0.000000086); assert(  domdt  ===     0.000000023); assert(     e3  ===     0.000124943 ); 
//              ee2     0.000647665); assert(    peo  ===     0.000000000); assert(   pgho  ===     0.000000000); assert(    pho  ===     0.000000000); assert(  pinco  ===     0.000000000); assert(    plo  ===     0.000000000 ); 
//              se2    -0.003006446); assert(    se3  ===     0.002366248); assert(   sgh2  ===    -0.002805618); assert(   sgh3  ===    -0.003755906); assert(   sgh4  ===    -0.000072681); assert(    sh2  ===     0.002948902 ); 
//              sh3     0.003166375); assert(    si2  ===     0.000656913); assert(    si3  ===    -0.000699250); assert(    sl2  ===     0.004534352); assert(    sl3  ===     0.006836119); assert(    sl4  ===     0.000291115 ); 
//            xfact    -0.008754040); assert(   xgh2  ===    -0.000181572); assert(   xgh3  ===     0.000813415); assert(   xgh4  ===    -0.000038262); assert(    xh2  ===     0.000048161 ); 
//              xh3    -0.000669642); assert(    xi2  ===    -0.000138364); assert(    xi3  ===    -0.000000711); assert(    xl2  ===     0.000411140); assert(    xl3  ===    -0.001491372 ); 
//              xl4     0.000153255); assert(    xli  ===     2.158241444); assert(  xlamo  ===     2.158241444); assert(    xni  ===     0.008762667); assert(   zmol  ===     1.755605827); assert(   zmos  ===     2.976104523 ); 
} 
// 9880
                                   // ------------------after initl  :---------------
checkIntl9998(ini : Initl) {
 import ini._
  assert(   satn  ===            9998 ); assert(             yr  ===           ); assert(   ecco  ===     0.027097100 ); assert(  epoch  === 20237.794179280 ); assert(  inclo  ===     0.165732975 ); 
 //   in/out : 
  assert(     no  ===     0.005069385 ); 
 //   outputs : 
  assert( method  ===               n ); assert(   ainv  ===     0.166872070 ); assert(     ao  ===     5.992614588 ); assert(  con41  ===     1.918349444 ); assert(  con42  ===    -3.863915741 ); assert(  cosio  ===     0.986297698 ); 
  assert( cosio2  ===     0.972783148 ); 
  assert(  einx   ===     0.000734253 ); assert(  eccsq  ===     0.000734253 ); assert(  omeosq ===     0.999265747 ); assert(   posq  ===    35.858712827 ); assert(     rp  ===     5.830232111 ); assert(  rteosq ===     0.999632806 ); 
  assert(  sinio  ===     0.164975307 ); assert(   gsto  ===     3.007604047 ); 
} 
       // ------------------after sgp4init :-------------
checkSgp4Init9998(ini: Sgp4Init) = {
 import ini._
assert(   satn  ===            9998); assert(     yr  ===               5); assert(  bstar  ===     0.000000000); assert(   ecco  ===     0.027097100); assert(  epoch  === 20237.794179280); assert(  argpo  ===     5.716345999 ); 
assert(  inclo  ===     0.165732975); assert(     mo  ===     0.537730707 ); 
// in and out variables 
assert(     no  ===     0.005069385 ); 
//    outputs  :
assert(   init  ===               n); assert(  isimp  ===               1); assert( method  ===               d); assert(  aycof  ===     0.000193694 ); 
assert(  con41  ===     1.918133933); assert(    cc1  ===     0.000000000); assert(    cc4  ===     0.000000000 ); 
assert(    cc5  ===     0.000000000); assert(     d2  ===     0.000000000); assert(     d3  ===     0.000000000); assert(     d4  ===     0.000000000); assert(  delmo  ===     1.086383608 ); 
assert(    eta  ===     0.032604400); assert( argpdot ===     0.000000444); assert(  omgcof ===     0.000000000 ); 
assert( sinmao  ===     0.512188277); assert(  t2cof  ===     0.000000000); assert(  t3cof  ===     0.000000000 ); 
assert(  t4cof  ===     0.000000000); assert(  t5cof  ===     0.000000000); assert(   gsto  ===     3.007604047); assert( x1mth2  ===     0.027288689); assert( x7thm1  ===     5.808979176); assert(  xlcof  ===     0.000386719 ); 
assert(  xmcof  ===    -0.000000000); assert(   mdot  ===     0.005069605); assert(  nodecf ===    -0.000000000); assert(  nodedt ===    -0.000000226 ); 
//   in and outputs from deep space satellites :
assert(      t  ===     0.000000000); assert(  nodeo  ===     5.465934885 ); 
//             irez               1); assert(  atime  ===     0.000000000); assert(  d2201  ===     0.000000000); assert(  d2211  ===     0.000000000); assert(  d3210  ===     0.000000000 ); 
//            d3222     0.000000000); assert(  d4410  ===     0.000000000); assert(  d4422  ===     0.000000000); assert(  d5220  ===     0.000000000); assert(  d5232  ===     0.000000000); assert(  d5421  ===     0.000000000 ); 
//            d5433     0.000000000); assert(   dedt  ===     0.000000000); assert(   del1  ===    -0.000000000); assert(   del2  ===     0.000000000); assert(   del3  ===     0.000000000 ); 
//             didt    -0.000000021); assert(   dmdt  ===    -0.000000101); assert(  dnodt  ===     0.000000052); assert(  domdt  ===    -0.000000021); assert(     e3  ===     0.000047595 ); 
//              ee2    -0.000052159); assert(    peo  ===     0.000000000); assert(   pgho  ===     0.000000000); assert(    pho  ===     0.000000000); assert(  pinco  ===     0.000000000); assert(    plo  ===     0.000000000 ); 
//              se2    -0.000454549); assert(    se3  ===    -0.000014083); assert(   sgh2  ===     0.000334176); assert(   sgh3  ===    -0.016312507); assert(   sgh4  ===    -0.000177555); assert(    sh2  ===    -0.000792530 ); 
//              sh3    -0.000761498); assert(    si2  ===    -0.000759355); assert(    si3  ===     0.000740636); assert(    sl2  ===    -0.000066504); assert(    sl3  ===     0.015692368); assert(    sl4  ===     0.000414577 ); 
//            xfact    -0.004374901); assert(   xgh2  ===    -0.001706031); assert(   xgh3  ===    -0.001810450); assert(   xgh4  ===    -0.000093472); assert(    xh2  ===    -0.000222723 ); 
//              xh3     0.000005492); assert(    xi2  ===    -0.000006827); assert(    xi3  ===     0.000209911); assert(    xl2  ===     0.001640123); assert(    xl3  ===     0.001647042 ); 
//              xl4     0.000218250); assert(    xli  ===     2.429222237); assert(  xlamo  ===     2.429222237); assert(    xni  ===     0.005069385); assert(   zmol  ===     0.158577396); assert(   zmos  ===     2.502914127 ); 
} 
// 9998
                                   // ------------------after initl  :---------------
checkIntl11801(ini : Initl) {
 import ini._
  assert(   satn  ===           11801 ); assert(             yr  ===           ); assert(   ecco  ===     0.731803600 ); assert(  epoch  === 11187.296297880 ); assert(  inclo  ===     0.816667482 ); 
 //   in/out : 
  assert(     no  ===     0.009971132 ); 
 //   outputs : 
  assert( method  ===               n ); assert(   ainv  ===     0.261964907 ); assert(     ao  ===     3.817305189 ); assert(  con41  ===     0.406253180 ); assert(  con42  ===    -1.343755300 ); assert(  cosio  ===     0.684653971 ); 
  assert( cosio2  ===     0.468751060 ); 
  assert(  einx   ===     0.535536509 ); assert(  eccsq  ===     0.535536509 ); assert(  omeosq ===     0.464463491 ); assert(   posq  ===     3.143525080 ); assert(     rp  ===     1.023787510 ); assert(  rteosq ===     0.681515584 ); 
  assert(  sinio  ===     0.728868260 ); assert(   gsto  ===     1.265125076 ); 
} 
       // ------------------after sgp4init :-------------
checkSgp4Init11801(ini: Sgp4Init) = {
 import ini._
assert(   satn  ===           11801); assert(     yr  ===              80); assert(  bstar  ===     0.014311000); assert(   ecco  ===     0.731803600); assert(  epoch  === 11187.296297880); assert(  argpo  ===     0.828546193 ); 
assert(  inclo  ===     0.816667482); assert(     mo  ===     0.181718446 ); 
// in and out variables 
assert(     no  ===     0.009971132 ); 
//    outputs  :
assert(   init  ===               n); assert(  isimp  ===               1); assert( method  ===               d); assert(  aycof  ===     0.000854057 ); 
assert(  con41  ===     0.408366749); assert(    cc1  ===     0.000002455); assert(    cc4  ===     0.000111088 ); 
assert(    cc5  ===     0.016673249); assert(     d2  ===     0.000000000); assert(     d3  ===     0.000000000); assert(     d4  ===     0.000000000); assert(  delmo  ===     7.753547419 ); 
assert(    eta  ===     0.995641346); assert( argpdot ===     0.000003461); assert(  omgcof ===     0.000000000 ); 
assert( sinmao  ===     0.180719990); assert(  t2cof  ===     0.000003683); assert(  t3cof  ===     0.000000000 ); 
assert(  t4cof  ===     0.000000000); assert(  t5cof  ===     0.000000000); assert(   gsto  ===     1.265125076); assert( x1mth2  ===     0.530544417); assert( x7thm1  ===     2.286189080); assert(  xlcof  ===     0.001628334 ); 
assert(  xmcof  ===    -0.000000000); assert(   mdot  ===     0.009971845); assert(  nodecf ===    -0.000000000); assert(  nodedt ===    -0.000003528 ); 
//   in and outputs from deep space satellites :
assert(      t  ===     0.000000000); assert(  nodeo  ===     4.021856443 ); 
//             irez               0); assert(  atime  ===     0.000000000); assert(  d2201  ===     0.000000000); assert(  d2211  ===     0.000000000); assert(  d3210  ===     0.000000000 ); 
//            d3222     0.000000000); assert(  d4410  ===     0.000000000); assert(  d4422  ===     0.000000000); assert(  d5220  ===     0.000000000); assert(  d5232  ===     0.000000000); assert(  d5421  ===     0.000000000 ); 
//            d5433     0.000000000); assert(   dedt  ===     0.000000026); assert(   del1  ===     0.000000000); assert(   del2  ===     0.000000000); assert(   del3  ===     0.000000000 ); 
//             didt    -0.000000035); assert(   dmdt  ===     0.000000080); assert(  dnodt  ===    -0.000000060); assert(  domdt  ===     0.000000009); assert(     e3  ===    -0.000074995 ); 
//              ee2     0.000398469); assert(    peo  ===     0.000000000); assert(   pgho  ===     0.000000000); assert(    pho  ===     0.000000000); assert(  pinco  ===     0.000000000); assert(    plo  ===     0.000000000 ); 
//              se2    -0.002359225); assert(    se3  ===    -0.000070472); assert(   sgh2  ===    -0.000182257); assert(   sgh3  ===    -0.002213029); assert(   sgh4  ===    -0.000061543); assert(    sh2  ===    -0.001139407 ); 
//              sh3     0.002509518); assert(    si2  ===    -0.000052083); assert(    si3  ===     0.003287353); assert(    sl2  ===     0.002781684); assert(    sl3  ===     0.003338363); assert(    sl4  ===     0.000259068 ); 
//            xfact     0.000000000); assert(   xgh2  ===     0.000151026); assert(   xgh3  ===     0.000355534); assert(   xgh4  ===    -0.000032399); assert(    xh2  ===     0.000112859 ); 
//              xh3    -0.000473394); assert(    xi2  ===    -0.000064141); assert(    xi3  ===    -0.000569517); assert(    xl2  ===    -0.000703486); assert(    xl3  ===    -0.000524067 ); 
//              xl4     0.000136384); assert(    xli  ===     0.000000000); assert(  xlamo  ===     0.000000000); assert(    xni  ===     0.000000000); assert(   zmol  ===     3.567468390); assert(   zmos  ===     3.896090412 ); 
} 
// 11801
                                   // ------------------after initl  :---------------
checkIntl14128(ini : Initl) {
 import ini._
  assert(   satn  ===           14128 ); assert(             yr  ===           ); assert(   ecco  ===     0.001156200 ); assert(  epoch  === 20630.028448930 ); assert(  inclo  ===     0.199637741 ); 
 //   in/out : 
  assert(     no  ===     0.004313875 ); 
 //   outputs : 
  assert( method  ===               n ); assert(   ainv  ===     0.149850601 ); assert(     ao  ===     6.673313224 ); assert(  con41  ===     1.882014339 ); assert(  con42  ===    -3.803357232 ); assert(  cosio  ===     0.980138483 ); 
  assert( cosio2  ===     0.960671446 ); 
  assert(  einx   ===     0.000001337 ); assert(  eccsq  ===     0.000001337 ); assert(  omeosq ===     0.999998663 ); assert(   posq  ===    44.532990320 ); assert(     rp  ===     6.665597539 ); assert(  rteosq ===     0.999999332 ); 
  assert(  sinio  ===     0.198314280 ); assert(   gsto  ===     4.943902852 ); 
} 
       // ------------------after sgp4init :-------------
checkSgp4Init14128(ini: Sgp4Init) = {
 import ini._
assert(   satn  ===           14128); assert(     yr  ===               6); assert(  bstar  ===     0.000100000); assert(   ecco  ===     0.001156200); assert(  epoch  === 20630.028448930); assert(  argpo  ===     0.461782704 ); 
assert(  inclo  ===     0.199637741); assert(     mo  ===     5.821811010 ); 
// in and out variables 
assert(     no  ===     0.004313875 ); 
//    outputs  :
assert(   init  ===               n); assert(  isimp  ===               1); assert( method  ===               d); assert(  aycof  ===     0.000232900 ); 
assert(  con41  ===     1.881638887); assert(    cc1  ===     0.000000000); assert(    cc4  ===     0.000000000 ); 
assert(    cc5  ===     0.000000000); assert(     d2  ===     0.000000000); assert(     d3  ===     0.000000000); assert(     d4  ===     0.000000000); assert(  delmo  ===     1.003665754 ); 
assert(    eta  ===     0.001362934); assert( argpdot ===     0.000000299); assert(  omgcof ===     0.000000000 ); 
assert( sinmao  ===    -0.445179130); assert(  t2cof  ===     0.000000000); assert(  t3cof  ===     0.000000000 ); 
assert(  t4cof  ===     0.000000000); assert(  t5cof  ===     0.000000000); assert(   gsto  ===     4.943902852); assert( x1mth2  ===     0.039453704); assert( x7thm1  ===     5.723824070); assert(  xlcof  ===     0.000464628 ); 
assert(  xmcof  ===    -0.000000000); assert(   mdot  ===     0.004314023); assert(  nodecf ===    -0.000000000); assert(  nodedt ===    -0.000000154 ); 
//   in and outputs from deep space satellites :
assert(      t  ===     0.000000000); assert(  nodeo  ===     0.614589771 ); 
//             irez               1); assert(  atime  ===     0.000000000); assert(  d2201  ===     0.000000000); assert(  d2211  ===     0.000000000); assert(  d3210  ===     0.000000000 ); 
//            d3222     0.000000000); assert(  d4410  ===     0.000000000); assert(  d4422  ===     0.000000000); assert(  d5220  ===     0.000000000); assert(  d5232  ===     0.000000000); assert(  d5421  ===     0.000000000 ); 
//            d5433     0.000000000); assert(   dedt  ===     0.000000000); assert(   del1  ===    -0.000000000); assert(   del2  ===     0.000000000); assert(   del3  ===     0.000000000 ); 
//             didt     0.000000019); assert(   dmdt  ===    -0.000000134); assert(  dnodt  ===     0.000000069); assert(  domdt  ===    -0.000000021); assert(     e3  ===    -0.000002024 ); 
//              ee2     0.000003000); assert(    peo  ===     0.000000000); assert(   pgho  ===     0.000000000); assert(    pho  ===     0.000000000); assert(  pinco  ===     0.000000000); assert(    plo  ===     0.000000000 ); 
//              se2    -0.000003299); assert(    se3  ===     0.000022905); assert(   sgh2  ===    -0.019397797); assert(   sgh3  ===    -0.002730323); assert(   sgh4  ===    -0.000208727); assert(    sh2  ===    -0.000247378 ); 
//              sh3    -0.001070558); assert(    si2  ===    -0.001043420); assert(    si3  ===     0.000277128); assert(    sl2  ===     0.018830898); assert(    sl3  ===     0.002558662); assert(    sl4  ===     0.000487031 ); 
//            xfact    -0.004375062); assert(   xgh2  ===     0.001723157); assert(   xgh3  ===     0.002484249); assert(   xgh4  ===    -0.000109883); assert(    xh2  ===    -0.000151044 ); 
//              xh3     0.000168061); assert(    xi2  ===     0.000173960); assert(    xi3  ===     0.000138021); assert(    xl2  ===    -0.001687938); assert(    xl3  ===    -0.002328138 ); 
//              xl4     0.000256393); assert(    xli  ===     1.954280633); assert(  xlamo  ===     1.954280633); assert(    xni  ===     0.004313875); assert(   zmol  ===     1.634038676); assert(   zmos  ===     2.966933705 ); 
} 
// 14128
                                   // ------------------after initl  :---------------
checkIntl16925(ini : Initl) {
 import ini._
  assert(   satn  ===           16925 ); assert(             yr  ===           ); assert(   ecco  ===     0.559632700 ); assert(  epoch  === 20605.674157710 ); assert(  inclo  ===     1.083685405 ); 
 //   in/out : 
  assert(     no  ===     0.021317321 ); 
 //   outputs : 
  assert( method  ===               n ); assert(   ainv  ===     0.434745641 ); assert(     ao  ===     2.300195578 ); assert(  con41  ===    -0.342717947 ); assert(  con42  ===    -0.095470089 ); assert(  cosio  ===     0.468074799 ); 
  assert( cosio2  ===     0.219094018 ); 
  assert(  einx   ===     0.313188759 ); assert(  eccsq  ===     0.313188759 ); assert(  omeosq ===     0.686811241 ); assert(   posq  ===     2.495768608 ); assert(     rp  ===     1.012930916 ); assert(  rteosq ===     0.828740756 ); 
  assert(  sinio  ===     0.883688849 ); assert(   gsto  ===     2.298863661 ); 
} 
       // ------------------after sgp4init :-------------
checkSgp4Init16925(ini: Sgp4Init) = {
 import ini._
assert(   satn  ===           16925); assert(     yr  ===               6); assert(  bstar  ===     0.000187840); assert(   ecco  ===     0.559632700); assert(  epoch  === 20605.674157710); assert(  argpo  ===     4.278836977 ); 
assert(  inclo  ===     1.083685405); assert(     mo  ===     0.837216989 ); 
// in and out variables 
assert(     no  ===     0.021317321 ); 
//    outputs  :
assert(   init  ===               n); assert(  isimp  ===               1); assert( method  ===               d); assert(  aycof  ===     0.001036141 ); 
assert(  con41  ===    -0.342648954); assert(    cc1  ===     0.000002418); assert(    cc4  ===     0.013202866 ); 
assert(    cc5  ===     0.933537434); assert(     d2  ===     0.000000000); assert(     d3  ===     0.000000000); assert(     d4  ===     0.000000000); assert(  delmo  ===     4.611401199 ); 
assert(    eta  ===     0.992448149); assert( argpdot ===     0.000000656); assert(  omgcof ===    -0.000000000 ); 
assert( sinmao  ===     0.742782682); assert(  t2cof  ===     0.000003627); assert(  t3cof  ===     0.000000000 ); 
assert(  t4cof  ===     0.000000000); assert(  t5cof  ===     0.000000000); assert(   gsto  ===     2.298863661); assert( x1mth2  ===     0.780882985); assert( x7thm1  ===     0.533819108); assert(  xlcof  ===     0.001884582 ); 
assert(  xmcof  ===    -0.000000000); assert(   mdot  ===     0.021315352); assert(  nodecf ===    -0.000000000); assert(  nodedt ===    -0.000006489 ); 
//   in and outputs from deep space satellites :
assert(      t  ===     0.000000000); assert(  nodeo  ===     5.149138427 ); 
//             irez               0); assert(  atime  ===     0.000000000); assert(  d2201  ===     0.000000000); assert(  d2211  ===     0.000000000); assert(  d3210  ===     0.000000000 ); 
//            d3222     0.000000000); assert(  d4410  ===     0.000000000); assert(  d4422  ===     0.000000000); assert(  d5220  ===     0.000000000); assert(  d5232  ===     0.000000000); assert(  d5421  ===     0.000000000 ); 
//            d5433     0.000000000); assert(   dedt  ===    -0.000000002); assert(   del1  ===     0.000000000); assert(   del2  ===     0.000000000); assert(   del3  ===     0.000000000 ); 
//             didt    -0.000000009); assert(   dmdt  ===     0.000000033); assert(  dnodt  ===    -0.000000020); assert(  domdt  ===    -0.000000011); assert(     e3  ===    -0.000166857 ); 
//              ee2    -0.000082753); assert(    peo  ===     0.000000000); assert(   pgho  ===     0.000000000); assert(    pho  ===     0.000000000); assert(  pinco  ===     0.000000000); assert(    plo  ===     0.000000000 ); 
//              se2     0.001125967); assert(    se3  ===     0.000056851); assert(   sgh2  ===    -0.000088643); assert(   sgh3  ===     0.001625809); assert(   sgh4  ===    -0.000035005); assert(    sh2  ===     0.000274456 ); 
//              sh3    -0.000975962); assert(    si2  ===    -0.000499145); assert(    si3  ===    -0.000457304); assert(    sl2  ===     0.000146214); assert(    sl3  ===    -0.001456991); assert(    sl4  ===     0.000111787 ); 
//            xfact     0.000000000); assert(   xgh2  ===     0.000243270); assert(   xgh3  ===    -0.000112616); assert(   xgh4  ===    -0.000018428); assert(    xh2  ===    -0.000162133 ); 
//              xh3     0.000053474); assert(    xi2  ===    -0.000012375); assert(    xi3  ===     0.000101509); assert(    xl2  ===    -0.000258014); assert(    xl3  ===     0.000056397 ); 
//              xl4     0.000058849); assert(    xli  ===     0.000000000); assert(  xlamo  ===     0.000000000); assert(    xni  ===     0.000000000); assert(   zmol  ===     2.363784804); assert(   zmos  ===     2.547991748 ); 
} 
// 16925
                                   // ------------------after initl  :---------------
checkIntl20413(ini : Initl) {
 import ini._
  assert(   satn  ===           20413 ); assert(             yr  ===           ); assert(   ecco  ===     0.786444700 ); assert(  epoch  === 20452.791666670 ); assert(  inclo  ===     0.215572597 ); 
 //   in/out : 
  assert(     no  ===     0.001077284 ); 
 //   outputs : 
  assert( method  ===               n ); assert(   ainv  ===     0.059424681 ); assert(     ao  ===    16.828024612 ); assert(  con41  ===     1.862731633 ); assert(  con42  ===    -3.771219389 ); assert(  cosio  ===     0.976854072 ); 
  assert( cosio2  ===     0.954243878 ); 
  assert(  einx   ===     0.618495266 ); assert(  eccsq  ===     0.618495266 ); assert(  omeosq ===     0.381504734 ); assert(   posq  ===    41.216028293 ); assert(     rp  ===     3.593713844 ); assert(  rteosq ===     0.617660695 ); 
  assert(  sinio  ===     0.213906807 ); assert(   gsto  ===     0.407188564 ); 
} 
       // ------------------after sgp4init :-------------
checkSgp4Init20413(ini: Sgp4Init) = {
 import ini._
assert(   satn  ===           20413); assert(     yr  ===               5); assert(  bstar  ===     0.000000000); assert(   ecco  ===     0.786444700); assert(  epoch  === 20452.791666670); assert(  argpo  ===     3.426128446 ); 
assert(  inclo  ===     0.215572597); assert(     mo  ===     6.222933051 ); 
// in and out variables 
assert(     no  ===     0.001077284 ); 
//    outputs  :
assert(   init  ===               n); assert(  isimp  ===               1); assert( method  ===               d); assert(  aycof  ===     0.000234252 ); 
assert(  con41  ===     1.880261114); assert(    cc1  ===     0.000000000); assert(    cc4  ===     0.000000000 ); 
assert(    cc5  ===     0.000000000); assert(     d2  ===     0.000000000); assert(     d3  ===     0.000000000); assert(     d4  ===     0.000000000); assert(  delmo  ===     6.181481066 ); 
assert(    eta  ===     0.836778075); assert( argpdot ===     0.000000080); assert(  omgcof ===    -0.000000000 ); 
assert( sinmao  ===    -0.060215807); assert(  t2cof  ===     0.000000000); assert(  t3cof  ===     0.000000000 ); 
assert(  t4cof  ===     0.000000000); assert(  t5cof  ===     0.000000000); assert(   gsto  ===     0.407188564); assert( x1mth2  ===     0.039912962); assert( x7thm1  ===     5.720609266); assert(  xlcof  ===     0.000467311 ); 
assert(  xmcof  ===    -0.000000000); assert(   mdot  ===     0.001077308); assert(  nodecf ===    -0.000000000); assert(  nodedt ===    -0.000000041 ); 
//   in and outputs from deep space satellites :
assert(      t  ===     0.000000000); assert(  nodeo  ===     3.271188587 ); 
//             irez               0); assert(  atime  ===     0.000000000); assert(  d2201  ===     0.000000000); assert(  d2211  ===     0.000000000); assert(  d3210  ===     0.000000000 ); 
//            d3222     0.000000000); assert(  d4410  ===     0.000000000); assert(  d4422  ===     0.000000000); assert(  d5220  ===     0.000000000); assert(  d5232  ===     0.000000000); assert(  d5421  ===     0.000000000 ); 
//            d5433     0.000000000); assert(   dedt  ===     0.000000100); assert(   del1  ===     0.000000000); assert(   del2  ===     0.000000000); assert(   del3  ===     0.000000000 ); 
//             didt    -0.000000266); assert(   dmdt  ===    -0.000000744); assert(  dnodt  ===    -0.000000790); assert(  domdt  ===     0.000000993); assert(     e3  ===    -0.004548826 ); 
//              ee2     0.002057188); assert(    peo  ===     0.000000000); assert(   pgho  ===     0.000000000); assert(    pho  ===     0.000000000); assert(  pinco  ===     0.000000000); assert(    plo  ===     0.000000000 ); 
//              se2     0.029695699); assert(    se3  ===     0.014683683); assert(   sgh2  ===    -0.016348090); assert(   sgh3  ===     0.043242164); assert(   sgh4  ===    -0.000516258); assert(    sh2  ===     0.014251742 ); 
//              sh3     0.004931955); assert(    si2  ===     0.051441765); assert(    si3  ===    -0.000864621); assert(    sl2  ===     0.039519100); assert(    sl3  ===    -0.124155805); assert(    sl4  ===     0.002467220 ); 
//            xfact     0.000000000); assert(   xgh2  ===     0.006919618); assert(   xgh3  ===     0.002084733); assert(   xgh4  ===    -0.000271780); assert(    xh2  ===     0.000718625 ); 
//              xh3    -0.002561987); assert(    xi2  ===    -0.000547527); assert(    xi3  ===    -0.009211923); assert(    xl2  ===    -0.020308776); assert(    xl3  ===    -0.004767342 ); 
//              xl4     0.001298847); assert(    xli  ===     0.000000000); assert(  xlamo  ===     0.000000000); assert(    xni  ===     0.000000000); assert(   zmol  ===     5.201540682); assert(   zmos  ===     6.201295960 ); 
} 
// 20413
                                   // ------------------after initl  :---------------
checkIntl21897(ini : Initl) {
 import ini._
  assert(   satn  ===           21897 ); assert(             yr  ===           ); assert(   ecco  ===     0.742169000 ); assert(  epoch  === 20630.023412440 ); assert(  inclo  ===     1.085156717 ); 
 //   in/out : 
  assert(     no  ===     0.008782536 ); 
 //   outputs : 
  assert( method  ===               n ); assert(   ainv  ===     0.240709610 ); assert(     ao  ===     4.154383373 ); assert(  con41  ===    -0.346365789 ); assert(  con42  ===    -0.089390352 ); assert(  cosio  ===     0.466774111 ); 
  assert( cosio2  ===     0.217878070 ); 
  assert(  einx   ===     0.550814825 ); assert(  eccsq  ===     0.550814825 ); assert(  omeosq ===     0.449185175 ); assert(   posq  ===     3.482282274 ); assert(     rp  ===     1.071128819 ); assert(  rteosq ===     0.670212784 ); 
  assert(  sinio  ===     0.884376577 ); assert(   gsto  ===     4.912171010 ); 
} 
       // ------------------after sgp4init :-------------
checkSgp4Init21897(ini: Sgp4Init) = {
 import ini._
assert(   satn  ===           21897); assert(     yr  ===               6); assert(  bstar  ===    -0.000135250); assert(   ecco  ===     0.742169000); assert(  epoch  === 20630.023412440); assert(  argpo  ===     4.416489350 ); 
assert(  inclo  ===     1.085156717); assert(     mo  ===     0.351790309 ); 
// in and out variables 
assert(     no  ===     0.008782536 ); 
//    outputs  :
assert(   init  ===               n); assert(  isimp  ===               1); assert( method  ===               d); assert(  aycof  ===     0.001036737 ); 
assert(  con41  ===    -0.345345237); assert(    cc1  ===    -0.000000000); assert(    cc4  ===     0.000000271 ); 
assert(    cc5  ===     0.000046322); assert(     d2  ===     0.000000000); assert(     d3  ===     0.000000000); assert(     d4  ===     0.000000000); assert(  delmo  ===     7.090728303 ); 
assert(    eta  ===     0.981255044); assert( argpdot ===     0.000000182); assert(  omgcof ===     0.000000000 ); 
assert( sinmao  ===     0.344579025); assert(  t2cof  ===    -0.000000000); assert(  t3cof  ===     0.000000000 ); 
assert(  t4cof  ===     0.000000000); assert(  t5cof  ===     0.000000000); assert(   gsto  ===     4.912171010); assert( x1mth2  ===     0.781781746); assert( x7thm1  ===     0.527527781); assert(  xlcof  ===     0.001885203 ); 
assert(  xmcof  ===     0.000000000); assert(   mdot  ===     0.008782060); assert(  nodecf ===     0.000000000); assert(  nodedt ===    -0.000001911 ); 
//   in and outputs from deep space satellites :
assert(      t  ===     0.000000000); assert(  nodeo  ===     3.455919471 ); 
//             irez               2); assert(  atime  ===     0.000000000); assert(  d2201  ===    -0.000000000); assert(  d2211  ===     0.000000000); assert(  d3210  ===    -0.000000000 ); 
//            d3222    -0.000000000); assert(  d4410  ===     0.000000000); assert(  d4422  ===     0.000000000); assert(  d5220  ===    -0.000000000); assert(  d5232  ===     0.000000000); assert(  d5421  ===    -0.000000000 ); 
//            d5433    -0.000000000); assert(   dedt  ===     0.000000014); assert(   del1  ===     0.000000000); assert(   del2  ===     0.000000000); assert(   del3  ===     0.000000000 ); 
//             didt    -0.000000002); assert(   dmdt  ===     0.000000195); assert(  dnodt  ===    -0.000000007); assert(  domdt  ===    -0.000000070); assert(     e3  ===    -0.000058097 ); 
//              ee2     0.000102972); assert(    peo  ===     0.000000000); assert(   pgho  ===     0.000000000); assert(    pho  ===     0.000000000); assert(  pinco  ===     0.000000000); assert(    plo  ===     0.000000000 ); 
//              se2    -0.000582776); assert(    se3  ===     0.000778294); assert(   sgh2  ===    -0.000014040); assert(   sgh3  ===    -0.001232243); assert(   sgh4  ===    -0.000068713); assert(    sh2  ===     0.001040864 ); 
//              sh3     0.001047904); assert(    si2  ===     0.001704327); assert(    si3  ===     0.000526915); assert(    sl2  ===     0.000695816); assert(    sl3  ===    -0.001138733); assert(    sl4  ===     0.000295695 ); 
//            xfact    -0.008754654); assert(   xgh2  ===    -0.000164551); assert(   xgh3  ===     0.000106743); assert(   xgh4  ===    -0.000036173); assert(    xh2  ===    -0.000073856 ); 
//              xh3    -0.000137935); assert(    xi2  ===    -0.000144004); assert(    xi3  ===    -0.000233955); assert(    xl2  ===    -0.000173373); assert(    xl3  ===     0.000102944 ); 
//              xl4     0.000155666); assert(    xli  ===    -2.560712770); assert(  xlamo  ===    -2.560712770); assert(    xni  ===     0.008782536); assert(   zmol  ===     1.632890219); assert(   zmos  ===     2.966847068 ); 
} 
// 21897
                                   // ------------------after initl  :---------------
checkIntl22312(ini : Initl) {
 import ini._
  assert(   satn  ===           22312 ); assert(             yr  ===           ); assert(   ecco  ===     0.030872300 ); assert(  epoch  === 20548.462359120 ); assert(  inclo  ===     1.084697696 ); 
 //   in/out : 
  assert(     no  ===     0.069645394 ); 
 //   outputs : 
  assert( method  ===               n ); assert(   ainv  ===     0.957212627 ); assert(     ao  ===     1.044699967 ); assert(  con41  ===    -0.345228516 ); assert(  con42  ===    -0.091285806 ); assert(  cosio  ===     0.467180009 ); 
  assert( cosio2  ===     0.218257161 ); 
  assert(  einx   ===     0.000953099 ); assert(  eccsq  ===     0.000953099 ); assert(  omeosq ===     0.999046901 ); assert(   posq  ===     1.089318592 ); assert(     rp  ===     1.012447676 ); assert(  rteosq ===     0.999523337 ); 
  assert(  sinio  ===     0.884162224 ); assert(   gsto  ===     6.267076520 ); 
} 
       // ------------------after sgp4init :-------------
checkSgp4Init22312(ini: Sgp4Init) = {
 import ini._
assert(   satn  ===           22312); assert(     yr  ===               6); assert(  bstar  ===     0.000499490); assert(   ecco  ===     0.030872300); assert(  epoch  === 20548.462359120); assert(  argpo  ===     4.676136746 ); 
assert(  inclo  ===     1.084697696); assert(     mo  ===     1.548791216 ); 
// in and out variables 
assert(     no  ===     0.069645394 ); 
//    outputs  :
assert(   init  ===               n); assert(  isimp  ===               1); assert( method  ===               n); assert(  aycof  ===     0.001036711 ); 
assert(  con41  ===    -0.345228516); assert(    cc1  ===     0.000033750); assert(    cc4  ===     0.130450358 ); 
assert(    cc5  ===     2.910356158); assert(     d2  ===     0.000000000); assert(     d3  ===     0.000000000); assert(     d4  ===     0.000000000); assert(  delmo  ===     1.052100787 ); 
assert(    eta  ===     0.775962214); assert( argpdot ===     0.000004627); assert(  omgcof ===    -0.000000082 ); 
assert( sinmao  ===     0.999757897); assert(  t2cof  ===     0.000050625); assert(  t3cof  ===     0.000000000 ); 
assert(  t4cof  ===     0.000000000); assert(  t5cof  ===     0.000000000); assert(   gsto  ===     6.267076520); assert( x1mth2  ===     0.781742839); assert( x7thm1  ===     0.527800129); assert(  xlcof  ===     0.001885176 ); 
assert(  xmcof  ===    -0.000281431); assert(   mdot  ===     0.069627489); assert(  nodecf ===    -0.000000006); assert(  nodedt ===    -0.000048444 ); 
//   in and outputs from deep space satellites :
assert(      t  ===     0.000000000); assert(  nodeo  ===     1.352103081 ); 
//             irez               0); assert(  atime  ===     0.000000000); assert(  d2201  ===     0.000000000); assert(  d2211  ===     0.000000000); assert(  d3210  ===     0.000000000 ); 
//            d3222     0.000000000); assert(  d4410  ===     0.000000000); assert(  d4422  ===     0.000000000); assert(  d5220  ===     0.000000000); assert(  d5232  ===     0.000000000); assert(  d5421  ===     0.000000000 ); 
//            d5433     0.000000000); assert(   dedt  ===     0.000000000); assert(   del1  ===     0.000000000); assert(   del2  ===     0.000000000); assert(   del3  ===     0.000000000 ); 
//             didt     0.000000000); assert(   dmdt  ===     0.000000000); assert(  dnodt  ===     0.000000000); assert(  domdt  ===     0.000000000); assert(     e3  ===     0.000000000 ); 
//              ee2     0.000000000); assert(    peo  ===     0.000000000); assert(   pgho  ===     0.000000000); assert(    pho  ===     0.000000000); assert(  pinco  ===     0.000000000); assert(    plo  ===     0.000000000 ); 
//              se2     0.000000000); assert(    se3  ===     0.000000000); assert(   sgh2  ===     0.000000000); assert(   sgh3  ===     0.000000000); assert(   sgh4  ===     0.000000000); assert(    sh2  ===     0.000000000 ); 
//              sh3     0.000000000); assert(    si2  ===     0.000000000); assert(    si3  ===     0.000000000); assert(    sl2  ===     0.000000000); assert(    sl3  ===     0.000000000); assert(    sl4  ===     0.000000000 ); 
//            xfact     0.000000000); assert(   xgh2  ===     0.000000000); assert(   xgh3  ===     0.000000000); assert(   xgh4  ===     0.000000000); assert(    xh2  ===     0.000000000 ); 
//              xh3     0.000000000); assert(    xi2  ===     0.000000000); assert(    xi3  ===     0.000000000); assert(    xl2  ===     0.000000000); assert(    xl3  ===     0.000000000 ); 
//              xl4     0.000000000); assert(    xli  ===     0.000000000); assert(  xlamo  ===     0.000000000); assert(    xni  ===     0.000000000); assert(   zmol  ===     0.000000000); assert(   zmos  ===     0.000000000 ); 
} 
// 22312
# *** error: t:= 494.202867 *** code =   1
                                   // ------------------after initl  :---------------
checkIntl22674(ini : Initl) {
 import ini._
  assert(   satn  ===           22674 ); assert(             yr  ===           ); assert(   ecco  ===     0.754171200 ); assert(  epoch  === 20630.559091070 ); assert(  inclo  ===     1.108345162 ); 
 //   in/out : 
  assert(     no  ===     0.008582333 ); 
 //   outputs : 
  assert( method  ===               n ); assert(   ainv  ===     0.237037492 ); assert(     ao  ===     4.218741906 ); assert(  con41  ===    -0.402868886 ); assert(  con42  ===     0.004781476 ); assert(  cosio  ===     0.446143144 ); 
  assert( cosio2  ===     0.199043705 ); 
  assert(  einx   ===     0.568774199 ); assert(  eccsq  ===     0.568774199 ); assert(  omeosq ===     0.431225801 ); assert(   posq  ===     3.309599096 ); assert(     rp  ===     1.037088260 ); assert(  rteosq ===     0.656677852 ); 
  assert(  sinio  ===     0.894961617 ); assert(   gsto  ===     2.003968970 ); 
} 
       // ------------------after sgp4init :-------------
checkSgp4Init22674(ini: Sgp4Init) = {
 import ini._
assert(   satn  ===           22674); assert(     yr  ===               6); assert(  bstar  ===     0.000298680); assert(   ecco  ===     0.754171200); assert(  epoch  === 20630.559091070); assert(  argpo  ===     4.421379762 ); 
assert(  inclo  ===     1.108345162); assert(     mo  ===     0.327692548 ); 
// in and out variables 
assert(     no  ===     0.008582333 ); 
//    outputs  :
assert(   init  ===               n); assert(  isimp  ===               1); assert( method  ===               d); assert(  aycof  ===     0.001049129 ); 
assert(  con41  ===    -0.401749432); assert(    cc1  ===     0.000000003); assert(    cc4  ===     0.000005255 ); 
assert(    cc5  ===     0.000918946); assert(     d2  ===     0.000000000); assert(     d3  ===     0.000000000); assert(     d4  ===     0.000000000); assert(  delmo  ===     7.295146736 ); 
assert(    eta  ===     0.992247347); assert( argpdot ===    -0.000000011); assert(  omgcof ===    -0.000000000 ); 
assert( sinmao  ===     0.321859221); assert(  t2cof  ===     0.000000004); assert(  t3cof  ===     0.000000000 ); 
assert(  t4cof  ===     0.000000000); assert(  t5cof  ===     0.000000000); assert(   gsto  ===     2.003968970); assert( x1mth2  ===     0.800583144); assert( x7thm1  ===     0.395917992); assert(  xlcof  ===     0.001897566 ); 
assert(  xmcof  ===    -0.000000000); assert(   mdot  ===     0.008581776); assert(  nodecf ===    -0.000000000); assert(  nodedt ===    -0.000001878 ); 
//   in and outputs from deep space satellites :
assert(      t  ===     0.000000000); assert(  nodeo  ===     6.186235758 ); 
//             irez               2); assert(  atime  ===     0.000000000); assert(  d2201  ===    -0.000000000); assert(  d2211  ===     0.000000000); assert(  d3210  ===    -0.000000000 ); 
//            d3222    -0.000000000); assert(  d4410  ===     0.000000000); assert(  d4422  ===     0.000000000); assert(  d5220  ===    -0.000000000); assert(  d5232  ===     0.000000000); assert(  d5421  ===    -0.000000000 ); 
//            d5433    -0.000000000); assert(   dedt  ===     0.000000007); assert(   del1  ===     0.000000000); assert(   del2  ===     0.000000000); assert(   del3  ===     0.000000000 ); 
//             didt    -0.000000024); assert(   dmdt  ===    -0.000000003); assert(  dnodt  ===    -0.000000098); assert(  domdt  ===     0.000000035); assert(     e3  ===    -0.000188024 ); 
//              ee2     0.000655191); assert(    peo  ===     0.000000000); assert(   pgho  ===     0.000000000); assert(    pho  ===     0.000000000); assert(  pinco  ===     0.000000000); assert(    plo  ===     0.000000000 ); 
//              se2    -0.001668216); assert(    se3  ===     0.003610858); assert(   sgh2  ===    -0.004299448); assert(   sgh3  ===    -0.001722985); assert(   sgh4  ===    -0.000068896); assert(    sh2  ===     0.003935976 ); 
//              sh3     0.003059743); assert(    si2  ===     0.001789569); assert(    si3  ===     0.000236688); assert(    sl2  ===     0.009202999); assert(    sl3  ===     0.002742276); assert(    sl4  ===     0.000304477 ); 
//            xfact    -0.008755050); assert(   xgh2  ===     0.000255814); assert(   xgh3  ===     0.000776034); assert(   xgh4  ===    -0.000036270); assert(    xh2  ===    -0.000044428 ); 
//              xh3    -0.000758555); assert(    xi2  ===    -0.000144526); assert(    xi3  ===    -0.000224161); assert(    xl2  ===    -0.000644395); assert(    xl3  ===    -0.001634546 ); 
//              xl4     0.000160290); assert(    xli  ===     2.409040818); assert(  xlamo  ===     2.409040818); assert(    xni  ===     0.008582333); assert(   zmol  ===     1.755039481); assert(   zmos  ===     2.976061799 ); 
} 
// 22674
                                   // ------------------after initl  :---------------
checkIntl23177(ini : Initl) {
 import ini._
  assert(   satn  ===           23177 ); assert(             yr  ===           ); assert(   ecco  ===     0.725849100 ); assert(  epoch  === 20629.457520520 ); assert(  inclo  ===     0.123038731 ); 
 //   in/out : 
  assert(     no  ===     0.009853789 ); 
 //   outputs : 
  assert( method  ===               n ); assert(   ainv  ===     0.259905620 ); assert(     ao  ===     3.847550501 ); assert(  con41  ===     1.954813125 ); assert(  con42  ===    -3.924688542 ); assert(  cosio  ===     0.992440279 ); 
  assert( cosio2  ===     0.984937708 ); 
  assert(  einx   ===     0.526856916 ); assert(  eccsq  ===     0.526856916 ); assert(  omeosq ===     0.473143084 ); assert(   posq  ===     3.314008748 ); assert(     rp  ===     1.054809433 ); assert(  rteosq ===     0.687853970 ); 
  assert(  sinio  ===     0.122728528 ); assert(   gsto  ===     1.346832291 ); 
} 
       // ------------------after sgp4init :-------------
checkSgp4Init23177(ini: Sgp4Init) = {
 import ini._
assert(   satn  ===           23177); assert(     yr  ===               6); assert(  bstar  ===     0.000765900); assert(   ecco  ===     0.725849100); assert(  epoch  === 20629.457520520); assert(  argpo  ===     5.167015835 ); 
assert(  inclo  ===     0.123038731); assert(     mo  ===     0.144968793 ); 
// in and out variables 
assert(     no  ===     0.009853789 ); 
//    outputs  :
assert(   init  ===               n); assert(  isimp  ===               1); assert( method  ===               d); assert(  aycof  ===     0.000143447 ); 
assert(  con41  ===     1.955099408); assert(    cc1  ===     0.000000001); assert(    cc4  ===     0.000000966 ); 
assert(    cc5  ===     0.000146556); assert(     d2  ===     0.000000000); assert(     d3  ===     0.000000000); assert(     d4  ===     0.000000000); assert(  delmo  ===     7.699641691 ); 
assert(    eta  ===     0.984982247); assert( argpdot ===     0.000009499); assert(  omgcof ===     0.000000000 ); 
assert( sinmao  ===     0.144461550); assert(  t2cof  ===     0.000000002); assert(  t3cof  ===     0.000000000 ); 
assert(  t4cof  ===     0.000000000); assert(  t5cof  ===     0.000000000); assert(   gsto  ===     1.346832291); assert( x1mth2  ===     0.014966864); assert( x7thm1  ===     5.895231953); assert(  xlcof  ===     0.000286623 ); 
assert(  xmcof  ===    -0.000000000); assert(   mdot  ===     0.009857038); assert(  nodecf ===    -0.000000000); assert(  nodedt ===    -0.000004803 ); 
//   in and outputs from deep space satellites :
assert(      t  ===     0.000000000); assert(  nodeo  ===     3.138517383 ); 
//             irez               0); assert(  atime  ===     0.000000000); assert(  d2201  ===     0.000000000); assert(  d2211  ===     0.000000000); assert(  d3210  ===     0.000000000 ); 
//            d3222     0.000000000); assert(  d4410  ===     0.000000000); assert(  d4422  ===     0.000000000); assert(  d5220  ===     0.000000000); assert(  d5232  ===     0.000000000); assert(  d5421  ===     0.000000000 ); 
//            d5433     0.000000000); assert(   dedt  ===    -0.000000010); assert(   del1  ===     0.000000000); assert(   del2  ===     0.000000000); assert(   del3  ===     0.000000000 ); 
//             didt     0.000000024); assert(   dmdt  ===    -0.000000026); assert(  dnodt  ===    -0.000000484); assert(  domdt  ===     0.000000481); assert(     e3  ===     0.000588377 ); 
//              ee2     0.000120180); assert(    peo  ===     0.000000000); assert(   pgho  ===     0.000000000); assert(    pho  ===     0.000000000); assert(  pinco  ===     0.000000000); assert(    plo  ===     0.000000000 ); 
//              se2    -0.003424601); assert(    se3  ===    -0.001945461); assert(   sgh2  ===     0.002807746); assert(   sgh3  ===    -0.004287930); assert(   sgh4  ===    -0.000062855); assert(    sh2  ===    -0.000127748 ); 
//              sh3     0.003309217); assert(    si2  ===     0.000751345); assert(    si3  ===    -0.001615208); assert(    sl2  ===    -0.006591259); assert(    sl3  ===     0.008653035); assert(    sl4  ===     0.000261360 ); 
//            xfact     0.000000000); assert(   xgh2  ===    -0.000758087); assert(   xgh3  ===     0.000089445); assert(   xgh4  ===    -0.000033089); assert(    xh2  ===     0.000459217 ); 
//              xh3    -0.000358102); assert(    xi2  ===    -0.000309491); assert(    xi3  ===     0.000082060); assert(    xl2  ===     0.001595876); assert(    xl3  ===    -0.000020259 ); 
//              xl4     0.000137591); assert(    xli  ===     0.000000000); assert(  xlamo  ===     0.000000000); assert(    xni  ===     0.000000000); assert(   zmol  ===     1.503851508); assert(   zmos  ===     2.957112608 ); 
} 
// 23177
                                   // ------------------after initl  :---------------
checkIntl23333(ini : Initl) {
 import ini._
  assert(   satn  ===           23333 ); assert(             yr  ===           ); assert(   ecco  ===     0.972829800 ); assert(  epoch  === 16376.499999990 ); assert(  inclo  ===     0.501764707 ); 
 //   in/out : 
  assert(     no  ===     0.000318918 ); 
 //   outputs : 
  assert( method  ===               n ); assert(   ainv  ===     0.026395664 ); assert(     ao  ===    37.885010518 ); assert(  con41  ===     1.305993572 ); assert(  con42  ===    -2.843322620 ); assert(  cosio  ===     0.876735150 ); 
  assert( cosio2  ===     0.768664524 ); 
  assert(  einx   ===     0.946397820 ); assert(  eccsq  ===     0.946397820 ); assert(  omeosq ===     0.053602180 ); assert(   posq  ===     4.123820315 ); assert(     rp  ===     1.029343313 ); assert(  rteosq ===     0.231521447 ); 
  assert(  sinio  ===     0.480973467 ); assert(   gsto  ===     3.849219569 ); 
} 
       // ------------------after sgp4init :-------------
checkSgp4Init23333(ini: Sgp4Init) = {
 import ini._
assert(   satn  ===           23333); assert(     yr  ===              94); assert(  bstar  ===     0.000100000); assert(   ecco  ===     0.972829800); assert(  epoch  === 16376.499999990); assert(  argpo  ===     0.531208411 ); 
assert(  inclo  ===     0.501764707); assert(     mo  ===     0.023561945 ); 
// in and out variables 
assert(     no  ===     0.000318918 ); 
//    outputs  :
assert(   init  ===               n); assert(  isimp  ===               1); assert( method  ===               d); assert(  aycof  ===     0.000590358 ); 
assert(  con41  ===     1.239498572); assert(    cc1  ===     0.000000000); assert(    cc4  ===     0.000000267 ); 
assert(    cc5  ===     0.001254245); assert(     d2  ===     0.000000000); assert(     d3  ===     0.000000000); assert(     d4  ===     0.000000000); assert(  delmo  ===     7.991104360 ); 
assert(    eta  ===     0.999535863); assert( argpdot ===     0.000000179); assert(  omgcof ===     0.000000000 ); 
assert( sinmao  ===     0.023559765); assert(  t2cof  ===     0.000000001); assert(  t3cof  ===     0.000000000 ); 
assert(  t4cof  ===     0.000000000); assert(  t5cof  ===     0.000000000); assert(   gsto  ===     3.849219569); assert( x1mth2  ===     0.253500476); assert( x7thm1  ===     4.225496667); assert(  xlcof  ===     0.001159179 ); 
assert(  xmcof  ===    -0.000000000); assert(   mdot  ===     0.000318937); assert(  nodecf ===    -0.000000000); assert(  nodedt ===    -0.000000110 ); 
//   in and outputs from deep space satellites :
assert(      t  ===     0.000000000); assert(  nodeo  ===     0.041399210 ); 
//             irez               0); assert(  atime  ===     0.000000000); assert(  d2201  ===     0.000000000); assert(  d2211  ===     0.000000000); assert(  d3210  ===     0.000000000 ); 
//            d3222     0.000000000); assert(  d4410  ===     0.000000000); assert(  d4422  ===     0.000000000); assert(  d5220  ===     0.000000000); assert(  d5232  ===     0.000000000); assert(  d5421  ===     0.000000000 ); 
//            d5433     0.000000000); assert(   dedt  ===     0.000000003); assert(   del1  ===     0.000000000); assert(   del2  ===     0.000000000); assert(   del3  ===     0.000000000 ); 
//             didt    -0.000000344); assert(   dmdt  ===    -0.000003438); assert(  dnodt  ===    -0.000000505); assert(  domdt  ===     0.000000691); assert(     e3  ===     0.006618130 ); 
//              ee2    -0.007503199); assert(    peo  ===     0.000000000); assert(   pgho  ===     0.000000000); assert(    pho  ===     0.000000000); assert(  pinco  ===     0.000000000); assert(    plo  ===     0.000000000 ); 
//              se2     0.046298098); assert(    se3  ===     0.042716269); assert(   sgh2  ===    -0.043914802); assert(   sgh3  ===     0.047764725); assert(   sgh4  ===    -0.000653671); assert(    sh2  ===     0.050870557 ); 
//              sh3     0.021941234); assert(    si2  ===     0.087500685); assert(    si3  ===     0.035116477); assert(    sl2  ===     0.369225217); assert(    sl3  ===    -0.402554110); assert(    sl4  ===     0.009259904 ); 
//            xfact     0.000000000); assert(   xgh2  ===    -0.006878293); assert(   xgh3  ===    -0.007775516); assert(   xgh4  ===    -0.000344120); assert(    xh2  ===    -0.011795765 ); 
//              xh3     0.011690375); assert(    xi2  ===    -0.019565899); assert(    xi3  ===     0.020395665); assert(    xl2  ===     0.058253284); assert(    xl3  ===     0.065726325 ); 
//              xl4     0.004874798); assert(    xli  ===     0.000000000); assert(  xlamo  ===     0.000000000); assert(    xni  ===     0.000000000); assert(   zmol  ===     5.607868196); assert(   zmos  ===     5.196058844 ); 
} 
// 23333
                                   // ------------------after initl  :---------------
checkIntl23599(ini : Initl) {
 import ini._
  assert(   satn  ===           23599 ); assert(             yr  ===           ); assert(   ecco  ===     0.578202200 ); assert(  epoch  === 20625.765354630 ); assert(  inclo  ===     0.120998441 ); 
 //   in/out : 
  assert(     no  ===     0.019529197 ); 
 //   outputs : 
  assert( method  ===               n ); assert(   ainv  ===     0.410081086 ); assert(     ao  ===     2.438542120 ); assert(  con41  ===     1.956292062 ); assert(  con42  ===    -3.927153436 ); assert(  cosio  ===     0.992688615 ); 
  assert( cosio2  ===     0.985430687 ); 
  assert(  einx   ===     0.334317784 ); assert(  eccsq  ===     0.334317784 ); assert(  omeosq ===     0.665682216 ); assert(   posq  ===     2.635083806 ); assert(     rp  ===     1.028571701 ); assert(  rteosq ===     0.815893508 ); 
  assert(  sinio  ===     0.120703408 ); assert(   gsto  ===     3.217495488 ); 
} 
       // ------------------after sgp4init :-------------
checkSgp4Init23599(ini: Sgp4Init) = {
 import ini._
assert(   satn  ===           23599); assert(     yr  ===               6); assert(  bstar  ===     0.001295600); assert(   ecco  ===     0.578202200); assert(  epoch  === 20625.765354630); assert(  argpo  ===     4.789944431 ); 
assert(  inclo  ===     0.120998441); assert(     mo  ===     0.440564736 ); 
// in and out variables 
assert(     no  ===     0.019529197 ); 
//    outputs  :
assert(   init  ===               n); assert(  isimp  ===               1); assert( method  ===               d); assert(  aycof  ===     0.000141587 ); 
assert(  con41  ===     1.956256021); assert(    cc1  ===     0.000000089); assert(    cc4  ===     0.000063940 ); 
assert(    cc5  ===     0.004806366); assert(     d2  ===     0.000000000); assert(     d3  ===     0.000000000); assert(     d4  ===     0.000000000); assert(  delmo  ===     6.795809885 ); 
assert(    eta  ===     0.988542190); assert( argpdot ===     0.000023708); assert(  omgcof ===     0.000000000 ); 
assert( sinmao  ===     0.426450343); assert(  t2cof  ===     0.000000133); assert(  t3cof  ===     0.000000000 ); 
assert(  t4cof  ===     0.000000000); assert(  t5cof  ===     0.000000000); assert(   gsto  ===     3.217495488); assert( x1mth2  ===     0.014581326); assert( x7thm1  ===     5.897930715); assert(  xlcof  ===     0.000282915 ); 
assert(  xmcof  ===    -0.000000000); assert(   mdot  ===     0.019538810); assert(  nodecf ===    -0.000000000); assert(  nodedt ===    -0.000011982 ); 
//   in and outputs from deep space satellites :
assert(      t  ===     0.000000000); assert(  nodeo  ===     0.004972443 ); 
//             irez               0); assert(  atime  ===     0.000000000); assert(  d2201  ===     0.000000000); assert(  d2211  ===     0.000000000); assert(  d3210  ===     0.000000000 ); 
//            d3222     0.000000000); assert(  d4410  ===     0.000000000); assert(  d4422  ===     0.000000000); assert(  d5220  ===     0.000000000); assert(  d5232  ===     0.000000000); assert(  d5421  ===     0.000000000 ); 
//            d5433     0.000000000); assert(   dedt  ===    -0.000000000); assert(   del1  ===     0.000000000); assert(   del2  ===     0.000000000); assert(   del3  ===     0.000000000 ); 
//             didt    -0.000000001); assert(   dmdt  ===    -0.000000031); assert(  dnodt  ===     0.000000130); assert(  domdt  ===    -0.000000121); assert(     e3  ===     0.000191769 ); 
//              ee2     0.000260040); assert(    peo  ===     0.000000000); assert(   pgho  ===     0.000000000); assert(    pho  ===     0.000000000); assert(  pinco  ===     0.000000000); assert(    plo  ===     0.000000000 ); 
//              se2    -0.002021960); assert(    se3  ===     0.000466447); assert(   sgh2  ===    -0.000773444); assert(   sgh3  ===    -0.003415978); assert(   sgh4  ===    -0.000037618); assert(    sh2  ===    -0.000232055 ); 
//              sh3    -0.000675629); assert(    si2  ===    -0.000184822); assert(    si3  ===     0.000118572); assert(    sl2  ===     0.001207732); assert(    sl3  ===     0.005449751); assert(    sl4  ===     0.000122996 ); 
//            xfact     0.000000000); assert(   xgh2  ===    -0.000321055); assert(   xgh3  ===     0.000429232); assert(   xgh4  ===    -0.000019804); assert(    xh2  ===    -0.000073440 ); 
//              xh3     0.000124387); assert(    xi2  ===     0.000043753); assert(    xi3  ===     0.000013391); assert(    xl2  ===     0.000506998); assert(    xl3  ===    -0.000666116 ); 
//              xl4     0.000064750); assert(    xli  ===     0.000000000); assert(  xlamo  ===     0.000000000); assert(    xni  ===     0.000000000); assert(   zmol  ===     0.661937509); assert(   zmos  ===     2.893600055 ); 
} 
// 23599
                                   // ------------------after initl  :---------------
checkIntl24208(ini : Initl) {
 import ini._
  assert(   satn  ===           24208 ); assert(             yr  ===           ); assert(   ecco  ===     0.002664000 ); assert(  epoch  === 20631.040617400 ); assert(  inclo  ===     0.067258008 ); 
 //   in/out : 
  assert(     no  ===     0.004397109 ); 
 //   outputs : 
  assert( method  ===               n ); assert(   ainv  ===     0.151771988 ); assert(     ao  ===     6.588831124 ); assert(  con41  ===     1.986449532 ); assert(  con42  ===    -3.977415887 ); assert(  cosio  ===     0.997739033 ); 
  assert( cosio2  ===     0.995483177 ); 
  assert(  einx   ===     0.000007097 ); assert(  eccsq  ===     0.000007097 ); assert(  omeosq ===     0.999992903 ); assert(   posq  ===    43.412079396 ); assert(     rp  ===     6.571278478 ); assert(  rteosq ===     0.999996452 ); 
  assert(  sinio  ===     0.067207311 ); assert(   gsto  ===     5.037771726 ); 
} 
       // ------------------after sgp4init :-------------
checkSgp4Init24208(ini: Sgp4Init) = {
 import ini._
assert(   satn  ===           24208); assert(     yr  ===               6); assert(  bstar  ===     0.000100000); assert(   ecco  ===     0.002664000); assert(  epoch  === 20631.040617400); assert(  argpo  ===     5.429679160 ); 
assert(  inclo  ===     0.067258008); assert(     mo  ===     0.842994029 ); 
// in and out variables 
assert(     no  ===     0.004397109 ); 
//    outputs  :
assert(   init  ===               n); assert(  isimp  ===               1); assert( method  ===               d); assert(  aycof  ===     0.000079039 ); 
assert(  con41  ===     1.986368119); assert(    cc1  ===     0.000000000); assert(    cc4  ===     0.000000000 ); 
assert(    cc5  ===     0.000000000); assert(     d2  ===     0.000000000); assert(     d3  ===     0.000000000); assert(     d4  ===     0.000000000); assert(  delmo  ===     1.006294704 ); 
assert(    eta  ===     0.003147552); assert( argpdot ===     0.000000327); assert(  omgcof ===     0.000000000 ); 
assert( sinmao  ===     0.746638182); assert(  t2cof  ===     0.000000000); assert(  t3cof  ===     0.000000000 ); 
assert(  t4cof  ===     0.000000000); assert(  t5cof  ===     0.000000000); assert(   gsto  ===     5.037771726); assert( x1mth2  ===     0.004543960); assert( x7thm1  ===     5.968192278); assert(  xlcof  ===     0.000158034 ); 
assert(  xmcof  ===    -0.000000000); assert(   mdot  ===     0.004397272); assert(  nodecf ===    -0.000000000); assert(  nodedt ===    -0.000000164 ); 
//   in and outputs from deep space satellites :
assert(      t  ===     0.000000000); assert(  nodeo  ===     1.396474586 ); 
//             irez               1); assert(  atime  ===     0.000000000); assert(  d2201  ===     0.000000000); assert(  d2211  ===     0.000000000); assert(  d3210  ===     0.000000000 ); 
//            d3222     0.000000000); assert(  d4410  ===     0.000000000); assert(  d4422  ===     0.000000000); assert(  d5220  ===     0.000000000); assert(  d5232  ===     0.000000000); assert(  d5421  ===     0.000000000 ); 
//            d5433     0.000000000); assert(   dedt  ===     0.000000000); assert(   del1  ===    -0.000000000); assert(   del2  ===     0.000000000); assert(   del3  ===     0.000000000 ); 
//             didt     0.000000030); assert(   dmdt  ===    -0.000000133); assert(  dnodt  ===     0.000000018); assert(  domdt  ===     0.000000043); assert(     e3  ===    -0.000007727 ); 
//              ee2    -0.000000518); assert(    peo  ===     0.000000000); assert(   pgho  ===     0.000000000); assert(    pho  ===     0.000000000); assert(  pinco  ===     0.000000000); assert(    plo  ===     0.000000000 ); 
//              se2     0.000039357); assert(    se3  ===     0.000031013); assert(   sgh2  ===    -0.010959432); assert(   sgh3  ===     0.015437894); assert(   sgh4  ===    -0.000204776); assert(    sh2  ===     0.001170723 ); 
//              sh3    -0.001086190); assert(    si2  ===    -0.001002690); assert(    si3  ===    -0.001074035); assert(    sl2  ===     0.010123798); assert(    sl3  ===    -0.016369880); assert(    sl4  ===     0.000477813 ); 
//            xfact    -0.004375014); assert(   xgh2  ===     0.002915576); assert(   xgh3  ===    -0.000418915); assert(   xgh4  ===    -0.000107802); assert(    xh2  ===    -0.000306502 ); 
//              xh3    -0.000037817); assert(    xi2  ===    -0.000029982); assert(    xi3  ===     0.000270783); assert(    xl2  ===    -0.002963866); assert(    xl3  ===     0.000706468 ); 
//              xl4     0.000251541); assert(    xli  ===     2.631376049); assert(  xlamo  ===     2.631376049); assert(    xni  ===     0.004397109); assert(   zmol  ===     1.864840549); assert(   zmos  ===     2.984345004 ); 
} 
// 24208
                                   // ------------------after initl  :---------------
checkIntl25954(ini : Initl) {
 import ini._
  assert(   satn  ===           25954 ); assert(             yr  ===           ); assert(   ecco  ===     0.000176500 ); assert(  epoch  === 19762.680572850 ); assert(  inclo  ===     0.000006981 ); 
 //   in/out : 
  assert(     no  ===     0.004374998 ); 
 //   outputs : 
  assert( method  ===               n ); assert(   ainv  ===     0.151262768 ); assert(     ao  ===     6.611012179 ); assert(  con41  ===     2.000000000 ); assert(  con42  ===    -4.000000000 ); assert(  cosio  ===     1.000000000 ); 
  assert( cosio2  ===     1.000000000 ); 
  assert(  einx   ===     0.000000031 ); assert(  eccsq  ===     0.000000031 ); assert(  omeosq ===     0.999999969 ); assert(   posq  ===    43.705479308 ); assert(     rp  ===     6.609845335 ); assert(  rteosq ===     0.999999984 ); 
  assert(  sinio  ===     0.000006981 ); assert(   gsto  ===     0.403698641 ); 
} 
       // ------------------after sgp4init :-------------
checkSgp4Init25954(ini: Sgp4Init) = {
 import ini._
assert(   satn  ===           25954); assert(     yr  ===               4); assert(  bstar  ===     0.000000000); assert(   ecco  ===     0.000176500); assert(  epoch  === 19762.680572850); assert(  argpo  ===     0.271039161 ); 
assert(  inclo  ===     0.000006981); assert(     mo  ===     0.396423614 ); 
// in and out variables 
assert(     no  ===     0.004374998 ); 
//    outputs  :
assert(   init  ===               n); assert(  isimp  ===               1); assert( method  ===               d); assert(  aycof  ===     0.000000373 ); 
assert(  con41  ===     1.999999696); assert(    cc1  ===     0.000000000); assert(    cc4  ===     0.000000000 ); 
assert(    cc5  ===     0.000000000); assert(     d2  ===     0.000000000); assert(     d3  ===     0.000000000); assert(     d4  ===     0.000000000); assert(  delmo  ===     1.000576854 ); 
assert(    eta  ===     0.000208410); assert( argpdot ===     0.000000325); assert(  omgcof ===     0.000000000 ); 
assert( sinmao  ===     0.386121790); assert(  t2cof  ===     0.000000000); assert(  t3cof  ===     0.000000000 ); 
assert(  t4cof  ===     0.000000000); assert(  t5cof  ===     0.000000000); assert(   gsto  ===     0.403698641); assert( x1mth2  ===     0.000000101); assert( x7thm1  ===     5.999999292); assert(  xlcof  ===     0.000000746 ); 
assert(  xmcof  ===    -0.000000000); assert(   mdot  ===     0.004375160); assert(  nodecf ===    -0.000000000); assert(  nodedt ===    -0.000000163 ); 
//   in and outputs from deep space satellites :
assert(      t  ===     0.000000000); assert(  nodeo  ===     4.255350081 ); 
//             irez               1); assert(  atime  ===     0.000000000); assert(  d2201  ===     0.000000000); assert(  d2211  ===     0.000000000); assert(  d3210  ===     0.000000000 ); 
//            d3222     0.000000000); assert(  d4410  ===     0.000000000); assert(  d4422  ===     0.000000000); assert(  d5220  ===     0.000000000); assert(  d5232  ===     0.000000000); assert(  d5421  ===     0.000000000 ); 
//            d5433     0.000000000); assert(   dedt  ===     0.000000000); assert(   del1  ===    -0.000000000); assert(   del2  ===     0.000000000); assert(   del3  ===     0.000000000 ); 
//             didt    -0.000000026); assert(   dmdt  ===    -0.000000096); assert(  dnodt  ===     0.000000000); assert(  domdt  ===     0.000000024); assert(     e3  ===    -0.000000144 ); 
//              ee2    -0.000000497); assert(    peo  ===     0.000000000); assert(   pgho  ===     0.000000000); assert(    pho  ===     0.000000000); assert(  pinco  ===     0.000000000); assert(    plo  ===     0.000000000 ); 
//              se2    -0.000002394); assert(    se3  ===     0.000002297); assert(   sgh2  ===    -0.012647157); assert(   sgh3  ===    -0.012731895); assert(   sgh4  ===    -0.000205811); assert(    sh2  ===    -0.001099705 ); 
//              sh3     0.001167960); assert(    si2  ===     0.001176752); assert(    si3  ===     0.000965472); assert(    sl2  ===     0.012152216); assert(    sl3  ===     0.011533443); assert(    sl4  ===     0.000480226 ); 
//            xfact    -0.004375016); assert(   xgh2  ===     0.000670809); assert(   xgh3  ===    -0.002691819); assert(   xgh4  ===    -0.000108348); assert(    xh2  ===    -0.000268855 ); 
//              xh3    -0.000112093); assert(    xi2  ===    -0.000078592); assert(    xi3  ===     0.000267702); assert(    xl2  ===    -0.000447840); assert(    xl3  ===     0.002528609 ); 
//              xl4     0.000252811); assert(    xli  ===     4.519114216); assert(  xlamo  ===     4.519114216); assert(    xni  ===     0.004374998); assert(   zmol  ===     4.917119876); assert(   zmos  ===     0.613206104 ); 
} 
// 25954
                                   // ------------------after initl  :---------------
checkIntl26900(ini : Initl) {
 import ini._
  assert(   satn  ===           26900 ); assert(             yr  ===           ); assert(   ecco  ===     0.000331900 ); assert(  epoch  === 20560.745032470 ); assert(  inclo  ===     0.000286234 ); 
 //   in/out : 
  assert(     no  ===     0.004375109 ); 
 //   outputs : 
  assert( method  ===               n ); assert(   ainv  ===     0.151265340 ); assert(     ao  ===     6.610899752 ); assert(  con41  ===     1.999999754 ); assert(  con42  ===    -3.999999590 ); assert(  cosio  ===     0.999999959 ); 
  assert( cosio2  ===     0.999999918 ); 
  assert(  einx   ===     0.000000110 ); assert(  eccsq  ===     0.000000110 ); assert(  omeosq ===     0.999999890 ); assert(   posq  ===    43.703985905 ); assert(     rp  ===     6.608705595 ); assert(  rteosq ===     0.999999945 ); 
  assert(  sinio  ===     0.000286234 ); assert(   gsto  ===     1.971276525 ); 
} 
       // ------------------after sgp4init :-------------
checkSgp4Init26900(ini: Sgp4Init) = {
 import ini._
assert(   satn  ===           26900); assert(     yr  ===               6); assert(  bstar  ===     0.000100000); assert(   ecco  ===     0.000331900); assert(  epoch  === 20560.745032470); assert(  argpo  ===     1.504114277 ); 
assert(  inclo  ===     0.000286234); assert(     mo  ===     3.181019641 ); 
// in and out variables 
assert(     no  ===     0.004375109 ); 
//    outputs  :
assert(   init  ===               n); assert(  isimp  ===               1); assert( method  ===               d); assert(  aycof  ===     0.000000753 ); 
assert(  con41  ===     1.999998764); assert(    cc1  ===     0.000000000); assert(    cc4  ===     0.000000000 ); 
assert(    cc5  ===     0.000000000); assert(     d2  ===     0.000000000); assert(     d3  ===     0.000000000); assert(     d4  ===     0.000000000); assert(  delmo  ===     0.998825653 ); 
assert(    eta  ===     0.000391907); assert( argpdot ===     0.000000325); assert(  omgcof ===     0.000000000 ); 
assert( sinmao  ===    -0.039416774); assert(  t2cof  ===     0.000000000); assert(  t3cof  ===     0.000000000 ); 
assert(  t4cof  ===     0.000000000); assert(  t5cof  ===     0.000000000); assert(   gsto  ===     1.971276525); assert( x1mth2  ===     0.000000412); assert( x7thm1  ===     5.999997116); assert(  xlcof  ===     0.000001505 ); 
assert(  xmcof  ===    -0.000000001); assert(   mdot  ===     0.004375272); assert(  nodecf ===    -0.000000000); assert(  nodedt ===    -0.000000163 ); 
//   in and outputs from deep space satellites :
assert(      t  ===     0.000000000); assert(  nodeo  ===     4.651962191 ); 
//             irez               1); assert(  atime  ===     0.000000000); assert(  d2201  ===     0.000000000); assert(  d2211  ===     0.000000000); assert(  d3210  ===     0.000000000 ); 
//            d3222     0.000000000); assert(  d4410  ===     0.000000000); assert(  d4422  ===     0.000000000); assert(  d5220  ===     0.000000000); assert(  d5232  ===     0.000000000); assert(  d5421  ===     0.000000000 ); 
//            d5433     0.000000000); assert(   dedt  ===    -0.000000000); assert(   del1  ===    -0.000000000); assert(   del2  ===     0.000000000); assert(   del3  ===     0.000000000 ); 
//             didt    -0.000000031); assert(   dmdt  ===    -0.000000161); assert(  dnodt  ===     0.000000000); assert(  domdt  ===     0.000000091); assert(     e3  ===    -0.000000430 ); 
//              ee2    -0.000000858); assert(    peo  ===     0.000000000); assert(   pgho  ===     0.000000000); assert(    pho  ===     0.000000000); assert(  pinco  ===     0.000000000); assert(    plo  ===     0.000000000 ); 
//              se2     0.000004978); assert(    se3  ===    -0.000003758); assert(   sgh2  ===     0.011702388); assert(   sgh3  ===     0.015966174); assert(   sgh4  ===    -0.000205806); assert(    sh2  ===    -0.001469490 ); 
//              sh3     0.000703146); assert(    si2  ===     0.000659658); assert(    si3  ===     0.001342180); assert(    sl2  ===    -0.012195667); assert(    sl3  ===    -0.017165372); assert(    sl4  ===     0.000480214 ); 
//            xfact    -0.004375014); assert(   xgh2  ===     0.001468611); assert(   xgh3  ===    -0.002762772); assert(   xgh4  ===    -0.000108345); assert(    xh2  ===     0.000244398 ); 
//              xh3     0.000198007); assert(    xi2  ===     0.000170060); assert(    xi3  ===    -0.000218124); assert(    xl2  ===    -0.001672610); assert(    xl3  ===     0.002984308 ); 
//              xl4     0.000252805); assert(    xli  ===     1.082634277); assert(  xlamo  ===     1.082634277); assert(    xni  ===     0.004375109); assert(   zmol  ===     4.685095847); assert(   zmos  ===     1.775121969 ); 
} 
// 26900
                                   // ------------------after initl  :---------------
checkIntl26975(ini : Initl) {
 import ini._
  assert(   satn  ===           26975 ); assert(             yr  ===           ); assert(   ecco  ===     0.560287700 ); assert(  epoch  === 20628.858188710 ); assert(  inclo  ===     1.195051373 ); 
 //   in/out : 
  assert(     no  ===     0.008973959 ); 
 //   outputs : 
  assert( method  ===               n ); assert(   ainv  ===     0.244194689 ); assert(     ao  ===     4.095093165 ); assert(  con41  ===    -0.596008718 ); assert(  con42  ===     0.326681197 ); assert(  cosio  ===     0.366965612 ); 
  assert( cosio2  ===     0.134663761 ); 
  assert(  einx   ===     0.313922307 ); assert(  eccsq  ===     0.313922307 ); assert(  omeosq ===     0.686077693 ); assert(   posq  ===     7.893582846 ); assert(     rp  ===     1.800662834 ); assert(  rteosq ===     0.828298070 ); 
  assert(  sinio  ===     0.930234508 ); assert(   gsto  ===     3.853994597 ); 
} 
       // ------------------after sgp4init :-------------
checkSgp4Init26975(ini: Sgp4Init) = {
 import ini._
assert(   satn  ===           26975); assert(     yr  ===               6); assert(  bstar  ===     0.000100000); assert(   ecco  ===     0.560287700); assert(  epoch  === 20628.858188710); assert(  argpo  ===     2.159817024 ); 
assert(  inclo  ===     1.195051373); assert(     mo  ===     5.280959655 ); 
// in and out variables 
assert(     no  ===     0.008973959 ); 
//    outputs  :
assert(   init  ===               n); assert(  isimp  ===               1); assert( method  ===               d); assert(  aycof  ===     0.001090834 ); 
assert(  con41  ===    -0.596491062); assert(    cc1  ===     0.000000000); assert(    cc4  ===     0.000000000 ); 
assert(    cc5  ===     0.000000008); assert(     d2  ===     0.000000000); assert(     d3  ===     0.000000000); assert(     d4  ===     0.000000000); assert(  delmo  ===     2.748275216 ); 
assert(    eta  ===     0.744252882); assert( argpdot ===    -0.000000302); assert(  omgcof ===    -0.000000000 ); 
assert( sinmao  ===    -0.842671425); assert(  t2cof  ===     0.000000000); assert(  t3cof  ===     0.000000000 ); 
assert(  t4cof  ===     0.000000000); assert(  t5cof  ===     0.000000000); assert(   gsto  ===     3.853994597); assert( x1mth2  ===     0.865497021); assert( x7thm1  ===    -0.058479144); assert(  xlcof  ===     0.001928960 ); 
assert(  xmcof  ===    -0.000000000); assert(   mdot  ===     0.008973504); assert(  nodecf ===    -0.000000000); assert(  nodedt ===    -0.000000677 ); 
//   in and outputs from deep space satellites :
assert(      t  ===     0.000000000); assert(  nodeo  ===     4.121251199 ); 
//             irez               2); assert(  atime  ===     0.000000000); assert(  d2201  ===    -0.000000000); assert(  d2211  ===     0.000000000); assert(  d3210  ===    -0.000000000 ); 
//            d3222    -0.000000000); assert(  d4410  ===     0.000000000); assert(  d4422  ===     0.000000000); assert(  d5220  ===    -0.000000000); assert(  d5232  ===    -0.000000000); assert(  d5421  ===    -0.000000000 ); 
//            d5433    -0.000000000); assert(   dedt  ===    -0.000000040); assert(   del1  ===     0.000000000); assert(   del2  ===     0.000000000); assert(   del3  ===     0.000000000 ); 
//             didt     0.000000001); assert(   dmdt  ===     0.000000003); assert(  dnodt  ===    -0.000000006); assert(  domdt  ===     0.000000016); assert(     e3  ===    -0.000226702 ); 
//              ee2    -0.000255122); assert(    peo  ===     0.000000000); assert(   pgho  ===     0.000000000); assert(    pho  ===     0.000000000); assert(  pinco  ===     0.000000000); assert(    plo  ===     0.000000000 ); 
//              se2     0.002254911); assert(    se3  ===    -0.000228039); assert(   sgh2  ===    -0.003389917); assert(   sgh3  ===     0.001654422); assert(   sgh4  ===    -0.000083109); assert(    sh2  ===    -0.000972114 ); 
//              sh3    -0.002919237); assert(    si2  ===     0.000653787); assert(    si3  ===     0.003149325); assert(    sl2  ===     0.009242202); assert(    sl3  ===    -0.003312631); assert(    sl4  ===     0.000265619 ); 
//            xfact    -0.008752358); assert(   xgh2  ===     0.000587067); assert(   xgh3  ===     0.000341108); assert(   xgh4  ===    -0.000043752); assert(    xh2  ===    -0.000293916 ); 
//              xh3     0.000441961); assert(    xi2  ===     0.000317727); assert(    xi3  ===    -0.000419361); assert(    xl2  ===    -0.001435489); assert(    xl3  ===    -0.000931792 ); 
//              xl4     0.000139833); assert(    xli  ===     5.815472858); assert(  xlamo  ===     5.815472858); assert(    xni  ===     0.008973959); assert(   zmol  ===     1.367187594); assert(   zmos  ===     2.946802916 ); 
} 
// 26975
                                   // ------------------after initl  :---------------
checkIntl28057(ini : Initl) {
 import ini._
  assert(   satn  ===           28057 ); assert(             yr  ===           ); assert(   ecco  ===     0.000088400 ); assert(  epoch  === 20631.786158330 ); assert(  inclo  ===     1.717897912 ); 
 //   in/out : 
  assert(     no  ===     0.062672399 ); 
 //   outputs : 
  assert( method  ===               n ); assert(   ainv  ===     0.892204404 ); assert(     ao  ===     1.120819394 ); assert(  con41  ===    -0.935550263 ); assert(  con42  ===     0.892583771 ); assert(  cosio  ===    -0.146571640 ); 
  assert( cosio2  ===     0.021483246 ); 
  assert(  einx   ===     0.000000008 ); assert(  eccsq  ===     0.000000008 ); assert(  omeosq ===     0.999999992 ); assert(   posq  ===     1.256236095 ); assert(     rp  ===     1.120720314 ); assert(  rteosq ===     0.999999996 ); 
  assert(  sinio  ===     0.989200058 ); assert(   gsto  ===     3.451783622 ); 
} 
       // ------------------after sgp4init :-------------
checkSgp4Init28057(ini: Sgp4Init) = {
 import ini._
assert(   satn  ===           28057); assert(     yr  ===               6); assert(  bstar  ===     0.000035940); assert(   ecco  ===     0.000088400); assert(  epoch  === 20631.786158330); assert(  argpo  ===     1.539317568 ); 
assert(  inclo  ===     1.717897912); assert(     mo  ===     4.746112232 ); 
// in and out variables 
assert(     no  ===     0.062672399 ); 
//    outputs  :
assert(   init  ===               n); assert(  isimp  ===               0); assert( method  ===               n); assert(  aycof  ===     0.001159872 ); 
assert(  con41  ===    -0.935550263); assert(    cc1  ===     0.000000000); assert(    cc4  ===    -0.000000044 ); 
assert(    cc5  ===     0.000030313); assert(     d2  ===     0.000000000); assert(     d3  ===     0.000000000); assert(     d4  ===     0.000000000); assert(  delmo  ===     1.000092295 ); 
assert(    eta  ===     0.000912426); assert( argpdot ===    -0.000036077); assert(  omgcof ===     0.000000000 ); 
assert( sinmao  ===    -0.999431425); assert(  t2cof  ===     0.000000000); assert(  t3cof  ===     0.000000000 ); 
assert(  t4cof  ===     0.000000000); assert(  t5cof  ===     0.000000000); assert(   gsto  ===     3.451783622); assert( x1mth2  ===     0.978516754); assert( x7thm1  ===    -0.849617280); assert(  xlcof  ===     0.001540606 ); 
assert(  xmcof  ===     0.000000000); assert(   mdot  ===     0.062634526); assert(  nodecf ===     0.000000000); assert(  nodedt ===     0.000011840 ); 
//   in and outputs from deep space satellites :
assert(      t  ===     0.000000000); assert(  nodeo  ===     4.323112489 ); 
//             irez               0); assert(  atime  ===     0.000000000); assert(  d2201  ===     0.000000000); assert(  d2211  ===     0.000000000); assert(  d3210  ===     0.000000000 ); 
//            d3222     0.000000000); assert(  d4410  ===     0.000000000); assert(  d4422  ===     0.000000000); assert(  d5220  ===     0.000000000); assert(  d5232  ===     0.000000000); assert(  d5421  ===     0.000000000 ); 
//            d5433     0.000000000); assert(   dedt  ===     0.000000000); assert(   del1  ===     0.000000000); assert(   del2  ===     0.000000000); assert(   del3  ===     0.000000000 ); 
//             didt     0.000000000); assert(   dmdt  ===     0.000000000); assert(  dnodt  ===     0.000000000); assert(  domdt  ===     0.000000000); assert(     e3  ===     0.000000000 ); 
//              ee2     0.000000000); assert(    peo  ===     0.000000000); assert(   pgho  ===     0.000000000); assert(    pho  ===     0.000000000); assert(  pinco  ===     0.000000000); assert(    plo  ===     0.000000000 ); 
//              se2     0.000000000); assert(    se3  ===     0.000000000); assert(   sgh2  ===     0.000000000); assert(   sgh3  ===     0.000000000); assert(   sgh4  ===     0.000000000); assert(    sh2  ===     0.000000000 ); 
//              sh3     0.000000000); assert(    si2  ===     0.000000000); assert(    si3  ===     0.000000000); assert(    sl2  ===     0.000000000); assert(    sl3  ===     0.000000000); assert(    sl4  ===     0.000000000 ); 
//            xfact     0.000000000); assert(   xgh2  ===     0.000000000); assert(   xgh3  ===     0.000000000); assert(   xgh4  ===     0.000000000); assert(    xh2  ===     0.000000000 ); 
//              xh3     0.000000000); assert(    xi2  ===     0.000000000); assert(    xi3  ===     0.000000000); assert(    xl2  ===     0.000000000); assert(    xl3  ===     0.000000000 ); 
//              xl4     0.000000000); assert(    xli  ===     0.000000000); assert(  xlamo  ===     0.000000000); assert(    xni  ===     0.000000000); assert(   zmol  ===     0.000000000); assert(   zmos  ===     0.000000000 ); 
} 
// 28057
                                   // ------------------after initl  :---------------
checkIntl28129(ini : Initl) {
 import ini._
  assert(   satn  ===           28129 ); assert(             yr  ===           ); assert(   ecco  ===     0.004850600 ); assert(  epoch  === 20629.570711360 ); assert(  inclo  ===     0.955215209 ); 
 //   in/out : 
  assert(     no  ===     0.008751202 ); 
 //   outputs : 
  assert( method  ===               n ); assert(   ainv  ===     0.240136739 ); assert(     ao  ===     4.164294079 ); assert(  con41  ===     0.000286839 ); assert(  con42  ===    -0.667144731 ); assert(  cosio  ===     0.577433066 ); 
  assert( cosio2  ===     0.333428946 ); 
  assert(  einx   ===     0.000023528 ); assert(  eccsq  ===     0.000023528 ); assert(  omeosq ===     0.999976472 ); assert(   posq  ===    17.340529165 ); assert(     rp  ===     4.144094755 ); assert(  rteosq ===     0.999988236 ); 
  assert(  sinio  ===     0.816438028 ); assert(   gsto  ===     2.059978512 ); 
} 
       // ------------------after sgp4init :-------------
checkSgp4Init28129(ini: Sgp4Init) = {
 import ini._
assert(   satn  ===           28129); assert(     yr  ===               6); assert(  bstar  ===     0.000100000); assert(   ecco  ===     0.004850600); assert(  epoch  === 20629.570711360); assert(  argpo  ===     4.647183480 ); 
assert(  inclo  ===     0.955215209); assert(     mo  ===     1.626058687 ); 
// in and out variables 
assert(     no  ===     0.008751202 ); 
//    outputs  :
assert(   init  ===               n); assert(  isimp  ===               1); assert( method  ===               d); assert(  aycof  ===     0.000957278 ); 
assert(  con41  ===     0.000388860); assert(    cc1  ===     0.000000000); assert(    cc4  ===     0.000000000 ); 
assert(    cc5  ===     0.000000000); assert(     d2  ===     0.000000000); assert(     d3  ===     0.000000000); assert(     d4  ===     0.000000000); assert(  delmo  ===     0.998938506 ); 
assert(    eta  ===     0.006408284); assert( argpdot ===     0.000000273); assert(  omgcof ===    -0.000000000 ); 
assert( sinmao  ===     0.998473424); assert(  t2cof  ===     0.000000000); assert(  t3cof  ===     0.000000000 ); 
assert(  t4cof  ===     0.000000000); assert(  t5cof  ===     0.000000000); assert(   gsto  ===     2.059978512); assert( x1mth2  ===     0.666537047); assert( x7thm1  ===     1.334240674); assert(  xlcof  ===     0.001786348 ); 
assert(  xmcof  ===    -0.000000000); assert(   mdot  ===     0.008751202); assert(  nodecf ===    -0.000000000); assert(  nodedt ===    -0.000000473 ); 
//   in and outputs from deep space satellites :
assert(      t  ===     0.000000000); assert(  nodeo  ===     5.669000453 ); 
//             irez               0); assert(  atime  ===     0.000000000); assert(  d2201  ===     0.000000000); assert(  d2211  ===     0.000000000); assert(  d3210  ===     0.000000000 ); 
//            d3222     0.000000000); assert(  d4410  ===     0.000000000); assert(  d4422  ===     0.000000000); assert(  d5220  ===     0.000000000); assert(  d5232  ===     0.000000000); assert(  d5421  ===     0.000000000 ); 
//            d5433     0.000000000); assert(   dedt  ===    -0.000000000); assert(   del1  ===     0.000000000); assert(   del2  ===     0.000000000); assert(   del3  ===     0.000000000 ); 
//             didt    -0.000000008); assert(   dmdt  ===    -0.000000023); assert(  dnodt  ===    -0.000000020); assert(  domdt  ===     0.000000009); assert(     e3  ===    -0.000003877 ); 
//              ee2     0.000005422); assert(    peo  ===     0.000000000); assert(   pgho  ===     0.000000000); assert(    pho  ===     0.000000000); assert(  pinco  ===     0.000000000); assert(    plo  ===     0.000000000 ); 
//              se2    -0.000002400); assert(    se3  ===     0.000039798); assert(   sgh2  ===    -0.007340466); assert(   sgh3  ===    -0.000926710); assert(   sgh4  ===    -0.000102890); assert(    sh2  ===     0.001019819 ); 
//              sh3    -0.000126073); assert(    si2  ===    -0.000337923); assert(    si3  ===    -0.001160185); assert(    sl2  ===     0.006096110); assert(    sl3  ===     0.001773703); assert(    sl4  ===     0.000240082 ); 
//            xfact     0.000000000); assert(   xgh2  ===     0.000659572); assert(   xgh3  ===     0.001091631); assert(   xgh4  ===    -0.000054166); assert(    xh2  ===    -0.000128858 ); 
//              xh3    -0.000097034); assert(    xi2  ===    -0.000082700); assert(    xi3  ===     0.000157591); assert(    xl2  ===    -0.000451406); assert(    xl3  ===    -0.001081449 ); 
//              xl4     0.000126389); assert(    xli  ===     0.000000000); assert(  xlamo  ===     0.000000000); assert(    xni  ===     0.000000000); assert(   zmol  ===     1.529662090); assert(   zmos  ===     2.959059714 ); 
} 
// 28129
                                   // ------------------after initl  :---------------
checkIntl28350(ini : Initl) {
 import ini._
  assert(   satn  ===           28350 ); assert(             yr  ===           ); assert(   ecco  ===     0.002487000 ); assert(  epoch  === 20621.217886660 ); assert(  inclo  ===     1.134423871 ); 
 //   in/out : 
  assert(     no  ===     0.071927220 ); 
 //   outputs : 
  assert( method  ===               n ); assert(   ainv  ===     0.978007836 ); assert(     ao  ===     1.022486695 ); assert(  con41  ===    -0.464089158 ); assert(  con42  ===     0.106815264 ); assert(  cosio  ===     0.422654643 ); 
  assert( cosio2  ===     0.178636947 ); 
  assert(  einx   ===     0.000006185 ); assert(  eccsq  ===     0.000006185 ); assert(  omeosq ===     0.999993815 ); assert(   posq  ===     1.045466108 ); assert(     rp  ===     1.019943771 ); assert(  rteosq ===     0.999996907 ); 
  assert(  sinio  ===     0.906290821 ); assert(   gsto  ===     5.982608944 ); 
} 
       // ------------------after sgp4init :-------------
checkSgp4Init28350(ini: Sgp4Init) = {
 import ini._
assert(   satn  ===           28350); assert(     yr  ===               6); assert(  bstar  ===     0.000186780); assert(   ecco  ===     0.002487000); assert(  epoch  === 20621.217886660); assert(  argpo  ===     4.551082160 ); 
assert(  inclo  ===     1.134423871); assert(     mo  ===     1.744613667 ); 
// in and out variables 
assert(     no  ===     0.071927220 ); 
//    outputs  :
assert(   init  ===               n); assert(  isimp  ===               1); assert( method  ===               n); assert(  aycof  ===     0.001062658 ); 
assert(  con41  ===    -0.464089158); assert(    cc1  ===     0.000004545); assert(    cc4  ===     0.012681710 ); 
assert(    cc5  ===     0.784127614); assert(     d2  ===     0.000000000); assert(     d3  ===     0.000000000); assert(     d4  ===     0.000000000); assert(  delmo  ===     0.913319792 ); 
assert(    eta  ===     0.172142512); assert( argpdot ===    -0.000006065); assert(  omgcof ===    -0.000079579 ); 
assert( sinmao  ===     0.984931761); assert(  t2cof  ===     0.000006817); assert(  t3cof  ===     0.000000000 ); 
assert(  t4cof  ===     0.000000000); assert(  t5cof  ===     0.000000000); assert(   gsto  ===     5.982608944); assert( x1mth2  ===     0.821363053); assert( x7thm1  ===     0.250458630); assert(  xlcof  ===     0.001909690 ); 
assert(  xmcof  ===    -0.092715531); assert(   mdot  ===     0.071901307); assert(  nodecf ===    -0.000000001); assert(  nodedt ===    -0.000047138 ); 
//   in and outputs from deep space satellites :
assert(      t  ===     0.000000000); assert(  nodeo  ===     6.032084788 ); 
//             irez               0); assert(  atime  ===     0.000000000); assert(  d2201  ===     0.000000000); assert(  d2211  ===     0.000000000); assert(  d3210  ===     0.000000000 ); 
//            d3222     0.000000000); assert(  d4410  ===     0.000000000); assert(  d4422  ===     0.000000000); assert(  d5220  ===     0.000000000); assert(  d5232  ===     0.000000000); assert(  d5421  ===     0.000000000 ); 
//            d5433     0.000000000); assert(   dedt  ===     0.000000000); assert(   del1  ===     0.000000000); assert(   del2  ===     0.000000000); assert(   del3  ===     0.000000000 ); 
//             didt     0.000000000); assert(   dmdt  ===     0.000000000); assert(  dnodt  ===     0.000000000); assert(  domdt  ===     0.000000000); assert(     e3  ===     0.000000000 ); 
//              ee2     0.000000000); assert(    peo  ===     0.000000000); assert(   pgho  ===     0.000000000); assert(    pho  ===     0.000000000); assert(  pinco  ===     0.000000000); assert(    plo  ===     0.000000000 ); 
//              se2     0.000000000); assert(    se3  ===     0.000000000); assert(   sgh2  ===     0.000000000); assert(   sgh3  ===     0.000000000); assert(   sgh4  ===     0.000000000); assert(    sh2  ===     0.000000000 ); 
//              sh3     0.000000000); assert(    si2  ===     0.000000000); assert(    si3  ===     0.000000000); assert(    sl2  ===     0.000000000); assert(    sl3  ===     0.000000000); assert(    sl4  ===     0.000000000 ); 
//            xfact     0.000000000); assert(   xgh2  ===     0.000000000); assert(   xgh3  ===     0.000000000); assert(   xgh4  ===     0.000000000); assert(    xh2  ===     0.000000000 ); 
//              xh3     0.000000000); assert(    xi2  ===     0.000000000); assert(    xi3  ===     0.000000000); assert(    xl2  ===     0.000000000); assert(    xl3  ===     0.000000000 ); 
//              xl4     0.000000000); assert(    xli  ===     0.000000000); assert(  xlamo  ===     0.000000000); assert(    xni  ===     0.000000000); assert(   zmol  ===     0.000000000); assert(   zmos  ===     0.000000000 ); 
} 
// 28350
# *** error: t:= 1560.000000 *** code =   1
                                   // ------------------after initl  :---------------
checkIntl28623(ini : Initl) {
 import ini._
  assert(   satn  ===           28623 ); assert(             yr  ===           ); assert(   ecco  ===     0.624905300 ); assert(  epoch  === 20631.810791840 ); assert(  inclo  ===     0.497767903 ); 
 //   in/out : 
  assert(     no  ===     0.016552797 ); 
 //   outputs : 
  assert( method  ===               n ); assert(   ainv  ===     0.367277578 ); assert(     ao  ===     2.722736317 ); assert(  con41  ===     1.316080100 ); assert(  con42  ===    -2.860133500 ); assert(  cosio  ===     0.878650499 ); 
  assert( cosio2  ===     0.772026700 ); 
  assert(  einx   ===     0.390506634 ); assert(  eccsq  ===     0.390506634 ); assert(  omeosq ===     0.609493366 ); assert(   posq  ===     2.753906139 ); assert(     rp  ===     1.021283962 ); assert(  rteosq ===     0.780700561 ); 
  assert(  sinio  ===     0.477465496 ); assert(   gsto  ===     3.606984295 ); 
} 
       // ------------------after sgp4init :-------------
checkSgp4Init28623(ini: Sgp4Init) = {
 import ini._
assert(   satn  ===           28623); assert(     yr  ===               6); assert(  bstar  ===     0.000963900); assert(   ecco  ===     0.624905300); assert(  epoch  === 20631.810791840); assert(  argpo  ===     2.971510318 ); 
assert(  inclo  ===     0.497767903); assert(     mo  ===     3.715744891 ); 
// in and out variables 
assert(     no  ===     0.016552797 ); 
//    outputs  :
assert(   init  ===               n); assert(  isimp  ===               1); assert( method  ===               d); assert(  aycof  ===     0.000560155 ); 
assert(  con41  ===     1.315321354); assert(    cc1  ===     0.000000779); assert(    cc4  ===     0.000687031 ); 
assert(    cc5  ===     0.061364679); assert(     d2  ===     0.000000000); assert(     d3  ===     0.000000000); assert(     d4  ===     0.000000000); assert(  delmo  ===     0.004602373 ); 
assert(    eta  ===     0.992863739); assert( argpdot ===     0.000013985); assert(  omgcof ===    -0.000000000 ); 
assert( sinmao  ===    -0.543123159); assert(  t2cof  ===     0.000001169); assert(  t3cof  ===     0.000000000 ); 
assert(  t4cof  ===     0.000000000); assert(  t5cof  ===     0.000000000); assert(   gsto  ===     3.606984295); assert( x1mth2  ===     0.228226215); assert( x7thm1  ===     4.402416493); assert(  xlcof  ===     0.001102197 ); 
assert(  xmcof  ===    -0.000000000); assert(   mdot  ===     0.016557815); assert(  nodecf ===    -0.000000000); assert(  nodedt ===    -0.000008593 ); 
//   in and outputs from deep space satellites :
assert(      t  ===     0.000000000); assert(  nodeo  ===     2.006838915 ); 
//             irez               0); assert(  atime  ===     0.000000000); assert(  d2201  ===     0.000000000); assert(  d2211  ===     0.000000000); assert(  d3210  ===     0.000000000 ); 
//            d3222     0.000000000); assert(  d4410  ===     0.000000000); assert(  d4422  ===     0.000000000); assert(  d5220  ===     0.000000000); assert(  d5232  ===     0.000000000); assert(  d5421  ===     0.000000000 ); 
//            d5433     0.000000000); assert(   dedt  ===    -0.000000013); assert(   del1  ===     0.000000000); assert(   del2  ===     0.000000000); assert(   del3  ===     0.000000000 ); 
//             didt     0.000000022); assert(   dmdt  ===    -0.000000013); assert(  dnodt  ===    -0.000000020); assert(  domdt  ===     0.000000021); assert(     e3  ===     0.000208021 ); 
//              ee2     0.000227961); assert(    peo  ===     0.000000000); assert(   pgho  ===     0.000000000); assert(    pho  ===     0.000000000); assert(  pinco  ===     0.000000000); assert(    plo  ===     0.000000000 ); 
//              se2    -0.002010667); assert(    se3  ===     0.000123489); assert(   sgh2  ===     0.000440469); assert(   sgh3  ===    -0.003174853); assert(   sgh4  ===    -0.000042468); assert(    sh2  ===     0.000489736 ); 
//              sh3    -0.000159488); assert(    si2  ===    -0.001422358); assert(    si3  ===    -0.001642085); assert(    sl2  ===    -0.001791874); assert(    sl3  ===     0.005840112); assert(    sl4  ===     0.000148169 ); 
//            xfact     0.000000000); assert(   xgh2  ===    -0.000387605); assert(   xgh3  ===     0.000262837); assert(   xgh4  ===    -0.000022357); assert(    xh2  ===    -0.000072968 ); 
//              xh3    -0.000040818); assert(    xi2  ===    -0.000069486); assert(    xi3  ===     0.000351267); assert(    xl2  ===     0.000827280); assert(    xl3  ===    -0.000337251 ); 
//              xl4     0.000078002); assert(    xli  ===     0.000000000); assert(  xlamo  ===     0.000000000); assert(    xni  ===     0.000000000); assert(   zmol  ===     2.040461217); assert(   zmos  ===     2.997593527 ); 
} 
// 28623
                                   // ------------------after initl  :---------------
checkIntl28626(ini : Initl) {
 import ini._
  assert(   satn  ===           28626 ); assert(             yr  ===           ); assert(   ecco  ===     0.000033500 ); assert(  epoch  === 20630.466833970 ); assert(  inclo  ===     0.000033161 ); 
 //   in/out : 
  assert(     no  ===     0.004374949 ); 
 //   outputs : 
  assert( method  ===               n ); assert(   ainv  ===     0.151261648 ); assert(     ao  ===     6.611061098 ); assert(  con41  ===     1.999999997 ); assert(  con42  ===    -3.999999995 ); assert(  cosio  ===     0.999999999 ); 
  assert( cosio2  ===     0.999999999 ); 
  assert(  einx   ===     0.000000001 ); assert(  eccsq  ===     0.000000001 ); assert(  omeosq ===     0.999999999 ); assert(   posq  ===    43.706128744 ); assert(     rp  ===     6.610839627 ); assert(  rteosq ===     0.999999999 ); 
  assert(  sinio  ===     0.000033161 ); assert(   gsto  ===     1.422713434 ); 
} 
       // ------------------after sgp4init :-------------
checkSgp4Init28626(ini: Sgp4Init) = {
 import ini._
assert(   satn  ===           28626); assert(     yr  ===               6); assert(  bstar  ===     0.000100000); assert(   ecco  ===     0.000033500); assert(  epoch  === 20630.466833970); assert(  argpo  ===     0.240712320 ); 
assert(  inclo  ===     0.000033161); assert(     mo  ===     0.971282710 ); 
// in and out variables 
assert(     no  ===     0.004374949 ); 
//    outputs  :
assert(   init  ===               n); assert(  isimp  ===               1); assert( method  ===               d); assert(  aycof  ===     0.000000169 ); 
assert(  con41  ===     1.999999938); assert(    cc1  ===     0.000000000); assert(    cc4  ===     0.000000000 ); 
assert(    cc5  ===     0.000000000); assert(     d2  ===     0.000000000); assert(     d3  ===     0.000000000); assert(     d4  ===     0.000000000); assert(  delmo  ===     1.000066960 ); 
assert(    eta  ===     0.000039557); assert( argpdot ===     0.000000325); assert(  omgcof ===     0.000000000 ); 
assert( sinmao  ===     0.825610150); assert(  t2cof  ===     0.000000000); assert(  t3cof  ===     0.000000000 ); 
assert(  t4cof  ===     0.000000000); assert(  t5cof  ===     0.000000000); assert(   gsto  ===     1.422713434); assert( x1mth2  ===     0.000000021); assert( x7thm1  ===     5.999999855); assert(  xlcof  ===     0.000000337 ); 
assert(  xmcof  ===     0.000000000); assert(   mdot  ===     0.004375112); assert(  nodecf ===    -0.000000000); assert(  nodedt ===    -0.000000163 ); 
//   in and outputs from deep space satellites :
assert(      t  ===     0.000000000); assert(  nodeo  ===     5.008105352 ); 
//             irez               1); assert(  atime  ===     0.000000000); assert(  d2201  ===     0.000000000); assert(  d2211  ===     0.000000000); assert(  d3210  ===     0.000000000 ); 
//            d3222     0.000000000); assert(  d4410  ===     0.000000000); assert(  d4422  ===     0.000000000); assert(  d5220  ===     0.000000000); assert(  d5232  ===     0.000000000); assert(  d5421  ===     0.000000000 ); 
//            d5433     0.000000000); assert(   dedt  ===    -0.000000000); assert(   del1  ===    -0.000000000); assert(   del2  ===     0.000000000); assert(   del3  ===     0.000000000 ); 
//             didt    -0.000000029); assert(   dmdt  ===    -0.000000105); assert(  dnodt  ===     0.000000000); assert(  domdt  ===     0.000000034); assert(     e3  ===     0.000000097 ); 
//              ee2     0.000000004); assert(    peo  ===     0.000000000); assert(   pgho  ===     0.000000000); assert(    pho  ===     0.000000000); assert(  pinco  ===     0.000000000); assert(    plo  ===     0.000000000 ); 
//              se2    -0.000000490); assert(    se3  ===    -0.000000398); assert(   sgh2  ===     0.012189798); assert(   sgh3  ===    -0.013727291); assert(   sgh4  ===    -0.000205814); assert(    sh2  ===    -0.001607053 ); 
//              sh3     0.000192217); assert(    si2  ===     0.000106890); assert(    si3  ===     0.001503070); assert(    sl2  ===    -0.012684562); assert(    sl3  ===     0.012528832); assert(    sl4  ===     0.000480232 ); 
//            xfact    -0.004375014); assert(   xgh2  ===    -0.002791927); assert(   xgh3  ===    -0.000060712); assert(   xgh4  ===    -0.000108349); assert(    xh2  ===     0.000235874 ); 
//              xh3     0.000203770); assert(    xi2  ===     0.000197896); assert(    xi3  ===    -0.000197945); assert(    xl2  ===     0.002660802); assert(    xl3  ===     0.000331956 ); 
//              xl4     0.000252814); assert(    xli  ===     4.797386948); assert(  xlamo  ===     4.797386948); assert(    xni  ===     0.004374949); assert(   zmol  ===     1.734002359); assert(   zmos  ===     2.974474794 ); 
} 
// 28626
                                   // ------------------after initl  :---------------
checkIntl28872(ini : Initl) {
 import ini._
  assert(   satn  ===           28872 ); assert(             yr  ===           ); assert(   ecco  ===     0.030395500 ); assert(  epoch  === 20422.020126610 ); assert(  inclo  ===     1.683781961 ); 
 //   in/out : 
  assert(     no  ===     0.071874628 ); 
 //   outputs : 
  assert( method  ===               n ); assert(   ainv  ===     0.977531046 ); assert(     ao  ===     1.022985412 ); assert(  con41  ===    -0.961865427 ); assert(  con42  ===     0.936442378 ); assert(  cosio  ===    -0.112745397 ); 
  assert( cosio2  ===     0.012711524 ); 
  assert(  einx   ===     0.000923886 ); assert(  eccsq  ===     0.000923886 ); assert(  omeosq ===     0.999076114 ); assert(   posq  ===     1.044566354 ); assert(     rp  ===     0.991891259 ); assert(  rteosq ===     0.999537950 ); 
  assert(  sinio  ===     0.993623911 ); assert(   gsto  ===     1.313288306 ); 
} 
       // ------------------after sgp4init :-------------
checkSgp4Init28872(ini: Sgp4Init) = {
 import ini._
assert(   satn  ===           28872); assert(     yr  ===               5); assert(  bstar  ===     0.000244760); assert(   ecco  ===     0.030395500); assert(  epoch  === 20422.020126610); assert(  argpo  ===     4.259462077 ); 
assert(  inclo  ===     1.683781961); assert(     mo  ===     1.931246960 ); 
// in and out variables 
assert(     no  ===     0.071874628 ); 
//    outputs  :
assert(   init  ===               n); assert(  isimp  ===               1); assert( method  ===               n); assert(  aycof  ===     0.001165059 ); 
assert(  con41  ===    -0.961865427); assert(    cc1  ===     0.000007305); assert(    cc4  ===     0.074383275 ); 
assert(    cc5  ===     1.716904677); assert(     d2  ===     0.000000000); assert(     d3  ===     0.000000000); assert(     d4  ===     0.000000000); assert(  delmo  ===     0.089620035 ); 
assert(    eta  ===     1.566479807); assert( argpdot ===    -0.000052168); assert(  omgcof ===    -0.000023144 ); 
assert( sinmao  ===     0.935737982); assert(  t2cof  ===     0.000010958); assert(  t3cof  ===     0.000000000 ); 
assert(  t4cof  ===     0.000000000); assert(  t5cof  ===     0.000000000); assert(   gsto  ===     1.313288306); assert( x1mth2  ===     0.987288476); assert( x7thm1  ===    -0.911019329); assert(  xlcof  ===     0.001599541 ); 
assert(  xmcof  ===    -0.001333904); assert(   mdot  ===     0.071820958); assert(  nodecf ===     0.000000000); assert(  nodedt ===     0.000012552 ); 
//   in and outputs from deep space satellites :
assert(      t  ===     0.000000000); assert(  nodeo  ===     2.757595784 ); 
//             irez               0); assert(  atime  ===     0.000000000); assert(  d2201  ===     0.000000000); assert(  d2211  ===     0.000000000); assert(  d3210  ===     0.000000000 ); 
//            d3222     0.000000000); assert(  d4410  ===     0.000000000); assert(  d4422  ===     0.000000000); assert(  d5220  ===     0.000000000); assert(  d5232  ===     0.000000000); assert(  d5421  ===     0.000000000 ); 
//            d5433     0.000000000); assert(   dedt  ===     0.000000000); assert(   del1  ===     0.000000000); assert(   del2  ===     0.000000000); assert(   del3  ===     0.000000000 ); 
//             didt     0.000000000); assert(   dmdt  ===     0.000000000); assert(  dnodt  ===     0.000000000); assert(  domdt  ===     0.000000000); assert(     e3  ===     0.000000000 ); 
//              ee2     0.000000000); assert(    peo  ===     0.000000000); assert(   pgho  ===     0.000000000); assert(    pho  ===     0.000000000); assert(  pinco  ===     0.000000000); assert(    plo  ===     0.000000000 ); 
//              se2     0.000000000); assert(    se3  ===     0.000000000); assert(   sgh2  ===     0.000000000); assert(   sgh3  ===     0.000000000); assert(   sgh4  ===     0.000000000); assert(    sh2  ===     0.000000000 ); 
//              sh3     0.000000000); assert(    si2  ===     0.000000000); assert(    si3  ===     0.000000000); assert(    sl2  ===     0.000000000); assert(    sl3  ===     0.000000000); assert(    sl4  ===     0.000000000 ); 
//            xfact     0.000000000); assert(   xgh2  ===     0.000000000); assert(   xgh3  ===     0.000000000); assert(   xgh4  ===     0.000000000); assert(    xh2  ===     0.000000000 ); 
//              xh3     0.000000000); assert(    xi2  ===     0.000000000); assert(    xi3  ===     0.000000000); assert(    xl2  ===     0.000000000); assert(    xl3  ===     0.000000000 ); 
//              xl4     0.000000000); assert(    xli  ===     0.000000000); assert(  xlamo  ===     0.000000000); assert(    xni  ===     0.000000000); assert(   zmol  ===     0.000000000); assert(   zmos  ===     0.000000000 ); 
} 
// 28872
                                   // ------------------after initl  :---------------
checkIntl29141(ini : Initl) {
 import ini._
  assert(   satn  ===           29141 ); assert(             yr  ===           ); assert(   ecco  ===     0.001584800 ); assert(  epoch  === 20624.267838450 ); assert(  inclo  ===     1.438653958 ); 
 //   in/out : 
  assert(     no  ===     0.069571632 ); 
 //   outputs : 
  assert( method  ===               n ); assert(   ainv  ===     0.956536647 ); assert(     ao  ===     1.045438252 ); assert(  con41  ===    -0.947919382 ); assert(  con42  ===     0.913198970 ); assert(  cosio  ===     0.131758134 ); 
  assert( cosio2  ===     0.017360206 ); 
  assert(  einx   ===     0.000002512 ); assert(  eccsq  ===     0.000002512 ); assert(  omeosq ===     0.999997488 ); assert(   posq  ===     1.092935649 ); assert(     rp  ===     1.043781442 ); assert(  rteosq ===     0.999998744 ); 
  assert(  sinio  ===     0.991281894 ); assert(   gsto  ===     0.065747677 ); 
} 
       // ------------------after sgp4init :-------------
checkSgp4Init29141(ini: Sgp4Init) = {
 import ini._
assert(   satn  ===           29141); assert(     yr  ===               6); assert(  bstar  ===     0.135190000); assert(   ecco  ===     0.001584800); assert(  epoch  === 20624.267838450); assert(  argpo  ===     4.838269107 ); 
assert(  inclo  ===     1.438653958); assert(     mo  ===     1.464563371 ); 
// in and out variables 
assert(     no  ===     0.069571632 ); 
//    outputs  :
assert(   init  ===               n); assert(  isimp  ===               0); assert( method  ===               n); assert(  aycof  ===     0.001162313 ); 
assert(  con41  ===    -0.947919382); assert(    cc1  ===     0.000014023); assert(    cc4  ===     0.000002617 ); 
assert(    cc5  ===     0.003283768); assert(     d2  ===     0.000000025); assert(     d3  ===     0.000000000); assert(     d4  ===     0.000000000); assert(  delmo  ===     1.015954242 ); 
assert(    eta  ===     0.049890449); assert( argpdot ===    -0.000047075); assert(  omgcof ===     0.000161265 ); 
assert( sinmao  ===     0.994362584); assert(  t2cof  ===     0.000021035); assert(  t3cof  ===     0.000000025 ); 
assert(  t4cof  ===     0.000000000); assert(  t5cof  ===     0.000000000); assert(   gsto  ===     0.065747677); assert( x1mth2  ===     0.982639794); assert( x7thm1  ===    -0.878478558); assert(  xlcof  ===     0.001878784 ); 
assert(  xmcof  ===    -1.762227730); assert(   mdot  ===     0.069522675); assert(  nodecf ===    -0.000000001); assert(  nodedt ===    -0.000013573 ); 
//   in and outputs from deep space satellites :
assert(      t  ===     0.000000000); assert(  nodeo  ===     4.773269555 ); 
//             irez               0); assert(  atime  ===     0.000000000); assert(  d2201  ===     0.000000000); assert(  d2211  ===     0.000000000); assert(  d3210  ===     0.000000000 ); 
//            d3222     0.000000000); assert(  d4410  ===     0.000000000); assert(  d4422  ===     0.000000000); assert(  d5220  ===     0.000000000); assert(  d5232  ===     0.000000000); assert(  d5421  ===     0.000000000 ); 
//            d5433     0.000000000); assert(   dedt  ===     0.000000000); assert(   del1  ===     0.000000000); assert(   del2  ===     0.000000000); assert(   del3  ===     0.000000000 ); 
//             didt     0.000000000); assert(   dmdt  ===     0.000000000); assert(  dnodt  ===     0.000000000); assert(  domdt  ===     0.000000000); assert(     e3  ===     0.000000000 ); 
//              ee2     0.000000000); assert(    peo  ===     0.000000000); assert(   pgho  ===     0.000000000); assert(    pho  ===     0.000000000); assert(  pinco  ===     0.000000000); assert(    plo  ===     0.000000000 ); 
//              se2     0.000000000); assert(    se3  ===     0.000000000); assert(   sgh2  ===     0.000000000); assert(   sgh3  ===     0.000000000); assert(   sgh4  ===     0.000000000); assert(    sh2  ===     0.000000000 ); 
//              sh3     0.000000000); assert(    si2  ===     0.000000000); assert(    si3  ===     0.000000000); assert(    sl2  ===     0.000000000); assert(    sl3  ===     0.000000000); assert(    sl4  ===     0.000000000 ); 
//            xfact     0.000000000); assert(   xgh2  ===     0.000000000); assert(   xgh3  ===     0.000000000); assert(   xgh4  ===     0.000000000); assert(    xh2  ===     0.000000000 ); 
//              xh3     0.000000000); assert(    xi2  ===     0.000000000); assert(    xi3  ===     0.000000000); assert(    xl2  ===     0.000000000); assert(    xl3  ===     0.000000000 ); 
//              xl4     0.000000000); assert(    xli  ===     0.000000000); assert(  xlamo  ===     0.000000000); assert(    xni  ===     0.000000000); assert(   zmol  ===     0.000000000); assert(   zmos  ===     0.000000000 ); 
} 
// 29141
# *** error: t:= 440.000000 *** code =   6
                                   // ------------------after initl  :---------------
checkIntl29238(ini : Initl) {
 import ini._
  assert(   satn  ===           29238 ); assert(             yr  ===           ); assert(   ecco  ===     0.020257900 ); assert(  epoch  === 20631.287320100 ); assert(  inclo  ===     0.899883036 ); 
 //   in/out : 
  assert(     no  ===     0.068663016 ); 
 //   outputs : 
  assert( method  ===               n ); assert(   ainv  ===     0.948190069 ); assert(     ao  ===     1.054640871 ); assert(  con41  ===     0.159538584 ); assert(  con42  ===    -0.932564306 ); assert(  cosio  ===     0.621701585 ); 
  assert( cosio2  ===     0.386512861 ); 
  assert(  einx   ===     0.000410383 ); assert(  eccsq  ===     0.000410383 ); assert(  omeosq ===     0.999589617 ); assert(   posq  ===     1.111354644 ); assert(     rp  ===     1.033276062 ); assert(  rteosq ===     0.999794788 ); 
  assert(  sinio  ===     0.783254198 ); assert(   gsto  ===     0.308909174 ); 
} 
       // ------------------after sgp4init :-------------
checkSgp4Init29238(ini: Sgp4Init) = {
 import ini._
assert(   satn  ===           29238); assert(     yr  ===               6); assert(  bstar  ===     0.001333400); assert(   ecco  ===     0.020257900); assert(  epoch  === 20631.287320100); assert(  argpo  ===     1.662431349 ); 
assert(  inclo  ===     0.899883036); assert(     mo  ===     4.675754519 ); 
// in and out variables 
assert(     no  ===     0.068663016 ); 
//    outputs  :
assert(   init  ===               n); assert(  isimp  ===               1); assert( method  ===               n); assert(  aycof  ===     0.000918393 ); 
assert(  con41  ===     0.159538584); assert(    cc1  ===     0.000000227); assert(    cc4  ===     0.000262533 ); 
assert(    cc5  ===     0.005899869); assert(     d2  ===     0.000000000); assert(     d3  ===     0.000000000); assert(     d4  ===     0.000000000); assert(  delmo  ===     0.945663607 ); 
assert(    eta  ===     0.503749304); assert( argpdot ===     0.000046695); assert(  omgcof ===    -0.000000021 ); 
assert( sinmao  ===    -0.999329033); assert(  t2cof  ===     0.000000340); assert(  t3cof  ===     0.000000000 ); 
assert(  t4cof  ===     0.000000000); assert(  t5cof  ===     0.000000000); assert(   gsto  ===     0.308909174); assert( x1mth2  ===     0.613487139); assert( x7thm1  ===     1.705590028); assert(  xlcof  ===     0.001729668 ); 
assert(  xmcof  ===    -0.000050623); assert(   mdot  ===     0.068671028); assert(  nodecf ===    -0.000000000); assert(  nodedt ===    -0.000062411 ); 
//   in and outputs from deep space satellites :
assert(      t  ===     0.000000000); assert(  nodeo  ===     3.731344644 ); 
//             irez               0); assert(  atime  ===     0.000000000); assert(  d2201  ===     0.000000000); assert(  d2211  ===     0.000000000); assert(  d3210  ===     0.000000000 ); 
//            d3222     0.000000000); assert(  d4410  ===     0.000000000); assert(  d4422  ===     0.000000000); assert(  d5220  ===     0.000000000); assert(  d5232  ===     0.000000000); assert(  d5421  ===     0.000000000 ); 
//            d5433     0.000000000); assert(   dedt  ===     0.000000000); assert(   del1  ===     0.000000000); assert(   del2  ===     0.000000000); assert(   del3  ===     0.000000000 ); 
//             didt     0.000000000); assert(   dmdt  ===     0.000000000); assert(  dnodt  ===     0.000000000); assert(  domdt  ===     0.000000000); assert(     e3  ===     0.000000000 ); 
//              ee2     0.000000000); assert(    peo  ===     0.000000000); assert(   pgho  ===     0.000000000); assert(    pho  ===     0.000000000); assert(  pinco  ===     0.000000000); assert(    plo  ===     0.000000000 ); 
//              se2     0.000000000); assert(    se3  ===     0.000000000); assert(   sgh2  ===     0.000000000); assert(   sgh3  ===     0.000000000); assert(   sgh4  ===     0.000000000); assert(    sh2  ===     0.000000000 ); 
//              sh3     0.000000000); assert(    si2  ===     0.000000000); assert(    si3  ===     0.000000000); assert(    sl2  ===     0.000000000); assert(    sl3  ===     0.000000000); assert(    sl4  ===     0.000000000 ); 
//            xfact     0.000000000); assert(   xgh2  ===     0.000000000); assert(   xgh3  ===     0.000000000); assert(   xgh4  ===     0.000000000); assert(    xh2  ===     0.000000000 ); 
//              xh3     0.000000000); assert(    xi2  ===     0.000000000); assert(    xi3  ===     0.000000000); assert(    xl2  ===     0.000000000); assert(    xl3  ===     0.000000000 ); 
//              xl4     0.000000000); assert(    xli  ===     0.000000000); assert(  xlamo  ===     0.000000000); assert(    xni  ===     0.000000000); assert(   zmol  ===     0.000000000); assert(   zmos  ===     0.000000000 ); 
} 
// 29238
                                   // ------------------after initl  :---------------
checkIntl88888(ini : Initl) {
 import ini._
  assert(   satn  ===           88888 ); assert(             yr  ===           ); assert(   ecco  ===     0.008673100 ); assert(  epoch  === 11232.987084650 ); assert(  inclo  ===     1.271358914 ); 
 //   in/out : 
  assert(     no  ===     0.070106156 ); 
 //   outputs : 
  assert( method  ===               n ); assert(   ainv  ===     0.961429817 ); assert(     ao  ===     1.040117523 ); assert(  con41  ===    -0.738955620 ); assert(  con42  ===     0.564926033 ); assert(  cosio  ===     0.294982700 ); 
  assert( cosio2  ===     0.087014793 ); 
  assert(  einx   ===     0.000075223 ); assert(  eccsq  ===     0.000075223 ); assert(  omeosq ===     0.999924777 ); assert(   posq  ===     1.081681709 ); assert(     rp  ===     1.031096480 ); assert(  rteosq ===     0.999962388 ); 
  assert(  sinio  ===     0.955502594 ); assert(   gsto  ===     0.108290142 ); 
} 
       // ------------------after sgp4init :-------------
checkSgp4Init88888(ini: Sgp4Init) = {
 import ini._
assert(   satn  ===           88888); assert(     yr  ===              80); assert(  bstar  ===     0.000066816); assert(   ecco  ===     0.008673100); assert(  epoch  === 11232.987084650); assert(  argpo  ===     0.919767572 ); 
assert(  inclo  ===     1.271358914); assert(     mo  ===     1.929834989 ); 
// in and out variables 
assert(     no  ===     0.070106156 ); 
//    outputs  :
assert(   init  ===               n); assert(  isimp  ===               1); assert( method  ===               n); assert(  aycof  ===     0.001120360 ); 
assert(  con41  ===    -0.738955620); assert(    cc1  ===     0.000000023); assert(    cc4  ===     0.000377201 ); 
assert(    cc5  ===     0.012334919); assert(     d2  ===     0.000000000); assert(     d3  ===     0.000000000); assert(     d4  ===     0.000000000); assert(  delmo  ===     0.696308675 ); 
assert(    eta  ===     0.323471197); assert( argpdot ===    -0.000029718); assert(  omgcof ===     0.000000163 ); 
assert( sinmao  ===     0.936235046); assert(  t2cof  ===     0.000000035); assert(  t3cof  ===     0.000000000 ); 
assert(  t4cof  ===     0.000000000); assert(  t5cof  ===     0.000000000); assert(   gsto  ===     0.108290142); assert( x1mth2  ===     0.912985207); assert( x7thm1  ===    -0.390896446); assert(  xlcof  ===     0.001935746 ); 
assert(  xmcof  ===    -0.000049353); assert(   mdot  ===     0.070067293); assert(  nodecf ===    -0.000000000); assert(  nodedt ===    -0.000030963 ); 
//   in and outputs from deep space satellites :
assert(      t  ===     0.000000000); assert(  nodeo  ===     2.024039135 ); 
//             irez               0); assert(  atime  ===     0.000000000); assert(  d2201  ===     0.000000000); assert(  d2211  ===     0.000000000); assert(  d3210  ===     0.000000000 ); 
//            d3222     0.000000000); assert(  d4410  ===     0.000000000); assert(  d4422  ===     0.000000000); assert(  d5220  ===     0.000000000); assert(  d5232  ===     0.000000000); assert(  d5421  ===     0.000000000 ); 
//            d5433     0.000000000); assert(   dedt  ===     0.000000000); assert(   del1  ===     0.000000000); assert(   del2  ===     0.000000000); assert(   del3  ===     0.000000000 ); 
//             didt     0.000000000); assert(   dmdt  ===     0.000000000); assert(  dnodt  ===     0.000000000); assert(  domdt  ===     0.000000000); assert(     e3  ===     0.000000000 ); 
//              ee2     0.000000000); assert(    peo  ===     0.000000000); assert(   pgho  ===     0.000000000); assert(    pho  ===     0.000000000); assert(  pinco  ===     0.000000000); assert(    plo  ===     0.000000000 ); 
//              se2     0.000000000); assert(    se3  ===     0.000000000); assert(   sgh2  ===     0.000000000); assert(   sgh3  ===     0.000000000); assert(   sgh4  ===     0.000000000); assert(    sh2  ===     0.000000000 ); 
//              sh3     0.000000000); assert(    si2  ===     0.000000000); assert(    si3  ===     0.000000000); assert(    sl2  ===     0.000000000); assert(    sl3  ===     0.000000000); assert(    sl4  ===     0.000000000 ); 
//            xfact     0.000000000); assert(   xgh2  ===     0.000000000); assert(   xgh3  ===     0.000000000); assert(   xgh4  ===     0.000000000); assert(    xh2  ===     0.000000000 ); 
//              xh3     0.000000000); assert(    xi2  ===     0.000000000); assert(    xi3  ===     0.000000000); assert(    xl2  ===     0.000000000); assert(    xl3  ===     0.000000000 ); 
//              xl4     0.000000000); assert(    xli  ===     0.000000000); assert(  xlamo  ===     0.000000000); assert(    xni  ===     0.000000000); assert(   zmol  ===     0.000000000); assert(   zmos  ===     0.000000000 ); 
} 
// 88888
