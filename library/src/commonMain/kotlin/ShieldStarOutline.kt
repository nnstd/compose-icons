package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShieldStarOutline: ImageVector
    get() {
        if (_ShieldStarOutline != null) {
            return _ShieldStarOutline!!
        }
        _ShieldStarOutline = ImageVector.Builder(
            name = "ShieldStarOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 11f)
                curveTo(21f, 16.55f, 17.16f, 21.74f, 12f, 23f)
                curveTo(6.84f, 21.74f, 3f, 16.55f, 3f, 11f)
                verticalLineTo(5f)
                lineTo(12f, 1f)
                lineTo(21f, 5f)
                verticalLineTo(11f)
                moveTo(12f, 21f)
                curveTo(15.75f, 20f, 19f, 15.54f, 19f, 11.22f)
                verticalLineTo(6.3f)
                lineTo(12f, 3.18f)
                lineTo(5f, 6.3f)
                verticalLineTo(11.22f)
                curveTo(5f, 15.54f, 8.25f, 20f, 12f, 21f)
                moveTo(15.05f, 16f)
                lineTo(11.97f, 14.15f)
                lineTo(8.9f, 16f)
                lineTo(9.71f, 12.5f)
                lineTo(7f, 10.16f)
                lineTo(10.58f, 9.85f)
                lineTo(11.97f, 6.55f)
                lineTo(13.37f, 9.84f)
                lineTo(16.95f, 10.15f)
                lineTo(14.23f, 12.5f)
                lineTo(15.05f, 16f)
            }
        }.build()

        return _ShieldStarOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldStarOutline: ImageVector? = null
