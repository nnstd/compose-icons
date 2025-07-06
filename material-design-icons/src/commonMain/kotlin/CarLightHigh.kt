package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarLightHigh: ImageVector
    get() {
        if (_CarLightHigh != null) {
            return _CarLightHigh!!
        }
        _CarLightHigh = ImageVector.Builder(
            name = "CarLightHigh",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 4.8f)
                curveTo(9f, 4.8f, 9f, 19.2f, 13f, 19.2f)
                curveTo(17f, 19.2f, 22f, 16.5f, 22f, 12f)
                curveTo(22f, 7.5f, 17f, 4.8f, 13f, 4.8f)
                moveTo(13.1f, 17.2f)
                curveTo(12.7f, 16.8f, 12f, 15f, 12f, 12f)
                curveTo(12f, 9f, 12.7f, 7.2f, 13.1f, 6.8f)
                curveTo(16f, 6.9f, 20f, 8.7f, 20f, 12f)
                curveTo(20f, 15.3f, 16f, 17.1f, 13.1f, 17.2f)
                moveTo(2f, 5f)
                horizontalLineTo(9.5f)
                curveTo(9.3f, 5.4f, 9f, 5.8f, 8.9f, 6.4f)
                curveTo(8.8f, 6.6f, 8.8f, 6.8f, 8.7f, 7f)
                horizontalLineTo(2f)
                verticalLineTo(5f)
                moveTo(8f, 11f)
                horizontalLineTo(2f)
                verticalLineTo(9f)
                horizontalLineTo(8.2f)
                curveTo(8.1f, 9.6f, 8.1f, 10.3f, 8f, 11f)
                moveTo(8.7f, 17f)
                curveTo(8.9f, 17.8f, 9.2f, 18.4f, 9.6f, 19f)
                horizontalLineTo(2.1f)
                verticalLineTo(17f)
                horizontalLineTo(8.7f)
                moveTo(8.2f, 15f)
                horizontalLineTo(2f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                curveTo(8.1f, 13.7f, 8.1f, 14.4f, 8.2f, 15f)
                close()
            }
        }.build()

        return _CarLightHigh!!
    }

@Suppress("ObjectPropertyName")
private var _CarLightHigh: ImageVector? = null
