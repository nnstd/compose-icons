package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WifiRefresh: ImageVector
    get() {
        if (_WifiRefresh != null) {
            return _WifiRefresh!!
        }
        _WifiRefresh = ImageVector.Builder(
            name = "WifiRefresh",
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
                lineTo(18.74f, 12f)
                curveTo(18.66f, 12f, 18.58f, 12f, 18.5f, 12f)
                curveTo(17.43f, 12f, 16.42f, 12.26f, 15.53f, 12.72f)
                curveTo(14.45f, 12.26f, 13.26f, 12f, 12f, 12f)
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
                lineTo(12.34f, 20.54f)
                curveTo(12.13f, 19.9f, 12f, 19.22f, 12f, 18.5f)
                curveTo(12f, 17.24f, 12.36f, 16.08f, 13f, 15.08f)
                curveTo(12.66f, 15.03f, 12.33f, 15f, 12f, 15f)
                moveTo(18f, 14.5f)
                curveTo(15.79f, 14.5f, 14f, 16.29f, 14f, 18.5f)
                reflectiveCurveTo(15.79f, 22.5f, 18f, 22.5f)
                curveTo(19.68f, 22.5f, 21.12f, 21.47f, 21.71f, 20f)
                horizontalLineTo(20f)
                curveTo(19.54f, 20.61f, 18.82f, 21f, 18f, 21f)
                curveTo(16.62f, 21f, 15.5f, 19.88f, 15.5f, 18.5f)
                reflectiveCurveTo(16.62f, 16f, 18f, 16f)
                curveTo(18.69f, 16f, 19.32f, 16.28f, 19.77f, 16.73f)
                lineTo(18f, 18.5f)
                horizontalLineTo(22f)
                verticalLineTo(14.5f)
                lineTo(20.83f, 15.67f)
                curveTo(20.11f, 14.95f, 19.11f, 14.5f, 18f, 14.5f)
                close()
            }
        }.build()

        return _WifiRefresh!!
    }

@Suppress("ObjectPropertyName")
private var _WifiRefresh: ImageVector? = null
