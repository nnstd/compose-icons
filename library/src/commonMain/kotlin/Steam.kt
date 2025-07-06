package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Steam: ImageVector
    get() {
        if (_Steam != null) {
            return _Steam!!
        }
        _Steam = ImageVector.Builder(
            name = "Steam",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                curveTo(7.4f, 22f, 3.55f, 18.92f, 2.36f, 14.73f)
                lineTo(6.19f, 16.31f)
                curveTo(6.45f, 17.6f, 7.6f, 18.58f, 8.97f, 18.58f)
                curveTo(10.53f, 18.58f, 11.8f, 17.31f, 11.8f, 15.75f)
                verticalLineTo(15.62f)
                lineTo(15.2f, 13.19f)
                horizontalLineTo(15.28f)
                curveTo(17.36f, 13.19f, 19.05f, 11.5f, 19.05f, 9.42f)
                curveTo(19.05f, 7.34f, 17.36f, 5.65f, 15.28f, 5.65f)
                curveTo(13.2f, 5.65f, 11.5f, 7.34f, 11.5f, 9.42f)
                verticalLineTo(9.47f)
                lineTo(9.13f, 12.93f)
                lineTo(8.97f, 12.92f)
                curveTo(8.38f, 12.92f, 7.83f, 13.1f, 7.38f, 13.41f)
                lineTo(2f, 11.2f)
                curveTo(2.43f, 6.05f, 6.73f, 2f, 12f, 2f)
                moveTo(8.28f, 17.17f)
                curveTo(9.08f, 17.5f, 10f, 17.13f, 10.33f, 16.33f)
                curveTo(10.66f, 15.53f, 10.28f, 14.62f, 9.5f, 14.29f)
                lineTo(8.22f, 13.76f)
                curveTo(8.71f, 13.58f, 9.26f, 13.57f, 9.78f, 13.79f)
                curveTo(10.31f, 14f, 10.72f, 14.41f, 10.93f, 14.94f)
                curveTo(11.15f, 15.46f, 11.15f, 16.04f, 10.93f, 16.56f)
                curveTo(10.5f, 17.64f, 9.23f, 18.16f, 8.15f, 17.71f)
                curveTo(7.65f, 17.5f, 7.27f, 17.12f, 7.06f, 16.67f)
                lineTo(8.28f, 17.17f)
                moveTo(17.8f, 9.42f)
                curveTo(17.8f, 10.81f, 16.67f, 11.94f, 15.28f, 11.94f)
                curveTo(13.9f, 11.94f, 12.77f, 10.81f, 12.77f, 9.42f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.28f, 6.91f)
                curveTo(16.67f, 6.91f, 17.8f, 8.04f, 17.8f, 9.42f)
                moveTo(13.4f, 9.42f)
                curveTo(13.4f, 10.46f, 14.24f, 11.31f, 15.29f, 11.31f)
                curveTo(16.33f, 11.31f, 17.17f, 10.46f, 17.17f, 9.42f)
                curveTo(17.17f, 8.38f, 16.33f, 7.53f, 15.29f, 7.53f)
                curveTo(14.24f, 7.53f, 13.4f, 8.38f, 13.4f, 9.42f)
                close()
            }
        }.build()

        return _Steam!!
    }

@Suppress("ObjectPropertyName")
private var _Steam: ImageVector? = null
