package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TextBoxRemove: ImageVector
    get() {
        if (_TextBoxRemove != null) {
            return _TextBoxRemove!!
        }
        _TextBoxRemove = ImageVector.Builder(
            name = "TextBoxRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.46f, 15.88f)
                lineTo(15.88f, 14.46f)
                lineTo(18f, 16.59f)
                lineTo(20.12f, 14.46f)
                lineTo(21.54f, 15.88f)
                lineTo(19.41f, 18f)
                lineTo(21.54f, 20.12f)
                lineTo(20.12f, 21.54f)
                lineTo(18f, 19.41f)
                lineTo(15.88f, 21.54f)
                lineTo(14.46f, 20.12f)
                lineTo(16.59f, 18f)
                lineTo(14.46f, 15.88f)
                moveTo(12f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(12f)
                moveTo(17f, 11f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(14.69f)
                curveTo(13.07f, 14.07f, 12f, 15.91f, 12f, 18f)
                curveTo(12f, 19.09f, 12.29f, 20.12f, 12.8f, 21f)
                horizontalLineTo(5f)
                curveTo(3.89f, 21f, 3f, 20.1f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.89f, 3.89f, 3f, 5f, 3f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                verticalLineTo(12.8f)
                curveTo(20.12f, 12.29f, 19.09f, 12f, 18f, 12f)
                lineTo(17f, 12.08f)
                verticalLineTo(11f)
                moveTo(17f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _TextBoxRemove!!
    }

@Suppress("ObjectPropertyName")
private var _TextBoxRemove: ImageVector? = null
