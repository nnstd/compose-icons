package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NoteMultiple: ImageVector
    get() {
        if (_NoteMultiple != null) {
            return _NoteMultiple!!
        }
        _NoteMultiple = ImageVector.Builder(
            name = "NoteMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 9f)
                horizontalLineTo(21.5f)
                lineTo(16f, 3.5f)
                verticalLineTo(9f)
                moveTo(7f, 2f)
                horizontalLineTo(17f)
                lineTo(23f, 8f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 20f)
                horizontalLineTo(7f)
                curveTo(5.89f, 20f, 5f, 19.1f, 5f, 18f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 2f)
                moveTo(3f, 6f)
                verticalLineTo(22f)
                horizontalLineTo(21f)
                verticalLineTo(24f)
                horizontalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 22f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                close()
            }
        }.build()

        return _NoteMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _NoteMultiple: ImageVector? = null
