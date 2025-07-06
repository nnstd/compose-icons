package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WifiStrength2Lock: ImageVector
    get() {
        if (_WifiStrength2Lock != null) {
            return _WifiStrength2Lock!!
        }
        _WifiStrength2Lock = ImageVector.Builder(
            name = "WifiStrength2Lock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.2f, 14.5f)
                verticalLineTo(14.74f)
                curveTo(13.5f, 15.34f, 13f, 16.24f, 13f, 17.2f)
                verticalLineTo(20.24f)
                lineTo(12f, 21.5f)
                curveTo(7.88f, 16.37f, 4.39f, 12.06f, 0.365f, 7f)
                curveTo(3.69f, 4.41f, 7.78f, 3f, 12f, 3f)
                curveTo(16.2f, 3f, 20.31f, 4.41f, 23.64f, 7f)
                lineTo(20.91f, 10.39f)
                curveTo(20.32f, 10.14f, 19.68f, 10f, 19f, 10f)
                curveTo(18.87f, 10f, 18.74f, 10.03f, 18.61f, 10.04f)
                lineTo(20.7f, 7.45f)
                curveTo(18.08f, 5.86f, 15.06f, 5f, 12f, 5f)
                reflectiveCurveTo(5.9f, 5.85f, 3.26f, 7.44f)
                lineTo(6.5f, 11.43f)
                curveTo(7.73f, 10.75f, 9.61f, 10f, 12f, 10f)
                curveTo(13.68f, 10f, 15.12f, 10.38f, 16.26f, 10.84f)
                curveTo(15.03f, 11.67f, 14.2f, 13f, 14.2f, 14.5f)
                moveTo(23f, 17.3f)
                verticalLineTo(20.8f)
                curveTo(23f, 21.4f, 22.4f, 22f, 21.7f, 22f)
                horizontalLineTo(16.2f)
                curveTo(15.6f, 22f, 15f, 21.4f, 15f, 20.7f)
                verticalLineTo(17.2f)
                curveTo(15f, 16.6f, 15.6f, 16f, 16.2f, 16f)
                verticalLineTo(14.5f)
                curveTo(16.2f, 13.1f, 17.6f, 12f, 19f, 12f)
                reflectiveCurveTo(21.8f, 13.1f, 21.8f, 14.5f)
                verticalLineTo(16f)
                curveTo(22.4f, 16f, 23f, 16.6f, 23f, 17.3f)
                moveTo(20.5f, 14.5f)
                curveTo(20.5f, 13.7f, 19.8f, 13.2f, 19f, 13.2f)
                reflectiveCurveTo(17.5f, 13.7f, 17.5f, 14.5f)
                verticalLineTo(16f)
                horizontalLineTo(20.5f)
                verticalLineTo(14.5f)
                close()
            }
        }.build()

        return _WifiStrength2Lock!!
    }

@Suppress("ObjectPropertyName")
private var _WifiStrength2Lock: ImageVector? = null
