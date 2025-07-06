package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShieldAccountOutline: ImageVector
    get() {
        if (_ShieldAccountOutline != null) {
            return _ShieldAccountOutline!!
        }
        _ShieldAccountOutline = ImageVector.Builder(
            name = "ShieldAccountOutline",
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
                moveTo(12f, 3.18f)
                lineTo(19f, 6.3f)
                verticalLineTo(11.22f)
                curveTo(19f, 12.92f, 18.5f, 14.65f, 17.65f, 16.17f)
                curveTo(16f, 14.94f, 13.26f, 14.5f, 12f, 14.5f)
                curveTo(10.74f, 14.5f, 8f, 14.94f, 6.35f, 16.17f)
                curveTo(5.5f, 14.65f, 5f, 12.92f, 5f, 11.22f)
                verticalLineTo(6.3f)
                lineTo(12f, 3.18f)
                moveTo(12f, 6f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 9.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 13f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 9.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 6f)
                moveTo(12f, 8f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 9.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 11f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 9.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 8f)
                moveTo(12f, 16.5f)
                curveTo(13.57f, 16.5f, 15.64f, 17.11f, 16.53f, 17.84f)
                curveTo(15.29f, 19.38f, 13.7f, 20.55f, 12f, 21f)
                curveTo(10.3f, 20.55f, 8.71f, 19.38f, 7.47f, 17.84f)
                curveTo(8.37f, 17.11f, 10.43f, 16.5f, 12f, 16.5f)
                close()
            }
        }.build()

        return _ShieldAccountOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldAccountOutline: ImageVector? = null
