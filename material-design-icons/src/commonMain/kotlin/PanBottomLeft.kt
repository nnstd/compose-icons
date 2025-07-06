package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PanBottomLeft: ImageVector
    get() {
        if (_PanBottomLeft != null) {
            return _PanBottomLeft!!
        }
        _PanBottomLeft = ImageVector.Builder(
            name = "PanBottomLeft",
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
                moveTo(5.35f, 13f)
                lineTo(11f, 18.65f)
                lineTo(5f, 19f)
                lineTo(5.35f, 13f)
                close()
            }
        }.build()

        return _PanBottomLeft!!
    }

@Suppress("ObjectPropertyName")
private var _PanBottomLeft: ImageVector? = null
