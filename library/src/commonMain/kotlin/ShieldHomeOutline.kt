package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShieldHomeOutline: ImageVector
    get() {
        if (_ShieldHomeOutline != null) {
            return _ShieldHomeOutline!!
        }
        _ShieldHomeOutline = ImageVector.Builder(
            name = "ShieldHomeOutline",
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
                moveTo(11f, 14f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(18f)
                lineTo(12f, 7f)
                lineTo(6f, 12f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
            }
        }.build()

        return _ShieldHomeOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldHomeOutline: ImageVector? = null
