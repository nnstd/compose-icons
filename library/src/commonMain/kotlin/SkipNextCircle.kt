package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SkipNextCircle: ImageVector
    get() {
        if (_SkipNextCircle != null) {
            return _SkipNextCircle!!
        }
        _SkipNextCircle = ImageVector.Builder(
            name = "SkipNextCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                moveTo(8f, 8f)
                lineTo(13f, 12f)
                lineTo(8f, 16f)
                moveTo(14f, 8f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                horizontalLineTo(14f)
            }
        }.build()

        return _SkipNextCircle!!
    }

@Suppress("ObjectPropertyName")
private var _SkipNextCircle: ImageVector? = null
