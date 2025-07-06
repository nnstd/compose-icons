package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LightbulbNight: ImageVector
    get() {
        if (_LightbulbNight != null) {
            return _LightbulbNight!!
        }
        _LightbulbNight = ImageVector.Builder(
            name = "LightbulbNight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 21f)
                curveTo(6f, 21.55f, 6.45f, 22f, 7f, 22f)
                horizontalLineTo(11f)
                curveTo(11.55f, 22f, 12f, 21.55f, 12f, 21f)
                verticalLineTo(20f)
                horizontalLineTo(6f)
                verticalLineTo(21f)
                moveTo(13f, 16.32f)
                verticalLineTo(17f)
                curveTo(13f, 17.55f, 12.55f, 18f, 12f, 18f)
                horizontalLineTo(6f)
                curveTo(5.45f, 18f, 5f, 17.55f, 5f, 17f)
                verticalLineTo(14.74f)
                curveTo(3.19f, 13.47f, 2f, 11.38f, 2f, 9f)
                curveTo(2f, 5.13f, 5.13f, 2f, 9f, 2f)
                curveTo(10.65f, 2f, 12.16f, 2.57f, 13.35f, 3.5f)
                curveTo(10.8f, 4.57f, 9f, 7.07f, 9f, 10f)
                curveTo(9f, 12.79f, 10.64f, 15.19f, 13f, 16.32f)
                moveTo(20.92f, 9.94f)
                lineTo(19.5f, 9.03f)
                lineTo(18.1f, 10f)
                lineTo(18.5f, 8.35f)
                lineTo(17.17f, 7.32f)
                lineTo(18.85f, 7.21f)
                lineTo(19.41f, 5.6f)
                lineTo(20.04f, 7.18f)
                lineTo(21.72f, 7.22f)
                lineTo(20.42f, 8.3f)
                lineTo(20.92f, 9.94f)
                moveTo(19.39f, 13f)
                curveTo(17.5f, 15.27f, 14.03f, 15.19f, 12.22f, 12.95f)
                curveTo(10f, 10.13f, 11.56f, 6f, 15f, 5.34f)
                curveTo(15.34f, 5.29f, 15.64f, 5.63f, 15.5f, 5.97f)
                curveTo(15.05f, 7.25f, 15.12f, 8.71f, 15.85f, 9.97f)
                curveTo(16.58f, 11.24f, 17.79f, 12.03f, 19.12f, 12.25f)
                curveTo(19.47f, 12.3f, 19.62f, 12.74f, 19.39f, 13f)
                close()
            }
        }.build()

        return _LightbulbNight!!
    }

@Suppress("ObjectPropertyName")
private var _LightbulbNight: ImageVector? = null
