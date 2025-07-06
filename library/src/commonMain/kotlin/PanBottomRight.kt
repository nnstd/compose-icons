package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PanBottomRight: ImageVector
    get() {
        if (_PanBottomRight != null) {
            return _PanBottomRight!!
        }
        _PanBottomRight = ImageVector.Builder(
            name = "PanBottomRight",
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
                moveTo(13f, 18.65f)
                lineTo(18.65f, 13f)
                lineTo(19f, 19f)
                lineTo(13f, 18.65f)
                close()
            }
        }.build()

        return _PanBottomRight!!
    }

@Suppress("ObjectPropertyName")
private var _PanBottomRight: ImageVector? = null
