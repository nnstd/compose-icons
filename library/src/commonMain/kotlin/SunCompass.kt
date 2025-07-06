package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SunCompass: ImageVector
    get() {
        if (_SunCompass != null) {
            return _SunCompass!!
        }
        _SunCompass = ImageVector.Builder(
            name = "SunCompass",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.7f, 4.3f)
                lineTo(12f, 1f)
                lineTo(14.3f, 4.3f)
                curveTo(13.6f, 4.1f, 12.8f, 4f, 12f, 4f)
                reflectiveCurveTo(10.4f, 4.1f, 9.7f, 4.3f)
                moveTo(17.5f, 6.2f)
                curveTo(18.6f, 7.3f, 19.5f, 8.7f, 19.8f, 10.3f)
                lineTo(21.5f, 6.6f)
                lineTo(17.5f, 6.2f)
                moveTo(5f, 8.1f)
                curveTo(5.1f, 8f, 5.1f, 8f, 5f, 8.1f)
                curveTo(5.1f, 8f, 5.1f, 8f, 5.1f, 7.9f)
                curveTo(5.5f, 7.3f, 6f, 6.7f, 6.5f, 6.2f)
                lineTo(2.5f, 6.5f)
                lineTo(4.2f, 10.2f)
                curveTo(4.4f, 9.5f, 4.7f, 8.7f, 5f, 8.1f)
                moveTo(19.2f, 15.4f)
                curveTo(19.2f, 15.4f, 19.2f, 15.5f, 19.2f, 15.4f)
                curveTo(19.1f, 15.6f, 19f, 15.8f, 18.9f, 15.9f)
                verticalLineTo(16.1f)
                curveTo(18.5f, 16.8f, 18f, 17.3f, 17.5f, 17.9f)
                lineTo(21.6f, 17.6f)
                lineTo(19.9f, 13.9f)
                curveTo(19.7f, 14.4f, 19.5f, 14.9f, 19.2f, 15.4f)
                moveTo(5.2f, 16.2f)
                curveTo(5.2f, 16.1f, 5.1f, 16.1f, 5.1f, 16f)
                curveTo(5f, 15.9f, 5f, 15.9f, 5f, 15.8f)
                curveTo(4.9f, 15.6f, 4.8f, 15.5f, 4.8f, 15.3f)
                curveTo(4.6f, 14.8f, 4.4f, 14.3f, 4.3f, 13.8f)
                lineTo(2.6f, 17.5f)
                lineTo(6.7f, 17.8f)
                curveTo(6f, 17.3f, 5.6f, 16.8f, 5.2f, 16.2f)
                moveTo(12.6f, 20f)
                horizontalLineTo(11.4f)
                curveTo(10.8f, 20f, 10.2f, 19.8f, 9.7f, 19.7f)
                lineTo(12f, 23f)
                lineTo(14.3f, 19.7f)
                curveTo(13.8f, 19.8f, 13.2f, 19.9f, 12.6f, 20f)
                moveTo(16.2f, 7.8f)
                curveTo(13.9f, 5.5f, 10.1f, 5.5f, 7.7f, 7.8f)
                reflectiveCurveTo(5.4f, 13.9f, 7.7f, 16.3f)
                reflectiveCurveTo(13.8f, 18.6f, 16.2f, 16.3f)
                reflectiveCurveTo(18.6f, 10.1f, 16.2f, 7.8f)
                moveTo(8.5f, 15.5f)
                lineTo(10.6f, 10.6f)
                lineTo(15.6f, 8.4f)
                lineTo(13.5f, 13.3f)
                lineTo(8.5f, 15.5f)
                moveTo(12.7f, 12.7f)
                curveTo(12.3f, 13.1f, 11.7f, 13.1f, 11.3f, 12.7f)
                curveTo(10.9f, 12.3f, 10.9f, 11.7f, 11.3f, 11.3f)
                curveTo(11.7f, 10.9f, 12.3f, 10.9f, 12.7f, 11.3f)
                curveTo(13.1f, 11.7f, 13.1f, 12.3f, 12.7f, 12.7f)
                close()
            }
        }.build()

        return _SunCompass!!
    }

@Suppress("ObjectPropertyName")
private var _SunCompass: ImageVector? = null
