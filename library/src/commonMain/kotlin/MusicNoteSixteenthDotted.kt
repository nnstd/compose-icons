package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MusicNoteSixteenthDotted: ImageVector
    get() {
        if (_MusicNoteSixteenthDotted != null) {
            return _MusicNoteSixteenthDotted!!
        }
        _MusicNoteSixteenthDotted = ImageVector.Builder(
            name = "MusicNoteSixteenthDotted",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 18.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16.5f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 18.5f)
                moveTo(18f, 7f)
                verticalLineTo(3f)
                horizontalLineTo(12f)
                verticalLineTo(13.55f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14f, 17f)
                verticalLineTo(11f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                horizontalLineTo(14f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _MusicNoteSixteenthDotted!!
    }

@Suppress("ObjectPropertyName")
private var _MusicNoteSixteenthDotted: ImageVector? = null
