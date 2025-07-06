package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarLightFog: ImageVector
    get() {
        if (_CarLightFog != null) {
            return _CarLightFog!!
        }
        _CarLightFog = ImageVector.Builder(
            name = "CarLightFog",
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
                moveTo(6f, 8f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                curveTo(8f, 11.3f, 8f, 11.7f, 8f, 12f)
                curveTo(8f, 12.3f, 8f, 12.7f, 8f, 13f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                horizontalLineTo(8.4f)
                curveTo(8.6f, 16.7f, 8.8f, 17.4f, 9f, 18f)
                horizontalLineTo(6f)
                verticalLineTo(21f)
                horizontalLineTo(4f)
                verticalLineTo(18f)
                horizontalLineTo(2f)
                verticalLineTo(16f)
                horizontalLineTo(4f)
                verticalLineTo(13f)
                horizontalLineTo(2f)
                verticalLineTo(11f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineTo(2f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                verticalLineTo(3f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineTo(9f)
                curveTo(9f, 6.1f, 8.9f, 6.2f, 8.9f, 6.4f)
                curveTo(8.7f, 6.9f, 8.5f, 7.4f, 8.4f, 8f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _CarLightFog!!
    }

@Suppress("ObjectPropertyName")
private var _CarLightFog: ImageVector? = null
