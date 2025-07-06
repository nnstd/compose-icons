package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Pi: ImageVector
    get() {
        if (_Pi != null) {
            return _Pi!!
        }
        _Pi = ImageVector.Builder(
            name = "Pi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(6f)
                verticalLineTo(19f)
                horizontalLineTo(8f)
                verticalLineTo(7f)
                horizontalLineTo(14f)
                verticalLineTo(16f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 19f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 16f)
                horizontalLineTo(18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
                verticalLineTo(7f)
                horizontalLineTo(18f)
                verticalLineTo(5f)
            }
        }.build()

        return _Pi!!
    }

@Suppress("ObjectPropertyName")
private var _Pi: ImageVector? = null
