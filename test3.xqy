i: INT = 5
j: INT = 7
i
j
i + j
i * j
i + j * 3
i * j + 3
declare function fscImmLib:getDocs(
	$context as map:map,
	$params  as map:map
) as document-node()* {
	let $qpElements  := $cc:FSCIMM-QUERY-PARAM-ELEMENTS
	let $searchElems := $cc:FSCIMM-SEARCH-ELEMENTS

	return edl:executeSearch(
		$cc:FSCIMM-ENTITY-NAME, $qpElements, $searchElems, $params, 
		$context, $cc:PARTIDENT-NSN-FSC-ELEMENT, fn:false(), ()
	)
};