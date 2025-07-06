package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MusicNoteWholeDotted: ImageVector
    get() {
        if (_MusicNoteWholeDotted != null) {
            return _MusicNoteWholeDotted!!
        }
        _MusicNoteWholeDotted = ImageVector.Builder(
            name = "MusicNoteWholeDotted",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, 17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 15f)
                moveTo(10f, 13f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14f, 17f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 13f)
                moveTo(16.5f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 15f, 18.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 17f)
                close()
            }
        }.build()

        return _MusicNoteWholeDotted!!
    }

@Suppress("ObjectPropertyName")
private var _MusicNoteWholeDotted: ImageVector? = null
