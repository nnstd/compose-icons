package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SetLeftRight: ImageVector
    get() {
        if (_SetLeftRight != null) {
            return _SetLeftRight!!
        }
        _SetLeftRight = ImageVector.Builder(
            name = "SetLeftRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 5f)
                curveTo(10.04f, 5f, 11.06f, 5.24f, 12f, 5.68f)
                curveTo(12.94f, 5.24f, 13.96f, 5f, 15f, 5f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 19f)
                curveTo(13.96f, 19f, 12.94f, 18.76f, 12f, 18.32f)
                curveTo(11.06f, 18.76f, 10.04f, 19f, 9f, 19f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 5f)
                moveTo(9f, 12f)
                curveTo(9f, 14.22f, 10.21f, 16.16f, 12f, 17.2f)
                curveTo(13.79f, 16.16f, 15f, 14.22f, 15f, 12f)
                curveTo(15f, 9.78f, 13.79f, 7.84f, 12f, 6.8f)
                curveTo(10.21f, 7.84f, 9f, 9.78f, 9f, 12f)
                close()
            }
        }.build()

        return _SetLeftRight!!
    }

@Suppress("ObjectPropertyName")
private var _SetLeftRight: ImageVector? = null
