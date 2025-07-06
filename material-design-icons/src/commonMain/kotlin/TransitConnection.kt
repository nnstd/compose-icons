package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TransitConnection: ImageVector
    get() {
        if (_TransitConnection != null) {
            return _TransitConnection!!
        }
        _TransitConnection = ImageVector.Builder(
            name = "TransitConnection",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 12f)
                curveTo(15f, 10.7f, 14.16f, 9.6f, 13f, 9.18f)
                verticalLineTo(6.82f)
                curveTo(14.16f, 6.4f, 15f, 5.3f, 15f, 4f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 1f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 4f)
                curveTo(9f, 5.3f, 9.84f, 6.4f, 11f, 6.82f)
                verticalLineTo(9.19f)
                curveTo(9.84f, 9.6f, 9f, 10.7f, 9f, 12f)
                curveTo(9f, 13.3f, 9.84f, 14.4f, 11f, 14.82f)
                verticalLineTo(17.18f)
                curveTo(9.84f, 17.6f, 9f, 18.7f, 9f, 20f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 23f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 20f)
                curveTo(15f, 18.7f, 14.16f, 17.6f, 13f, 17.18f)
                verticalLineTo(14.82f)
                curveTo(14.16f, 14.4f, 15f, 13.3f, 15f, 12f)
                moveTo(12f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
                moveTo(12f, 21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21f)
                close()
            }
        }.build()

        return _TransitConnection!!
    }

@Suppress("ObjectPropertyName")
private var _TransitConnection: ImageVector? = null
