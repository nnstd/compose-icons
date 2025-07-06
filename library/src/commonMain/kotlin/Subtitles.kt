package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Subtitles: ImageVector
    get() {
        if (_Subtitles != null) {
            return _Subtitles!!
        }
        _Subtitles = ImageVector.Builder(
            name = "Subtitles",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 4f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 20f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 18f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 4f)
                moveTo(4f, 12f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                moveTo(14f, 18f)
                horizontalLineTo(4f)
                verticalLineTo(16f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                moveTo(20f, 18f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                horizontalLineTo(20f)
                verticalLineTo(18f)
                moveTo(20f, 14f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                horizontalLineTo(20f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _Subtitles!!
    }

@Suppress("ObjectPropertyName")
private var _Subtitles: ImageVector? = null
