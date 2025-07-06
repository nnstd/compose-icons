package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WifiStrength3Lock: ImageVector
    get() {
        if (_WifiStrength3Lock != null) {
            return _WifiStrength3Lock!!
        }
        _WifiStrength3Lock = ImageVector.Builder(
            name = "WifiStrength3Lock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 10f)
                curveTo(19.68f, 10f, 20.32f, 10.14f, 20.91f, 10.39f)
                lineTo(23.64f, 7f)
                curveTo(20.31f, 4.41f, 16.2f, 3f, 12f, 3f)
                curveTo(7.78f, 3f, 3.69f, 4.41f, 0.365f, 7f)
                curveTo(4.39f, 12.06f, 7.88f, 16.37f, 12f, 21.5f)
                lineTo(13f, 20.24f)
                verticalLineTo(17.2f)
                curveTo(13f, 16.24f, 13.5f, 15.34f, 14.2f, 14.74f)
                verticalLineTo(14.5f)
                curveTo(14.2f, 12.06f, 16.4f, 10f, 19f, 10f)
                moveTo(12f, 8f)
                curveTo(9f, 8f, 6.67f, 9f, 5.2f, 9.84f)
                lineTo(3.26f, 7.44f)
                curveTo(5.9f, 5.85f, 8.91f, 5f, 12f, 5f)
                reflectiveCurveTo(18.08f, 5.86f, 20.7f, 7.45f)
                lineTo(18.76f, 9.88f)
                curveTo(17.25f, 9f, 14.87f, 8f, 12f, 8f)
                moveTo(21.8f, 16f)
                verticalLineTo(14.5f)
                curveTo(21.8f, 13.1f, 20.4f, 12f, 19f, 12f)
                reflectiveCurveTo(16.2f, 13.1f, 16.2f, 14.5f)
                verticalLineTo(16f)
                curveTo(15.6f, 16f, 15f, 16.6f, 15f, 17.2f)
                verticalLineTo(20.7f)
                curveTo(15f, 21.4f, 15.6f, 22f, 16.2f, 22f)
                horizontalLineTo(21.7f)
                curveTo(22.4f, 22f, 23f, 21.4f, 23f, 20.8f)
                verticalLineTo(17.3f)
                curveTo(23f, 16.6f, 22.4f, 16f, 21.8f, 16f)
                moveTo(20.5f, 16f)
                horizontalLineTo(17.5f)
                verticalLineTo(14.5f)
                curveTo(17.5f, 13.7f, 18.2f, 13.2f, 19f, 13.2f)
                reflectiveCurveTo(20.5f, 13.7f, 20.5f, 14.5f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _WifiStrength3Lock!!
    }

@Suppress("ObjectPropertyName")
private var _WifiStrength3Lock: ImageVector? = null
