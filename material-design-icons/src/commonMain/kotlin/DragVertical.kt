package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DragVertical: ImageVector
    get() {
        if (_DragVertical != null) {
            return _DragVertical!!
        }
        _DragVertical = ImageVector.Builder(
            name = "DragVertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 3f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                moveTo(13f, 3f)
                horizontalLineTo(15f)
                verticalLineTo(5f)
                horizontalLineTo(13f)
                verticalLineTo(3f)
                moveTo(9f, 7f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                moveTo(13f, 7f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                moveTo(9f, 11f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                moveTo(13f, 11f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                moveTo(9f, 15f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                moveTo(13f, 15f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                moveTo(9f, 19f)
                horizontalLineTo(11f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                verticalLineTo(19f)
                moveTo(13f, 19f)
                horizontalLineTo(15f)
                verticalLineTo(21f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _DragVertical!!
    }

@Suppress("ObjectPropertyName")
private var _DragVertical: ImageVector? = null
