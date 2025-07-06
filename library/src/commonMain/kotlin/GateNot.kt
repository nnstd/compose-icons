package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GateNot: ImageVector
    get() {
        if (_GateNot != null) {
            return _GateNot!!
        }
        _GateNot = ImageVector.Builder(
            name = "GateNot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 4f)
                verticalLineTo(20f)
                lineTo(16.2f, 13f)
                curveTo(16.62f, 14.19f, 17.74f, 15f, 19f, 15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 9f)
                curveTo(17.74f, 9f, 16.62f, 9.81f, 16.2f, 11f)
                lineTo(2f, 4f)
                moveTo(4f, 7.3f)
                lineTo(13.7f, 12f)
                lineTo(4f, 16.7f)
                verticalLineTo(7.3f)
                moveTo(19f, 11f)
                curveTo(19.5f, 11f, 20f, 11.5f, 20f, 12f)
                curveTo(20f, 12.5f, 19.5f, 13f, 19f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 12f)
                curveTo(18f, 11.5f, 18.5f, 11f, 19f, 11f)
                close()
            }
        }.build()

        return _GateNot!!
    }

@Suppress("ObjectPropertyName")
private var _GateNot: ImageVector? = null
