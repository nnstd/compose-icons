package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TextBoxMinus: ImageVector
    get() {
        if (_TextBoxMinus != null) {
            return _TextBoxMinus!!
        }
        _TextBoxMinus = ImageVector.Builder(
            name = "TextBoxMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
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

        return _TextBoxMinus!!
    }

@Suppress("ObjectPropertyName")
private var _TextBoxMinus: ImageVector? = null
