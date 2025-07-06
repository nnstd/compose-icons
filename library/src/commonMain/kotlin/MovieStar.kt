package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MovieStar: ImageVector
    get() {
        if (_MovieStar != null) {
            return _MovieStar!!
        }
        _MovieStar = ImageVector.Builder(
            name = "MovieStar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 19f)
                curveTo(13f, 19.34f, 13.04f, 19.67f, 13.09f, 20f)
                horizontalLineTo(4f)
                curveTo(2.9f, 20f, 2f, 19.11f, 2f, 18f)
                verticalLineTo(6f)
                curveTo(2f, 4.89f, 2.9f, 4f, 4f, 4f)
                horizontalLineTo(5f)
                lineTo(7f, 8f)
                horizontalLineTo(10f)
                lineTo(8f, 4f)
                horizontalLineTo(10f)
                lineTo(12f, 8f)
                horizontalLineTo(15f)
                lineTo(13f, 4f)
                horizontalLineTo(15f)
                lineTo(17f, 8f)
                horizontalLineTo(20f)
                lineTo(18f, 4f)
                horizontalLineTo(22f)
                verticalLineTo(13.81f)
                curveTo(21.12f, 13.3f, 20.1f, 13f, 19f, 13f)
                curveTo(15.69f, 13f, 13f, 15.69f, 13f, 19f)
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

        return _MovieStar!!
    }

@Suppress("ObjectPropertyName")
private var _MovieStar: ImageVector? = null
