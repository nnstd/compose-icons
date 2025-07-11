package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Copyleft: ImageVector
    get() {
        if (_Copyleft != null) {
            return _Copyleft!!
        }
        _Copyleft = ImageVector.Builder(
            name = "Copyleft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.92f, 10.86f)
                curveTo(14.04f, 11.85f, 14.12f, 13.1f, 13.62f, 14f)
                curveTo(13.5f, 14.27f, 13.28f, 14.5f, 13.03f, 14.64f)
                curveTo(12.8f, 14.79f, 12.5f, 14.86f, 12.14f, 14.87f)
                curveTo(11.72f, 14.87f, 11.33f, 14.73f, 11f, 14.47f)
                curveTo(10.87f, 14.34f, 10.75f, 14.19f, 10.66f, 14f)
                curveTo(10.57f, 13.83f, 10.5f, 13.64f, 10.5f, 13.43f)
                horizontalLineTo(8.72f)
                curveTo(8.73f, 13.84f, 8.84f, 14.22f, 9f, 14.58f)
                curveTo(9.2f, 14.94f, 9.45f, 15.25f, 9.76f, 15.5f)
                curveTo(11.2f, 16.83f, 13.85f, 16.62f, 15.06f, 15.13f)
                curveTo(16.37f, 13.46f, 16.34f, 10.54f, 15.05f, 8.87f)
                curveTo(13.83f, 7.35f, 11.13f, 7.16f, 9.68f, 8.5f)
                curveTo(9.38f, 8.78f, 9.15f, 9.12f, 9f, 9.5f)
                curveTo(8.81f, 9.9f, 8.72f, 10.33f, 8.7f, 10.8f)
                horizontalLineTo(10.5f)
                curveTo(10.5f, 10.37f, 10.69f, 9.94f, 10.97f, 9.63f)
                curveTo(11.26f, 9.34f, 11.67f, 9.14f, 12.12f, 9.14f)
                curveTo(12.81f, 9.15f, 13.33f, 9.44f, 13.62f, 10f)
                curveTo(13.76f, 10.24f, 13.87f, 10.53f, 13.92f, 10.86f)
                moveTo(12f, 2f)
                curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                curveTo(2.53f, 25.26f, 21.47f, 25.27f, 22f, 12f)
                curveTo(22f, 6.5f, 17.5f, 2f, 12f, 2f)
                moveTo(4f, 12f)
                curveTo(4.44f, 1.39f, 19.56f, 1.39f, 20f, 12f)
                curveTo(20f, 16.41f, 16.41f, 20f, 12f, 20f)
                reflectiveCurveTo(4f, 16.41f, 4f, 12f)
                close()
            }
        }.build()

        return _Copyleft!!
    }

@Suppress("ObjectPropertyName")
private var _Copyleft: ImageVector? = null
