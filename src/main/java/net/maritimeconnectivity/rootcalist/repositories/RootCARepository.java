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

package net.maritimeconnectivity.rootcalist.repositories;

import net.maritimeconnectivity.rootcalist.model.RootCA;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;

public interface RootCARepository extends EntityRepository<RootCA> {

    @Query("select r from RootCA r where r.id = (select s.rootCA.id from Attestation s where s.attestor.id in :attestorIds)")
    List<RootCA> findByAttestor(Collection<Long> attestorIds);
}
