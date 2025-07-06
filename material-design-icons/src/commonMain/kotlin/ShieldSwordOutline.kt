package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShieldSwordOutline: ImageVector
    get() {
        if (_ShieldSwordOutline != null) {
            return _ShieldSwordOutline!!
        }
        _ShieldSwordOutline = ImageVector.Builder(
            name = "ShieldSwordOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                lineTo(21f, 5f)
                verticalLineTo(11f)
                curveTo(21f, 16.5f, 17.2f, 21.7f, 12f, 23f)
                curveTo(6.8f, 21.7f, 3f, 16.5f, 3f, 11f)
                verticalLineTo(5f)
                lineTo(12f, 1f)
                moveTo(12f, 3.2f)
                lineTo(5f, 6.3f)
                verticalLineTo(11.2f)
                curveTo(5f, 15.5f, 8.2f, 20f, 12f, 21f)
                curveTo(15.8f, 20f, 19f, 15.5f, 19f, 11.2f)
                verticalLineTo(6.3f)
                lineTo(12f, 3.2f)
                moveTo(12f, 5.5f)
                lineTo(14f, 7.1f)
                lineTo(13f, 13f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(9f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                lineTo(10f, 7.1f)
                lineTo(12f, 5.5f)
                close()
            }
        }.build()

        return _ShieldSwordOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldSwordOutline: ImageVector? = null
