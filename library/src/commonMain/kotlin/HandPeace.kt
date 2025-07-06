package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HandPeace: ImageVector
    get() {
        if (_HandPeace != null) {
            return _HandPeace!!
        }
        _HandPeace = ImageVector.Builder(
            name = "HandPeace",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 19f)
                horizontalLineTo(15f)
                verticalLineTo(22f)
                horizontalLineTo(7f)
                verticalLineTo(19f)
                moveTo(16.15f, 12f)
                verticalLineTo(12f)
                lineTo(12.97f, 10.34f)
                curveTo(12.82f, 10.34f, 12.69f, 10.4f, 12.6f, 10.5f)
                lineTo(12.3f, 10.81f)
                lineTo(12.89f, 13.23f)
                lineTo(11.91f, 13.47f)
                lineTo(10.72f, 8.5f)
                lineTo(9.25f, 9.18f)
                lineTo(10.29f, 13.47f)
                lineTo(9.32f, 13.7f)
                lineTo(8.32f, 9.59f)
                lineTo(7.85f, 9.8f)
                curveTo(7.35f, 10f, 7f, 10.53f, 7f, 11.14f)
                verticalLineTo(15.5f)
                curveTo(7f, 16.3f, 7.73f, 17f, 8.5f, 17f)
                horizontalLineTo(15f)
                curveTo(15.39f, 17f, 15.74f, 16.84f, 16f, 16.57f)
                lineTo(16.5f, 16.16f)
                curveTo(16.5f, 16.16f, 17f, 15.78f, 17f, 15.36f)
                verticalLineTo(13.7f)
                curveTo(17f, 13.7f, 17f, 12.56f, 16.15f, 12f)
                moveTo(16.94f, 1f)
                curveTo(16.4f, 0.91f, 15.87f, 1.25f, 15.76f, 1.8f)
                lineTo(14.69f, 7.97f)
                curveTo(14.47f, 7.94f, 14.38f, 7.86f, 14.08f, 7.83f)
                lineTo(13.65f, 7.88f)
                lineTo(12.41f, 1.8f)
                curveTo(12.3f, 1.26f, 11.78f, 0.91f, 11.24f, 1f)
                curveTo(10.69f, 1.13f, 10.34f, 1.66f, 10.45f, 2.2f)
                lineTo(11.65f, 8.11f)
                verticalLineTo(8.11f)
                lineTo(12f, 9.67f)
                curveTo(12.28f, 9.47f, 12.61f, 9.34f, 12.97f, 9.34f)
                horizontalLineTo(13.31f)
                lineTo(16.31f, 10.95f)
                lineTo(17.72f, 2.2f)
                curveTo(17.83f, 1.66f, 17.5f, 1.13f, 16.94f, 1f)
                close()
            }
        }.build()

        return _HandPeace!!
    }

@Suppress("ObjectPropertyName")
private var _HandPeace: ImageVector? = null
