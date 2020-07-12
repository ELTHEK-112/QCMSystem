<!doctype html>
<html lang="en">

    <head>
        <meta charset="utf-8" />
        <title>accueil  Etudiant | BTSQCMSystem</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta content="Premium Multipurpose Admin & Dashboard Template" name="description" />
        <meta content="Themesdesign" name="author" />
        <!-- App favicon -->
        <link rel="shortcut icon" href="assets/images/favicon.ico">

        <!-- datepicker -->
        <link href="assets/libs/air-datepicker/css/datepicker.min.css" rel="stylesheet" type="text/css" />

        <!-- jvectormap -->
        <link href="assets/libs/jqvmap/jqvmap.min.css" rel="stylesheet" />

        <!-- Bootstrap Css -->
        <link href="assets/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <!-- Icons Css -->
        <link href="assets/css/icons.min.css" rel="stylesheet" type="text/css" />
        <!-- App Css-->
        <link href="assets/css/app.min.css" rel="stylesheet" type="text/css" />

    </head>

    <body data-topbar="colored" data-layout="horizontal" data-layout-size="boxed">

        <!-- Begin page -->
        <div id="layout-wrapper">

            <header id="page-topbar">
                <div class="navbar-header">
                    <div class="container-fluid">
                        <div class="float-right">

                            <div class="dropdown d-inline-block ml-2">
                                <button type="button" class="btn header-item noti-icon waves-effect" id="page-header-search-dropdown" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <i class="mdi mdi-magnify"></i>
                                </button>
                                <div class="dropdown-menu dropdown-menu-lg dropdown-menu-right p-0" aria-labelledby="page-header-search-dropdown">

                                    <form class="p-3">
                                        <div class="form-group m-0">
                                            <div class="input-group">
                                                <input type="text" class="form-control" placeholder="Search ..." aria-label="Recipient's username">
                                                <div class="input-group-append">
                                                    <button class="btn btn-primary" type="submit"><i class="mdi mdi-magnify"></i></button>
                                                </div>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                              <div class="dropdown d-inline-block">
                                <button type="button" class="btn header-item waves-effect" id="page-header-user-dropdown" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <img class="rounded-circle header-profile-user" src="assets/images/users/avatar4.png" alt="Header Avatar">
                                    <span class="d-none d-sm-inline-block ml-1">Etudiant</span>
                                    <i class="mdi mdi-chevron-down d-none d-sm-inline-block"></i>
                                </button>
                                <div class="dropdown-menu dropdown-menu-right">
                                    <!-- item-->
                                    <a class="dropdown-item" href="#"><i class="mdi mdi-face-profile font-size-16 align-middle mr-1"></i> Profile</a>
                                    <a class="dropdown-item" href="#"><i class="mdi mdi-credit-card-outline font-size-16 align-middle mr-1"></i> Billing</a>
                                    <a class="dropdown-item" href="#"><i class="mdi mdi-account-settings font-size-16 align-middle mr-1"></i> Settings</a>
                                    <a class="dropdown-item" href="#"><i class="mdi mdi-lock font-size-16 align-middle mr-1"></i> Lock screen</a>
                                    <div class="dropdown-divider"></div>
                                    <a class="dropdown-item" href="#"><i class="mdi mdi-logout font-size-16 align-middle mr-1"></i> Logout</a>
                                </div>
                            </div>
                        </div>
                        <!-- LOGO -->
                        <div class="navbar-brand-box">
                            <a href="index.html" class="logo logo-dark">
                                <span class="logo-sm">
                                    <img src="assets/images/logo-sm-dark.png" alt="" height="22">
                                </span>
                                <span class="logo-lg">
                                    <img src="assets/images/logo-dark.png" alt="" height="20">
                                </span>
                            </a>

                            <a href="index.html" class="logo logo-light">
                                <span class="logo-sm">
                                    <img src="assets/images/logo-sm-light.png" alt="" height="44">
                                </span>
                                <span class="logo-lg">
                                    <img src="assets/images/logo-light.png" alt="" height="40">
                                </span>
                            </a>
                        </div>

                        <button type="button" class="btn btn-sm mr-2 font-size-16 d-lg-none header-item waves-effect waves-light" data-toggle="collapse" data-target="#topnav-menu-content">
                            <i class="fa fa-fw fa-bars"></i>
                        </button>

                        <div class="topnav">
                            <nav class="navbar navbar-light navbar-expand-lg topnav-menu">

                                <div class="collapse navbar-collapse" id="topnav-menu-content">
                                    <ul class="navbar-nav">
                                        <li class="nav-item">
                                            <a class="nav-link" href="accueil_Beneficers.html">
                                                Accueil
                                            </a>
                                        </li>

                                        <li class="nav-item dropdown">
                                            <a class="nav-link dropdown-toggle arrow-none" href="#" id="topnav-uielement" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                                Services  <div class="arrow-down"></div>
                                            </a>
                                            <div class="dropdown-menu" aria-labelledby="topnav-components">
                                                <div class="row">
                                                    <div class="col-lg-4">
                                                        <div class="row">
                                                            <div class="col-lg-2">
                                                                <a href="Demande_donat.html" class="dropdown-item">Demande des Donations</a>
                                                                <a href="Demande_bevelt.html" class="dropdown-item"> Demande des Bénévoles</a>
                                                                <a href="Recherche_benevlt.html" class="dropdown-item"> Recherche  des Bénévoles</a>
                                                                <a href="Recherche_donat.html" class="dropdown-item"> Recherche des Donations</a>
                                                            </div>
                                                        </div>
                                                    </div>
                                        </li>
                                        <li class="nav-item dropdown">
                                           <a class="nav-link dropdown-toggle arrow-none" href="#" id="topnav-components" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                               autre <div class="arrow-down"></div>
                                           </a>
                                           <div class="dropdown-menu" aria-labelledby="topnav-components">
                                               <div class="dropdown">
                                                   <a class="dropdown-item dropdown-toggle arrow-none" href="#" id="topnav-email" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                                       <div class="d-inline-block icons-sm mr-2"><i class="uim uim-comment-message"></i></div> Relais
                                                       <div class="arrow-down"></div>
                                                   </a>
                                                   <div class="dropdown-menu" aria-labelledby="topnav-email">
                                                       <a href="lesDonation.html" class="dropdown-item">les  Donations</a>
                                                       <a href="lesBenevoles.html" class="dropdown-item"> les Bénévoles</a>
                                                   </div>
                                               </div>
                                               <div class="dropdown">
                                                   <a class="dropdown-item dropdown-toggle arrow-none" href="#" id="topnav-email" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                                       <div class="d-inline-block icons-sm mr-2"><i class="uim uim-comment-message"></i></div>à propos
                                                       <div class="arrow-down"></div>
                                                   </a>
                                                   <div class="dropdown-menu" aria-labelledby="topnav-email">
                                                       <a href="sadaqa.html" class="dropdown-item">BTSQCMSystem application</a>
                                                   </div>
                                               </div>
                                            </div>
                                       </li>
                                      </ul>
                                </div>
                            </nav>
                        </div>
                    </div>
                </div>


            </header>

            <!-- ============================================================== -->
            <!-- Start right Content here -->
            <!-- ============================================================== -->
            <div class="main-content">

                <div class="page-content">

                    <!-- Page-Title -->
                    <div class="page-title-box">
                        <div class="container-fluid">
                            <div class="row align-items-center">
                                <div class="col-md-8">
                                    <h4 class="page-title mb-1">Accueil</h4>
                                    <ol class="breadcrumb m-0">
                                    <li class="breadcrumb-item active">Bienvenue dans BTSQCMSystem</li>
                                    </ol>
                                </div>
                                <div class="col-md-4">
                                    <div class="float-right d-none d-md-block">
                                        <div class="dropdown">
                                            <button class="btn btn-light btn-rounded dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                                <i class="mdi mdi-settings-outline mr-1"></i> Settings
                                            </button>
                                            <div class="dropdown-menu dropdown-menu-right dropdown-menu-animated">
                                                <a class="dropdown-item" href="#">Action</a>
                                                <a class="dropdown-item" href="#">Another action</a>
                                                <a class="dropdown-item" href="#">Something else here</a>
                                                <div class="dropdown-divider"></div>
                                                <a class="dropdown-item" href="#">Separated link</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>
                    <!-- end page title end breadcrumb -->

                    <div class="page-content-wrapper">
                        <div class="container-fluid">
                          <div class="row">
                              <div class="col-xl-4">
                                  <div class="card">
                                      <div class="card-body">
                                      <div class="row">
                                              <div class="col-6">
                                                  <h5> Nous saluons le retour !</h5>
                                                  <p class="text-muted">Etudiant Dashboard</p>

                                                  <div class="mt-4">
                                                      <a href="#" class="btn btn-primary btn-sm">Voir plus<i class="mdi mdi-arrow-right ml-1"></i></a>
                                                  </div>
                                              </div>

                                              <div class="col-5 ml-auto">
                                                  <div>
                                                      <img src="assets/images/widget-img.png" alt="" class="img-fluid">
                                                  </div>
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                                  <div class="card">
                                      <div class="card-body">
                                          <h5 class="header-title mb-4">Rapport de test </h5>
                                          <div class="media">
                                              <div class="media-body">
                                                  <p class="text-muted mb-2">les test no passer</p>
                                                  <h4>2</h4>
                                              </div>
                                              <div dir="ltr" class="ml-2">
                                                  <input data-plugin="knob" data-width="56" data-height="56" data-linecap=round data-displayInput=false
                                                  data-fgColor="#3051d3" value="56" data-skin="tron" data-angleOffset="56"
                                                  data-readOnly=true data-thickness=".17" />
                                              </div>
                                          </div>
                                          <hr>
                                          <div class="media">
                                              <div class="media-body">
                                                  <p class="text-muted">test bien passer status</p>
                                                  <h5 class="mb-0"> 3 % <span class="font-size-14 text-muted ml-1">De la période précédente</span></h5>
                                              </div>

                                              <div class="align-self-end ml-2">
                                                  <a href="#" class="btn btn-primary btn-sm">Voir plus</a>
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                              <div class="col-lg-8">
                                  <div class="card">
                                      <div class="card-header bg-transparent p-3">
                                          <h5 class="header-title mb-0">Statut du test cette annee </h5>
                                      </div>
                                      <ul class="list-group list-group-flush">
                                          <li class="list-group-item">
                                              <div class="media my-2">

                                                  <div class="media-body">
                                                      <p class="text-muted mb-2">Nombre des test</p>
                                                      <h5 class="mb-0">50</h5>
                                                  </div>
                                                  <div class="icons-lg ml-2 align-self-center">
                                                      <i class="uim uim-layer-group"></i>
                                                  </div>
                                              </div>
                                          </li>
                                          <li class="list-group-item">
                                              <div class="media my-2">
                                                  <div class="media-body">
                                                      <p class="text-muted mb-2">Nombre test par module </p>
                                                      <h5 class="mb-0">4</h5>
                                                  </div>
                                                  <div class="icons-lg ml-2 align-self-center">
                                                      <i class="uim uim-analytics"></i>
                                                  </div>
                                              </div>
                                          </li>
                                          <li class="list-group-item">
                                              <div class="media my-2">
                                                  <div class="media-body">
                                                      <p class="text-muted mb-2">les test deja passer</p>
                                                      <h5 class="mb-0">10</h5>
                                                  </div>
                                                  <div class="icons-lg ml-2 align-self-center">
                                                      <i class="uim uim-box"></i>
                                                  </div>
                                              </div>
                                          </li>
                                      </ul>
                                  </div>
                              </div>
                              </div>
                            <!-- end row -->
                            <div class="row">
                              <div class="col-lg-12">
                                    <div class="card">
                                        <div class="card-body">
                                            <div class="float-right ml-2">
                                                <a href="#">View all</a>
                                            </div>
                                            <h5 class="header-title mb-4">les nouvelles test </h5>

                                            <div class="table-responsive">
                                                <table class="table table-centered table-hover mb-0">
                                                    <thead>
                                                        <tr>
                                                            <th scope="col">Nom de test</th>
                                                            <th scope="col">Date </th>
                                                            <th scope="col">module</th>
                                                            <th scope="col">chapiter</th>
                                                            <th scope="col">Action</th>
                                                        </tr>
                                                    </thead>
                                                    <tbody>
                                                        <tr>
                                                            <th scope="row">
                                                                <a href="#">uml 1</a>
                                                            </th>
                                                            <td>26 Jan</td>
                                                            <td>
                                                                <div class="badge badge-soft-primary">UML</div>
                                                            </td>
                                                            <td>chap 1</td>
                                                            <td>
                                                          <div class="btn-group" role="group">
                                                            <button  type="button" class="btn btn-outline-secondary btn-sm" data-target=".bs-example-modal-center" data-toggle="modal">Passer</button>
                                                              <div class="modal fade bs-example-modal-center" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
                                                               <div class="modal-dialog modal-dialog-centered">
                                                                   <div class="modal-content">
                                                                       <div class="modal-header">
                                                                           <h5 class="modal-title mt-0">Center modal</h5>
                                                                           <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                                               <span aria-hidden="true">&times;</span>
                                                                           </button>
                                                                       </div>
                                                                       <div class="modal-body">
                                                                           <p>Cras mattis consectetur purus sit amet fermentum.
                                                                               Cras justo odio, dapibus ac facilisis in,
                                                                               egestas eget quam. Morbi leo risus, porta ac
                                                                               consectetur ac, vestibulum at eros.</p>
                                                                           <p>Praesent commodo cursus magna, vel scelerisque
                                                                               nisl consectetur et. Vivamus sagittis lacus vel
                                                                               augue laoreet rutrum faucibus dolor auctor.</p>
                                                                           <p class="mb-0">Aenean lacinia bibendum nulla sed consectetur.
                                                                               Praesent commodo cursus magna, vel scelerisque
                                                                               nisl consectetur et. Donec sed odio dui. Donec
                                                                               ullamcorper nulla non metus auctor
                                                                               fringilla.</p>
                                                                       </div>
                                                                   </div><!-- /.modal-content -->
                                                               </div><!-- /.modal-dialog -->
                                                           </div><!-- /.modal -->

                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <th scope="row">
                                                                <a href="#">Math 1</a>
                                                            </th>
                                                            <td>21 Jan</td>
                                                            <td>
                                                                <div class="badge badge-soft-warning">Mathimatique</div>
                                                            </td>
                                                            <td>chap1</td>
                                                            <td>
                                                          <div class="btn-group" role="group">
                                                            <button  type="button" class="btn btn-outline-secondary btn-sm" data-target=".bs-example-modal-center" data-toggle="modal">passer</button>
                                                              <div class="modal fade bs-example-modal-center" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
                                                               <div class="modal-dialog modal-dialog-centered">
                                                                   <div class="modal-content">
                                                                       <div class="modal-header">
                                                                           <h5 class="modal-title mt-0">Center modal</h5>
                                                                           <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                                               <span aria-hidden="true">&times;</span>
                                                                           </button>
                                                                       </div>
                                                                       <div class="modal-body">
                                                                           <p>Cras mattis consectetur purus sit amet fermentum.
                                                                               Cras justo odio, dapibus ac facilisis in,
                                                                               egestas eget quam. Morbi leo risus, porta ac
                                                                               consectetur ac, vestibulum at eros.</p>
                                                                           <p>Praesent commodo cursus magna, vel scelerisque
                                                                               nisl consectetur et. Vivamus sagittis lacus vel
                                                                               augue laoreet rutrum faucibus dolor auctor.</p>
                                                                           <p class="mb-0">Aenean lacinia bibendum nulla sed consectetur.
                                                                               Praesent commodo cursus magna, vel scelerisque
                                                                               nisl consectetur et. Donec sed odio dui. Donec
                                                                               ullamcorper nulla non metus auctor
                                                                               fringilla.</p>
                                                                       </div>
                                                                   </div><!-- /.modal-content -->
                                                               </div><!-- /.modal-dialog -->
                                                           </div><!-- /.modal -->

                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <th scope="row">
                                                                <a href="#">java 1</a>
                                                            </th>
                                                            <td>11 Jan</td>
                                                            <td>
                                                                <div class="badge badge-soft-primary">JAVA</div>
                                                            </td>
                                                            <td>chap1</td>
                                                            <td>
                                                          <div class="btn-group" role="group">
                                                            <button  type="button" class="btn btn-outline-secondary btn-sm" data-target=".bs-example-modal-center" data-toggle="modal">passer</button>
                                                              <div class="modal fade bs-example-modal-center" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
                                                               <div class="modal-dialog modal-dialog-centered">
                                                                   <div class="modal-content">
                                                                       <div class="modal-header">
                                                                           <h5 class="modal-title mt-0">Center modal</h5>
                                                                           <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                                               <span aria-hidden="true">&times;</span>
                                                                           </button>
                                                                       </div>
                                                                       <div class="modal-body">
                                                                           <p>Cras mattis consectetur purus sit amet fermentum.
                                                                               Cras justo odio, dapibus ac facilisis in,
                                                                               egestas eget quam. Morbi leo risus, porta ac
                                                                               consectetur ac, vestibulum at eros.</p>
                                                                           <p>Praesent commodo cursus magna, vel scelerisque
                                                                               nisl consectetur et. Vivamus sagittis lacus vel
                                                                               augue laoreet rutrum faucibus dolor auctor.</p>
                                                                           <p class="mb-0">Aenean lacinia bibendum nulla sed consectetur.
                                                                               Praesent commodo cursus magna, vel scelerisque
                                                                               nisl consectetur et. Donec sed odio dui. Donec
                                                                               ullamcorper nulla non metus auctor
                                                                               fringilla.</p>
                                                                       </div>
                                                                   </div><!-- /.modal-content -->
                                                               </div><!-- /.modal-dialog -->
                                                           </div><!-- /.modal -->

                                                            </td>
                                                        </tr>

                                                    </tbody>
                                                </table>
                                            </div>

                                            <div class="mt-4">
                                                <ul class="pagination pagination-rounded justify-content-center mb-0">
                                                    <li class="page-item disabled">
                                                        <a class="page-link" href="#" aria-label="Previous">
                                                            <i class="mdi mdi-chevron-left"></i>
                                                        </a>
                                                    </li>
                                                    <li class="page-item"><a class="page-link" href="#">1</a></li>
                                                    <li class="page-item active"><a class="page-link" href="#">2</a></li>
                                                    <li class="page-item"><a class="page-link" href="#">3</a></li>
                                                    <li class="page-item"><a class="page-link" href="#">4</a></li>
                                                    <li class="page-item">
                                                        <a class="page-link" href="#" aria-label="Next">
                                                            <i class="mdi mdi-chevron-right"></i>
                                                        </a>
                                                    </li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                        </div>
                            <!-- end row -->
                            <div class="row">
                              <div class="col-lg-12">
                                    <div class="card">
                                        <div class="card-body">
                                            <div class="float-right ml-2">
                                                <a href="#">View all</a>
                                            </div>
                                            <h5 class="header-title mb-4">Dernier tests</h5>

                                            <div class="table-responsive">
                                                <table class="table table-centered table-hover mb-0">
                                                    <thead>
                                                        <tr>
                                                            <th scope="col">Nom</th>
                                                            <th scope="col">Date</th>
                                                            <th scope="col">points</th>
                                                            <th scope="col">module</th>

                                                        </tr>
                                                    </thead>

                                                </table>
                                            </div>

                                          
                                        </div>
                                    </div>
                                </div>
                          </div>
                            <!-- end row -->

                        </div> <!-- container-fluid -->
                    </div>
                    <!-- end page-content-wrapper -->
                </div>
                <!-- End Page-content -->


                <footer class="footer">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-sm-6">
                                2020 © SADAQA.
                            </div>
                            <div class="col-sm-6">
                                <div class="text-sm-right d-none d-sm-block">
                                    Crafted with <i class="mdi mdi-heart text-danger"></i> by ELalkaoui && NSALLA
                                </div>
                            </div>
                        </div>
                    </div>
                </footer>
            </div>
            <!-- end main content-->

        </div>
        <!-- END layout-wrapper -->

        <div class="rightbar-overlay"></div>

        <!-- JAVASCRIPT -->
        <script src="assets/libs/jquery/jquery.min.js"></script>
        <script src="assets/libs/bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="assets/libs/metismenu/metisMenu.min.js"></script>
        <script src="assets/libs/simplebar/simplebar.min.js"></script>
        <script src="assets/libs/node-waves/waves.min.js"></script>

        <script src="https://unicons.iconscout.com/release/v2.0.1/script/monochrome/bundle.js"></script>

        <!-- datepicker -->
        <script src="assets/libs/air-datepicker/js/datepicker.min.js"></script>
        <script src="assets/libs/air-datepicker/js/i18n/datepicker.en.js"></script>

        <!-- apexcharts -->
        <script src="assets/libs/apexcharts/apexcharts.min.js"></script>

        <script src="assets/libs/jquery-knob/jquery.knob.min.js"></script>

        <!-- Jq vector map -->
        <script src="assets/libs/jqvmap/jquery.vmap.min.js"></script>
        <script src="assets/libs/jqvmap/maps/jquery.vmap.usa.js"></script>

        <script src="assets/js/pages/dashboard.init.js"></script>

        <script src="assets/js/app.js"></script>

    </body>
</html>