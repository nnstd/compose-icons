package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShieldSyncOutline: ImageVector
    get() {
        if (_ShieldSyncOutline != null) {
            return _ShieldSyncOutline!!
        }
        _ShieldSyncOutline = ImageVector.Builder(
            name = "ShieldSyncOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 21f)
                curveTo(8.25f, 20f, 5f, 15.54f, 5f, 11.22f)
                verticalLineTo(6.3f)
                lineTo(12f, 3.18f)
                lineTo(19f, 6.3f)
                verticalLineTo(12.07f)
                arcTo(6.45f, 6.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.91f, 12.67f)
                arcTo(11.63f, 11.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 11f)
                verticalLineTo(5f)
                lineTo(12f, 1f)
                lineTo(3f, 5f)
                verticalLineTo(11f)
                curveTo(3f, 16.55f, 6.84f, 21.74f, 12f, 23f)
                curveTo(12.35f, 22.91f, 12.7f, 22.8f, 13f, 22.68f)
                arcTo(6.3f, 6.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21f)
                moveTo(18f, 14.5f)
                verticalLineTo(13f)
                lineTo(15.75f, 15.25f)
                lineTo(18f, 17.5f)
                verticalLineTo(16f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.24f, 19.62f)
                lineTo(21.33f, 20.71f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 14.5f)
                moveTo(18f, 21f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.76f, 17.38f)
                lineTo(14.67f, 16.29f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 22.5f)
                verticalLineTo(24f)
                lineTo(20.25f, 21.75f)
                lineTo(18f, 19.5f)
                close()
            }
        }.build()

        return _ShieldSyncOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldSyncOutline: ImageVector? = null
