package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CompassOutline: ImageVector
    get() {
        if (_CompassOutline != null) {
            return _CompassOutline!!
        }
        _CompassOutline = ImageVector.Builder(
            name = "CompassOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 17f)
                lineTo(10.2f, 10.2f)
                lineTo(17f, 7f)
                lineTo(13.8f, 13.8f)
                lineTo(7f, 17f)
                moveTo(12f, 11.1f)
                arcTo(0.9f, 0.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.1f, 12f)
                arcTo(0.9f, 0.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 12.9f)
                arcTo(0.9f, 0.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.9f, 12f)
                arcTo(0.9f, 0.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 11.1f)
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                moveTo(12f, 4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                close()
            }
        }.build()

        return _CompassOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CompassOutline: ImageVector? = null
