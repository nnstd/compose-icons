package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShieldAccount: ImageVector
    get() {
        if (_ShieldAccount != null) {
            return _ShieldAccount!!
        }
        _ShieldAccount = ImageVector.Builder(
            name = "ShieldAccount",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                lineTo(3f, 5f)
                verticalLineTo(11f)
                curveTo(3f, 16.55f, 6.84f, 21.74f, 12f, 23f)
                curveTo(17.16f, 21.74f, 21f, 16.55f, 21f, 11f)
                verticalLineTo(5f)
                lineTo(12f, 1f)
                moveTo(12f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 11f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 5f)
                moveTo(17.13f, 17f)
                curveTo(15.92f, 18.85f, 14.11f, 20.24f, 12f, 20.92f)
                curveTo(9.89f, 20.24f, 8.08f, 18.85f, 6.87f, 17f)
                curveTo(6.53f, 16.5f, 6.24f, 16f, 6f, 15.47f)
                curveTo(6f, 13.82f, 8.71f, 12.47f, 12f, 12.47f)
                curveTo(15.29f, 12.47f, 18f, 13.79f, 18f, 15.47f)
                curveTo(17.76f, 16f, 17.47f, 16.5f, 17.13f, 17f)
                close()
            }
        }.build()

        return _ShieldAccount!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldAccount: ImageVector? = null
