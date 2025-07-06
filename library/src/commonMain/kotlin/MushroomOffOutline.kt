package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MushroomOffOutline: ImageVector
    get() {
        if (_MushroomOffOutline != null) {
            return _MushroomOffOutline!!
        }
        _MushroomOffOutline = ImageVector.Builder(
            name = "MushroomOffOutline",
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
                lineTo(8f, 18.5f)
                lineTo(7.7f, 19.5f)
                curveTo(7.4f, 20.6f, 8.1f, 21.7f, 9.1f, 21.9f)
                lineTo(9.7f, 22f)
                horizontalLineTo(14.4f)
                curveTo(15.5f, 22f, 16.4f, 21.1f, 16.4f, 20f)
                lineTo(16.3f, 19.5f)
                lineTo(16f, 18.5f)
                lineTo(15.8f, 17.6f)
                lineTo(20.9f, 22.7f)
                lineTo(22.1f, 21.5f)
                moveTo(4f, 12f)
                curveTo(4f, 10.3f, 4.6f, 8.7f, 5.5f, 7.4f)
                lineTo(6.2f, 8.1f)
                curveTo(6.1f, 8.4f, 6f, 8.7f, 6f, 9f)
                curveTo(6f, 10.1f, 6.9f, 11f, 8f, 11f)
                curveTo(8.3f, 11f, 8.6f, 10.9f, 8.9f, 10.8f)
                lineTo(10.1f, 12f)
                horizontalLineTo(4f)
                moveTo(9.7f, 20f)
                lineTo(10f, 19f)
                lineTo(10.6f, 17f)
                horizontalLineTo(13.6f)
                lineTo(14.2f, 19f)
                lineTo(14.5f, 20f)
                horizontalLineTo(9.7f)
                moveTo(16f, 11f)
                curveTo(14.9f, 11f, 14f, 10.1f, 14f, 9f)
                reflectiveCurveTo(14.9f, 7f, 16f, 7f)
                reflectiveCurveTo(18f, 7.9f, 18f, 9f)
                reflectiveCurveTo(17.1f, 11f, 16f, 11f)
                moveTo(8.2f, 5f)
                lineTo(6.7f, 3.5f)
                curveTo(8.3f, 2.6f, 10.1f, 2f, 12f, 2f)
                curveTo(17.5f, 2f, 22f, 6.5f, 22f, 12f)
                curveTo(22f, 13.1f, 21.1f, 14f, 20f, 14f)
                horizontalLineTo(17.2f)
                lineTo(15.2f, 12f)
                horizontalLineTo(20f)
                curveTo(20f, 8.3f, 17.4f, 5.1f, 14f, 4.2f)
                curveTo(13.9f, 5.2f, 13f, 6f, 12f, 6f)
                reflectiveCurveTo(10.1f, 5.2f, 10f, 4.2f)
                curveTo(9.4f, 4.4f, 8.7f, 4.7f, 8.2f, 5f)
                close()
            }
        }.build()

        return _MushroomOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MushroomOffOutline: ImageVector? = null
