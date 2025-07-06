package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GateNand: ImageVector
    get() {
        if (_GateNand != null) {
            return _GateNand!!
        }
        _GateNand = ImageVector.Builder(
            name = "GateNand",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 4f)
                verticalLineTo(20f)
                horizontalLineTo(10f)
                curveTo(13.43f, 20f, 16.5f, 17.84f, 17.6f, 14.6f)
                curveTo(18f, 14.8f, 18.5f, 15f, 19f, 15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 9f)
                curveTo(18.5f, 9f, 18.03f, 9.15f, 17.6f, 9.4f)
                curveTo(16.5f, 6.16f, 13.43f, 4f, 10f, 4f)
                horizontalLineTo(2f)
                moveTo(4f, 6f)
                horizontalLineTo(10f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 12f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 18f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                moveTo(19f, 11f)
                curveTo(19.5f, 11f, 20f, 11.5f, 20f, 12f)
                curveTo(20f, 12.5f, 19.5f, 13f, 19f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 12f)
                curveTo(18f, 11.5f, 18.5f, 11f, 19f, 11f)
                close()
            }
        }.build()

        return _GateNand!!
    }

@Suppress("ObjectPropertyName")
private var _GateNand: ImageVector? = null
