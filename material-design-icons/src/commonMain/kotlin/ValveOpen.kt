package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ValveOpen: ImageVector
    get() {
        if (_ValveOpen != null) {
            return _ValveOpen!!
        }
        _ValveOpen = ImageVector.Builder(
            name = "ValveOpen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 22f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                horizontalLineTo(4f)
                moveTo(22f, 2f)
                horizontalLineTo(20f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                moveTo(11f, 4f)
                verticalLineTo(9.18f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 14.82f)
                verticalLineTo(20f)
                horizontalLineTo(13f)
                verticalLineTo(14.82f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 9.18f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _ValveOpen!!
    }

@Suppress("ObjectPropertyName")
private var _ValveOpen: ImageVector? = null
