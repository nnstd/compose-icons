package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SkipPreviousCircleOutline: ImageVector
    get() {
        if (_SkipPreviousCircleOutline != null) {
            return _SkipPreviousCircleOutline!!
        }
        _SkipPreviousCircleOutline = ImageVector.Builder(
            name = "SkipPreviousCircleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                moveTo(12f, 4f)
                curveTo(7.59f, 4f, 4f, 7.59f, 4f, 12f)
                curveTo(4f, 16.41f, 7.59f, 20f, 12f, 20f)
                curveTo(16.41f, 20f, 20f, 16.41f, 20f, 12f)
                curveTo(20f, 7.59f, 16.41f, 4f, 12f, 4f)
                moveTo(16f, 8f)
                verticalLineTo(16f)
                lineTo(11f, 12f)
                moveTo(10f, 8f)
                verticalLineTo(16f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
            }
        }.build()

        return _SkipPreviousCircleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SkipPreviousCircleOutline: ImageVector? = null
