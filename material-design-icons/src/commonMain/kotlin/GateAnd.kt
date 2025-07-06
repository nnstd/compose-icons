package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GateAnd: ImageVector
    get() {
        if (_GateAnd != null) {
            return _GateAnd!!
        }
        _GateAnd = ImageVector.Builder(
            name = "GateAnd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 4f)
                verticalLineTo(20f)
                horizontalLineTo(14f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 4f)
                horizontalLineTo(2f)
                moveTo(4f, 6f)
                horizontalLineTo(14f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 12f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 18f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _GateAnd!!
    }

@Suppress("ObjectPropertyName")
private var _GateAnd: ImageVector? = null
