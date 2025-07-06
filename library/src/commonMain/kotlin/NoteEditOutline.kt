package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NoteEditOutline: ImageVector
    get() {
        if (_NoteEditOutline != null) {
            return _NoteEditOutline!!
        }
        _NoteEditOutline = ImageVector.Builder(
            name = "NoteEditOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.13f, 12f)
                lineTo(19.39f, 10.74f)
                curveTo(19.83f, 10.3f, 20.39f, 10.06f, 21f, 10f)
                verticalLineTo(9f)
                lineTo(15f, 3f)
                horizontalLineTo(5f)
                curveTo(3.89f, 3f, 3f, 3.89f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.89f, 21f, 5f, 21f)
                horizontalLineTo(11f)
                verticalLineTo(19.13f)
                lineTo(11.13f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(12f)
                verticalLineTo(12f)
                horizontalLineTo(18.13f)
                moveTo(14f, 4.5f)
                lineTo(19.5f, 10f)
                horizontalLineTo(14f)
                verticalLineTo(4.5f)
                moveTo(19.13f, 13.83f)
                lineTo(21.17f, 15.87f)
                lineTo(15.04f, 22f)
                horizontalLineTo(13f)
                verticalLineTo(19.96f)
                lineTo(19.13f, 13.83f)
                moveTo(22.85f, 14.19f)
                lineTo(21.87f, 15.17f)
                lineTo(19.83f, 13.13f)
                lineTo(20.81f, 12.15f)
                curveTo(21f, 11.95f, 21.33f, 11.95f, 21.53f, 12.15f)
                lineTo(22.85f, 13.47f)
                curveTo(23.05f, 13.67f, 23.05f, 14f, 22.85f, 14.19f)
                close()
            }
        }.build()

        return _NoteEditOutline!!
    }

@Suppress("ObjectPropertyName")
private var _NoteEditOutline: ImageVector? = null
