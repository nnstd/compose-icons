package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SetLeft: ImageVector
    get() {
        if (_SetLeft != null) {
            return _SetLeft!!
        }
        _SetLeft = ImageVector.Builder(
            name = "SetLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 5f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 19f)
                curveTo(10.04f, 19f, 11.06f, 18.76f, 12f, 18.32f)
                curveTo(12.94f, 18.76f, 13.96f, 19f, 15f, 19f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 5f)
                curveTo(13.96f, 5f, 12.94f, 5.24f, 12f, 5.68f)
                curveTo(11.06f, 5.24f, 10.04f, 5f, 9f, 5f)
                moveTo(15f, 7f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 17f)
                curveTo(14.66f, 17f, 14.33f, 16.97f, 14f, 16.9f)
                curveTo(15.28f, 15.59f, 16f, 13.83f, 16f, 12f)
                curveTo(16f, 10.17f, 15.28f, 8.41f, 14f, 7.11f)
                curveTo(14.33f, 7.04f, 14.66f, 7f, 15f, 7f)
                moveTo(12f, 8f)
                curveTo(13.26f, 8.95f, 14f, 10.43f, 14f, 12f)
                curveTo(14f, 13.57f, 13.26f, 15.05f, 12f, 16f)
                curveTo(10.74f, 15.05f, 10f, 13.57f, 10f, 12f)
                curveTo(10f, 10.43f, 10.74f, 8.95f, 12f, 8f)
                close()
            }
        }.build()

        return _SetLeft!!
    }

@Suppress("ObjectPropertyName")
private var _SetLeft: ImageVector? = null
