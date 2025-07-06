package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MushroomOff: ImageVector
    get() {
        if (_MushroomOff != null) {
            return _MushroomOff!!
        }
        _MushroomOff = ImageVector.Builder(
            name = "MushroomOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3f)
                lineTo(4.1f, 6f)
                curveTo(2.8f, 7.6f, 2f, 9.7f, 2f, 12f)
                curveTo(2f, 13.1f, 2.9f, 14f, 4f, 14f)
                horizontalLineTo(12.1f)
                lineTo(13.1f, 15f)
                horizontalLineTo(9f)
                lineTo(7.7f, 19.5f)
                verticalLineTo(20f)
                curveTo(7.7f, 21.1f, 8.6f, 22f, 9.7f, 22f)
                horizontalLineTo(14.4f)
                curveTo(15.5f, 22f, 16.4f, 21.1f, 16.4f, 20f)
                lineTo(16.3f, 19.5f)
                lineTo(15.8f, 17.7f)
                lineTo(20.9f, 22.8f)
                lineTo(22.1f, 21.5f)
                moveTo(7f, 12f)
                curveTo(5.9f, 12f, 5f, 11.1f, 5f, 10f)
                curveTo(5f, 9.2f, 5.5f, 8.4f, 6.3f, 8.1f)
                lineTo(8.9f, 10.7f)
                curveTo(8.6f, 11.5f, 7.8f, 12f, 7f, 12f)
                moveTo(10f, 6f)
                curveTo(10f, 4.9f, 10.9f, 4f, 12f, 4f)
                reflectiveCurveTo(14f, 4.9f, 14f, 6f)
                reflectiveCurveTo(13.1f, 8f, 12f, 8f)
                curveTo(11.5f, 8f, 11.1f, 7.8f, 10.7f, 7.5f)
                lineTo(17.2f, 14f)
                horizontalLineTo(20f)
                curveTo(21.1f, 14f, 22f, 13.1f, 22f, 12f)
                curveTo(22f, 6.5f, 17.5f, 2f, 12f, 2f)
                curveTo(10.1f, 2f, 8.3f, 2.6f, 6.7f, 3.5f)
                lineTo(10.4f, 7.2f)
                curveTo(10.2f, 6.9f, 10f, 6.5f, 10f, 6f)
                moveTo(17f, 8f)
                curveTo(18.1f, 8f, 19f, 8.9f, 19f, 10f)
                reflectiveCurveTo(18.1f, 12f, 17f, 12f)
                reflectiveCurveTo(15f, 11.1f, 15f, 10f)
                reflectiveCurveTo(15.9f, 8f, 17f, 8f)
                close()
            }
        }.build()

        return _MushroomOff!!
    }

@Suppress("ObjectPropertyName")
private var _MushroomOff: ImageVector? = null
