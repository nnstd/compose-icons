package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DebugStepOver: ImageVector
    get() {
        if (_DebugStepOver != null) {
            return _DebugStepOver!!
        }
        _DebugStepOver = ImageVector.Builder(
            name = "DebugStepOver",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 14f)
                moveTo(23.46f, 8.86f)
                lineTo(21.87f, 15.75f)
                lineTo(15f, 14.16f)
                lineTo(18.8f, 11.78f)
                curveTo(17.39f, 9.5f, 14.87f, 8f, 12f, 8f)
                curveTo(8.05f, 8f, 4.77f, 10.86f, 4.12f, 14.63f)
                lineTo(2.15f, 14.28f)
                curveTo(2.96f, 9.58f, 7.06f, 6f, 12f, 6f)
                curveTo(15.58f, 6f, 18.73f, 7.89f, 20.5f, 10.72f)
                lineTo(23.46f, 8.86f)
                close()
            }
        }.build()

        return _DebugStepOver!!
    }

@Suppress("ObjectPropertyName")
private var _DebugStepOver: ImageVector? = null
