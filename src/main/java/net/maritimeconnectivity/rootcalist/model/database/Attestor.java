/*
 * Copyright 2020 Maritime Connectivity Platform Consortium
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.maritimeconnectivity.rootcalist.model.database;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "attestor")
@Getter
@Setter
public class Attestor extends EntityModel {

    @OneToMany(mappedBy = "attestor")
    private Set<Attestation> attestations;

    @OneToMany(mappedBy = "attestor")
    private Set<Revocation> revocations;

    @ApiModelProperty(value = "The CA that has issued the certificate of this attestor")
    @Column(name = "issuer")
    private String issuer;
}
