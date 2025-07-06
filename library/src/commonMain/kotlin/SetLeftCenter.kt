package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SetLeftCenter: ImageVector
    get() {
        if (_SetLeftCenter != null) {
            return _SetLeftCenter!!
        }
        _SetLeftCenter = ImageVector.Builder(
            name = "SetLeftCenter",
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
                moveTo(15f, 7f)
                lineTo(14f, 7.11f)
                curveTo(15.28f, 8.41f, 16f, 10.17f, 16f, 12f)
                curveTo(16f, 13.83f, 15.28f, 15.59f, 14f, 16.9f)
                lineTo(15f, 17f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 7f)
                moveTo(8.5f, 12f)
                curveTo(8.5f, 13.87f, 9.29f, 15.56f, 10.56f, 16.75f)
                lineTo(11.56f, 16.29f)
                curveTo(10.31f, 15.29f, 9.5f, 13.74f, 9.5f, 12f)
                curveTo(9.5f, 10.26f, 10.31f, 8.71f, 11.56f, 7.71f)
                lineTo(10.56f, 7.25f)
                curveTo(9.29f, 8.44f, 8.5f, 10.13f, 8.5f, 12f)
                close()
            }
        }.build()

        return _SetLeftCenter!!
    }

@Suppress("ObjectPropertyName")
private var _SetLeftCenter: ImageVector? = null
