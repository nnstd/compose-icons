package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MeterElectric: ImageVector
    get() {
        if (_MeterElectric != null) {
            return _MeterElectric!!
        }
        _MeterElectric = ImageVector.Builder(
            name = "MeterElectric",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(7.04f, 2f, 3f, 6.04f, 3f, 11f)
                curveTo(3f, 14.91f, 5.5f, 18.24f, 9f, 19.47f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                verticalLineTo(19.94f)
                curveTo(11.33f, 20f, 11.66f, 20f, 12f, 20f)
                reflectiveCurveTo(12.67f, 20f, 13f, 19.94f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                verticalLineTo(19.47f)
                curveTo(18.5f, 18.23f, 21f, 14.9f, 21f, 11f)
                curveTo(21f, 6.04f, 16.96f, 2f, 12f, 2f)
                moveTo(14.25f, 14f)
                lineTo(11.25f, 17f)
                lineTo(9.75f, 15.5f)
                lineTo(11f, 14.25f)
                lineTo(9.75f, 13f)
                lineTo(12.75f, 10f)
                lineTo(14.25f, 11.5f)
                lineTo(13f, 12.75f)
                lineTo(14.25f, 14f)
                moveTo(16f, 9f)
                horizontalLineTo(8f)
                verticalLineTo(7f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _MeterElectric!!
    }

@Suppress("ObjectPropertyName")
private var _MeterElectric: ImageVector? = null
