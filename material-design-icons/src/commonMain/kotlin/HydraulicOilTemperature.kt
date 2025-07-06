package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HydraulicOilTemperature: ImageVector
    get() {
        if (_HydraulicOilTemperature != null) {
            return _HydraulicOilTemperature!!
        }
        _HydraulicOilTemperature = ImageVector.Builder(
            name = "HydraulicOilTemperature",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 18f)
                curveTo(7.34f, 18f, 6f, 16.66f, 6f, 15f)
                curveTo(6f, 13f, 9f, 9.63f, 9f, 9.63f)
                reflectiveCurveTo(12f, 13f, 12f, 15f)
                curveTo(12f, 16.66f, 10.66f, 18f, 9f, 18f)
                moveTo(14f, 4f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(2f)
                verticalLineTo(20f)
                curveTo(2f, 21.11f, 2.89f, 22f, 4f, 22f)
                horizontalLineTo(14f)
                curveTo(15.11f, 22f, 16f, 21.11f, 16f, 20f)
                verticalLineTo(4f)
                horizontalLineTo(14f)
                moveTo(10f, 6f)
                verticalLineTo(2f)
                horizontalLineTo(8f)
                verticalLineTo(6f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineTo(13f)
                verticalLineTo(6f)
                horizontalLineTo(10f)
                moveTo(21f, 17.5f)
                verticalLineTo(5.5f)
                curveTo(21f, 4.67f, 20.33f, 4f, 19.5f, 4f)
                reflectiveCurveTo(18f, 4.67f, 18f, 5.5f)
                verticalLineTo(17.5f)
                curveTo(17.37f, 17.97f, 17f, 18.71f, 17f, 19.5f)
                curveTo(17f, 20.88f, 18.12f, 22f, 19.5f, 22f)
                reflectiveCurveTo(22f, 20.88f, 22f, 19.5f)
                curveTo(22f, 18.71f, 21.63f, 18f, 21f, 17.5f)
                moveTo(20f, 13f)
                horizontalLineTo(19f)
                verticalLineTo(6f)
                horizontalLineTo(20f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _HydraulicOilTemperature!!
    }

@Suppress("ObjectPropertyName")
private var _HydraulicOilTemperature: ImageVector? = null
