package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SkipPreviousCircle: ImageVector
    get() {
        if (_SkipPreviousCircle != null) {
            return _SkipPreviousCircle!!
        }
        _SkipPreviousCircle = ImageVector.Builder(
            name = "SkipPreviousCircle",
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
                horizontalLineTo(10f)
                verticalLineTo(16f)
                horizontalLineTo(8f)
                moveTo(16f, 8f)
                verticalLineTo(16f)
                lineTo(11f, 12f)
            }
        }.build()

        return _SkipPreviousCircle!!
    }

@Suppress("ObjectPropertyName")
private var _SkipPreviousCircle: ImageVector? = null
