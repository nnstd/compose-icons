package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WifiArrowDown: ImageVector
    get() {
        if (_WifiArrowDown != null) {
            return _WifiArrowDown!!
        }
        _WifiArrowDown = ImageVector.Builder(
            name = "WifiArrowDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 6f)
                curveTo(8.62f, 6f, 5.5f, 7.12f, 3f, 9f)
                lineTo(1.2f, 6.6f)
                curveTo(4.21f, 4.34f, 7.95f, 3f, 12f, 3f)
                reflectiveCurveTo(19.79f, 4.34f, 22.8f, 6.6f)
                lineTo(21f, 9f)
                curveTo(18.5f, 7.12f, 15.38f, 6f, 12f, 6f)
                moveTo(12f, 15f)
                curveTo(10.65f, 15f, 9.4f, 15.45f, 8.4f, 16.2f)
                lineTo(12f, 21f)
                lineTo(13.04f, 19.61f)
                curveTo(13f, 19.41f, 13f, 19.21f, 13f, 19f)
                curveTo(13f, 17.66f, 13.44f, 16.43f, 14.19f, 15.43f)
                curveTo(13.5f, 15.16f, 12.77f, 15f, 12f, 15f)
                moveTo(16.84f, 13.41f)
                curveTo(17.18f, 13.27f, 17.55f, 13.17f, 17.92f, 13.1f)
                lineTo(19.2f, 11.4f)
                curveTo(17.19f, 9.89f, 14.7f, 9f, 12f, 9f)
                reflectiveCurveTo(6.81f, 9.89f, 4.8f, 11.4f)
                lineTo(6.6f, 13.8f)
                curveTo(8.1f, 12.67f, 9.97f, 12f, 12f, 12f)
                curveTo(13.78f, 12f, 15.44f, 12.5f, 16.84f, 13.41f)
                moveTo(20f, 16f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                lineTo(19f, 23f)
                lineTo(22f, 20f)
                horizontalLineTo(20f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _WifiArrowDown!!
    }

@Suppress("ObjectPropertyName")
private var _WifiArrowDown: ImageVector? = null
