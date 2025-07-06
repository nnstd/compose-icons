package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PanTopLeft: ImageVector
    get() {
        if (_PanTopLeft != null) {
            return _PanTopLeft!!
        }
        _PanTopLeft = ImageVector.Builder(
            name = "PanTopLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 10f)
                moveTo(11f, 5.35f)
                lineTo(5.35f, 11f)
                lineTo(5f, 5f)
                lineTo(11f, 5.35f)
                close()
            }
        }.build()

        return _PanTopLeft!!
    }

@Suppress("ObjectPropertyName")
private var _PanTopLeft: ImageVector? = null
