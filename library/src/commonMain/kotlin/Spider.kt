package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Spider: ImageVector
    get() {
        if (_Spider != null) {
            return _Spider!!
        }
        _Spider = ImageVector.Builder(
            name = "Spider",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.29f, 16.71f)
                lineTo(22.71f, 15.29f)
                lineTo(19.5f, 12.11f)
                lineTo(16.5f, 11.26f)
                lineTo(18.41f, 11f)
                lineTo(22.6f, 7.8f)
                lineTo(21.4f, 6.2f)
                lineTo(17.59f, 9.05f)
                lineTo(14.91f, 9.5f)
                lineTo(18.11f, 6.31f)
                lineTo(17f, 1.76f)
                lineTo(15f, 2.24f)
                lineTo(15.86f, 5.69f)
                lineTo(14.76f, 6.83f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.24f, 6.83f)
                lineTo(8.11f, 5.69f)
                lineTo(9f, 2.24f)
                lineTo(7f, 1.76f)
                lineTo(5.89f, 6.31f)
                lineTo(9.09f, 9.5f)
                lineTo(6.4f, 9.05f)
                lineTo(2.6f, 6.2f)
                lineTo(1.4f, 7.8f)
                lineTo(5.6f, 11f)
                lineTo(7.46f, 11.31f)
                lineTo(4.46f, 12.16f)
                lineTo(1.29f, 15.29f)
                lineTo(2.71f, 16.71f)
                lineTo(5.5f, 13.89f)
                lineTo(7.87f, 13.22f)
                lineTo(4f, 16.54f)
                verticalLineTo(22f)
                horizontalLineTo(6f)
                verticalLineTo(17.46f)
                lineTo(7.56f, 16.12f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.44f, 16.12f)
                lineTo(18f, 17.46f)
                verticalLineTo(22f)
                horizontalLineTo(20f)
                verticalLineTo(16.54f)
                lineTo(16.13f, 13.22f)
                lineTo(18.5f, 13.89f)
                close()
            }
        }.build()

        return _Spider!!
    }

@Suppress("ObjectPropertyName")
private var _Spider: ImageVector? = null
