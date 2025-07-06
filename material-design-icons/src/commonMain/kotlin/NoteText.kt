package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NoteText: ImageVector
    get() {
        if (_NoteText != null) {
            return _NoteText!!
        }
        _NoteText = ImageVector.Builder(
            name = "NoteText",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 10f)
                horizontalLineTo(19.5f)
                lineTo(14f, 4.5f)
                verticalLineTo(10f)
                moveTo(5f, 3f)
                horizontalLineTo(15f)
                lineTo(21f, 9f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                horizontalLineTo(5f)
                curveTo(3.89f, 21f, 3f, 20.1f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.89f, 3.89f, 3f, 5f, 3f)
                moveTo(5f, 12f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                moveTo(5f, 16f)
                verticalLineTo(18f)
                horizontalLineTo(14f)
                verticalLineTo(16f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _NoteText!!
    }

@Suppress("ObjectPropertyName")
private var _NoteText: ImageVector? = null
