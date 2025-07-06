package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DragVerticalVariant: ImageVector
    get() {
        if (_DragVerticalVariant != null) {
            return _DragVerticalVariant!!
        }
        _DragVerticalVariant = ImageVector.Builder(
            name = "DragVerticalVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 21f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                horizontalLineTo(11f)
                verticalLineTo(21f)
                moveTo(15f, 3f)
                horizontalLineTo(13f)
                verticalLineTo(21f)
                horizontalLineTo(15f)
                verticalLineTo(3f)
                close()
            }
        }.build()

        return _DragVerticalVariant!!
    }

@Suppress("ObjectPropertyName")
private var _DragVerticalVariant: ImageVector? = null
