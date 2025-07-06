package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NoteTextOutline: ImageVector
    get() {
        if (_NoteTextOutline != null) {
            return _NoteTextOutline!!
        }
        _NoteTextOutline = ImageVector.Builder(
            name = "NoteTextOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 3f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                verticalLineTo(9f)
                lineTo(15f, 3f)
                moveTo(19f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                horizontalLineTo(19f)
                moveTo(17f, 14f)
                horizontalLineTo(7f)
                verticalLineTo(12f)
                horizontalLineTo(17f)
                moveTo(14f, 17f)
                horizontalLineTo(7f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
            }
        }.build()

        return _NoteTextOutline!!
    }

@Suppress("ObjectPropertyName")
private var _NoteTextOutline: ImageVector? = null
