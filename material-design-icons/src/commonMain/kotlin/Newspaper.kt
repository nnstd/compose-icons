package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Newspaper: ImageVector
    get() {
        if (_Newspaper != null) {
            return _Newspaper!!
        }
        _Newspaper = ImageVector.Builder(
            name = "Newspaper",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 11f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                moveTo(20f, 15f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                moveTo(20f, 19f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                moveTo(11f, 19f)
                horizontalLineTo(4f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                moveTo(20.33f, 4.67f)
                lineTo(18.67f, 3f)
                lineTo(17f, 4.67f)
                lineTo(15.33f, 3f)
                lineTo(13.67f, 4.67f)
                lineTo(12f, 3f)
                lineTo(10.33f, 4.67f)
                lineTo(8.67f, 3f)
                lineTo(7f, 4.67f)
                lineTo(5.33f, 3f)
                lineTo(3.67f, 4.67f)
                lineTo(2f, 3f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 21f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 19f)
                verticalLineTo(3f)
                lineTo(20.33f, 4.67f)
                close()
            }
        }.build()

        return _Newspaper!!
    }

@Suppress("ObjectPropertyName")
private var _Newspaper: ImageVector? = null
