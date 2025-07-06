package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShieldSword: ImageVector
    get() {
        if (_ShieldSword != null) {
            return _ShieldSword!!
        }
        _ShieldSword = ImageVector.Builder(
            name = "ShieldSword",
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
                moveTo(15f, 15f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(9f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                lineTo(10f, 7.1f)
                lineTo(12f, 5.5f)
                lineTo(14f, 7.1f)
                lineTo(13f, 13f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _ShieldSword!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldSword: ImageVector? = null
