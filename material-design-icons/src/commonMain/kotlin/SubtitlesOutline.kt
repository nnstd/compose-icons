package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SubtitlesOutline: ImageVector
    get() {
        if (_SubtitlesOutline != null) {
            return _SubtitlesOutline!!
        }
        _SubtitlesOutline = ImageVector.Builder(
            name = "SubtitlesOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 20f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 18f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                horizontalLineTo(20f)
                moveTo(20f, 18f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                moveTo(6f, 10f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                horizontalLineTo(6f)
                verticalLineTo(10f)
                moveTo(6f, 14f)
                horizontalLineTo(14f)
                verticalLineTo(16f)
                horizontalLineTo(6f)
                verticalLineTo(14f)
                moveTo(16f, 14f)
                horizontalLineTo(18f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                moveTo(10f, 10f)
                horizontalLineTo(18f)
                verticalLineTo(12f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _SubtitlesOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SubtitlesOutline: ImageVector? = null
