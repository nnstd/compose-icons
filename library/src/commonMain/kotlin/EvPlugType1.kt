package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EvPlugType1: ImageVector
    get() {
        if (_EvPlugType1 != null) {
            return _EvPlugType1!!
        }
        _EvPlugType1 = ImageVector.Builder(
            name = "EvPlugType1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 9f)
                curveTo(13f, 10.1f, 13.9f, 11f, 15f, 11f)
                reflectiveCurveTo(17f, 10.1f, 17f, 9f)
                reflectiveCurveTo(16.1f, 7f, 15f, 7f)
                reflectiveCurveTo(13f, 7.9f, 13f, 9f)
                moveTo(7f, 9f)
                curveTo(7f, 10.1f, 7.9f, 11f, 9f, 11f)
                reflectiveCurveTo(11f, 10.1f, 11f, 9f)
                reflectiveCurveTo(10.1f, 7f, 9f, 7f)
                reflectiveCurveTo(7f, 7.9f, 7f, 9f)
                moveTo(9f, 13.2f)
                curveTo(9f, 12.6f, 8.4f, 12f, 7.8f, 12f)
                reflectiveCurveTo(6.6f, 12.6f, 6.6f, 13.2f)
                reflectiveCurveTo(7.2f, 14.4f, 7.8f, 14.4f)
                reflectiveCurveTo(9f, 13.9f, 9f, 13.2f)
                moveTo(14f, 16f)
                curveTo(14f, 14.9f, 13.1f, 14f, 12f, 14f)
                reflectiveCurveTo(10f, 14.9f, 10f, 16f)
                reflectiveCurveTo(10.9f, 18f, 12f, 18f)
                reflectiveCurveTo(14f, 17.1f, 14f, 16f)
                moveTo(12f, 4f)
                curveTo(16.4f, 4f, 20f, 7.6f, 20f, 12f)
                reflectiveCurveTo(16.4f, 20f, 12f, 20f)
                reflectiveCurveTo(4f, 16.4f, 4f, 12f)
                reflectiveCurveTo(7.6f, 4f, 12f, 4f)
                moveTo(12f, 2f)
                curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                reflectiveCurveTo(6.5f, 22f, 12f, 22f)
                reflectiveCurveTo(22f, 17.5f, 22f, 12f)
                reflectiveCurveTo(17.5f, 2f, 12f, 2f)
                moveTo(17.5f, 13.2f)
                curveTo(17.5f, 12.5f, 16.9f, 12f, 16.3f, 12f)
                curveTo(15.6f, 12f, 15.1f, 12.6f, 15.1f, 13.2f)
                reflectiveCurveTo(15.7f, 14.4f, 16.3f, 14.4f)
                curveTo(16.9f, 14.5f, 17.5f, 13.9f, 17.5f, 13.2f)
            }
        }.build()

        return _EvPlugType1!!
    }

@Suppress("ObjectPropertyName")
private var _EvPlugType1: ImageVector? = null
