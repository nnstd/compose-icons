package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DebugStepOut: ImageVector
    get() {
        if (_DebugStepOut != null) {
            return _DebugStepOut!!
        }
        _DebugStepOut = ImageVector.Builder(
            name = "DebugStepOut",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 22f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                moveTo(13f, 16f)
                horizontalLineTo(11f)
                verticalLineTo(6f)
                lineTo(6.5f, 10.5f)
                lineTo(5.08f, 9.08f)
                lineTo(12f, 2.16f)
                lineTo(18.92f, 9.08f)
                lineTo(17.5f, 10.5f)
                lineTo(13f, 6f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _DebugStepOut!!
    }

@Suppress("ObjectPropertyName")
private var _DebugStepOut: ImageVector? = null
