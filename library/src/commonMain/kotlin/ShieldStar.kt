package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShieldStar: ImageVector
    get() {
        if (_ShieldStar != null) {
            return _ShieldStar!!
        }
        _ShieldStar = ImageVector.Builder(
            name = "ShieldStar",
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
                moveTo(15.08f, 16f)
                lineTo(12f, 14.15f)
                lineTo(8.93f, 16f)
                lineTo(9.74f, 12.5f)
                lineTo(7.03f, 10.16f)
                lineTo(10.61f, 9.85f)
                lineTo(12f, 6.55f)
                lineTo(13.39f, 9.84f)
                lineTo(16.97f, 10.15f)
                lineTo(14.26f, 12.5f)
                lineTo(15.08f, 16f)
                close()
            }
        }.build()

        return _ShieldStar!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldStar: ImageVector? = null
