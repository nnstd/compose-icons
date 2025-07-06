package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WifiArrowLeftRight: ImageVector
    get() {
        if (_WifiArrowLeftRight != null) {
            return _WifiArrowLeftRight!!
        }
        _WifiArrowLeftRight = ImageVector.Builder(
            name = "WifiArrowLeftRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 12f)
                curveTo(9.97f, 12f, 8.1f, 12.67f, 6.6f, 13.8f)
                lineTo(4.8f, 11.4f)
                curveTo(6.81f, 9.89f, 9.3f, 9f, 12f, 9f)
                reflectiveCurveTo(17.19f, 9.89f, 19.2f, 11.4f)
                lineTo(17.92f, 13.1f)
                curveTo(17.55f, 13.17f, 17.18f, 13.27f, 16.84f, 13.41f)
                curveTo(15.44f, 12.5f, 13.78f, 12f, 12f, 12f)
                moveTo(21f, 9f)
                lineTo(22.8f, 6.6f)
                curveTo(19.79f, 4.34f, 16.05f, 3f, 12f, 3f)
                reflectiveCurveTo(4.21f, 4.34f, 1.2f, 6.6f)
                lineTo(3f, 9f)
                curveTo(5.5f, 7.12f, 8.62f, 6f, 12f, 6f)
                reflectiveCurveTo(18.5f, 7.12f, 21f, 9f)
                moveTo(12f, 15f)
                curveTo(10.65f, 15f, 9.4f, 15.45f, 8.4f, 16.2f)
                lineTo(12f, 21f)
                lineTo(13.04f, 19.61f)
                curveTo(13f, 19.41f, 13f, 19.21f, 13f, 19f)
                curveTo(13f, 17.66f, 13.44f, 16.43f, 14.19f, 15.43f)
                curveTo(13.5f, 15.16f, 12.77f, 15f, 12f, 15f)
                moveTo(18f, 18.5f)
                lineTo(15f, 21f)
                lineTo(18f, 23.5f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(18.5f)
                moveTo(23f, 17f)
                lineTo(20f, 14.5f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(19.5f)
                lineTo(23f, 17f)
                close()
            }
        }.build()

        return _WifiArrowLeftRight!!
    }

@Suppress("ObjectPropertyName")
private var _WifiArrowLeftRight: ImageVector? = null
