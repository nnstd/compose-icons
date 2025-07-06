package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ReorderVertical: ImageVector
    get() {
        if (_ReorderVertical != null) {
            return _ReorderVertical!!
        }
        _ReorderVertical = ImageVector.Builder(
            name = "ReorderVertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 3f)
                verticalLineTo(21f)
                horizontalLineTo(11f)
                verticalLineTo(3f)
                horizontalLineTo(9f)
                moveTo(5f, 3f)
                verticalLineTo(21f)
                horizontalLineTo(7f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                moveTo(13f, 3f)
                verticalLineTo(21f)
                horizontalLineTo(15f)
                verticalLineTo(3f)
                horizontalLineTo(13f)
                moveTo(19f, 3f)
                horizontalLineTo(17f)
                verticalLineTo(21f)
                horizontalLineTo(19f)
                verticalLineTo(3f)
                close()
            }
        }.build()

        return _ReorderVertical!!
    }

@Suppress("ObjectPropertyName")
private var _ReorderVertical: ImageVector? = null
