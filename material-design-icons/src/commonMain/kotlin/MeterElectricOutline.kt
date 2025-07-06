package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MeterElectricOutline: ImageVector
    get() {
        if (_MeterElectricOutline != null) {
            return _MeterElectricOutline!!
        }
        _MeterElectricOutline = ImageVector.Builder(
            name = "MeterElectricOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 11f)
                curveTo(21f, 6.03f, 16.97f, 2f, 12f, 2f)
                reflectiveCurveTo(3f, 6.03f, 3f, 11f)
                curveTo(3f, 14.92f, 5.5f, 18.24f, 9f, 19.5f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                verticalLineTo(19.94f)
                curveTo(11.33f, 20f, 11.66f, 20f, 12f, 20f)
                reflectiveCurveTo(12.67f, 20f, 13f, 19.94f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                verticalLineTo(19.5f)
                curveTo(18.5f, 18.24f, 21f, 14.92f, 21f, 11f)
                moveTo(12f, 18f)
                curveTo(8.14f, 18f, 5f, 14.86f, 5f, 11f)
                reflectiveCurveTo(8.14f, 4f, 12f, 4f)
                reflectiveCurveTo(19f, 7.14f, 19f, 11f)
                reflectiveCurveTo(15.86f, 18f, 12f, 18f)
                moveTo(8f, 7f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                verticalLineTo(7f)
                moveTo(12.75f, 10f)
                lineTo(9.75f, 13f)
                lineTo(11f, 14.25f)
                lineTo(9.75f, 15.5f)
                lineTo(11.25f, 17f)
                lineTo(14.25f, 14f)
                lineTo(13f, 12.75f)
                lineTo(14.25f, 11.5f)
                lineTo(12.75f, 10f)
                close()
            }
        }.build()

        return _MeterElectricOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MeterElectricOutline: ImageVector? = null
