package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SetRight: ImageVector
    get() {
        if (_SetRight != null) {
            return _SetRight!!
        }
        _SetRight = ImageVector.Builder(
            name = "SetRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 19f)
                curveTo(13.96f, 19f, 12.94f, 18.76f, 12f, 18.32f)
                curveTo(11.06f, 18.76f, 10.04f, 19f, 9f, 19f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 5f)
                curveTo(10.04f, 5f, 11.06f, 5.24f, 12f, 5.68f)
                curveTo(12.94f, 5.24f, 13.96f, 5f, 15f, 5f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 19f)
                moveTo(9f, 17f)
                lineTo(10f, 16.89f)
                curveTo(8.72f, 15.59f, 8f, 13.83f, 8f, 12f)
                curveTo(8f, 10.17f, 8.72f, 8.41f, 10f, 7.1f)
                lineTo(9f, 7f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 17f)
                moveTo(12f, 16f)
                curveTo(13.26f, 15.05f, 14f, 13.57f, 14f, 12f)
                curveTo(14f, 10.43f, 13.26f, 8.95f, 12f, 8f)
                curveTo(10.74f, 8.95f, 10f, 10.43f, 10f, 12f)
                curveTo(10f, 13.57f, 10.74f, 15.05f, 12f, 16f)
                close()
            }
        }.build()

        return _SetRight!!
    }

@Suppress("ObjectPropertyName")
private var _SetRight: ImageVector? = null
