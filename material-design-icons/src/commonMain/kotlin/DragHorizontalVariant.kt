package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DragHorizontalVariant: ImageVector
    get() {
        if (_DragHorizontalVariant != null) {
            return _DragHorizontalVariant!!
        }
        _DragHorizontalVariant = ImageVector.Builder(
            name = "DragHorizontalVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 11f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                moveTo(21f, 13f)
                horizontalLineTo(3f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _DragHorizontalVariant!!
    }

@Suppress("ObjectPropertyName")
private var _DragHorizontalVariant: ImageVector? = null
