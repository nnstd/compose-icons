package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ReorderHorizontal: ImageVector
    get() {
        if (_ReorderHorizontal != null) {
            return _ReorderHorizontal!!
        }
        _ReorderHorizontal = ImageVector.Builder(
            name = "ReorderHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 15f)
                horizontalLineTo(21f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                verticalLineTo(15f)
                moveTo(3f, 19f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                moveTo(3f, 11f)
                horizontalLineTo(21f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                moveTo(3f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                close()
            }
        }.build()

        return _ReorderHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _ReorderHorizontal: ImageVector? = null
