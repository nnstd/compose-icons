package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MovieOpenRemove: ImageVector
    get() {
        if (_MovieOpenRemove != null) {
            return _MovieOpenRemove!!
        }
        _MovieOpenRemove = ImageVector.Builder(
            name = "MovieOpenRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.75f, 7.46f)
                lineTo(12f, 3.93f)
                lineTo(13.97f, 3.54f)
                lineTo(16.71f, 7.07f)
                lineTo(14.75f, 7.46f)
                moveTo(11.81f, 8.05f)
                lineTo(9.07f, 4.5f)
                lineTo(7.1f, 4.91f)
                lineTo(9.85f, 8.44f)
                lineTo(11.81f, 8.05f)
                moveTo(21.62f, 6.1f)
                lineTo(20.84f, 2.18f)
                lineTo(16.91f, 2.96f)
                lineTo(19.65f, 6.5f)
                lineTo(21.62f, 6.1f)
                moveTo(19f, 13f)
                curveTo(20.1f, 13f, 21.12f, 13.3f, 22f, 13.81f)
                verticalLineTo(10f)
                horizontalLineTo(2f)
                verticalLineTo(20f)
                curveTo(2f, 21.11f, 2.9f, 22f, 4f, 22f)
                horizontalLineTo(13.81f)
                curveTo(13.3f, 21.12f, 13f, 20.1f, 13f, 19f)
                curveTo(13f, 15.69f, 15.69f, 13f, 19f, 13f)
                moveTo(4.16f, 5.5f)
                lineTo(3.18f, 5.69f)
                curveTo(2.1f, 5.91f, 1.4f, 6.96f, 1.61f, 8.04f)
                lineTo(2f, 10f)
                lineTo(6.9f, 9.03f)
                lineTo(4.16f, 5.5f)
                moveTo(22.54f, 16.88f)
                lineTo(21.12f, 15.47f)
                lineTo(19f, 17.59f)
                lineTo(16.88f, 15.47f)
                lineTo(15.47f, 16.88f)
                lineTo(17.59f, 19f)
                lineTo(15.47f, 21.12f)
                lineTo(16.88f, 22.54f)
                lineTo(19f, 20.41f)
                lineTo(21.12f, 22.54f)
                lineTo(22.54f, 21.12f)
                lineTo(20.41f, 19f)
                lineTo(22.54f, 16.88f)
                close()
            }
        }.build()

        return _MovieOpenRemove!!
    }

@Suppress("ObjectPropertyName")
private var _MovieOpenRemove: ImageVector? = null
