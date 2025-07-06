package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MovieOpenStar: ImageVector
    get() {
        if (_MovieOpenStar != null) {
            return _MovieOpenStar!!
        }
        _MovieOpenStar = ImageVector.Builder(
            name = "MovieOpenStar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.65f, 6.5f)
                lineTo(16.91f, 2.96f)
                lineTo(20.84f, 2.18f)
                lineTo(21.62f, 6.1f)
                lineTo(19.65f, 6.5f)
                moveTo(16.71f, 7.07f)
                lineTo(13.97f, 3.54f)
                lineTo(12f, 3.93f)
                lineTo(14.75f, 7.46f)
                lineTo(16.71f, 7.07f)
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
                moveTo(11.81f, 8.05f)
                lineTo(9.07f, 4.5f)
                lineTo(7.1f, 4.91f)
                lineTo(9.85f, 8.44f)
                lineTo(11.81f, 8.05f)
                moveTo(23f, 17.89f)
                lineTo(20.11f, 17.64f)
                lineTo(19f, 15f)
                lineTo(17.87f, 17.64f)
                lineTo(15f, 17.89f)
                lineTo(17.18f, 19.77f)
                lineTo(16.5f, 22.58f)
                lineTo(19f, 21.09f)
                lineTo(21.45f, 22.58f)
                lineTo(20.8f, 19.77f)
                lineTo(23f, 17.89f)
                close()
            }
        }.build()

        return _MovieOpenStar!!
    }

@Suppress("ObjectPropertyName")
private var _MovieOpenStar: ImageVector? = null
