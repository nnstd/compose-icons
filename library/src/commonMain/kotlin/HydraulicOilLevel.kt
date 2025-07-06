package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HydraulicOilLevel: ImageVector
    get() {
        if (_HydraulicOilLevel != null) {
            return _HydraulicOilLevel!!
        }
        _HydraulicOilLevel = ImageVector.Builder(
            name = "HydraulicOilLevel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 18f)
                curveTo(13.34f, 18f, 12f, 16.66f, 12f, 15f)
                curveTo(12f, 13f, 15f, 9.63f, 15f, 9.63f)
                reflectiveCurveTo(18f, 13f, 18f, 15f)
                curveTo(18f, 16.66f, 16.66f, 18f, 15f, 18f)
                moveTo(20f, 4f)
                verticalLineTo(20f)
                horizontalLineTo(10f)
                verticalLineTo(4f)
                horizontalLineTo(8f)
                verticalLineTo(20f)
                curveTo(8f, 21.11f, 8.89f, 22f, 10f, 22f)
                horizontalLineTo(20f)
                curveTo(21.11f, 22f, 22f, 21.11f, 22f, 20f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                moveTo(2f, 19f)
                lineTo(7f, 14f)
                lineTo(2f, 9f)
                verticalLineTo(19f)
                moveTo(16f, 6f)
                verticalLineTo(2f)
                horizontalLineTo(14f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                verticalLineTo(6f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _HydraulicOilLevel!!
    }

@Suppress("ObjectPropertyName")
private var _HydraulicOilLevel: ImageVector? = null
