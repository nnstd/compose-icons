package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DebugStepInto: ImageVector
    get() {
        if (_DebugStepInto != null) {
            return _DebugStepInto!!
        }
        _DebugStepInto = ImageVector.Builder(
            name = "DebugStepInto",
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
                moveTo(13f, 2f)
                verticalLineTo(13f)
                lineTo(17.5f, 8.5f)
                lineTo(18.92f, 9.92f)
                lineTo(12f, 16.84f)
                lineTo(5.08f, 9.92f)
                lineTo(6.5f, 8.5f)
                lineTo(11f, 13f)
                verticalLineTo(2f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _DebugStepInto!!
    }

@Suppress("ObjectPropertyName")
private var _DebugStepInto: ImageVector? = null
