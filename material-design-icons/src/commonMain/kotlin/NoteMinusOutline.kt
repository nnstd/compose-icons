package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NoteMinusOutline: ImageVector
    get() {
        if (_NoteMinusOutline != null) {
            return _NoteMinusOutline!!
        }
        _NoteMinusOutline = ImageVector.Builder(
            name = "NoteMinusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                verticalLineTo(18f)
                horizontalLineTo(23f)
                moveTo(13f, 19f)
                curveTo(13f, 19.7f, 13.13f, 20.37f, 13.35f, 21f)
                horizontalLineTo(5f)
                curveTo(3.89f, 21f, 3f, 20.1f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.89f, 3.89f, 3f, 5f, 3f)
                horizontalLineTo(15f)
                lineTo(21f, 9f)
                verticalLineTo(13.35f)
                curveTo(20.37f, 13.13f, 19.7f, 13f, 19f, 13f)
                verticalLineTo(12f)
                horizontalLineTo(12f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                moveTo(14f, 10f)
                horizontalLineTo(19.5f)
                lineTo(14f, 4.5f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _NoteMinusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _NoteMinusOutline: ImageVector? = null
