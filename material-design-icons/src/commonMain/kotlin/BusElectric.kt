package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BusElectric: ImageVector
    get() {
        if (_BusElectric != null) {
            return _BusElectric!!
        }
        _BusElectric = ImageVector.Builder(
            name = "BusElectric",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 8f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(18f)
                moveTo(16.5f, 14f)
                curveTo(15.7f, 14f, 15f, 13.3f, 15f, 12.5f)
                curveTo(15f, 11.7f, 15.7f, 11f, 16.5f, 11f)
                curveTo(17.3f, 11f, 18f, 11.7f, 18f, 12.5f)
                curveTo(18f, 13.3f, 17.3f, 14f, 16.5f, 14f)
                moveTo(7.5f, 14f)
                curveTo(6.7f, 14f, 6f, 13.3f, 6f, 12.5f)
                curveTo(6f, 11.7f, 6.7f, 11f, 7.5f, 11f)
                reflectiveCurveTo(9f, 11.7f, 9f, 12.5f)
                curveTo(9f, 13.3f, 8.3f, 14f, 7.5f, 14f)
                moveTo(4f, 13f)
                curveTo(4f, 13.9f, 4.4f, 14.7f, 5f, 15.2f)
                verticalLineTo(17f)
                curveTo(5f, 17.6f, 5.4f, 18f, 6f, 18f)
                horizontalLineTo(7f)
                curveTo(7.6f, 18f, 8f, 17.6f, 8f, 17f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                verticalLineTo(17f)
                curveTo(16f, 17.6f, 16.4f, 18f, 17f, 18f)
                horizontalLineTo(18f)
                curveTo(18.6f, 18f, 19f, 17.6f, 19f, 17f)
                verticalLineTo(15.2f)
                curveTo(19.6f, 14.7f, 20f, 13.9f, 20f, 13f)
                verticalLineTo(4f)
                curveTo(20f, 0.5f, 16.4f, 0f, 12f, 0f)
                reflectiveCurveTo(4f, 0.5f, 4f, 4f)
                verticalLineTo(13f)
                moveTo(7f, 21f)
                horizontalLineTo(11f)
                verticalLineTo(19f)
                lineTo(17f, 22f)
                horizontalLineTo(13f)
                verticalLineTo(24f)
                lineTo(7f, 21f)
                close()
            }
        }.build()

        return _BusElectric!!
    }

@Suppress("ObjectPropertyName")
private var _BusElectric: ImageVector? = null
