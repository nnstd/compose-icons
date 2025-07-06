package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MusicNoteWhole: ImageVector
    get() {
        if (_MusicNoteWhole != null) {
            return _MusicNoteWhole!!
        }
        _MusicNoteWhole = ImageVector.Builder(
            name = "MusicNoteWhole",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 10f, 17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
                moveTo(12f, 13f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 16f, 17f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 13f)
                close()
            }
        }.build()

        return _MusicNoteWhole!!
    }

@Suppress("ObjectPropertyName")
private var _MusicNoteWhole: ImageVector? = null
