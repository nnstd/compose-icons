package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LightbulbNightOutline: ImageVector
    get() {
        if (_LightbulbNightOutline != null) {
            return _LightbulbNightOutline!!
        }
        _LightbulbNightOutline = ImageVector.Builder(
            name = "LightbulbNightOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 20f)
                horizontalLineTo(12f)
                verticalLineTo(21f)
                curveTo(12f, 21.55f, 11.55f, 22f, 11f, 22f)
                horizontalLineTo(7f)
                curveTo(6.45f, 22f, 6f, 21.55f, 6f, 21f)
                verticalLineTo(20f)
                moveTo(11f, 14.89f)
                verticalLineTo(16f)
                horizontalLineTo(7f)
                verticalLineTo(13.58f)
                curveTo(5.23f, 12.81f, 4f, 11.05f, 4f, 9f)
                curveTo(4f, 6.24f, 6.24f, 4f, 9f, 4f)
                curveTo(9.9f, 4f, 10.73f, 4.26f, 11.46f, 4.67f)
                curveTo(12f, 4.2f, 12.66f, 3.81f, 13.35f, 3.5f)
                curveTo(12.16f, 2.57f, 10.65f, 2f, 9f, 2f)
                curveTo(5.13f, 2f, 2f, 5.13f, 2f, 9f)
                curveTo(2f, 11.38f, 3.19f, 13.47f, 5f, 14.74f)
                verticalLineTo(17f)
                curveTo(5f, 17.55f, 5.45f, 18f, 6f, 18f)
                horizontalLineTo(12f)
                curveTo(12.55f, 18f, 13f, 17.55f, 13f, 17f)
                verticalLineTo(16.32f)
                curveTo(12.25f, 15.96f, 11.57f, 15.5f, 11f, 14.89f)
                moveTo(20.92f, 9.94f)
                lineTo(20.42f, 8.3f)
                lineTo(21.72f, 7.22f)
                lineTo(20.04f, 7.18f)
                lineTo(19.41f, 5.6f)
                lineTo(18.85f, 7.21f)
                lineTo(17.17f, 7.32f)
                lineTo(18.5f, 8.35f)
                lineTo(18.1f, 10f)
                lineTo(19.5f, 9.03f)
                lineTo(20.92f, 9.94f)
                moveTo(19.12f, 12.25f)
                curveTo(17.79f, 12.03f, 16.58f, 11.24f, 15.85f, 9.97f)
                curveTo(15.12f, 8.71f, 15.05f, 7.25f, 15.5f, 5.97f)
                curveTo(15.64f, 5.63f, 15.34f, 5.29f, 15f, 5.34f)
                curveTo(11.56f, 6f, 10f, 10.13f, 12.22f, 12.95f)
                curveTo(14.03f, 15.19f, 17.5f, 15.27f, 19.39f, 13f)
                curveTo(19.62f, 12.74f, 19.47f, 12.3f, 19.12f, 12.25f)
                close()
            }
        }.build()

        return _LightbulbNightOutline!!
    }

@Suppress("ObjectPropertyName")
private var _LightbulbNightOutline: ImageVector? = null
