package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShieldCross: ImageVector
    get() {
        if (_ShieldCross != null) {
            return _ShieldCross!!
        }
        _ShieldCross = ImageVector.Builder(
            name = "ShieldCross",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                lineTo(3f, 5f)
                verticalLineTo(11f)
                curveTo(3f, 16.5f, 6.8f, 21.7f, 12f, 23f)
                curveTo(17.2f, 21.7f, 21f, 16.5f, 21f, 11f)
                verticalLineTo(5f)
                lineTo(12f, 1f)
                moveTo(16f, 10f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineTo(16f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _ShieldCross!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldCross: ImageVector? = null
