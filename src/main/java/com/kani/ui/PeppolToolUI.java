/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kani.ui;

import com.kani.exception.LookupUIException;
import com.kani.peppol.LookupUtil;
import com.kani.peppol.model.PeppolDocIdentifier;
import com.kani.peppol.model.PeppolEndpoint;
import java.security.cert.CertificateEncodingException;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingWorker;
import no.difi.vefa.peppol.common.model.DocumentTypeIdentifier;
import no.difi.vefa.peppol.common.model.Endpoint;
import no.difi.vefa.peppol.common.model.ProcessMetadata;
import no.difi.vefa.peppol.common.model.ServiceMetadata;

/**
 *
 * @author kanishka
 */
public class PeppolToolUI extends javax.swing.JFrame {

    /**
     * Creates new form PeppolToolUI
     */
    public PeppolToolUI() {
        initComponents();

        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/icons/vefa-peppol-ico.png")).getImage());
        jLabelLoader.setVisible(false);
        jLabelServiceMetadataLoader.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldPeppold = new javax.swing.JTextField();
        jComboBoxEnvironment = new javax.swing.JComboBox<>();
        jButtonLookup = new javax.swing.JButton();
        jLabelLoader = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxDoctypes = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldUri = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldDoctype = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabelServiceMetadataLoader = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxEndpoints = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldTransportProfile = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldEndpointUrl = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldCertificateSubjectName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldSubjectAlgo = new javax.swing.JTextField();
        jTextFieldSubjectValidityFrom = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldSubjectValidityTo = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldCertificateIssuerName = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaEncodedCertificate = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Peppol Id");

        jTextFieldPeppold.setText("9908:222222222");

        jComboBoxEnvironment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prod", "Test" }));

        jButtonLookup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/globe.png"))); // NOI18N
        jButtonLookup.setText("Lookup!");
        jButtonLookup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLookupActionPerformed(evt);
            }
        });

        jLabelLoader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loaders/ajax-loader.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPeppold, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxEnvironment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonLookup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLoader)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabelLoader))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jTextFieldPeppold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxEnvironment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonLookup)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Supported Document Types");

        jComboBoxDoctypes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDoctypesActionPerformed(evt);
            }
        });

        jLabel3.setText("URI ");

        jTextFieldUri.setEditable(false);

        jLabel4.setText("DocType Identifier");

        jTextFieldDoctype.setEditable(false);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/link.png"))); // NOI18N
        jButton1.setText("Open");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/metadata.png"))); // NOI18N
        jButton2.setText("Metadata");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Service Metadata"));

        jLabelServiceMetadataLoader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loaders/ajax-loader.gif"))); // NOI18N

        jLabel5.setText("Endpoints");

        jComboBoxEndpoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEndpointsActionPerformed(evt);
            }
        });

        jLabel6.setText("Transport Profile");

        jLabel7.setText("Endpoint URL");

        jLabel8.setText("Name");

        jTextFieldCertificateSubjectName.setEditable(false);

        jLabel9.setText("Algorithm");

        jTextFieldSubjectAlgo.setEditable(false);

        jTextFieldSubjectValidityFrom.setEditable(false);

        jLabel10.setText("Validit Period");

        jLabel11.setText("To");

        jTextFieldSubjectValidityTo.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldSubjectAlgo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldSubjectValidityFrom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSubjectValidityTo, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldCertificateSubjectName))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldCertificateSubjectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSubjectAlgo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSubjectValidityFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldSubjectValidityTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Subject", jPanel4);

        jLabel12.setText("Name");

        jTextFieldCertificateIssuerName.setEditable(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldCertificateIssuerName)
                .addGap(121, 121, 121))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldCertificateIssuerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(136, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Issuer", jPanel5);

        jLabel13.setText("Encoded");

        jTextAreaEncodedCertificate.setEditable(false);
        jTextAreaEncodedCertificate.setColumns(10);
        jTextAreaEncodedCertificate.setLineWrap(true);
        jTextAreaEncodedCertificate.setRows(5);
        jScrollPane2.setViewportView(jTextAreaEncodedCertificate);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Certificate", jPanel6);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelServiceMetadataLoader)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxEndpoints, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTransportProfile)
                            .addComponent(jTextFieldEndpointUrl))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(jLabelServiceMetadataLoader)
                    .addComponent(jComboBoxEndpoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldTransportProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEndpointUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldDoctype)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxDoctypes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldUri))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxDoctypes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldDoctype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLookupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLookupActionPerformed
        SwingWorker lookupWorker = new SwingWorker() {
            @Override
            protected Object doInBackground() throws Exception {
                jLabelLoader.setVisible(true);
                String peppolId = jTextFieldPeppold.getText();
                try {
                    List<DocumentTypeIdentifier> docIds = new LookupUtil().fetchDocumentIdentifiers(peppolId);
                    loadDocTypes(docIds, peppolId);
                } catch (LookupUIException ex) {
                    Logger.getLogger(PeppolToolUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                return null;
            }

            @Override
            protected void done() {
                jLabelLoader.setVisible(false);
            }
        };

        lookupWorker.execute();
    }//GEN-LAST:event_jButtonLookupActionPerformed

    private void jComboBoxDoctypesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDoctypesActionPerformed
        if (jComboBoxDoctypes.getSelectedItem() != null) {
            PeppolDocIdentifier selectedDocIdentifier = (PeppolDocIdentifier) jComboBoxDoctypes.getSelectedItem();
            jTextFieldUri.setText(selectedDocIdentifier.getUri());
            jTextFieldDoctype.setText(selectedDocIdentifier.getDocIdentifier());
        }
    }//GEN-LAST:event_jComboBoxDoctypesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jComboBoxDoctypes.getSelectedItem() != null) {
            PeppolDocIdentifier selectedDocIdentifier = (PeppolDocIdentifier) jComboBoxDoctypes.getSelectedItem();

            SwingWorker metadataWorker = new SwingWorker() {
                @Override
                protected Object doInBackground() throws Exception {
                    jLabelServiceMetadataLoader.setVisible(true);
                    ServiceMetadata peppolMetadata = new LookupUtil().fetchServiceMetadata(selectedDocIdentifier.getPeppolId(),
                            selectedDocIdentifier.getDocumentTypeIdentifier());
                    showPeppolServiceMetadata(peppolMetadata);
                    return null;
                }

                @Override
                protected void done() {
                    jLabelServiceMetadataLoader.setVisible(false);
                }
            };

            metadataWorker.execute();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBoxEndpointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEndpointsActionPerformed
        if(jComboBoxEndpoints.getSelectedItem() != null){
            PeppolEndpoint selectedEndpoint = (PeppolEndpoint) jComboBoxEndpoints.getSelectedItem();
            jTextFieldTransportProfile.setText(selectedEndpoint.getTransportProfile());
            jTextFieldEndpointUrl.setText(selectedEndpoint.getUrl());

            //load certificate info
            //subject
            String subjectPrincipalName = selectedEndpoint.getEndpoint().getCertificate().getSubjectX500Principal().getName();
            String subjectSigAlgo = selectedEndpoint.getEndpoint().getCertificate().getSigAlgName();
            Date notAfter = selectedEndpoint.getEndpoint().getCertificate().getNotAfter();
            Date notBefore = selectedEndpoint.getEndpoint().getCertificate().getNotBefore();
            try {
                String encoded = Base64.getEncoder().encodeToString(selectedEndpoint.getEndpoint().getCertificate().getEncoded());
                jTextAreaEncodedCertificate.setText(encoded);
            } catch (CertificateEncodingException ex) {
                ex.printStackTrace();
            }
            
            //issuer
            String issuerName =  selectedEndpoint.getEndpoint().getCertificate().getIssuerX500Principal().getName();
                    
            jTextFieldCertificateSubjectName.setText(subjectPrincipalName);
            jTextFieldSubjectAlgo.setText(subjectSigAlgo);
            jTextFieldSubjectValidityFrom.setText(notBefore.toString());
            jTextFieldSubjectValidityTo.setText(notAfter.toString());
            jTextFieldCertificateIssuerName.setText(issuerName);
        }
    }//GEN-LAST:event_jComboBoxEndpointsActionPerformed

    private void loadDocTypes(List<DocumentTypeIdentifier> docIds, String peppolId) {
        DefaultComboBoxModel docTypeComboboxModel = new DefaultComboBoxModel<PeppolDocIdentifier>();
        for (DocumentTypeIdentifier docId : docIds) {
            String identifier = docId.getIdentifier();
            String uri = docId.urlencoded();
            PeppolDocIdentifier peppolDocIdentifier = new PeppolDocIdentifier(docId, identifier, uri, peppolId);
            docTypeComboboxModel.addElement(peppolDocIdentifier);
        }
        jComboBoxDoctypes.setModel(docTypeComboboxModel);
        jComboBoxDoctypes.setSelectedIndex(0);
    }

    private void showPeppolServiceMetadata(ServiceMetadata serviceMetadata) {
        ProcessMetadata<Endpoint> processMetadata = serviceMetadata.getProcesses().get(0); //TODO : works for 99.9% cases
        List<Endpoint> endpoints = processMetadata.getEndpoints();
        
        DefaultComboBoxModel endpointComboModel = new DefaultComboBoxModel<PeppolEndpoint>();
        for (Endpoint endpoint : endpoints) {
            PeppolEndpoint peppolEndpoint = new PeppolEndpoint(endpoint, endpoint.getTransportProfile().getIdentifier(),
                    endpoint.getAddress().toString());
            endpointComboModel.addElement(peppolEndpoint);
        }
        jComboBoxEndpoints.setModel(endpointComboModel);
        jComboBoxEndpoints.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonLookup;
    private javax.swing.JComboBox<String> jComboBoxDoctypes;
    private javax.swing.JComboBox<String> jComboBoxEndpoints;
    private javax.swing.JComboBox<String> jComboBoxEnvironment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelLoader;
    private javax.swing.JLabel jLabelServiceMetadataLoader;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextAreaEncodedCertificate;
    private javax.swing.JTextField jTextFieldCertificateIssuerName;
    private javax.swing.JTextField jTextFieldCertificateSubjectName;
    private javax.swing.JTextField jTextFieldDoctype;
    private javax.swing.JTextField jTextFieldEndpointUrl;
    private javax.swing.JTextField jTextFieldPeppold;
    private javax.swing.JTextField jTextFieldSubjectAlgo;
    private javax.swing.JTextField jTextFieldSubjectValidityFrom;
    private javax.swing.JTextField jTextFieldSubjectValidityTo;
    private javax.swing.JTextField jTextFieldTransportProfile;
    private javax.swing.JTextField jTextFieldUri;
    // End of variables declaration//GEN-END:variables

}
