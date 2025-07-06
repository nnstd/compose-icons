package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PanTopRight: ImageVector
    get() {
        if (_PanTopRight != null) {
            return _PanTopRight!!
        }
        _PanTopRight = ImageVector.Builder(
            name = "PanTopRight",
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
                moveTo(18.65f, 11f)
                lineTo(13f, 5.35f)
                lineTo(19f, 5f)
                lineTo(18.65f, 11f)
                close()
            }
        }.build()

        return _PanTopRight!!
    }

@Suppress("ObjectPropertyName")
private var _PanTopRight: ImageVector? = null
