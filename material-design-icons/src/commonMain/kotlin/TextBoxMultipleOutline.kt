package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TextBoxMultipleOutline: ImageVector
    get() {
        if (_TextBoxMultipleOutline != null) {
            return _TextBoxMultipleOutline!!
        }
        _TextBoxMultipleOutline = ImageVector.Builder(
            name = "TextBoxMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 15f)
                horizontalLineTo(9f)
                verticalLineTo(13f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
                moveTo(19f, 11f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                moveTo(19f, 7f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                moveTo(3f, 5f)
                verticalLineTo(21f)
                horizontalLineTo(19f)
                verticalLineTo(23f)
                horizontalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 21f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                moveTo(21f, 1f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 3f)
                verticalLineTo(17f)
                curveTo(23f, 18.11f, 22.11f, 19f, 21f, 19f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 17f)
                verticalLineTo(3f)
                curveTo(5f, 1.89f, 5.89f, 1f, 7f, 1f)
                horizontalLineTo(21f)
                moveTo(7f, 3f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                verticalLineTo(3f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _TextBoxMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TextBoxMultipleOutline: ImageVector? = null
